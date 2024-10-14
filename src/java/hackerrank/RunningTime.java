package java.hackerrank;

import java.util.List;

//Problem Linki -> https://www.hackerrank.com/challenges/runningtime/problem

public class RunningTime {

    public static int runningTime(List<Integer> arr) {
        int shift=0;
        int length = arr.size();
        for (int i = 1; i < length; i++) {
            int current = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > current) {
                arr.set(j + 1, arr.get(j));
                j--;
                shift++;
            }
            arr.set(j + 1, current);
        }
        return shift;
    }
}
