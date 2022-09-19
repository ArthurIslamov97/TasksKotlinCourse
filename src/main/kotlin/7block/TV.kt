package `7block`

class TV(
    val brand: String,
    val model: String,
    val screenDiagonal: Double,
    private var onOrOff: Boolean,
    var volume: Int,
    private var chosenChannel: Int = 0

) {
    private var channelList: List<String> = ChannelsGenerator.getRandomChannels()


    fun getOnOrOff(): Boolean {
        return onOrOff
    }


    fun switch() {
        onOrOff = !onOrOff
    }

    fun volumeUp() {
        volume = volume + 10
    }

    fun volumeDown() {
        volume = volume - 15
    }


    fun setChannel(channel: Int) {
        onOrOff = true
        if (channel >= channelList.size || channel < 0) {
            println("Error")
            return
        }
        chosenChannel = channel

    }

    fun nextChannel() {
        onOrOff = true
        val nextChannel = chosenChannel + 1
        if (nextChannel < channelList.size) {
            chosenChannel = nextChannel
        }
    }

    fun previousChannel() {
        onOrOff = true
        val previousChannel = chosenChannel - 1
        if (previousChannel >= 0) {
            chosenChannel = previousChannel
        }

    }

    fun getSelectedChannel(): String {
        return channelList[chosenChannel]
    }

    fun printChannelList() {
        for (i in 0 until channelList.size) {
            println("$i - ${channelList[i]}")
        }
    }

    companion object {
        val maxVolume: Int = 100
    }


}