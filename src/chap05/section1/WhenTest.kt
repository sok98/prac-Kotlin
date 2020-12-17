package chap05.section1

// ctrl + / : 범위 주석처리

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade : Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
    }

//    if (score >= 90.0) {
//        grade = 'A'
//    } else if (score in 80.0 .. 89.9) {
//        grade = 'B'
//    } else if (score in 70.0 .. 79.9) {
//        grade = 'C'
//    }

    println("score: $score, grade: $grade")
}