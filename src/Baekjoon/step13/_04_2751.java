package Baekjoon.step13;

import java.util.Arrays;
import java.util.Scanner;

public class _04_2751 {
    // 수 정렬하기
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 정렬 후 출력
//        Arrays.sort(arr); - 내장 정렬 사용했는데 시간 초과로 나옴

        // 버블 정렬 (시간 초과)
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = arr.length - 1; j > i; j--) {
//                if (arr[j-1] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }

        // 퀵 정렬
//        quickSort(arr, 0, N-1);

        // 출력
        for (int Arr: arr
             ) {
            System.out.println(Arr);
        }
    }
//    // 퀵 정렬 메소드
//    static void quickSort(int[] a, int left, int right) {
//        int pl = left; // 왼쪽 커서
//        int pr = right; // 오른쪽 커서
//        int x = a[(pl + pr) / 2]; // 가운데 요소
//
//        do {
//            while (a[pl] < x) pl++;
//            while (a[pr] > x) pr--;
//            if (pl <= pr) swap(a, pl++, pr--);
//        } while (pl <= pr);
//
//        if (left < pr) quickSort(a, left, pr);
//        if (pl < right) quickSort(a, pl, right);
//    }

    // swap 메소드
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
