package Baekjoon.step05;

import java.util.Scanner;

public class _01_27866 {
    // 문자와 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine(); // 문자열 입력
        int i = sc.nextInt(); // 숫자 입력

        System.out.print(S.charAt(i-1)); // charAt 이용하여 문자열의 문자 뽑아내기
        sc.close();
    }
}
