package Baekjoon.step05;

import java.util.Scanner;

public class _07_2675 {
    // 문자열 반복
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스
        for (int i = 0; i < T; i++) {
            int R = sc.nextInt(); // 문자 반복 횟수
            String S = sc.next(); // 반복할 문자
            String P = ""; // 출력할 변수 P
            for (int j = 0; j < S.length(); j++) {
                String temp = ""; // P에 합칠 문자열 임시 생성
                String substring = S.substring(j, j + 1); // 첫째 자리부터 한 자리씩 빼기
                for (int k = 0; k < R; k++) {
                    temp = temp.concat(substring); // 뺀 문자 temp에 반복 후 저장
                }
                P = P.concat(temp); // 반복한 temp P에 결합
            }
            System.out.println(P); // 출력
        }
    }
}
