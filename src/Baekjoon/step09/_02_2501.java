package Baekjoon.step09;

import java.util.Scanner;

public class _02_2501 {
    // 약수 구하기
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        int[] q = new int[N]; // 약수를 저장하는 배열
        int count = 0; // 약수 카운트 변수
        for (int i = 1; i <= N; i++) { // 1부터 N까지 나누기 실행하여 약수 구하기
            if (N % i == 0) { // 약수라면 배열에 저장
                q[count] = i;
                count++; // 배열 칸 이동
            }
        }
        System.out.print(q[K-1]); // 출력
    }
}
