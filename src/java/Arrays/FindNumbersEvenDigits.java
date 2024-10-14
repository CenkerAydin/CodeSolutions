package java.Arrays;

/*
Problem -> https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 */
public class FindNumbersEvenDigits {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digitCount = 0;
            int absNum = Math.abs(num);

            if (absNum == 0) {
                digitCount++;
            } else {
                while (absNum > 0) {
                    absNum /= 10;
                    digitCount++;
                }
            }
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
