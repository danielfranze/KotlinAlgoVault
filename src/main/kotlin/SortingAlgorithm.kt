package com.franze.playground.algorithm

/**
 * Interface defining a sorting algorithm.
 *
 * Implementations of this interface should provide a method to sort
 * a given list of comparable Numbers in ascending order.
 *
 * @author Daniel Franze
 * @version 1.0
 * @since 2024-03-29
 */
interface SortingAlgorithm {

    /**
     * Sorts a given list of Numbers in ascending order.
     * The elements of the list must be of a type
     * that implements both Number and Comparable.
     *
     * @param unsortedList The list of comparable Numbers to be sorted.
     * @return The sorted list of comparable Numbers.
     */
    fun <T> sort(unsortedList: List<T>): MutableList<T> where T : Number, T : Comparable<T>
}
