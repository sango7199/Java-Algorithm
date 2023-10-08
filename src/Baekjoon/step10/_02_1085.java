package Baekjoon.step10;

import java.util.Scanner;

public class _02_1085 {
    // 직사각형에서 탈출
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[] move = new int[4]; // 현재 위치에서 이동하는 거리 측정 배열
        move[0] = x - 0;
        move[1] = w - x;
        move[2] = y - 0;
        move[3] = h - y;
        int MIN = move[0]; // 출력할 최솟값
        for (int i = 1; i < move.length; i++) { // 최솟값 구하기
            if (move[i] < MIN) MIN = move[i];
        }
        System.out.print(MIN); // 출력
    }
}
