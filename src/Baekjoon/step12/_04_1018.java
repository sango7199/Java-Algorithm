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
            String inputRow = br.readLine();
            for (int j = 0; j < M; j++) {
                chessboard[i][j] = inputRow.charAt(j);
            }
        }
        br.close();
        // 최솟값 구하기
        String whitePattern = "WBWBWBWB";
        String blackPattern = "BWBWBWBW";
        int MIN = 64;
        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                int whiteCount = 0, blackCount = 0, count = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) { // 첫 컬러가 화이트일 때
                        if ((k % 2) == 0) { // 짝수행은 화이트 패턴
                            if (chessboard[i+k][j+l] != whitePattern.charAt(l)) {
                                whiteCount++;
                            }
                        } else { // 홀수행은 블랙 패턴
                            if (chessboard[i+k][j+l] != blackPattern.charAt(l)) {
                                whiteCount++;
                            }
                        }
                    }

                    for (int l = 0; l < 8; l++) { // 첫 컬러가 블랙일 때
                        if ((k % 2) == 0) { // 짝수행은 블랙 패턴
                            if (chessboard[i+k][j+l] != blackPattern.charAt(l)) {
                                blackCount++;
                            }
                        } else { // 홀수행은 화이트 패턴
                            if (chessboard[i+k][j+l] != whitePattern.charAt(l)) {
                                blackCount++;
                            }
                        }
                    }
                }
                count = Math.min(whiteCount, blackCount); // 화이트일 때와 블랙일 때 비교 후 최솟값 저장
                if (MIN > count) MIN = count; // 최솟값보다 카운트가 작다면 저장
            }
        }
        System.out.print(MIN); // 출력
    }
}
