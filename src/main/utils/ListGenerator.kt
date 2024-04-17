package algostructs.utils

// TODO: Добавить функции для генерации списков разной степени перемешивания.
fun generateShuffledList(size: Int): MutableList<Int> {
    val list = mutableListOf<Int>();
    for (i in 0..<size) {
        list.add(i)
    }

    list.shuffle();
    return list;
}