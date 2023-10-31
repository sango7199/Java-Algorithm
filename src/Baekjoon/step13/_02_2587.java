package Baekjoon.step13;

import java.util.Scanner;

public class _02_2587 {
    // 대표값2 (버블 정렬)
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // 버블 정렬
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        // 평균과 중앙값 구하고 출력
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total / arr.length);
        System.out.print(arr[2]);
    }
}
