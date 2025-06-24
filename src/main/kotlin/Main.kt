import java.text.DecimalFormat

fun main() {
    val earthPeople = 8_000_000_000L
    println(DecimalFormat("#,###").format(earthPeople))
}