package problems.easy

//Link -> https://leetcode.com/problems/climbing-stairs/description/
fun main() {
    println(climbStairs(3)) //3
    println(climbStairs(5)) //8
}

fun climbStairs(n: Int): Int {
    if (n == 1) return 1
    if (n == 2) return 2

    var a = 1
    var b = 2

    for (i in 3..n) {
        val temp = a + b
        a = b
        b = temp
    }

    return b
}