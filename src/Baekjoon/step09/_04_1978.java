package Baekjoon.step09;

import java.util.Scanner;

public class _04_1978 {
    // 소수 찾기
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0; // 소수 체크할 변수 선언
        for (int i = 0; i < N; i++) { // 소수 찾기
            int num = sc.nextInt();
            int factorCount = 0;
            for (int j = 1; j <= num; j++) { // 해당 수의 약수 찾기
                if(num % j == 0) factorCount++;
            }
            if (factorCount == 2) count++;
        }
        System.out.print(count); // 출력
    }
}
