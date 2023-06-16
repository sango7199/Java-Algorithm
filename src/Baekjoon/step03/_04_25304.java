package Baekjoon.step03;

import java.util.Scanner;

public class _04_25304 {
    // 영수증
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int T = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= T; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            sum += price * quantity;
        }
        System.out.println((total == sum ? "Yes" :  "No"));
        sc.close();
    }
}
