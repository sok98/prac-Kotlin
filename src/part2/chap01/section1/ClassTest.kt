package part2.chap01.section1

class Car {
    val wheel : Int = 4

    fun start() {
        println("Engine Start!")
    }
}

class Bird

fun main() {
    val sonata: Car = Car()

    println(sonata.wheel)
    sonata.start()
}