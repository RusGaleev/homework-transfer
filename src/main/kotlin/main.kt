var commissionRate: Double = 0.0075
fun main() {
    val amount = 66793 //сумма перевода в копейках
    var commission = countCommission(amount)
    println("Комиссия составит $commission рублей")
}

private fun countCommission(amount: Int): Int {
    return (commissionRate * amount).toInt()
}
