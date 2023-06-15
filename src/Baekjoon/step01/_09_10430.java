package Baekjoon.step01;

import java.util.Scanner;

public class _09_10430 {
    // 나머지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.print((A + B) % C);
        System.out.print(((A % C) + (B % C)) % C);
        System.out.print((A * B) % C);
        System.out.print(((A % C) * (B % C)) % C);

    }
}
