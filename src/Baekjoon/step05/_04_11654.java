package Baekjoon.step05;

import java.util.Scanner;

public class _04_11654 {
    // 아스키코드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 문자열로 입력받고
        char ch = input.charAt(0); // 문자열을 문자로 변경
        System.out.print((int)ch); // 아스키코드 숫자로 변환 후 출력
        sc.close();
    }
}
