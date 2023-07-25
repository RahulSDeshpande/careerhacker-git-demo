fun main() {
    val number1 = 20
    val number2 = 40

    // Print out data
    println("Number 1: $number1")
    println("Number 2: $number2")

    val sum = sum(number1, number2)
    println("Sum: $sum")
}

private fun sum(
    number1: Int,
    number2: Int
): Int {
    return number1 + number2
}