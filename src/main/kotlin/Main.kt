import java.net.InetAddress

fun main() {
    println(
        connectionManager("www.google.com")
    )
}

private val connectionManager: (address: String) -> Boolean = { address ->
    try {
        InetAddress.getByName(address)
            .isReachable(3000)
    } catch (e: Exception) {
        println(e.stackTraceToString())
        false
    }
}