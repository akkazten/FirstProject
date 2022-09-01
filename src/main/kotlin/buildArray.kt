import java.util.Arrays

fun main() {
    val nums = arrayOf(3, 2, 1, 4,0)
    /*
    val numbers = Array(5, {0})
    for (i in 0..(nums.size)- 1){
        numbers[i]=nums[nums[i]]
    }
     */
    var numbers = nums
    for (i in 0..nums.size-1){
        numbers[i]=nums[nums[i]]
    }
    print(Arrays.toString(numbers))
}
