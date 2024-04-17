package algostructs.algorithms.sorts

/**
 * Быстрая сортировка слиянием
 *
 * Деление массива на две части. Затем деление частей на части до тех пор, пока изначальный массив не будет покрошен на отдельные элементы.
 * Затем эти элементы начинаем собирать.
 * Как только массивы будут собраны, следует проводить слияние следующих пар массивов, до тех пор пока не придём к итоговому массиву.
 *
 * Во всех случаях O(n log n)
 */

// TODO: Запилить сортировку в обратном порядке.
// TODO: in-place (без использования дополнительного массива)
fun <T : Comparable<T>> MutableList<T>.mergeSort() {
    val sorted = sort(this)
    // Замена элементов исходного массива на значения из отсортированного массива.
    for (i in this.indices) {
        this[i] = sorted[i]
    }
}

private fun <T : Comparable<T>> sort(list: MutableList<T>): MutableList<T> {
    if (list.size < 2) {
        return list
    }

    val mid = list.size / 2
    val left = list.slice(0 until mid).toMutableList()
    val right = list.slice(mid until list.size).toMutableList()
    return merge(sort(left), sort(right))
}

private fun <T : Comparable<T>> merge(left: MutableList<T>, right: MutableList<T>): MutableList<T> {
    val leftSize = left.size
    val rightSize = right.size
    val totalSize = leftSize + rightSize
    var leftPointer = 0
    var rightPointer = 0

    val result = ArrayList<T>(totalSize)

    for (i in 0 until totalSize) {
        if (leftPointer < leftSize && rightPointer < rightSize) {
            // Сравнение элементов из массивов и перемещение наименьшего значения в result.
            if (left[leftPointer] > right[rightPointer]) {
                result += right[rightPointer]
                rightPointer++
            } else {
                result += left[leftPointer]
                leftPointer++
            }
            // Закидывание оставшихся элементов из массивов.
        } else if (rightPointer < rightSize) {
            result += right[rightPointer]
            rightPointer++
        } else if (leftPointer < leftSize) {
            result += left[leftPointer]
            leftPointer++
        }
    }
    return result
}