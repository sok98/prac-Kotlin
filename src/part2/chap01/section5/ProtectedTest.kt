package part2.chap01.section5

open class Base {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }
    fun access() {
        protectedFunc()
    }
    protected class Nested
}

class Derived : Base() {
    var j = 1 + i
    fun derivedFunc() : Int {
        protectedFunc()
        return i
    }
}

class Other {
    fun other() {
        val base = Base()
        //base.i = 3
    }
}

fun main() {
    val base = Base()
    //base.i
    //base.protectedFunc()
    base.access()
}