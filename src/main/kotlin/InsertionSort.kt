package com.franze.playground.algorithm

import com.franze.playground.algorithm.util.swap

/**
 * An example implementation of the InsertionSort algorithm
 *
 * time complexity
 * best case: O(n)
 * worst case: O(n²)
 * average case : O(n²)
 *
 * @author Daniel Franze
 * @version 1.0
 * @since 2024-04-03
 */
class InsertionSort : SortingAlgorithm {

    override fun <T> sort(unsortedList: List<T>): MutableList<T> where T : Number, T : Comparable<T> {
        val list = unsortedList.toMutableList() // generate a depth copy

        var temp: T
        for (i in 1 until list.size) {
            temp = list[i]
            for (j in i - 1 downTo 0) {
                if (list[j] < temp) {
                    list[j + 1] = temp
                    break
                } else {
                    list.swap(j + 1, j)
                }
            }
        }
        return list
    }
}
