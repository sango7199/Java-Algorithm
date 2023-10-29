package Baekjoon.step12;

import java.util.Scanner;

public class _06_2839 {
    // 설탕 배달
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // 봉지 수 계산
        int output = 0;
        while (N > 0) {
            if (N % 5 == 0) {
                output += N / 5;
                N = 0;
            } else {
                N -= 3;
                output++;
            }
        }
        if (N < 0) {
            System.out.print(-1);
        } else {
            System.out.print(output);
        }
    }
}
