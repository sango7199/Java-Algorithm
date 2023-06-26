package Baekjoon.step04;

import java.io.*;
import java.util.StringTokenizer;

public class _09_10811 {
    // 바구니 바꾸기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // N개의 바구니
        int M = Integer.parseInt(st.nextToken()); // M번의 반복

        int[] arr = new int[N]; // N개의 바구니 선언
        for (int i = 0; i < N; i++) { // 비구니에 수 입력
            arr[i] = i + 1;
        }
        for (int i = 0; i < M; i++) { // 바구니 순서 역순으로 배치
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) - 1; // I부터(인덱스 번호라 -1)
            int J = Integer.parseInt(st.nextToken()) - 1; // J까지
            for (int j = 0; j < ((J - I) + 1) / 2; j++) { // [((J - I) + 1) / 2]번을 반복
                // swap
                int temp = arr[I + j];
                arr[I + j] = arr[J - j];
                arr[J - j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) { // 출력
            bw.write(arr[i] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
