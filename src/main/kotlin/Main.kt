package module

fun main() {
        var firstName: String = "Arthur"
        var lastName: String = "Islamov"
        var height: Double = 175.0
        var weight: Float = 90F
        var isChild: Boolean = (height<150.0) || (weight<40)
        var info: String = "Name: $firstName; Last name: $lastName; height: $height; weight: $weight; Is he child? - $isChild"
        println(info)

        height = 180.0
        println(info)

        // Дополнительные пунты "По желанию"
        height = 145.0
        weight = 35F
        isChild = (height<150.0) || (weight<40)
        info = "Name: $firstName; Last name: $lastName; height: $height; weight: $weight; Is he child? - $isChild"
        println(info)




}