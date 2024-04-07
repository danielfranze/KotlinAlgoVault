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
        if (rightList.isEmpty()) {
            return leftList
        } else if (leftList.isEmpty()) {
            return rightList
        }
        // conquer part
        val mergedList = mutableListOf<T>()
        // find the smallest element and move to the end of mergedList
        while (leftList.isNotEmpty() || rightList.isNotEmpty()) {
            if (leftList.isNotEmpty() && (rightList.isEmpty() || leftList.first() < rightList.first())) {
                mergedList.addLast(leftList.first())
                leftList.removeFirst()
            } else if (rightList.isNotEmpty()) {
                mergedList.addLast(rightList.first())
                rightList.removeFirst()
            }
        }
        return (mergedList)
    }

    override fun <T> sort(unsortedList: List<T>): MutableList<T> where T : Number, T : Comparable<T> {
        val list = unsortedList.toMutableList() // generate a depth copy
        if (list.size == 1) {
            return list
        }

        var sortedList = mutableListOf<T>()
        while (sortedList.isEmpty()) {
            // divide part
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
