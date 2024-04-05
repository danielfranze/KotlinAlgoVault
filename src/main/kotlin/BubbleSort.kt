package com.franze.playground.algorithm

import com.franze.playground.algorithm.util.swap

/**
 * An example implementation of the BubbleSort algorithm
 *
 * time complexity
 * best case: O(n)
 * worst case: O(n²)
 * average case : O(n²)
 *
 * @author Daniel Franze
 * @version 1.1
 * @since 2024-03-29
 */
class BubbleSort : SortingAlgorithm {
    override fun <T> sort(unsortedList: List<T>): MutableList<T> where T : Number, T : Comparable<T> {
        val list = unsortedList.toMutableList() // generate a depth copy

        var i: Int = list.size - 1 // unsorted index
        var swap = true // to abort the algorithm if no value was swapped in an iteration

        while (i >= 0 && swap) {
            swap = false
            for (j in 0 until i ) {
                // swap the values if j is greater than j+1
                if(list.elementAt(j) > list.elementAt(j+1)){
                    list.swap(j, j+1)
                    swap = true
                }
            }
            i--
        }
        return list
    }
}
