package Baekjoon.step02;

import java.util.Scanner;

public class _07_2480 {
    // 주사위 세 개
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] diceNum = new int[3];
        int prize = 0;
        for (int i = 0; i < 3; i++) {
            diceNum[i] = sc.nextInt();
        }
        if (diceNum[0] == diceNum[1] && diceNum[1] == diceNum[2]) {
            prize = 10000 + diceNum[0] * 1000;
        } else if (diceNum[0] == diceNum[1] || diceNum[0] == diceNum[2] || diceNum[1] == diceNum[2]) {
            if (diceNum[1] == diceNum[2]) {
                prize = 1000 + (diceNum[1]) * 100;
            } else {
                prize = 1000 + (diceNum[0]) * 100;
            }
        } else {
            int max = 1;
            for (int i = 0; i < diceNum.length; i++) {
                if (max < diceNum[i]) {
                    max = diceNum[i];
                }
            }
            prize = max * 100;
        }
        System.out.print(prize);
        sc.close();
    }
}
