package org.example.utils

fun <T : Comparable<T>> MutableList<T>.swap(first: Int, second: Int) {
    this[first] = this[second].also { this[second] = this[first] }
}