package Baekjoon.step08;

import java.util.Scanner;

public class _03_2720 {
    // 세탁소 사장 동혁
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 입력
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            // 변수들 선언
            int change = sc.nextInt();
            int[] unitOfMoney = {25, 10, 5, 1};
            int[] changeArray = new int[4];
            for (int j = 0; j < changeArray.length; j++) {
                changeArray[j] = change / unitOfMoney[j];
                change %= unitOfMoney[j];
            }
            // 출력
            for (int arr: changeArray) {
                System.out.print(arr + " ");
            }
        }
        sc.close();
    }
}
