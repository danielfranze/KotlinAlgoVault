import com.franze.playground.algorithm.*
import org.junit.jupiter.api.Test

class TestCases {

    @Test
    fun testBubbleSort() {
        SortingAlgorithmTester(BubbleSort()).testSort()
    }

    @Test
    fun testCountingSort() {
        SortingAlgorithmTester(CountingSort()).testSort()
    }

    @Test
    fun testInsertionSort() {
        SortingAlgorithmTester(InsertionSort()).testSort()
    }

    @Test
    fun testMergeSort() {
        SortingAlgorithmTester(SelectionSort()).testSort()
    }

    @Test
    fun testQuickSort() {
        SortingAlgorithmTester(QuickSort()).testSort()
    }

    @Test
    fun testSelectionSort() {
        SortingAlgorithmTester(SelectionSort()).testSort()
    }
}
