package Baekjoon.step10;

import java.util.Arrays;
import java.util.Scanner;

public class _05_9063 {
    // 대지
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] xArr = new int[T];
        int[] yArr = new int[T];
        for (int i = 0; i < T; i++) {
            xArr[i] = sc.nextInt();
            yArr[i] = sc.nextInt();
        }
        // x와 y의 최대 최소 찾기
        if (T == 1) { // 1이라면 직사각형이 불가하므로 0 출력
            System.out.print(0);
        } else if (T >= 2) {
            Arrays.sort(xArr);
            Arrays.sort(yArr);
            System.out.print((xArr[T-1] - xArr[0]) * (yArr[T-1] - yArr[0]));
        }
    }
}
