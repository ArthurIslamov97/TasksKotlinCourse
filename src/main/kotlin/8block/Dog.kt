package `8block`

import kotlin.random.Random

class Dog(
    energy: Int,
    weight: Int,
    maxAge: Int,
    name: String
) : Animal(energy, weight, maxAge, name) {

    override fun move() {
        println("${name} is running")
    }

    override fun createAnimal(): Animal {
        println("${name} is creating offspring")
        var newenergy = Random.nextInt(1, 10)
        var newweight = Random.nextInt(1, 5)
        return Dog(newenergy, newweight, maxAge, name = "babyDog")
    }
}