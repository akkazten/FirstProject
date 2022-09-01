fun isPalindrome(x: Int): Boolean {
        var num = x.toString()
        var reverse = num.reversed()
        var Polindrom = reverse.toInt()
        return x == Polindrom
    }

fun main(args: Array<String>) {
    

    println("Program arguments: ${args.joinToString()}")
    val result = isPalindrome(122)
    println(result)
    val string = "Baeldung"
    println(string[3])


}