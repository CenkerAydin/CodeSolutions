package java.leetcode.easy;

//Problem Linki -> https://leetcode.com/problems/missing-number/description/

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int numsLength =nums.length;
        int sum= (numsLength*(numsLength+1)) / 2;
        int arrSum=0;
        for(int i = 0; i<numsLength ; i++){
            arrSum += nums[i];
        }
        return sum - arrSum;
    }
}
