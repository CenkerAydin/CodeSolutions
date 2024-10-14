package java.leetcode.medium;

public class MaxSubArray {

    //Problem Linki -> https://leetcode.com/problems/maximum-subarray/description/

    public int maxSubArray(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {

            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();

        System.out.println(maxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray.maxSubArray(new int[]{5,4,-1,7,8}));
    }
}
