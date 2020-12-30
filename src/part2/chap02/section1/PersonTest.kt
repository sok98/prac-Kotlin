package part2.chap02.section1

class Person(var id: Int, var name: String, var age: Int)

fun main() {
    val person = Person(1, "Kildong", 30)

    println("person: ${person.id}, ${person.name}, ${person.age}")
}