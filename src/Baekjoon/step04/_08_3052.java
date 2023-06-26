package Baekjoon.step04;

import java.util.Arrays;
import java.util.Scanner;

public class _08_3052 {
    // 나머지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // 10개의 배열 선언
        for (int i = 0; i < arr.length; i++) { // 배열에 나머지 값들 입력
            arr[i] = sc.nextInt() % 42;
        }
        Arrays.sort(arr); // 배열 정렬
        int cnt = 1; // 다른 수 체크 변수
        int num = arr[0]; // 다른 수일때 저장할 변수
        for (int i = 0; i < arr.length; i++) { // 다른 수 체크
            if (num != arr[i]) {
                num = arr[i];
                cnt++;
            }
        }
        sc.close();
        System.out.print(cnt); // 출력
    }
}
