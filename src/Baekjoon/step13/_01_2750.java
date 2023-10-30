package Baekjoon.step13;

import java.util.Scanner;

public class _01_2750 {
    // 수 정렬하기 (버블정렬)
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // 버블 정렬
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length -1 ; j > i; j--) { // 비교
                if (arr[j-1] > arr[j]) { // arr[j]가 더 작다면 swap(교환)
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        // 출력
        for (int output : arr) {
            System.out.println(output);
        }
    }
}
