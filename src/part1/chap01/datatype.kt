package part1.chap01

//선언키워드 변수이름: 자료형 = "값"
//val : 불변형
//var : 가변형

fun main() {
    var username: String = "Kildong"
    var username2: String
    username2 = "Test"
    var count = 3
    username = "Dooly"

    println("username: $username, count: $count")
    println("username2: $username2")
}