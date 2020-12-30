package part2.chap02.section2

class Person(){
    lateinit var name: String

    fun test(){
        if(!::name.isInitialized){
            println("not Initialized")
        } else {
            println("Initialized : $name")
        }
    }
}

fun main() {
    val person = Person()
    person.test()
    person.name = "Kildong"
    person.test()
    println("person.name = ${person.name}")
}