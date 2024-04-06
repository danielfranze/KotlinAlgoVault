package com.franze.playground.algorithm

/**
 * An example implementation of the MergeSort algorithm
 *
 * time complexity
 * best case: O(n log n)
 * worst case: O(n log n)
 * average case : O(n log n)
 *
 * @author Daniel Franze
 * @version 1.0
 * @since 2024-04-06
 */
class MergeSort : SortingAlgorithm {

    private fun <T> merge(leftList: MutableList<T>, rightList: MutableList<T>): MutableList<T> where T : Number, T : Comparable<T> {
        val mergedList = mutableListOf<T>() // generate a depth copy

        if (rightList.isEmpty()) {
            return leftList
        } else if (leftList.isEmpty()) {
            return rightList
        }

        //println("left: $leftList  right: $rightList")
        while (leftList.isNotEmpty() || rightList.isNotEmpty()) {
            if (leftList.isNotEmpty() && (rightList.isEmpty() || leftList[0] < rightList[0])) {
                mergedList.addLast(leftList[0])
                leftList.removeAt(0)
            } else if (rightList.isNotEmpty()) {
                mergedList.addLast(rightList[0])
                rightList.removeAt(0)
            }
        }

        return (mergedList)
    }

    override fun <T> sort(unsortedList: List<T>): MutableList<T> where T : Number, T : Comparable<T> {
        val list = unsortedList.toMutableList() // generate a depth copy

        var sortedList = mutableListOf<T>()
        if (list.size == 1) {
            return list
        }

        while (sortedList.isEmpty()) {
            val leftSide = list.slice(0..(list.size / 2 - 1))
            val rightSide = list.slice((list.size / 2)..list.size - 1)

            if (leftSide.isNotEmpty()) {
                sortedList = merge(sort(leftSide), sortedList)
            }
            if (rightSide.isNotEmpty()) {
                sortedList = merge(sort(rightSide), sortedList)
            }
        }

        return sortedList
    }
}
