package problems.easy

//Link -> https://leetcode.com/problems/fibonacci-number/

fun main() {
    println(fib(5))
}
fun fib(n: Int): Int {
    return when(n){
        0 -> 0
        1 -> 1
        else -> fib(n-1) + fib(n-2)
    }
}