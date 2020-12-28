package part2.chap01.section5

private class PrivateTest {
    private var i = 1
    private fun privateFunc() { //Private
        i += 1
        println(i)
    }
    fun access(){   //Public
        privateFunc()
    }
}

class OtherClass {
    private val pc = PrivateTest()  //공개 생성 불가
    fun test() {
        val pc = PrivateTest()
        pc.access()
    }
}

fun main() {
    val pc = PrivateTest()
    //pc.i= 3
    //pc.privateFunc()
    pc.access()
}

fun topFunction() {
    val pc = PrivateTest()
}