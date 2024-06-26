import com.franze.playground.algorithm.SortingAlgorithm
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue


class SortingAlgorithmTester(private val sortingAlgorithm: SortingAlgorithm) {

    fun testSort() {
        val inputList = mutableListOf(12, 14, 15, 5, 17, 11, 19, 1, 18, 2, 10, 6, 9, 13, 20, 4, 16, 8, 7, 3)
        val targetList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        val resultList = sortingAlgorithm.sort(inputList.toMutableList())

        // Test Lists of Integer
        assertEquals(inputList, mutableListOf(12, 14, 15, 5, 17, 11, 19, 1, 18, 2, 10, 6, 9, 13, 20, 4, 16, 8, 7, 3))
        assertEquals(targetList, resultList)
        assertTrue(resultList == resultList.sorted())
        assertEquals(inputList.size, resultList.size)
        assertEquals(resultList.toSet().size, resultList.size)


        // Test Lists of Double
        val inputDoubleList = mutableListOf(7.0, 10.0, 4.0, 3.0, 5.0, 9.0, 1.0, 8.0, 6.0, 2.0)
        val targetDoubleList = mutableListOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
        val resultDoubleList = sortingAlgorithm.sort(inputDoubleList.toMutableList())

        assertEquals(inputDoubleList, mutableListOf(7.0, 10.0, 4.0, 3.0, 5.0, 9.0, 1.0, 8.0, 6.0, 2.0))
        assertEquals(targetDoubleList, resultDoubleList)
        assertTrue(resultDoubleList == resultDoubleList.sorted())
        assertEquals(inputDoubleList.size, resultDoubleList.size)
        assertEquals(resultDoubleList.toSet().size, resultDoubleList.size)


        // Test Lists where numbers can occur several times
        val inputListMultiple = mutableListOf(12, 14, 15, 6, 19, 1, 18, 3, 2, 10, 6, 13, 20, 4, 16, 8, 7, 3)
        val targetListMultiple = mutableListOf(1, 2, 3, 3, 4, 6, 6, 7, 8, 10, 12, 13, 14, 15, 16, 18, 19, 20)
        val resultListMultiple = sortingAlgorithm.sort(inputListMultiple.toMutableList())

        // Test Lists of Integer
        assertEquals(inputListMultiple, mutableListOf(12, 14, 15, 6, 19, 1, 18, 3, 2, 10, 6, 13, 20, 4, 16, 8, 7, 3))
        assertEquals(targetListMultiple, resultListMultiple)
        assertTrue(resultListMultiple == resultListMultiple.sorted())
        assertEquals(inputListMultiple.size, resultListMultiple.size)

    }
}
