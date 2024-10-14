package kotlin.leetcode.easy

//Problem Linki -> https://leetcode.com/problems/binary-search/description/

fun search(nums: List<Int>, target: Int) :Int{

    var low =0;
    var high =nums.size - 1
    while (low <= high){
        val mid = low + (high - low) / 2
        if (nums[mid] == target){
            return mid
        }
        if (nums[mid] > target){
            high = mid - 1
        }else{
            low = mid + 1
        }
    }
    return -1;
}