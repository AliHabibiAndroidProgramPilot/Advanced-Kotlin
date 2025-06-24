fun main() {
    println(
        12 isInRange (2..5)
    )
}

private infix fun Int.isInRange(range: IntRange) = this in range
