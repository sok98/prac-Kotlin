package fastcampus

fun main(array: Array<String>){

    val cal : Calculator = Calculator(3,5)
    cal.plus()
    cal.minus()
    cal.multi()
    cal.division()

    println()
    val account : Bank = Bank("서예슬", 980523)
    account.deposit(100000)
    account.check()
    account.withdraw(3000)
    account.check()

    println()
    val tv : TV = TV()
    tv.tvOn()
    tv.change()
    tv.change("K사")
    tv.tvOff()

}

class Calculator(val a: Int, val b:Int){
    fun plus(){
        println(a+b)
    }
    fun minus(){
        println(a-b)
    }
    fun multi(){
        println(a*b)
    }
    fun division(){
        println(a/b)
    }
}

class Bank(var name:String, var birth: Int){
    var money: Int = 0
    init{
        println("$name 님 계좌를 생성하였습니다.")
    }

    fun check(){
        println("잔고 : $money")
    }

    fun withdraw(out_money:Int){
        println("$out_money 원 출금하였습니다.")
        money -= out_money
    }

    fun deposit(in_money:Int){
        println("$in_money 원 입금하였습니다.")
        money += in_money
    }
}

class TV(){
    var channel = mapOf<Int, String>(0 to "S사", 1 to "M사", 2 to "K사")
    var num : Int = 0
    fun tvOn(){
        println("TV를 켭니다.")
    }

    fun tvOff(){
        println("TV를 끕니다.")
    }

    fun change(){
        num = (num+1)%3
        var name = channel.get(num)
        println("$name 체널로 변경합니다.")
    }

    fun change(i : String){
        println("$i 채널로 변경합니다.")
    }
}