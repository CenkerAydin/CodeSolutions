package kotlin.leetcode.easy


//Link -> https://leetcode.com/problems/power-of-two/description/
fun main() {
    println(isPowerOfTwo(2))
    println(isPowerOfTwo(3))
    println(isPowerOfTwo(16))
}

fun isPowerOfTwo(n: Int): Boolean {
    if (n <= 0) return false
    return (n and (n - 1)) == 0
}