package Baekjoon.step13;

import java.io.*;
import java.util.Scanner;

public class _05_10989 {
    // 수 정렬하기 3 - 도수 정렬 (카운팅 정렬)
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        // 도수 정렬 최댓값 구하기
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        // 정렬
        countingSort(N, arr, max);
        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();

    }
    // 도수 정렬 메소드
    public static void countingSort(int n, int[] a, int max) {
        int[] f = new int[max + 1]; // 누적 도수
        int[] b = new int[n]; // 작업용 목표 배열

        for (int i = 0; i < n; i++) f[a[i]]++; // 1단계 도수 분포표 만들기
        for (int i = 1; i < f.length; i++) f[i] += f[i - 1]; // 2단계 누적 도수 분포표 만들기
        for (int i = n - 1; i >= 0; i--) b[--f[a[i]]] = a[i]; // 3단계 목표 배열 만들기
        for (int i = 0; i < n; i++) a[i] = b[i]; // 4단계 배열 복사
    }
}
