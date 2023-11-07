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

        //

        for (int Arr: arr
             ) {
            System.out.println(Arr);
        }
    }
}
