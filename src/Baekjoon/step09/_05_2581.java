package Baekjoon.step09;

import java.util.Scanner;

public class _05_2581 {
    // 소수
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int Min = -1; // 최솟값
        int total = 0; // 소수들의 총합
        for (int i = M; i <= N; i++) { // 소수 찾기
            int factorCount = 0;
            for (int j = 1; j <= i; j++) { // 해당 수 약수 찾기
                if (i % j == 0) factorCount++;
            }
            if (factorCount == 2) { // 약수라면 total에 더하여 저장
                if (Min == -1) { // 맨 첫 번째 소수는 Min에 저장
                    Min = i;
                    total += i;
                } else { total += i; }
            }
        }
        if (total != 0) System.out.println(total); // 소수가 있다면 총합 출력
        System.out.print(Min);
    }
}
