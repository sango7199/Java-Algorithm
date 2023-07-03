package Baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_10988 {
    // 팰린드롬인지 확인하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // 문자열 입력
        char[] arr = new char[str.length()]; // 배열 선언
        arr = str.toCharArray(); // 문자열 배열로 전환
        boolean check = false; // 0 또는 1 출력할 불리언 변수
        for (int i = 0; i < str.length() / 2; i++) {
            if (arr[i] == arr[arr.length - (1+i)]) check = true; // 문자열 비교
            else { check = false; break; } // 글자가 다르다면 false 저장 후 종료
        }
        System.out.print(check ? 1 : 0); // 삼항연산자 이용하여 출력
        br.close();
        // 틀렸다고 나오는데 이유를 모르겠음
//        int check = 0;
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) check = 1;
//            else { check = 0; break;}
//        }
//        System.out.print(check);
//        br.close();
    }
}
