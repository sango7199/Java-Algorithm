package Baekjoon.step13;

import java.util.Scanner;

public class _01_2750_2 {
    // 수 정렬하기 (단순 삽입 정렬)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 정렬
        arrSort(arr, N);
        // 출력
        for (int Arr: arr) {
            System.out.println(Arr);
        }
    }

    static void arrSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int temp = a[i];
            for (j = i; j > 0 && a[j - 1] > temp; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }
}
