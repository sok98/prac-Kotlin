package part1.chap05.section2

// Alt + Enter = 빠른 수정

fun main() {
    var total = 0

    for (num in 0..99 step 2) { // 홀수 합
        total += num
    }
    println("total: $total")
}