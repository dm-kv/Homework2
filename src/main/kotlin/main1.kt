fun main() {
    var amount = 1_0000
    val tax = amount / 100 * 0.75
    val totalTax = if (tax > 35) tax else 35
    println(totalTax)
}