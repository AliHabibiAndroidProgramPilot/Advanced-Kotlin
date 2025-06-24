fun main() {
    val message = "Hello to Kotlin"
    showAlert(message) {
        println("test")
    }
}

private fun showAlert(text: String, listener: (text: String) -> Unit) {
    listener(text)
}
