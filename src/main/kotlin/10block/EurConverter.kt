package `10block`

class EurConverter : CurrencyConverter {
    override val currencyCode: String = "EUR"
    override fun convertToRub(amount: Double): Double = amount / 88.8
}