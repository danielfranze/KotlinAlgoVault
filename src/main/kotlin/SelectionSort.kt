package com.franze.playground.algorithm

import com.franze.playground.algorithm.util.swap

/**
 * An example implementation of the SelectionSort algorithm
 *
 * time complexity
 * best case: O(n²)
 * worst case: O(n²)
 * average case : O(n²)
 *
 * @author Daniel Franze
 * @version 1.0
 * @since 2024-03-31
 */
class SelectionSort : SortingAlgorithm {

    override fun <T> sort(unsortedList: List<T>): MutableList<T> where T : Number, T : Comparable<T> {
        val list = unsortedList.toMutableList() // generate a depth copy

        var unsortedIndex = 0
        var smallestValueIndex = 0

        while (unsortedIndex <= (list.size - 1)) {
            // search for the element with the lowest value from the unsorted range
            for (i in unsortedIndex until list.size) {
                if (list[smallestValueIndex] > list[i]) {
                    smallestValueIndex = i
                }
            }
            list.swap(unsortedIndex, smallestValueIndex)

            unsortedIndex++
            smallestValueIndex = unsortedIndex
        }

        return list
    }
}
