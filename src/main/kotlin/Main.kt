package com.franze.playground.algorithm

fun main() {

    // Returns a list in a mixed order in which only elements of 1-length are contained.
    fun newUnsortedList(length: Int): MutableList<Int> {
        return (1..length).shuffled().toMutableList()
    }

    // tests an algorithm by creating a new unsorted list and sorting it.
    // There are various debug outputs for comparing the input and output list
    fun testOutputOfAlgorithm(algorithm: SortingAlgorithm) {
        println("Start: $algorithm")
        val unsortedList = newUnsortedList(20)
        println("unsorted list: $unsortedList")
        val sortedList = algorithm.sort(unsortedList)
        println("sorted list: $sortedList \n ==> Reference check:")
        println("unsorted list: $unsortedList \n")
    }

    testOutputOfAlgorithm(SelectionSort())

    testOutputOfAlgorithm(BubbleSort())

}
