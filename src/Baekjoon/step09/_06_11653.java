package Baekjoon.step09;

import java.util.Scanner;

public class _06_11653 {
    // 소인수분해
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // 소인수분해
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        if (N > 1) {
            System.out.println(N);
        }
    }
}

//public class _06_11653 {
//    // 소인수분해
//    public static void main(String[] args) {
//        // 입력
//        Scanner sc = new Scanner(System.in);
//        StringBuilder output = new StringBuilder();
//        int N = sc.nextInt();
//        sc.close();
//        // 소인수분해
//        int primeNum = 2; // 몫(소수)
//        int reminder = N;
//        while (true) {
//            if (reminder % primeNum == 0) {
//                reminder /= primeNum;
//                output.append(primeNum + "\n");
//            } else {
//                while (true) {
//                    primeNum++;
//                    int factorCnt = 0; // 약수 세는 변수
//                    for (int i = 1; i <= primeNum; i++) {
//                        if (primeNum % i == 0) factorCnt++;
//                    }
//                    if (factorCnt == 2) break;
//                }
//            }
//            int factorCnt = 0; // 약수 세는 변수
//            for (int i = 1; i <= reminder; i++) {
//                if (reminder % i == 0) factorCnt++;
//            }
//            if (factorCnt == 2 || reminder == 1) break;
//        }
//        System.out.print(output);
//        if(reminder != 1) System.out.print(reminder);
//    }
//}
