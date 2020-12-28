package part2.chap01.section4.pri

class Person(firstName: String,
             out: Unit = println("[Primary Constructor] Parameter")) {   // 2 주 생성자

    val fName = println("[Property] Person fName: $firstName")  // 3 프로퍼티 할당

    init {
        println("[init] Person init block") // 4 초기화 블록
    }

    // 1 부 생성자
    constructor(firstName: String, age: Int,
                out: Unit = println("[Secondary Constructor] Parameter")): this(firstName) {
        println("[Secondary Constructor] body : $firstName, $age")   // 5 부 생성자 본문
    }
}

fun main() {
    val p1 = Person("Kildong", 30)
    println()
    val p2 = Person("Dooly")
}