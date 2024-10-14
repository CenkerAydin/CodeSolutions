package java.leetcode.easy;

//Problem Linki -> https://leetcode.com/problems/valid-anagram/description/

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        String normalizedStr1 = s.replaceAll("\\s", "").toLowerCase();
        String normalizedStr2 = t.replaceAll("\\s", "").toLowerCase();

        char[] charArray1 = normalizedStr1.toCharArray();
        char[] charArray2 = normalizedStr2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
