package part2.chap04.section1

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
    val obj1 : Parent = Child()
    val obj2 = Child()

    val obj3 = Cup<Parent>()
    val obj4 = Cup<Child>()
}