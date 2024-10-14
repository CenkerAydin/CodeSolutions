package java.leetcode.medium;

import java.util.Arrays;

//Problem Linki -> https://leetcode.com/problems/sort-colors/description/

public class SortColors {

    public static void sortColors(int[] IntArray) {
        int length = IntArray.length;
        for (int i = 1; i < length; i++){
            int current = IntArray[i];
            int j = i - 1;
            while (j >= 0 && IntArray[j] > current){
                IntArray[j + 1] = IntArray[j];
                j = j - 1;
            }
            IntArray[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Original Array: " + Arrays.toString(nums));
        sortColors(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}
