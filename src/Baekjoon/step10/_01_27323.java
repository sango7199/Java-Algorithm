package Baekjoon.step10;

import java.util.Scanner;

public class _01_27323 {
    // 직사각형
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        // 직사각형의 넓이 출력
        System.out.print(A * B);
    }
}
