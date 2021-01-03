var x: Int = 0
var y: Int = 0
var board = arrayOf(arrayOf(' ',' ',' '),
    arrayOf(' ',' ',' '),
    arrayOf(' ',' ',' '))

fun main() {
    val names = arrayOf("Player1", "Player2")
    val marks = arrayOf('O', 'X')

    play(board, names, marks)
}

// 게임 보드 출력
fun printboard(board: Array<Array<Char>>) {
    print("  ")
    for(x in 0..2) print("$x ")
    println()
    for(y in 0..2){
        print("$y ")
        for(z in 0..2) {
            print(board[y][z])
            if(z!=2) print("|")
        }
        println()
        if(y!=2) println("  -+-+-")
    }
}

//칸이 비었는지 검사 : 비어있으면 true
fun isValid(board:Array<Array<Char>>, x:Int, y:Int): Boolean{
    if(board[x][y] == ' ') return true
    return false
}

//줄, 칸 입력 후 대입
fun playerInput(player: String): Boolean {
    print("$player 입력 (줄, 칸): ")
    val input = readLine()
    var arr = input!!.split(",")
    y = arr[0].toInt()
    x = arr[1].toInt()

    return isValid(board, x, y)
}

//이겼는지 검사 : 0=승리 / 1=무승부 / 2=진행중
fun isWin(board: Array<Array<Char>>, mark: Char): Int {
    //가로 세로 판별
    for(i in 0..2) {
        if ((mark == board[i][0] &&
            board[i][0] == board[i][1] &&
            board[i][1] == board[i][2])
            ||
            (mark == board[0][i] &&
            board[0][i] == board[1][i] &&
            board[1][i] == board[2][i])) return 0
    }
    //대각선 판별
    if ((mark == board[1][1] &&
        board[1][1] == board[0][0] &&
        board[1][1] == board[2][2])
        ||
        (mark == board[1][1] &&
         board[1][1] == board[0][2] &&
         board[1][1] == board[2][0])) return 0

    //공백 판별 (진행중)
    for(i in 0..2) {
        for (j in 0..2) {
            if (board[i][j] == ' ') return 2
        }
    }
    //무승부
    return 1

}

//play
fun play(board: Array<Array<Char>>, name: Array<String>, mark: Array<Char>) {

    var round = 0
    var turn = 0

    while(true){
        println("\n ${round+1}번째 턴 \n")
        printboard(board)
        if(playerInput(name[turn])){
            board[x][y] = mark[turn]
        } else{
            println("이미 입력된 칸입니다.")
        }

        // 승리 검사
        var win = isWin(board, mark[turn])
        if(win == 0){
            printboard(board)
            println("${name[turn]} 승리 !")
            break
        } else if (win == 1) {
            printboard(board)
            println("무승부입니다.")
            break
        }

        when(turn){
            0-> turn=1
            1-> turn=0
        }
        round++

    }
}