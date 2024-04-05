import com.franze.playground.algorithm.SortingAlgorithm
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue


class SortingAlgorithmTester(private val sortingAlgorithm: SortingAlgorithm) {

    fun testSort() {
        val inputList = mutableListOf(12, 14, 15, 5, 17, 11, 19, 1, 18, 2, 10, 6, 9, 13, 20, 4, 16, 8, 7, 3)
        val targetList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        val resultList = sortingAlgorithm.sort(inputList.toMutableList())

        assertEquals(inputList, mutableListOf(12, 14, 15, 5, 17, 11, 19, 1, 18, 2, 10, 6, 9, 13, 20, 4, 16, 8, 7, 3))
        assertEquals(targetList, resultList)
        assertTrue(resultList == resultList.sorted())
        assertEquals(inputList.size, resultList.size)
        assertEquals(resultList.toSet().size, resultList.size)

    }
}
