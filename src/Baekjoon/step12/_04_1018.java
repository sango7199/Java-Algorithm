package Baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04_1018 {
    // 체스판 다시 칠하기
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] chessboard = new char[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < M; j++) {
                chessboard[i][j] = str.charAt(j);
            }
        }
        br.close();
        // 체스판 검사
        int MIN = 0;
        int count = 0;
        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        char firstColor = chessboard[i+k][j];

                    }
                }
            }
        }
    }
}
