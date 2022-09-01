fun main() {
    val carsList = listOf<Car>()
    val cars = mutableListOf<Car>()
    cars.add(Car(
        name = "BMW",
        price = 20
    ))
    cars.add(Car(
        name = "MERS",
        price = 25
    ))
    cars.add(Car(
        name = "Nissan",
        price = 15
    ))

    cars.forEach {
        println(it)
    }

}

data class Car(
    val name: String,
    val price: Int
)
