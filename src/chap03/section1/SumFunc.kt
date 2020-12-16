package chap03.section1

fun sum(a: Int = 2, b: Int = 5): Int {
    return a + b
} // 최상위 함수

fun max(a: Int, b: Int) = if (a>b) a else b

fun outfunc(name: String): Unit {
    println("Name: $name")
} // 반환형이 없는 함수


fun main() { //최상위 (Top-level) 함수
    val result1 = sum(2,3)
    val result3 = sum(b = 2) //default 사용
    println(result1)
    println(result3)

    val a = 3
    val b = 5
    val result2 = max(a, b)
    println(result2)

    outfunc("KilDong")
}