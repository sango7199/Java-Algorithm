package Baekjoon.step08;

import java.util.Scanner;

public class _04_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        double value = 2;
        for (int i = 0; i < N; i++) {
            value += Math.pow(2, i);
        }
        System.out.print((int)(Math.pow(value, 2)));
    }
}
