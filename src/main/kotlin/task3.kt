fun longestCommonPrefix(strs: Array<String>): String {
        var minText = strs[0]
        for (ind in 1 until strs.size) {
            if (strs[ind].length < minText.length) {
                minText = strs[ind]//grue
            }
        }

        val min = StringBuilder()
        for ((ind, letter) in minText.withIndex()) {
            // 0 g 1 r 2 u 3 e
            for (text in strs) {
                if (letter != text[ind]) {
                    return min.toString()
                }
            }
            min.append(letter)//g r
        }

        return if (min.isEmpty()) "" else min.toString()
    }
fun main(args: Array<String>) {
    var strs: Array<String> = arrayOf("green", "gred", "grue")
    val result3 = longestCommonPrefix(strs)
    println(strs[0][1])
    println(result3 )

}