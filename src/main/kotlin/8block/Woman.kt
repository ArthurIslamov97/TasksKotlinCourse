package `8block`

class Woman(
    energy: Int,
    weight: Int,
    maxAge: Int,
    name: String
) : Animal(energy, weight, maxAge, name) {

    override fun move() {
        println("${name} is cooking")
    }

    fun cleanUp() {
        println("${name} is cleaning up the house")
    }


}