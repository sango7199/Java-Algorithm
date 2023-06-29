package Baekjoon.step05;

import java.util.Scanner;

public class _03_9086 {
    // 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] str = new String[T];
        for (int i = 0; i < T; i++) {
            str[i] = sc.next();
            char first = str[i].charAt(0); // 첫번째 문자 추출
            char last = str[i].charAt(str[i].length() - 1); // 마지막 문자 추출
            String result = String.valueOf(first).concat(String.valueOf(last)); // 문자 결합
            System.out.println(result); // 출력
        }
        sc.close();
    }
}
