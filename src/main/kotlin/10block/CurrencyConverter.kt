package `10block`

interface CurrencyConverter {
    val currencyCode: String
    fun convertToRub(amount: Double): Double
}