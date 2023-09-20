package Baekjoon.step08;

import java.util.Scanner;

public class _05_2292 {
    // 벌집
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력값 N
        sc.close();
        int count = 1; // 출력할 이동 칸 수
        int start = 0;
        int end = 1;
        while (true) {
//            System.out.println(count + "번째 : " + start + " ~ " + end);
            if (N > end) {
                start = end + 1;
                int hiveMove = 6 * count;
                end += hiveMove;
                count++;
            } else { break; }
        }
        System.out.print(count);
    }
}
