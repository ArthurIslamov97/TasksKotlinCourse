package `10block`

class UsdConverter : CurrencyConverter {
    override val currencyCode: String = "USD"
    override fun convertToRub(amount: Double): Double = amount / 74.6
}