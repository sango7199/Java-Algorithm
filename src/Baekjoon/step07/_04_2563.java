package Baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04_2563 {
    // 색종이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] arr = new boolean[100][100]; // 가로 세로 100인 정사각형 도화지
        int N = Integer.parseInt(br.readLine()); // 색종이 갯수
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // x 시작점
            int y = Integer.parseInt(st.nextToken()); // y 시작점
            for (int j = y; j < y + 10; j++) { // y좌표부터 10칸
                for (int k = x; k < x + 10; k++) { // x좌표부터 10칸
                    arr[j][k] = true; // 색종이 칠하기
                }
            }
        }
        int count = 0; // 칠해진 부분 넓이 측정 변수
        for (int i = 0; i < arr.length; i++) { // 넓이 측정
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == true) count++;
            }
        }
        System.out.print(count); // 출력
        br.close();
    }
}
