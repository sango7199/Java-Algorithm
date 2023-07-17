package Baekjoon.step07;

import java.util.Scanner;

public class _01_2738 {
    // 행렬 덧셈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N 입력
        int M = sc.nextInt(); // M 입력
        int [][] arr = new int[N][M]; // 2차원 배열 선언
        for (int k = 0; k < 2; k++) { // 2번 입력
            for (int i = 0; i < N; i++) { // 2차원 배열 입력
                for (int j = 0; j < M; j++) {
                    arr[i][j] += sc.nextInt();
                }
            }
        }
        for (int i = 0; i < N; i++) { // 출력
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
