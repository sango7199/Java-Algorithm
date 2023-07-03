package Baekjoon.step06;

import java.util.Scanner;

public class _03_2444 {
    // 별 찍기 - 7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N 입력
        // N번째 줄까지 차례대로 피라미드 별 출력
        for (int i = 0; i < N; i++) {
            for (int j = N-i; j > 1; j--) { // 공백 출력
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2+1; k++) { // 별 출력
                System.out.print("*");
            }
            System.out.println();
        }
        // N부터 2*N-1번째 줄까지 역 피라미드 출력
        for (int i = 1; i <= (N*2-1) - N; i++) {
            for (int j = 0; j < i; j++) { // 공백 출력
                System.out.print(" ");
            }
            for (int k = (N-i)*2-1; k > 0; k--) { // 별 출력
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
