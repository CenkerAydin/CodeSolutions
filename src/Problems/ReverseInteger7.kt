package Problems

class ReverseInteger7 {
    fun reverse(x: Int): Int {
    var original =x
    var reversed=0
    while (original !=0){
        val pop = original % 10
        original /=10

        if (reversed > Int.MAX_VALUE / 10 || (reversed == Int.MAX_VALUE / 10 && pop > 7)) {
            return 0
        }
        if (reversed < Int.MIN_VALUE / 10 || (reversed == Int.MIN_VALUE / 10 && pop < -8)) {
            return 0
        }
        reversed = reversed * 10 + pop

    }
        return reversed
    }
}