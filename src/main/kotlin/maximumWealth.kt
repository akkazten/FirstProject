import java.util.*

fun main(){
    val nums = arrayOf(3, 2, 1, 4,0)
    val shuffled = IntArray(nums.size)
    println(Arrays.toString(shuffled))
    var table = Array(3, { Array(3, {2}) })
    println(table)
    var maxWealth = 0
    for (i in table.indices) {
        var sum = 0
        for (j in table[i].indices) {
            sum += table[i][j]

        }
        if (sum > maxWealth) maxWealth = sum
        println(sum)


    }
    val numbers = IntArray(6)
    println(Arrays.toString(numbers))
    }

