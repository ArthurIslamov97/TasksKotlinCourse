package `8block`

import kotlin.math.max
import kotlin.random.Random

open class Animal(var energy: Int, var weight: Int, var maxAge: Int, val name: String) {
    var currentAge: Int = 0

    fun isTooOld(): Boolean {
        if (currentAge > maxAge)
            return true
        else return false
    }

    open fun createAnimal(): Animal {
        println("${name} is creating offspring")
        var newenergy = Random.nextInt(1, 10)
        var newweight = Random.nextInt(1, 5)
        return Animal(newenergy, newweight, maxAge, name = "baby")
    }


    fun tryIncrementAge() {
        if (Random.nextBoolean()) {
            currentAge = currentAge + 1
        }
    }

    fun sleep() {
        energy = energy + 5
        currentAge = currentAge + 1
        println("${name} is sleeping")
    }

    fun eat() {
        energy = energy + 3
        weight = weight + 1
        tryIncrementAge()
        println("${name} is eating")
    }

    open fun move() {
        energy = energy - 5
        weight = weight - 1
        tryIncrementAge()
        println("${name} is moving")
    }


}