package Baekjoon.step05;

import java.util.Scanner;

public class _02_2743 {
    // 단어 길이 재기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine(); // 문자열 입력
        System.out.print(S.length()); // length 이용하여 문자열 길이 출력
        sc.close();
    }
}
