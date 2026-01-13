fun main() {
    var pay = 15000
    val regularCustomer = true
    if (pay in 1001..10000) {
        pay -= 100
    } else if (pay > 10000) {
        pay -= pay / 20
    }
    val total = if (regularCustomer == true) pay - (pay / 100) else pay
    println(total)
}