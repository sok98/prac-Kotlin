package part1.chap05.section2

fun main() {
    print("Enter the lines : ")
    val input = readLine()!!.toInt()

    for(i in 1..input){
        for (j in 0 until input-i ){
            print(" ")
        }
        for (k in 1 until 2*i ){
            print("*")
        }
        println()
    }
}