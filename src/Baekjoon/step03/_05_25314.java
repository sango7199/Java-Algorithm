package Baekjoon.step03;

import java.util.Scanner;

public class _05_25314 {
    // 코딩은 체육과목 입니다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        String str = "long int";
        String lng = "long";
        for (int i = 0; i < N/4 - 1 ; i++) {
            str = lng + " " + str;
        }
        System.out.print(str);
    }
}
