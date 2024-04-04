package com.franze.playground.algorithm

import com.franze.playground.algorithm.util.swap

/**
 * An example implementation of the Quicksort algorithm
 *
 * time complexity
 * best case: O(n log n)
 * worst case: O(n²)
 * average case : O(n log n)
 *
 * @author Daniel Franze
 * @version 2.0
 * @since 2024-03-30
 */
class Quicksort : SortingAlgorithm {

    override fun <T> sort(unsortedList: List<T>): MutableList<T> where T : Number, T : Comparable<T> {
        val list = unsortedList.toMutableList() // generate a depth copy
        var pivotIndex: Int = list.size - 1

        if (list.size == 1) {
            return list
        }
        var indexLeft: Int = 0
        var indexRight: Int = pivotIndex - 1

        // an iteration where sorting is based on the pivot element
        while (indexLeft < indexRight) {
            for (i in indexLeft until pivotIndex) {
                if (list[i] > list[pivotIndex]) {
                    break
                }
                indexLeft++
            }
            for (j in indexRight downTo 0) {
                if (list[j] < list[pivotIndex]) {
                    break
                }
                indexRight--
            }
            if (indexLeft < indexRight) {
                list.swap(indexLeft, indexRight)
            }
        }
        if (list[indexLeft] > list[pivotIndex]) {
            list.swap(indexLeft, pivotIndex)
            pivotIndex = indexLeft
        }

        var sortedList: List<T> = mutableListOf<T>(list[pivotIndex])

        // Split the list into a left and a right side, where the pivot element is in the middle
        val leftSide = list.slice(0..pivotIndex - 1)
        val rightSide = list.slice(pivotIndex + 1..list.size - 1)

        // continue with the algorithm on the left side
        if (leftSide.isNotEmpty()) {
            sortedList = sort(leftSide).plus(sortedList)
        }

        //continue with the algorithm on the right side
        if (rightSide.isNotEmpty()) {
            sortedList = sortedList.plus(sort(rightSide))
        }

        return sortedList.toMutableList()
    }

}
