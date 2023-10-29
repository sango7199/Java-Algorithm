package Baekjoon.step12;

import java.util.Scanner;

public class _05_1436 {
    // 영화감독 숌
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        // 종말의 숫자 666 찾기
        int theNumberOfTheApocalypse = 666;
        int count = 0;
        while (true) {
            String numToString = Integer.toString(theNumberOfTheApocalypse);
            if (numToString.contains("666") == true) {
                count++;
                if (count == N)  {
                    System.out.print(theNumberOfTheApocalypse);
                    break;
                }
            }
            theNumberOfTheApocalypse++;
        }
    }
}
