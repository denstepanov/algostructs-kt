package org.example

import algorithms.isPalindrome
import org.example.algorithms.search
import org.example.algorithms.sorts.quickSort

// TODO: Позже сделать api для более интерактивного взаимодействия с алгоритмами.
fun main() {
    println("Check palindrome")
    println("Palindrome is ${isPalindrome("kayak")}")

    val arr = mutableListOf(15, 16, 100, 1, 7, 65)
    arr.quickSort()
    for (i in arr) {
        println(i)
    }

    // Binary search
    val anotherArray = mutableListOf(1, 18, 47, 38, 64, 99, 195, 44)
    println(anotherArray.search(64))
}