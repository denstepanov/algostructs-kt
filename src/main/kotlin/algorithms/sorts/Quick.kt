package org.example.algorithms.sorts

import org.example.utils.swap

/**
 * Быстрая сортировка Хоара
 *
 * Очень похожа на быструю сортировку слиянием. Однако разбивается на три массива а не на два. Это нужно чтобы сортировка не зациклилась.
 * Берётся элемент и с ним сравнивают все оставшиеся значения в массиве.
 * Значения меньше элемента помещаются в левый массив, а значения больше - в правый.
 * Т.к. алгоритм рекурсивный, это значит что он ведёт себя как сортировка слиянием - сначала дробит, а затем собирает.
 *
 * Лучший случай  O(n log n)
 * Средний случай O(n log n)
 * Худший случай O(n^2). Массив частично упорядочен.
 */

fun <T : Comparable<T>> MutableList<T>.quickSort(low: Int = 0, high: Int = this.size - 1) {
    if (low < high) {
        val pointer = this.partition(low, high)
        this.quickSort(low, pointer - 1)
        this.quickSort(pointer + 1, high)
    }
}

private fun <T : Comparable<T>> MutableList<T>.partition(low: Int, high: Int): Int {
    var pointer = low
    for (i in low until high) {
        if (this[i] < this[high]) {
            this.swap(i, pointer)
            pointer++
        }
    }
    this.swap(pointer, high)
    return pointer
}