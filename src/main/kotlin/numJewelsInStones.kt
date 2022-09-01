import java.util.Arrays

fun main() {
    var jewels = "aA"
    var stones = "aAAbbbb"
    var count = 0
    val array1 = Array(stones.length) { stones[it].toString() }
    for (i in 0..array1.size - 1) {
        if (jewels.contains(stones[i]))
            count++
    }
    println(count)
}