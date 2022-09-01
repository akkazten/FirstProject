import java.util.*

fun shuffle(nums: Array<Int>, n: Int): IntArray {
    val shuffled = IntArray(nums.size)
    var index = 0
    var left = 0
    var right = n
    while (right != nums.size) {
        shuffled[index++] = nums[left++]
        shuffled[index++] = nums[right++]
    }
    return shuffled
}

fun main(){
    var nums = arrayOf(1, 1, 1, 2,2,2)
    var n = 3
    val result = shuffle(nums, n)
    println( println(Arrays.toString(result)))
   }