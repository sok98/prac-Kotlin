package part1.chap02.section3

// ?. : 세이프콜 - null이면 뒷부분 실행안함
// !!. : null일리 없다라고 단정. null이더라도 실행시킴. NPE 발생 가능성때문에 사용하지않는 것이 좋음
// Alt + Enter : 빠른 수정

fun main() {
    var str1: String?
    str1 = null
    var len = str1?.length ?: -1
    println(": $str1, length: $len")
    str1 = "Hello"
    println(": $str1, length: ${str1?.length}")
}

