package `8block`

import kotlin.random.Random

class Bird(
    energy: Int,
    weight: Int,
    maxAge: Int,
    name: String
) : Animal(energy, weight, maxAge, name) {

    override fun move() {
        println("${name} is flying")
    }

    override fun createAnimal(): Animal {
        println("${name} is creating offspring")
        var newenergy = Random.nextInt(1, 10)
        var newweight = Random.nextInt(1, 5)
        return Bird(newenergy, newweight, maxAge, name = "babyBird")
    }
}