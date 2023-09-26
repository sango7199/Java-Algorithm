package Baekjoon.step08;

import java.util.Scanner;

public class _07_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력값
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        double everyClimbStep = A - B; // 매일 올라가는 거리
        double heightToReach = V - A; // 올라가기 직전의 거리
        double rawDays = heightToReach / everyClimbStep; // 처음 계산한 올라가는데 걸리는 일수
        double day = Math.ceil(rawDays); // 소수점으로 떨어지면 하루를 추가로 올라가야 해서 소수점 반올림
        int finalDays = (int)day + 1; // 직전까지의 거리만 계산했으므로 하루 더 추가
        System.out.print(finalDays); // 출력
    }
}
