package algostructs.algorithms.sorts

import algostructs.utils.swap

/**
 * Сортировка выбором
 *
 * Алгоритм использует два указателя, стартовые позиции которых на индексах 0 и 1 соответственно.
 * Значение первого указателя сравнивается со значением второго указателя
 * Второй указатель проходит по подмассиву и ищет наименьшее значение в нём
 * Индекс наименьшего значения в подмассиве сохраняется в отдельной переменной
 * После того как второй указатель прошёл весь подмассив, происходит сравнение значения первого указателя и наименьшего найденного значения подмассива
 *
 * Во всех случаях O(n^2)
 */

// TODO: Запилить сортировку в обратном порядке.
fun <T : Comparable<T>> MutableList<T>.selectionSort() {
    val lastIndex = this.size
    for (firstPointer in this.indices) {
        var minValueIndex = firstPointer
        val sublistStart = firstPointer + 1
        if (sublistStart <= lastIndex) {
            for (secondPointer in sublistStart until lastIndex) {
                if (this[secondPointer] < this[minValueIndex]) {
                    minValueIndex = secondPointer
                }
            }

            if (this[firstPointer] > this[minValueIndex]) {
                this.swap(firstPointer, minValueIndex)
            }
        }
    }
}