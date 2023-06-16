package Baekjoon.step03;

import java.util.Scanner;

public class _03_8393 {
    // 합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
