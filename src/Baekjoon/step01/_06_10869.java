package Baekjoon.step01;

import java.util.Scanner;

public class _06_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print(num1 + num2);
        System.out.print(num1 - num2);
        System.out.print(num1 * num2);
        System.out.print(num1 / num2);
        System.out.print(num1 % num2);
        sc.close();
    }
}
