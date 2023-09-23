package Baekjoon.step08;

import java.util.Scanner;

public class _06_1193 {
    // 분수찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int count = 1;
        while (count <= N) { // 행 구하기
            N -= count;
            if(N == 0) { // N이 0이 될 때
                N = count;
                break;
            }
            count++;
        }
        if (count % 2 == 0) { // count가 짝
            System.out.printf(N + "/" + ((count + 1) - N));
        } else { // count가 홀
            System.out.printf(((count + 1) - N  + "/" + N));
        }
    }
}
