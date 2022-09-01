import java.util.Arrays

fun main(){
    var nums = arrayOf(1,2,3)
    val b: Array<Int> = nums.distinct().toTypedArray()
    var i = 0
    var count = 0

    while (i<nums.size) {
        var j = i + 1
        while(j>i && j<nums.size) {
            if (nums[i] == nums[j]) {
                count++
            }
            j++
        }
        i++
    }
    println(count)

}