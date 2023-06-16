package Baekjoon.step03;

import java.util.Scanner;

public class _01_2739 {
    // 구구단
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}

