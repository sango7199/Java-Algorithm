package Baekjoon.step05;

import java.util.Scanner;

public class _09_2908 {
    // 상수
    // swap 이용하여 문자열 뒤집는 건 할 줄 아니 StringBuilder 사용하여 문제풀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // reverseString 이용하여 문자열로 바꾼 후 reverse
        // 문자열 리턴 받으면 int 타입으로 변환
        int rvsA = Integer.parseInt(reverseString(String.valueOf(A)));
        int rvsB = Integer.parseInt(reverseString(String.valueOf(B)));
        System.out.print(rvsA > rvsB ? rvsA : rvsB); // 삼항연산자 이용하여 출력
    }

    // StringBuilder 클래스의 reverse() 메소드
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
