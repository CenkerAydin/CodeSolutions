package java.cses;

import java.util.Scanner;

//Problem Linki -> https://cses.fi/problemset/task/1068

public class WeirdAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        weirdd(n);
    }

    public static void weirdd(Long n) {

        while (n !=1){
            if (n % 2 == 0){
                System.out.print(n +" ");
                n /=2;
            }else {
                System.out.print(n+ " ");
                n = (n*3) +1;
            }
        }
        System.out.println(n);
    }
}
