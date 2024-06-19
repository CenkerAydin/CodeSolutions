package Arrays;

import java.util.Arrays;

/*
 Problem -> https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */
public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        return res;
    }

}
