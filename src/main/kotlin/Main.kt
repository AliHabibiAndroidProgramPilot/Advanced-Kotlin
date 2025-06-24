fun main() {
    val emotions = "happiness sadness embarrassment amazed excited"
    println(emotions wordCount 10)
}

// Extension function implemented on String class!
private infix fun String.wordCount(limit: Int): Short {
    val count: Short = this.split(' ').size.toShort()
    return if (count <= limit) count
    else 0
}