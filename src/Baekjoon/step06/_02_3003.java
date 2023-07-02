package Baekjoon.step06;

import java.util.Scanner;

public class _02_3003 {
    // 킹, 퀸, 룩, 비숍, 나이트, 폰
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chessArr = { 1, 1, 2, 2, 2, 8 }; // 올바른 체스 세트
        int[] findArr = new int[6]; // 찾은 체스 세트
        for (int i = 0; i < findArr.length; i++) { // 찾은 세트 배열에 입력 후 계산
            findArr[i] = chessArr[i] - sc.nextInt();
        }
        for (int FindArr: findArr) { // 출력
            System.out.printf(FindArr + " ");
        }
        sc.close();
    }
}
