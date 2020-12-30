package part2.chap02.section3

class Person {
    var id: Int = 0
    var name: String = "Yeseul"
    companion object{
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person.language)
    Person.language = "English"
    println(Person.language)
    Person.work()
}