package Baekjoon.step12;

import java.util.Scanner;

public class _02_2231 {
    // 분해합
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        // 분해합 계산
        int result = 0;
        int total = 0;
        boolean check = false;
        for (int i = 1; i <= N; i++) {
            int M = i;
            total = M;
            while (M >= 1) {
                int digit = M % 10;
                total += digit;
                M /= 10;
            }
            if (total == N) {
                check = true;
                result = i;
                break;
            }
        }
        int output = (check) ? result : 0;
        System.out.print(output);
    }
}
