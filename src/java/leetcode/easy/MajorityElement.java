package java.leetcode.easy;

//Problem Linki -> https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=divide-and-conquer

public class MajorityElement {
    public int majorityElement(int[] nums) {
        insertionSort(nums);

        int n= nums.length;

        return nums[n/2];
    }

    static void insertionSort(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            int key = nums[i];
            int r = i - 1;

            while (r >= 0 && nums[r] > key) {
                nums[r + 1] = nums[r];
                r = r - 1;
            }
            nums[r + 1] = key;
        }
    }

}