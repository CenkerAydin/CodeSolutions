package hackerrank

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    for (i in 0 until apples.size) {
        apples[i] += a
    }
    for (i in 0 until oranges.size) {
        oranges[i] += b
    }
    var countApple = 0
    for (i in apples.indices) {
        if (apples[i] in s..t) {
            countApple++
        }
    }
    var countOrange = 0
    for (i in 0 until oranges.size) {
        if (oranges[i] in s..t) {
            countOrange++
        }
    }
    println(countApple)
    println(countOrange)

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}