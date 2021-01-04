package part2.chap03.section2

interface Switcher {
    fun on() : String
}

class Smartphone(val model: String) {

    private val cpu = "Exynos"

    inner class ExternalStorage(val size : Int) {
        fun getInfo() = println("$model : Installed on $cpu with $size Gb")
    }

    fun powerOn(): String{
        class Led(val color: String) {
            fun blink() = "Blinking $color on $model"
        }
        val powerStatus = Led("red")
        //return powerStatus.blink()
        val powerSwitch = object : Switcher {
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(128)
    mySdcard.getInfo()
    println(Smartphone("S8").powerOn())
}