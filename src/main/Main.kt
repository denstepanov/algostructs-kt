package algostructs

import algostructs.algorithms.isPalindrome
import algostructs.algorithms.searches.binarySearch
import algostructs.algorithms.sorts.quickSort
import algostructs.utils.generateShuffledList

fun main() {
    runPalindrome()

    runQuickSort()

    runBinarySearch()
}

private fun runPalindrome() {
    println("Check palindrome")
    println("Palindrome is ${isPalindrome("kayak")}")
}

private fun runQuickSort() {
    val quickSortList = generateShuffledList(10)
    quickSortList.quickSort()
    for (i in quickSortList) {
        println(i)
    }
}

private fun runBinarySearch() {
    val binarySearchList =  mutableListOf(1, 18, 47, 38, 64, 99, 195, 44)
    println("Binary search result: ${binarySearchList.binarySearch(64)}")
}