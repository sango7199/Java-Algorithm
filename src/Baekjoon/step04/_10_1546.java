package Baekjoon.step04;

import java.util.Scanner;

public class _10_1546 {
    // 평균
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 과목 수
        double[] arr = new double[N]; // 시험 점수 입력할 배열

        int Max = 0;
        for (int i = 0; i < N; i++) { // 점수 입력
            arr[i] = sc.nextInt();
            if (arr[i] > Max) Max = (int) arr[i]; // 최댓값 구하기
        }
        double avg = 0;
        for (int i = 0; i < N; i++) {
            avg += arr[i] / Max * 100;
        }
        System.out.print(avg / N);
        sc.close();
    }
}