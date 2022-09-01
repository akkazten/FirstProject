import java.util.*
fun isValids(s: String): Boolean {
    if(s.length % 2 != 0) return false
    val brackets = mapOf(')' to '(', '}' to '{', ']' to '[')

    val opened = arrayListOf<Char>()
    for(c in s) {
        if(c in brackets.values) {//[(, {, []
            opened.add(c)
        } else if(opened.size == 0 || brackets.get(c) != opened.removeAt(opened.size - 1)) {
            return false
        }
    }
    return opened.isEmpty()
}


fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.reversed().forEach {
        when (it) {
            '(' -> if (stack.isNotEmpty() && stack.peek() == ')') stack.pop() else stack.push(it)
            '[' -> if (stack.isNotEmpty() && stack.peek() == ']') stack.pop() else stack.push(it)
            '{' -> if (stack.isNotEmpty() && stack.peek() == '}') stack.pop() else stack.push(it)
            else -> stack.push(it)
        }
    }

    return stack.isEmpty()
}
fun main(args: Array<String>) {

    val result1 = isValid("{}4[[[[[[[{")
    val result = isValids("{}[]")
    println(result)
    val brackets = mapOf(')' to '(', '}' to '{', ']' to '[')
    println(brackets.values)
}