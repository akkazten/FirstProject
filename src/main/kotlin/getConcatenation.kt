package com.zetcode

import java.util.Arrays

fun main() {

    val nums = arrayOf(1, 2, 3, 4)
    val len = nums.size
    for (i in 1..len - 1){
        nums[i] = nums[i] + nums[i - 1]
    }
    print(Arrays.toString(nums))
}

