package Baekjoon.step05;

import java.io.*;
import java.util.StringTokenizer;

public class _08_1152 {
    // 단어의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); // st에 문자열 저장
        System.out.print(st.countTokens()); // countTokens() 메소드 이용하여 토큰 개수 세어 출력

        br.close();
    }
}
