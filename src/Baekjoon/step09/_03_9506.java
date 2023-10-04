package Baekjoon.step09;

import java.util.Scanner;

public class _03_9506 {
    // 약수들의 합
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        while (true) {
            int N = sc.nextInt();
            if (N == -1) break; // N이 -1이라면 종료

            int[] arr = new int[N]; // 약수 담을 배열 선언
            int total = 0; // 약수의 총합 변수 선언
            int j = 0;
            for (int i = 1; i < N; i++) { // 약수 구하기
                if (N % i == 0) {
                    arr[j] = i;
                    j++;
                }
            }
            // 완전수 구하기
            for (int i = 0; i < arr.length; i++) { // 약수 전체 더하기
                total += arr[i];
            }
            if (N == total) { // 완전수일 경우
                output.append(N + " = " + arr[0]);
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] == 0) break;
                    else { output.append(" + " + arr[i]); }
                }
                output.append("\n");
            } else { // 완전수가 아닐 경우
                output.append(N + " is NOT perfect.\n");
            }
        }
        // 출력
        System.out.print(output);
    }
}
