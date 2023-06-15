package Baekjoon.step02;

import java.util.Scanner;

public class _04_14681 {
    // 사분면 고르기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] QuadrantNum = {1, 2, 3, 4};
        int answer = 0;
        if (x > 0 && y > 0) {
            answer = QuadrantNum[0];
        } else if (x < 0 && y > 0) {
            answer = QuadrantNum[1];
        } else if (x < 0 && y < 0) {
            answer = QuadrantNum[2];
        } else {
            answer = QuadrantNum[3];
        }
        System.out.print(answer);
        sc.close();
    }
}
