package Baekjoon.step08;

import java.util.Scanner;

public class _01_2745 {
    // 진법 변화
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next(); // N 입력
        int B = sc.nextInt(); // B진수 입력
        // 입력받은 수 자리수로 돌리기 위해서 reverse
        StringBuilder reversedStringBuilder = new StringBuilder(N);
        reversedStringBuilder.reverse();
        String reversedString = reversedStringBuilder.toString();
        int result = 0; // 출력할 변수 선언
        for (int i = 0; i < N.length(); i++) { // N 자릿수만큼 반복
            char c = reversedString.charAt(i); // 자릿수
            if (c >= '0' && c <= '9') { // 숫자라면 아스키코드 - 48 자릿수 승수 곱하기
                result += (c - 48) * (int) Math.pow(B, i);
            } else if (c >= 'A' && c <= 'Z') { // 문자라면 아스키코드 - 55 자릿수 승수 곱하기
                result += (c - 55) * (int) Math.pow(B, i);
            }
        }
        System.out.print(result); // 출력
        sc.close();
    }
}
