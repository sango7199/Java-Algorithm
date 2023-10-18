package Baekjoon.step10;

import java.util.Scanner;

public class _08_14215 {
    // 세 막대기
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int arrTotal= 0;
        int MAX = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            arrTotal += arr[i]; // 세 막대 길이
            if (arr[i] > MAX) MAX = arr[i]; // 최대 막대 저장
        }
        sc.close();
        int rest = arrTotal - MAX; // 가장 긴 막대를 제외한 두 막대의 길이
        if (rest <= MAX) { // 가장 긴 막대가 나머지보다 큰 경우
            System.out.print((rest * 2) - 1);
        } else { // 나머지의 경우
            System.out.print(arrTotal);
        }
    }
}
