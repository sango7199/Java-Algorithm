package Baekjoon.step04;

import java.io.*;
import java.util.StringTokenizer;

public class _05_10810 {
    // 공 넣기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 반복 횟수

        int[] arr = new int[N]; // 배열 선언
        int I, J, K = 0; // 입력받을 I J K 선언
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            I = Integer.parseInt(st.nextToken());
            J = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            for (int j = I - 1 ; j <= J - 1; j++) { // I번부터 J번까지
                arr[j] = K; // 바구니에 K번 공 넣기
            }
        }
        for (int basket : arr) {
            bw.write(basket + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
