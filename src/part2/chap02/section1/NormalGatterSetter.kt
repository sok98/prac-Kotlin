package part2.chap02.section1

import java.lang.AssertionError

class User(_id: Int, _name: String, _age: Int){
    val id: Int = _id
        get() = field

    private var tempName : String? = null
    var name: String = _name
        get(){
            if(tempName == null) tempName = "NONAME"
            return tempName?: throw AssertionError("Asserted by others")
        }
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value + 10
        }
}

fun main() {
    val user1 = User(1, "Kildong", 30)
    user1.age = 35
    println("user1.age = ${user1.age}")
    user1.name = "ABC"
    println("user1.name = ${user1.name}")
}