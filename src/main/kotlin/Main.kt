import java.net.InetAddress
import java.net.UnknownHostException

fun main() {
    val urls = listOf<String>(
        "www.google.com",
        "www.time.ir",
        "www.digikala.ir",
        "www.digikala.com",
        "www.youtube.com"
    )
    val availableUrls = checkUrlHealth(urls) {
        try {
            InetAddress.getByName(it).isReachable(1000)
        } catch (e: UnknownHostException) {
            e.cause
            false
        }
    }
    println(availableUrls)
}

private fun checkUrlHealth(urls: List<String>, healthChecker: (String) -> Boolean): List<String> {
    return urls.filter { healthChecker(it) }
}