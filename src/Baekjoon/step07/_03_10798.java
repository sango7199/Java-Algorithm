package Baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_10798 {
    // 세로 읽기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) { // 입력
            str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < arr[0].length; i++) { // 출력
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] != '\0') System.out.print(arr[j][i]);
            }
        }
        br.close();
    }
}
