package Baekjoon.step02;

import java.util.Scanner;
public class _03_2753 {
    // 윤년
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int answer = 0;
        if (year % 4 == 0 && year % 100 != 0) {
            answer = 1;
        } else if (year % 400 == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        System.out.print(answer);
        sc.close();
    }
}
