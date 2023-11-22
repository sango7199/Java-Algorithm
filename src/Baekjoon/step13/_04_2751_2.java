package Baekjoon.step13;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _04_2751_2 {
    // 수 정렬하기 2 - 병합 정렬
    static int[] buff; // 작업용 배열

    // 재귀적 병합 정렬
    static void __mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i; // 배열 a 위치용 변수
            int center = (left + right) / 2;
            int p = 0; // 임시배열 buff 위치용 변수
            int j = 0; // 배열 복사 후 buff 위치용 변수
            int k = left; // 배열 복사 후 배열 a 위치용 변수

//            if (buff == null || buff.length < right - left + 1) {
//                buff = new int[center];
//            }

            __mergeSort(a, left, center); // 전반부 병합정렬
            __mergeSort(a, center + 1, right); // 후반부 병합정렬

            for (i = left; i <= center; i++) { // 1. 배열 a의 전반부 buff로 복사
                buff[p++] = a[i];
            }

            while (i <= right && j < p) { // 2. buff와 후반부 비교 후 배열 a에 정렬
                a[k++] = (buff[j] <= a[i] ? buff[j++] : a[i++]);
            }

            while (j < p) { // 3. 남은 거 털기
                a[k++] = buff[j++];
            }
        }
    }

    // 병합 정렬
    static void mergeSort(int[] a, int n) {
        buff = new int[n];
        __mergeSort(a, 0, n -1);
        buff = null;
    }

    public static void main(String[] args) throws IOException {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // 정렬
        mergeSort(arr, N);

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
