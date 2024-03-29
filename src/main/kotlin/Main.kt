package com.franze.playground

fun main() {

    // Returns a list in a mixed order in which only elements of 1-length are contained.
    fun newList(length: Int): MutableList<Int> {
        return (1..length).shuffled().toMutableList()
    }


    val sortTester: SortingAlgorithm = BubbleSort()
    val unsortedList = newList(20)
    println("unsorted list: $unsortedList")
    val sortedList = sortTester.sort(unsortedList)
    println("sorted list:  $sortedList")











}