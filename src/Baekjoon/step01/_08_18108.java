package Baekjoon.step01;

import java.util.Scanner;

public class _08_18108 {
    // 1998년생인 내가 태국에서는 2541년생?!
    public static void main(String[] args) {
        int taiYear;
        Scanner sc = new Scanner(System.in);
        taiYear = sc.nextInt();
        System.out.print(taiYear - 543);
        sc.close();
    }
}
