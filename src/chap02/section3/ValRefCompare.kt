package chap02.section3

// == : 값만 비교
// === : 값과 참조 주소 비교
// 참조 주소가 달라지는 경우 : Int(기본형) != Int?(객체)

fun main() {
    val a: Int = 128
    val b = a

    println(a == b)
    println(a === b)

    val c : Int? = a
    val d : Int? = a
    val e : Int? = c

    println(c == d)
    println(c === d)
    println(c === e)
}