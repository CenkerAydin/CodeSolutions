package java.leetcode.easy;

import java.util.HashSet;

// Problem Linki -> https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1})); //True
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4})); //False
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenElements = new HashSet<>();

        for (int num : nums) {
            if (!seenElements.add(num)) return true;
        }
        return false;
    }
}
