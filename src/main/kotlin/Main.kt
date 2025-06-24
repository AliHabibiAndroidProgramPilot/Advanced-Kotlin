fun main() {
    val emotions = "happiness sadness embarrassment amazed excited"
    println(emotions.wordCount())
}

// Extension function implemented on String class!
private fun String.wordCount(): Short {
    return this.split(' ').size.toShort()
}