package Baekjoon.step02;

import java.util.Scanner;

public class _05_2884 {
    // 알람시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if (H < 0) {
                H = 23;
            }
        } else {
            H--;
            M = M - 45;
        }
        System.out.print(H + " " + M);
    }
}
