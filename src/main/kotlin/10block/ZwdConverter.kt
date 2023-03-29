package `10block`

class ZwdConverter : CurrencyConverter {
    override val currencyCode: String = "ZWD"
    override fun convertToRub(amount: Double): Double = amount / 0.24

}