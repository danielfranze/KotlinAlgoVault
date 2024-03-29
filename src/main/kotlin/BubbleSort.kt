package com.franze.playground
/**
 * An example implementation of the Bubblesort algorithm
 *
 * time complexity
 * best case: O(n)
 * worst case: O(n²)
 * average case : O(n²)
 *
 * @author Daniel Franze
 * @version 1.0
 * @since 2024-03-29
 */
class BubbleSort : SortingAlgorithm{
    override fun sort(list: MutableList<Int>): MutableList<Int> {

        var i: Int = list.size - 1
        var swap: Boolean = true // to abort the algorithm if no value was swapped in an iteration

        while(i >= 0 && swap){
            swap = false
            for (j in 0 until i){
                // swap the values if j is greater than j+1
                if(j+1 <= i && list.elementAt(j) > list.elementAt(j+1)){
                    val valueOfFirstElement: Int = list.elementAt(j)
                    list[j] = list.elementAt(j+1)
                    list[j+1] = valueOfFirstElement
                    swap = true
                }
            }
            i--
        }
        return list
    }
}