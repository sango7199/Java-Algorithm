package Baekjoon.step02;

import java.util.Scanner;

public class _06_2525 {
    // 오븐 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();
        sc.close();

        if (time >= 60) {
            hour += time / 60;
            min += time % 60;
        } else {
            min += time;
        }

        if (min >= 60) {
            hour += min / 60;
            min %= 60;
        }

        if (hour >= 24) {
            hour -= 24;
        }

        System.out.print(hour + " " + min);
    }
}
