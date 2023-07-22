import kotlin.math.pow

fun main() {
    val principal = 10000f
    val rate = 10f
    val time = 2f
    val emi = calculateEmi(principal, rate, time)

    println("Principal: $principal")
    println("Interest: $rate")
    println("Duration: $time years")
    println("EMI: $emi")
}

// Function to calculate EMI
private fun calculateEmi(
    principal: Float,
    interest: Float,
    duration: Float
): Float {
    var _interest = interest
    var _duration = duration

    _interest /= (12 * 100) // one month interest
    _duration *= 12 // one month period

    val emi =
        (principal * _interest * (1 + _interest).toDouble().pow(_duration.toDouble()).toFloat()
                / ((1 + _interest).toDouble().pow(_duration.toDouble()) - 1).toFloat())

    return emi
}
