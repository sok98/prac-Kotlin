package part2.chap01.section2

class Bird/*(var name: String, val wing: Int,  var beak: String)*/ {  //주 생성자

    //프로퍼티
    var name : String
    var wing : Int
    var beak : String

    constructor(name: String, wing: Int, beak: String) { //부 생성자
        this.name = name
        this.wing = wing
        this.beak = beak
    }

    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
    }


  /*  init {
        println("-------------init start ----------------")
        name = name.capitalize()    //capitalize(): 문자열 첫 문자를 대문자로 바꿈
        println("name: $name, wing: $wing, beak: $beak")
        println("-------------init end ----------------")

    }*/

    //메서드
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco", 2, "long")
    val coco2 = Bird("coco", "long")

    //coco.name = "coco"
    coco.fly()
    println(coco.name)
    println(coco.wing)
    println(coco.beak)

    println("coco2: name: ${coco2.name}, wing: ${coco2.wing}, beak: $coco2.beak")
}