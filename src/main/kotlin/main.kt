var commissionRate: Double = 0.0075
fun main() {
    val amount = 667 //сумма перевода в копейках
    var commission = countCommission(amount)
    println("Комиссия составит $commission рублей")
}

private fun countCommission(amount: Int): Int {
    return if ((commissionRate * amount).toInt() < 35) 35 else (commissionRate * amount).toInt()
}
