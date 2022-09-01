package bekzat_tasks
fun main(){
    val numbersMap = mapOf(2 to 1, "2" to 2, "3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("2" in numbersMap) println("Value by key \"2\": ${numbersMap["3"]}")
    if (2 in numbersMap.values) println("The value 2 is in the map")
    if (numbersMap.containsValue(2)) println("The value 1 is in the map") // same as previous
    val Maps = mutableMapOf("one" to 1, "two" to 2)
    Maps.put("three", 3)
    Maps["one"] = 11

}

fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { it % 2 == 0 }
