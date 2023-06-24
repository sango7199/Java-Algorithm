package Baekjoon.step04;

import java.util.Scanner;

public class _01_10807 {
    // 개수 세기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 첫쨰 줄 입력
        int[] arr = new int[N]; // 둘째 줄 숫자 넣을 배열 선언
        for (int i = 0; i < N; i++) { // 둘째 줄 숫자들 배열에 입력
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt(); // 셋째 줄 찾을 숫자 입력
        sc.close(); // 입력 종료
        int cnt = 0; // 찾을 숫자 카운트
        for (int i = 0; i < N; i++) { // 숫자 개수 세기
            if (search == arr[i]) cnt++;
        }
        System.out.print(cnt); // cnt 출력
    }
}
