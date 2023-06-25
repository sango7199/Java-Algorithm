package Baekjoon.step04;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _03_10818 {
    // 최소, 최대
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 첫째 줄 숫자 입력
        int[] arr = new int[N]; // N개의 배열 선언
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) { // 둘재 줄 숫자들 배열에 입력
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[N - 1]);
        br.close();
        bw.flush();
        bw.close();

        /* 시간 초과로 뜸 - 버블 정렬 이용하여 최소,최대 끝으로 이동
        for (int i = N -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        bw.write(arr[0] + " " + arr[N - 1]);
        br.close();
        bw.flush();
        bw.close();
         */
    }
}
