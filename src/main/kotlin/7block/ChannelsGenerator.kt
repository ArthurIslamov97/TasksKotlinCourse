package `7block`

import kotlin.random.Random

object ChannelsGenerator {

    private val listOfChannels = listOf<String>("First", "Russia", "TNT", "STS", "Discovery channel")

    fun getRandomChannels(): List<String> {
        val shuffledChannels = listOfChannels.shuffled(random = Random)
        val randomIndex = (0..shuffledChannels.size - 3).random()
        return shuffledChannels.subList(fromIndex = randomIndex, toIndex = shuffledChannels.size - 1)
    }




}