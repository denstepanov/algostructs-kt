package algorithms.sorts

import org.example.utils.swap

/**
 * Пузырьковая сортировка
 *
 * Проходя по массиву смотрим на два элемента. В самом начале это индексы 0 и 1.
 * Меняем местами, если левый элемент больше правого.
 * После первого прохода массива самый большой элемент будет располагаться в конце, что позволяет нам уменьшить длину прохода всего массива на 1.
 * Такое уменьшение массива похоже на оптимизацию. В оригинале алгоритм должен проходить массив от и до.
 *
 * Лучший случай: O(n). Последовательность уже упорядочена.
 * Средний случай: O(n^2).
 * Худший случай: O(n^2). Последовательность обратно упорядочена.
 *
 * Показывает свою эффективность по сравнению с быстрой сортировкой если массив наполовину упорядочен.
 */
fun <T : Comparable<T>> MutableList<T>.bubbleSort(descendantOrder: Boolean = false) {
    var lastIndex = this.size - 1
    while (lastIndex > 1) {
        for (index in 0..<lastIndex) {
            when (descendantOrder) {
                false -> {
                    if (index + 1 <= lastIndex && this[index] > this[index + 1]) {
                        this.swap(index, index + 1)
                    }
                }
                true -> {
                    if (index + 1 <= lastIndex && this[index] < this[index + 1]) {
                        this.swap(index + 1, index)
                    }
                }
            }
        }
        lastIndex--
    }
}