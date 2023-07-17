package Baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07_1316 { // 미해결
    // 그룹 단어 체커
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N개의 단어
        int count = 0; // 그룹 단어의 개수
        for (int i = 0; i < N; i++) {
            String str = br.readLine(); // 단어 입력
            char pre = str.charAt(0); // 전 알파벳 저장 변수 초기화
            boolean check = true; // 그룹단어 체크 변수
            for (int j = 1; j < str.length(); j++) { // 인덱스 1부터 단어 글자수 만큼 반복 비교
                if (pre != str.charAt(j)) { // 전 알파벳과 현재 알파벳 비교
                    for (int k = 0; k < j; k++) { // 다르다면 그 전에 같은 문자가 있었나
                        if (str.charAt(j) == str.charAt(k)) { // 0~k까지 비교 있었다면 false
                            check = false;
                            break;
                        }
                    }
                }
                pre = str.charAt(j); // 전 알파벳 재설정
            }
            if (check) { count++; } // 그룹단어라면 count++
        }
        System.out.println(count); // 출력
        br.close();
    }
}
