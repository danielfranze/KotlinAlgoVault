package com.franze.playground.algorithm.util

/**
 * Swaps two elements in a mutable list.
 * @param indexOfFirstElement The index of the first element.
 * @param indexOfSecondElement The index of the second element.
 *
 */
fun <T> MutableList<T>.swap(indexOfFirstElement: Int, indexOfSecondElement: Int) = apply {
    val temp = this[indexOfFirstElement]
    this[indexOfFirstElement] = this[indexOfSecondElement]
    this[indexOfSecondElement] = temp
}
