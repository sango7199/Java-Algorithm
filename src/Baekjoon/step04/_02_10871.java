package Baekjoon.step04;

import java.util.Scanner;

public class _02_10871 {
    // X보다 작은 수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 첫째 자리 수 입력
        int X = sc.nextInt(); // 둘쨰 자리 수 입력
        int[] arr = new int[N]; // N개의 배열 선언
        for (int i = 0; i < N; i++) { // 둘째 줄 숫자들 배열에 입력
            arr[i] = sc.nextInt();
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
