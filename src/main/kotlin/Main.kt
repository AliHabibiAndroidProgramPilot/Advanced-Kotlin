fun main() {
    val average: (number1: Int, number2: Int) -> Int = { number1, number2 ->
        (number1 + number2) / 2
    }
    println(average(10, 20))

    val sayHello: (name: String) -> String = { name ->
        "Hello, Welcome $name"
    }
    println(sayHello("Ali"))
}
