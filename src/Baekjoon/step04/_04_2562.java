package Baekjoon.step04;

import java.util.Scanner;

public class _04_2562 {
    // 최댓값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9]; // 서로 다른 9개의 자연수를 넣을 배열 선언
        int Max = 0; // 최댓값 저장할 변수
        int location = 0; // 최댓값 위치 변수
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 배열에 수 입력
            if (arr[i] > Max) { // 배열값과 최댓값 비교 후 최댓값 저장
                Max = arr[i];
                location = i + 1; // 최댓값 위치 저장
            }
        }
        System.out.print(Max + "\n" + location);
    }
}
