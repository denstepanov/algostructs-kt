package algostructs.algorithms

fun isPalindrome(input: String): Boolean {
    if (input.isBlank()) {
        return true
    }

    val reversed = reverseString(input)
    return input == reversed
}

private fun reverseString(input: String): String {
    var reversed = ""
    for (i in input.length -1 downTo 0) {
        reversed += input[i]
    }
    return reversed
}