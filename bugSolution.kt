fun main() {
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val iterator = map.entries.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        if (entry.value % 2 == 0) {
            iterator.remove()
        }
    }
    println(map) // Output: {a=1, c=3}
} 