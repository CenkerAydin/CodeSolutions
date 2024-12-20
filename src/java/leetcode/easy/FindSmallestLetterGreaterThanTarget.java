package java.leetcode.easy;

public class FindSmallestLetterGreaterThanTarget {

    //Problem Link -> https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left < letters.length ? letters[left] : letters[0];
    }
}
