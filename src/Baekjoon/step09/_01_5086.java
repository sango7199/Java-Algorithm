package Baekjoon.step09;

import java.util.Scanner;

public class _01_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        while (true) {
            // 숫자 입력
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) break; // 입력값이 0 0이면 종료

            if (B % A == 0) { // 약수인지 확인
                output.append("factor\n");
            } else if (A % B == 0) { // 배수인지 확인
                output.append("multiple\n");
            } else { // 둘 다 아니라면
                output.append("neither\n");
            }
        }
        sc.close();
        System.out.print(output.toString());
    }
}
