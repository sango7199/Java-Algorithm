package Baekjoon.step05;

import java.util.Scanner;

public class _05_11720 {
    // 숫자의 합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 첫째 줄 숫자 입력
        String str = sc.next(); // 둘째 줄 숫자 공백없이 N개 입력
        char[] charArray = str.toCharArray(); // toCharArray() 메소드 사용하여 문자열 한 자리씩 배열에 저장
        int sum = 0; // 총합 출력할 변수 선언
        for (int i = 0; i < N; i++) {
            sum += (int)charArray[i] - 48; // 아스키코드 0이 48이여서 -48로 유니코드 숫자로 만들고 sum에 저장
        }
        System.out.print(sum); // 출력
        sc.close();
    }
}
