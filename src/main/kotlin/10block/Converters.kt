package `10block`

object Converters {

    private val converters = hashMapOf<String, CurrencyConverter>(
        "USD" to UsdConverter(),
        "EUR" to EurConverter(),
        "ZWD" to ZwdConverter()
    )


    fun get(currencyCode: String): CurrencyConverter {
        return converters[currencyCode] ?: object : CurrencyConverter {
            override val currencyCode: String = currencyCode
            override fun convertToRub(rubles: Double): Double = rubles
        }
    }


}