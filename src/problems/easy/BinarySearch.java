package problems.easy;

//Problem Linki -> https://leetcode.com/problems/binary-search/description/

public class BinarySearch {

    public int search(int[] nums, int target) {
        int low =0 , high = nums.length-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
