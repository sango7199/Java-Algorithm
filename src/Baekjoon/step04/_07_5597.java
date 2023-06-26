package Baekjoon.step04;

import java.util.Scanner;

public class _07_5597 {
    // 과제 안 내신 분..?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30]; // 출석번호 1~30번
        for (int i = 0; i < 28; i++) { // 과제 제출한 학생들 입력
            int N = sc.nextInt();
            arr[N-1] = N;
        }
        for (int j = 0; j < 30; j++) { // 과제 제출 안한 학생 선별 후 출력
            if (arr[j] == 0) System.out.println(j+1);
        }
        sc.close();
    }
}
