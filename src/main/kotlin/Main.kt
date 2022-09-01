//class Solution {
// test comment
    fun romanToInt(s: String): Int {
        var m1Value = 0
        var m2Value = 0

        var result = 0

        for(i in s.length - 1 downTo 0) {
            val letter = s[i]

            val value = getValue(letter)
            if(value >= m1Value) {
                result += value
            } else if ( m1Value >= m2Value ) {
                result -= value
            } else {
                throw Exception("Wrong number")
            }

            m2Value = m1Value
            m1Value = value
        }

        return result
    }

    fun getValue(letter: Char) = when(letter) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> throw Exception("Unexpected letter $letter")
    }

fun main(args: Array<String>) {
    val result1 = romanToInt("XXX")
    println(result1)

}

