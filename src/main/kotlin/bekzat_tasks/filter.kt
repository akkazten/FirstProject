package bekzat_tasks

import org.jetbrains.annotations.Nullable
import java.awt.List

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val mix = listOf(2, null, "three", "four")
    val nums = listOf(1,2,3,4,5,5,6)
    val longerThan3 = numbers.filter { it.length > 3 }
    val comparison = nums.filter { it<5 }
    val filteredIdx = numbers.filterIndexed { index, s -> (index != 0) && (s.length < 5)  }
    val filteredIdx1 = nums.filterIndexed { index, s ->(s < 2)  }
    val filteredNot = numbers.filterNot { it.length <= 3 }
    val filteredNot1 = nums.filterNot { it <= 3 }
//filterIsInstance() returns collection elements of a given type.
    mix.filterIsInstance<Integer>().forEach{
    }
    val (match, rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)
    }

    //var longerThan3 = carsList.filter {  }
