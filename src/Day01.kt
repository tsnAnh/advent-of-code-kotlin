fun main() {
    fun part1(input: List<String>): Int {
        return input
            .joinToString(separator = "\n")
            .split("\n\n")
            .maxOfOrNull { it.split("\n").sumOf { value -> value.toInt() } }!!
    }

    fun part2(input: List<String>): Int {
        return input
            .joinToString(separator = "\n")
            .split("\n\n")
            .map { it.split("\n").sumOf { value -> value.toInt() } }
            .sortedDescending()
            .take(3)
            .sum()
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
