package `10block`

object Converters {

    private val converters = hashMapOf<String, CurrencyConverter>(
        "USD" to UsdConverter(),
        "EUR" to EurConverter()
    )

    val zwdConverter = object : CurrencyConverter {
        override val currencyCode = "ZWD"
        override fun convertToRub(amount: Double): Double {
            return amount / 0.24
        }
    }

    fun get(currencyCode: String): CurrencyConverter {
        return converters[currencyCode] ?: object : CurrencyConverter {
            override val currencyCode: String = currencyCode
            override fun convertToRub(rubles: Double): Double = rubles
        }
    }


}