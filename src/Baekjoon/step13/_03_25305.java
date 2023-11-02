package Baekjoon.step13;

import java.util.Scanner;

public class _03_25305 {
    // 커트라인 (버블 정렬)
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // 버블 정렬 (내림차 정렬)
        for (int i = 0; i < N; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j-1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.print(arr[k - 1]);
    }
}
