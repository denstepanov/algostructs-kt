package algorithms.sorts

import org.example.utils.swap

/**
 * Сортировка вставками
 *
 * Сортировка состоит из двух массивов: первый - отвечает за размер подмассива,
 * второй - пробегает подмассив в обратном порядке и размещает последний элемент подмассива в подходящее место.
 * Как работает вложенный цикл:
 * 1. Берёт последний элемент подмассива,
 * 2. Проводит две проверки над ним: если больше нуля И меньше предыдущего элемента, тогда меняем текущий и предыдущий элемент местами
 * 3. В ином случае сбрасывает вложенный цикл, тем самым "говоря" что текущий элемент находится на своём месте.
 *
 * // Лучший случай O(n)
 * // Средний случай O(n^2)
 * // Худший случай O(n^2)
 */
fun <T : Comparable<T>> MutableList<T>.insertionSort(descendantOrder: Boolean = false) {
    for (sublistLastIndex in this.indices) {
        for (index in sublistLastIndex downTo 0) {
            when (descendantOrder) {
                false -> {
                    if (index > 0 && this[index] < this[index - 1]) {
                        this.swap(index, index - 1)
                    }
                    else {
                        break
                    }
                }
                true -> {
                    if (index > 0 && this[index] > this[index - 1]) {
                        this.swap(index, index - 1)
                    }
                    else {
                        break
                    }
                }
            }

        }
    }
}