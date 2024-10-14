package kotlin.leetcode.easy

//Link -> https://leetcode.com/problems/n-th-tribonacci-number/

fun main() {
    println(tribonacci(4))
}

fun tribonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1 || n == 2) return 1

    val tribonacciArr = IntArray(n + 1)
    tribonacciArr[0] = 0
    tribonacciArr[1] = 1
    tribonacciArr[2] = 1

    for (i in 3..n) {
        tribonacciArr[i] = tribonacciArr[i - 1] + tribonacciArr[i - 2] + tribonacciArr[i - 3]
    }

    return tribonacciArr[n]

}

