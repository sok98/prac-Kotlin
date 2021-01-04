package part2.chap04.section1

open class Animal(val size : Int)

class Cat(val jump: Int) : Animal(50)

class Spider(val poison : Boolean) : Animal(1)

class Box1<out T>

fun main() {
    val c1 = Cat(10)
    val s1 = Spider(true)

    var a1 : Animal = c1
    a1 = s1
    println("s1 ${a1.size} ${a1.poison}")

    val b1: Box1<Animal> = Box1<Animal>()
    val b2: Box1<Cat> = Box1<Cat>()
    val b3 = Box1<Spider>()
}