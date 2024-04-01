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
        var smallestValueIndex: Int = 0
        var cacheForSwapping: Int

        while(unsortedIndex <= (list.size - 1)){

            for (i in unsortedIndex until list.size ){

                if(list[smallestValueIndex] > list[i]){
                    smallestValueIndex = i
                }
            }
            cacheForSwapping = list[unsortedIndex]
            list[unsortedIndex] = list[smallestValueIndex]
            list[smallestValueIndex] = cacheForSwapping

            unsortedIndex++
            smallestValueIndex = unsortedIndex
        }

        return list
    }
}