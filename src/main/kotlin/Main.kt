fun main() {
    // implement a range to a list
    val rangeList = (0..10).toList()
    println(rangeList)

    // spilt a list with a delimiters
    val splitList = "Ali -- Alireza -- Mohammad -- Nazi -- Omid -- Ayda".split("--")
    println(splitList)

    // check multiple contains of a list
    val mainList = listOf<Int>(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    println(mainList.containsAll(listOf(40, 50, 60, 88)))

    // pull out a sub list from a list
    val subList = listOf<Int>(10, 11, 12, 13, 14, 15).subList(1, 4)
    println(subList)

    val reversed = listOf<Int>(10, 20, 30, 40, 50, 60, 70, 80, 90, 100).asReversed()
    println(reversed)
}