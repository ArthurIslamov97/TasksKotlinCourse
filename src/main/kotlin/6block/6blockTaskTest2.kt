package `6block`

fun nReader(n: Int): MutableList<String> {
    val list = emptyList<String>().toMutableList()

    for (i in 1..n) {
        list.add(readLine() ?: "")
    }
    return list

}

fun main() {

    println("Enter N-number")
    val n = readLine()?.toIntOrNull() ?: -1
    if (n > 0) {

        val nReaderResult = nReader(n).filter { element -> element.startsWith("+7") }
        println(nReaderResult)

        val uniqueNumbers = nReaderResult.toSet().size
        println(uniqueNumbers)
        println(nReaderResult.sumOf { it.length })

        val unique = nReaderResult.toSet()
        val uniqueNumbersMutableMap = mutableMapOf<String, String>()
            println("Enter abonents' names")
            for (uniqueNumber in unique) {
                uniqueNumbersMutableMap[uniqueNumber]= readLine()?: ""
            }
        for (number in uniqueNumbersMutableMap.keys) {
            println("Абонент:${uniqueNumbersMutableMap[number]}. Номер телефона: $number")
        }
        val sortedMap = uniqueNumbersMutableMap.toSortedMap()
            println(sortedMap.keys)
            println(sortedMap.values)
            }

    else {
        println("Input error")
    }


}