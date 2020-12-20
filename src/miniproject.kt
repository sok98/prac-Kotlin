fun main() {
    var n = 1
    //var board = arrayOf({'a','b','c'}, {'d','e','f'}, {'g','h','i'})

  //  do {
        println("$n 번째 턴")
        println("  0  1  2")
        println("0   |  |")
        println("  --+--+--")
        println("1   |  |")
        println("  --+--+--")
        println("2   |  |")

        if (n % 2 != 0) {
            print("Player 1 입력 (줄, 칸) : ")
            var player1 = readLine()
        } else {
            print("Player 1 입력 (줄, 칸) : ")
            var player2 = readLine()
        }
  //  } while()
}

fun makeboard(board: Array<CharArray>) {
    print(" ")
    for(x in 0..2) print("$x ")
    println()

    for(y in 0..2){
        print("$y ")

    }

}