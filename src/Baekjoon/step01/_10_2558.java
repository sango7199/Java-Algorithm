package Baekjoon.step01;

import java.util.Scanner;

public class _10_2558 {
    // 곱셈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // 값1 입력
        int num2 = sc.nextInt(); // 값2 입력
        int[] arr = new int[3];
        int rest; // 나머지
        int div = num2; // 몫

        for (int i = 0; i < arr.length - 1; i++) {
            rest = div % 10;
            arr[i] = rest;
            div /= 10;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d\n", num1 * arr[i]);
        }
        System.out.printf("%d\n", num1 * div);
        int total = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            total += num1 * arr[i] * Math.pow(10, i);
        }
        total += num1 * div * Math.pow(10, 2);

        System.out.printf("%d", total);
        sc.close();
    }
}
