import com.franze.playground.algorithm.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TestCases {

    @Test
    fun testBubbleSort() {
        SortingAlgorithmTester(BubbleSort()).testSort()
    }

    @Test
    fun testInsertionSort() {
        SortingAlgorithmTester(InsertionSort()).testSort()
    }

    @Test
    fun testQuicksort() {
        SortingAlgorithmTester(Quicksort()).testSort()
    }

    @Test
    fun testSelectionSort() {
        SortingAlgorithmTester(SelectionSort()).testSort()
    }
}
