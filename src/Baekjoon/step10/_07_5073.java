package Baekjoon.step10;

import java.util.Scanner;

public class _07_5073 {
    // 삼각형과 세 변
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            // 종료 시점을 위한 total 변수
            int arrTotal = 0;
            for (int i = 0; i < arr.length; i++) {
                arrTotal += arr[i];
            }
            if (arrTotal == 0) break; // 0 0 0 입력 시 종료
            // 세 변의 길이에 따른 조건 출력
            if (arr[0] == arr[1] && arr[1] == arr[2]) { // 세 변의 길이가 모두 같은 경우
                System.out.println("Equilateral");
            } else {
                int MAX = 0;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] > MAX) MAX = arr[i];
                }
                int rest = arrTotal - MAX;
                if (rest > MAX) { // 나머지 길이가 조건 충족 분기
                    if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) { // 두 변의 길이가 같은 경우
                        System.out.println("Isosceles");
                    } else { // 세 변의 길이가 모두 다른 경우
                        System.out.println("Scalene");
                    }
                } else {
                    System.out.println("Invalid");
                }
            }
        }
        sc.close();
    }
}
