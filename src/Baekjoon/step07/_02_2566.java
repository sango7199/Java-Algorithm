package Baekjoon.step07;

import java.util.Scanner;

public class _02_2566 {
    // 최댓값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) { // 숫자 입력
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int Max = 0; // 최댓값 변수 선언
        int row = 0; // 행
        int cols = 0; // 열
        for (int i = 0; i < arr.length; i++) { // 숫자 비교
            for (int j = 0; j < arr[i].length; j++) {
                if (Max <= arr[i][j]) {
                    Max = arr[i][j];
                    row = i + 1;
                    cols = j + 1;
                }
            }
        }
        System.out.println(Max); // 최댓값 출력
        System.out.print(row + " " + cols); // 행 열 출력
        sc.close();
    }
}
