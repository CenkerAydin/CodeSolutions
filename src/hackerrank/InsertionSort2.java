package hackerrank;

import java.util.ArrayList;
import java.util.List;

//Problem Linki -> https://www.hackerrank.com/challenges/insertionsort2/problem

public class InsertionSort2 {

    public static void insertionSort2(int n, List<Integer> arr) {
        int length = arr.size();
        for (int i = 1; i < length; i++) {
            int current = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > current) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, current);
            printArray(arr);

        }

    }

    public static void printArray(List<Integer> arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(3);
        insertionSort2(5, arr);
    }
}
