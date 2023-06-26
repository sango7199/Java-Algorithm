package Baekjoon.step04;

import java.io.*;
import java.util.StringTokenizer;

public class _06_10813 {
    // 공 바꾸기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 반복 횟수

        int[] arr = new int[N]; // N개의 바구니 선언
        for (int i = 0; i < N; i++) { // 바구니에 적힌 번호와 같은 번호 입력
            arr[i] = i+1;
        }
        int I, J; // 서로 바꿀 수 선언
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            I = Integer.parseInt(st.nextToken()) - 1; // 인덱스 번호 -1
            J = Integer.parseInt(st.nextToken()) - 1;
            // swap
            int temp = arr[I];
            arr[I] = arr[J];
            arr[J] = temp;
        }
        for (int basket:arr) { // 출력
            bw.write(basket + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
