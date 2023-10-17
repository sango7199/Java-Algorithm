package Baekjoon.step10;

import java.util.Scanner;

public class _06_10101 {
    // 삼각형 외우기
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int[] angle = new int[3];
        for (int i = 0; i < 3; i++) {
            angle[i] = sc.nextInt();
        }
        sc.close();
        // 삼각형 각도 계산
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += angle[i];
        }
        if (total == 180) {
            if (angle[0] == 60 && angle[1] == 60 && angle[2] == 60) {
                System.out.print("Equilateral");
            } else if (angle[0] == angle[1] || angle[1] == angle[2] || angle[0] == angle[2]) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        } else {
            System.out.print("Error");
        }
    }
}
