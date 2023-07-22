// Function to calculate EMI
private fun calculateEmi(
    principal: Float,
    interest: Float,
    duration: Float
): Float {
    var r = interest
    var t = duration
    r /= (12 * 100) // one month interest
    t *= 12 // one month period
    val emi = (principal * r * Math.pow((1 + r).toDouble(), t.toDouble()).toFloat()
            / (Math.pow((1 + r).toDouble(), t.toDouble()) - 1).toFloat())
    return emi
}

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