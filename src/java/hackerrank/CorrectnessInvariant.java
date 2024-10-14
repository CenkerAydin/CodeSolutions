package java.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Problem Linki -> https://www.hackerrank.com/challenges/correctness-invariant/problem

public class CorrectnessInvariant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        insertionSort(n, arr);

        scanner.close();
    }

    public static void insertionSort(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++) {
            int current = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > current) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, current);
        }
        printArray(arr);
    }

    public static void printArray(List<Integer> arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
