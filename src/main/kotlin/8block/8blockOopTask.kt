package `8block`

import kotlin.random.Random

fun main() {

    var natureReserve = NatureReserve()
    println(natureReserve.list.size)
    var count = 3

    for (i in 1..count) {
        for (j in 0..natureReserve.list.size - 1) {
            var randomFun = Random.nextInt(1, 4)
            when (randomFun) {
                1 -> {
                    val baby = natureReserve.list[j].createAnimal()
                    natureReserve.list.add(baby)
                }
                2 -> {
                    natureReserve.list[j].eat()


                }
                3 -> {
                    natureReserve.list[j].sleep()
                }
                4 -> {
                    natureReserve.list[j].move()
                }
            }


        }
        //var candidatesToRemove = natureReserve.list
        /* 1. обратиться к созданному списку экземпляров
           2. проверить все экземляры на условие по возрасту, т.е.
           if (currentAge < maxAge)
                removeAt() // удалить из списка экземпляры, подходящие под условие
            3. вписать в цикл, чтобы функция removeAt() выполнялась в конце каждой итерации
        */
        /*   for (j in 0..natureReserve.list.size - 1) {

               if (natureReserve.list[j].isTooOld())
                   natureReserve.list.remove(natureReserve.list[j])
           }*/
        //natureReserve.list.removeIf { it.isTooOld() }
        val emptyList = mutableListOf<Animal>()
        for (j in 0..natureReserve.list.size - 1) {
            if (natureReserve.list[j].isTooOld())
                emptyList.add(natureReserve.list[j])
        }

        for (j in 0..emptyList.size - 1) {
            println("Old animals - ${emptyList[j].name}")
            natureReserve.list.remove(emptyList[j])
        }
        println(natureReserve.list.size)

        if (natureReserve.list.size == 0) {
            println("All animals are dead")
            break
        }

    }
    if (natureReserve.list.size > 0) {
        println(natureReserve.list.size)
    }

}