package bekzat_tasks
/*A generic unordered collection of elements that does not support duplicate elements.
 Methods in this interface support only read-only
access to the set; read/write access is supported through the MutableSet interface.*/

fun main(){
    val number = mutableListOf("one", "five", "six")
    val numbers = setOf(1, 2, 3, 4,4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")
    number.add(2, "two")
    number[1] =  "two"
    number.fill("one")
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())
}
