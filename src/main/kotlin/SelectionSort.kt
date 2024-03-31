package com.franze.playground
/**
 * An example implementation of the Selectionsort algorithm
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
class SelectionSort : SortingAlgorithm{

    override fun sort(list: MutableList<Int>): MutableList<Int> {
        var unsortedIndex: Int = 0
        var indexOfMinValue: Int = 0
        var temp: Int

        while(unsortedIndex <= (list.size - 1)){

            for (i in unsortedIndex until list.size ){

                if(list[indexOfMinValue] > list[i]){
                    indexOfMinValue = i
                }
            }
            temp = list[unsortedIndex]
            list[unsortedIndex] = list[indexOfMinValue]
            list[indexOfMinValue] = temp

            unsortedIndex++
            indexOfMinValue = unsortedIndex
        }

        return list
    }
}