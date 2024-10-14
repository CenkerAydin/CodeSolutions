package kotlin.leetcode.easy
//Link -> https://leetcode.com/problems/palindrome-number/description/
fun main() {
    println(isPalindrome(121)) //true
    println(isPalindrome(-121)) //false
    println(isPalindrome(10)) //false
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    var original = x
    var reversed= 0;
    while (original !=0 ){
        reversed= reversed *10 + original % 10
        original /= 10
    }
    return x == reversed
}