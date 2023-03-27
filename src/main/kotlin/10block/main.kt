package `10block`

fun main() {

    
    val usdConverter = Converters.get("USD")
    val eurConverter = Converters.get("EUR")
    val unknownConverter = Converters.get("ZWD")

    val amountInRub = 100.0
    val usdAmount = usdConverter.convertToRub(amountInRub)
    val eurAmount = eurConverter.convertToRub(amountInRub)
    val unknownAmount = unknownConverter.convertToRub(amountInRub)

    println("$amountInRub рублей = $usdAmount ${usdConverter.currencyCode}")
    println("$amountInRub рублей = $eurAmount ${eurConverter.currencyCode}")
    println("$amountInRub рублей = $unknownAmount ${unknownConverter.currencyCode}")
}