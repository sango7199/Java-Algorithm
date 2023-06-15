package Baekjoon.step02;

import java.util.Scanner;

public class _01_1330 {
    // 두 수 비교하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A > B) {
            System.out.print(">");
        } else if (A < B) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
        sc.close();
    }
}
