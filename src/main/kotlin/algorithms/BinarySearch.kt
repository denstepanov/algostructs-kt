package org.example.algorithms

fun <T : Comparable<T>> MutableList<T>.search(
    elem: T,
    start: Int = 0,
    end: Int = this.size - 1): Int {
    if (start <= end) {
        val middle = start + (end - start) / 2
        if (this[middle] == elem) {
            return middle
        }

        if (this[middle] > elem) {
            return this.search(elem, start, middle - 1)
        }

        return this.search(elem, middle + 1, end)
    }
    return -1
}