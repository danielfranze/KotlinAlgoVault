package com.franze.playground
/**
 * An example implementation of the Quicksort algorithm
 *
 * time complexity
 * best case: O(n log n)
 * worst case: O(n²)
 * average case : O(n log n)
 *
 * @author Daniel Franze
 * @version 1.0
 * @since 2024-03-30
 */
class Quicksort: SortingAlgorithm{

    private fun pivotElementWithMedianStrategy(list: MutableList<Int>) : Int {
        val firstElement: Pair<Int, Int> = Pair(list.elementAt(0), 0)
        val lastElement: Pair<Int, Int> = Pair(list.elementAt(list.size - 1), list.size - 1)
        val elementInTheMiddle: Pair<Int, Int> = Pair(list.elementAt((list.size - 1) / 2), (list.size - 1) / 2)

        val indexOfPivotElement: Int = listOf(firstElement, lastElement, elementInTheMiddle)
            .sortedWith(compareBy { it.first })
            .asReversed()[1].second

        return indexOfPivotElement
    }


    override fun sort(list: MutableList<Int>): MutableList<Int> {
        val pivotElement: Int = pivotElementWithMedianStrategy(list)

        TODO("Not yet implemented")
    }

}