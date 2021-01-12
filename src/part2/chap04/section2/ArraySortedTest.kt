package part2.chap04.section2

import java.util.*

fun main() {
    val arr = arrayOf(8,4,3,2,5,9,1)

    val sortedArr = arr.sortedArray()
    println(Arrays.toString(sortedArr))

    val sortedArrDesc = arr.sortedArrayDescending()
    println(Arrays.toString(sortedArrDesc))

    arr.sort(1,3)
    println(Arrays.toString(arr))
}