package com.franze.playground.algorithm

/**
 * An example implementation of the CountingSort algorithm
 *
 * time complexity
 * best case: Ω(n+k)
 * worst case: Θ(n+k)
 * average case : O(n+k)
 *
 * @author Daniel Franze
 * @version 1.0
 * @since 2024-04-08
 */

/*Note: The Explicit Typecasts are not nice, but a workable solution to not
having to change the interface SortingAlgorithm with a new where clause*/
class CountingSort : SortingAlgorithm {

    private fun <T> incrementValue(value: T): T where T : Number, T : Comparable<T> {
        val newValue = when (value) {
            is Int -> value + 1
            is Long -> value + 1L
            is Double -> value + 1.0
            is Float -> value + 1.0f
            is Short -> value + 1
            is Byte -> value + 1
            else -> throw IllegalArgumentException("Unsupported type: $value")
        }
        @Suppress("UNCHECKED_CAST")
        return newValue as T
    }

    private fun <T> createCountingList(list: MutableList<T>): MutableList<T> where T : Number, T : Comparable<T> {
        var minValue: T = list.first()
        var maxValue: T = list.first()
        val countingList: MutableList<T> = mutableListOf()

        for (i in list) {
            if (i < minValue) {
                minValue = i
            }
            if (i > maxValue) {
                maxValue = i
            }
        }

        var i: T = minValue
        while (i <= maxValue) {
            @Suppress("UNCHECKED_CAST")
            countingList.addLast(0 as T)
            i = incrementValue(i)
        }
        return countingList
    }

    override fun <T> sort(unsortedList: List<T>): MutableList<T> where T : Number, T : Comparable<T> {
        val list = unsortedList.toMutableList() // generate a depth copy

        @Suppress("UNCHECKED_CAST")
        val sortedList = MutableList(list.size) { 0 as T }
        val countingList = createCountingList(list)

        for (element in list) {
            countingList[element.toInt() - 1] = incrementValue(countingList[element.toInt() - 1])
        }

        for (i in 0 until countingList.size) {
            if (i > 0) {
                @Suppress("UNCHECKED_CAST")
                countingList[i] = (countingList[i].toInt() + countingList[i - 1].toInt()) as T
            } else {
                @Suppress("UNCHECKED_CAST")
                countingList[i] = (0 + countingList[i].toInt()) as T
            }
        }

        for (i in list.size - 1 downTo 0) {
            sortedList[countingList[list[i].toInt() - 1].toInt() - 1] = list[i]
            @Suppress("UNCHECKED_CAST")
            countingList[list[i].toInt() - 1] = (countingList[list[i].toInt() - 1].toInt() - 1) as T
        }
        return sortedList
    }
}
