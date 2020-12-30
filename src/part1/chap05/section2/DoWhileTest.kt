package part1.chap05.section2

fun main() {

    // 5 -> 12345. 23451. 34512 ...

    do {
        print("Enter the number : ")
        val input = readLine()!!.toInt()

        for (i in 0 until input){
            for (j in 0 until input){
                print((i+j)%input +1)
            }
            println()
        }
    } while( input != 0) // 0 입력시 종료
}