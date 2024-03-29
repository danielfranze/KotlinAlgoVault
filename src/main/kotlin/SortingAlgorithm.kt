package com.franze.playground
/**
 * Interface defining a sorting algorithm.
 *
 * Implementations of this interface should provide a method to sort a given list of integers
 * in ascending order.
 *
 * @author Daniel Franze
 * @version 1.0
 * @since 2024-03-29
 */
interface SortingAlgorithm {
    /**
     * Sorts a given list of integers in ascending order.
     *
     * @param list The list of integers to be sorted.
     * @return The sorted list of integers.
     */
    fun sort(list: MutableList<Int>): MutableList<Int>
}