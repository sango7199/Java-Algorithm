package Baekjoon.step12;

import java.util.Scanner;

public class _01_2798 {
    // 블랙잭
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // 경우의 수 계산
        int MAX = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum > MAX && sum <= M) MAX = sum;
                }
            }
        }
        System.out.print(MAX);
    }
}
