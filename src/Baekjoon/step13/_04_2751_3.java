package Baekjoon.step13;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _04_2751_3 {
    // 수 정렬하기 2 - 힙 정렬
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        heapSort(arr, N);
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1]; a[idx1] = a[idx2]; a[idx2] = temp;
    }

    // a[left]~a[right]를 힙으로 만듦
    static void downHeap(int[] a, int left, int right) {
        int temp = a[left]; // 루트
        int child; // 큰 값을 갖는 자식
        int parent; // 부모

        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1; // 왼쪽 자식
            int cr = cl + 1; // 오른쪽 자식
            child = (cr <= right && a[cr] > a[cl]) ? cr : cl; // 큰 쪽을 자식에 대입
            if (temp >= a[child]) break;
            a[parent] = a[child];
        }
        a[parent] = temp;
    }

    // 힙 정렬
    static void heapSort(int[] a, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) downHeap(a, i, n - 1);
        for (int i = n - 1; i > 0; i--) {
            swap(a, 0, i); // 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
            downHeap(a, 0, i - 1); // a[0]~a[i-1]을 힙으로 만듦
        }
    }
}
