package Baekjoon.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10_5622 {
    // 다이얼
    public static void main(String[] args) throws IOException {
        // 문자열 입력받기 위해 BufferedReader 클래스 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 문자열 입력 받는 변수
        int sec; // 초 변수
        int time = 0; // 출력할 총 시간
        for (int i = 0; i < str.length(); i++) {
            sec = 2; // 숫자 1 : 2초
            switch (str.charAt(i)) { // 칸마다 +1초
                case 'A':
                case 'B':
                case 'C':
                    sec += 1;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    sec += 2;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    sec += 3;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    sec += 4;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    sec += 5;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sec += 6;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    sec += 7;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sec += 8;
                    break;
                default:
                    sec += 9;
                    break;
            }
            time += sec;
        }
        System.out.print(time); // 출력
    }
}
