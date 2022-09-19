package `7block`

fun main() {

    val sony =
        TV(brand = "SONY", model = "Bravia", screenDiagonal = 55.0, onOrOff = false, volume = 15)


    println("Current TV status: ${printInfo(sony)}")
    sony.nextChannel()
    println("TV status: ${printInfo(sony)}")
    sony.previousChannel()
    println("TV status: ${printInfo(sony)}")



    println("TV status: ${printInfo(sony)}")

    sony.volumeUp()
    println("TV's volume up on 10 points: ${printInfo(sony)}")
    sony.volumeDown()
    println("TV's volume down on 15 points: ${printInfo(sony)}")

    sony.printChannelList()


    val toshiba =
        TV(brand = "TOSHIBA", model = "S1", screenDiagonal = 55.0, onOrOff = false, volume = 15)

    toshiba.printChannelList()

}

fun printInfo(tv: TV): String {
    var status: String
    if (tv.getOnOrOff()) {
        status = "ON"
    } else status = "OFF"

    return "Brand - ${tv.brand},model - ${tv.model}, screen diagonal - ${tv.screenDiagonal}, ON/OFF: $status, volume: ${tv.volume}, selected channel: ${tv.getSelectedChannel()}"

}