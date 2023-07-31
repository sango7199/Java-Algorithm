package Baekjoon.step08;

import java.util.Scanner;

public class _02_11005 {
    // 진법 변환 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 10진수 N 입력
        int B = sc.nextInt(); // 진수 B 입력
        String result = ""; // 출력할 변수
        int current = N;
        while (current > 0) { // 몫이 0이 될 때까지 나누기 반복
            if ((current % B) <= 9) { // 9보다 크다면 알파벳으로 저장
                result += String.valueOf(current % B);
            }
            else { // 9이하라면 숫자로 저장
                result += String.valueOf((char)((current % B) + 55));
            }
            current /= B;
        }
        // 역순으로 저장됐기 때문에 reverse
        StringBuilder reversedStringBuilder = new StringBuilder(result);
        reversedStringBuilder.reverse();
        String reversedString = reversedStringBuilder.toString();
        System.out.print(reversedString); // 출력
        sc.close();
    }
}
