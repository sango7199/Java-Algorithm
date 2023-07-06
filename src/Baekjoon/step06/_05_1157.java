package Baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_1157 {
    // 단어 공부
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase(); // 문자 대문자로 입력
        int[] arr = new int[26]; // 알파벳 배열
        int max = 0; // 알파벳 인덱스 저장할 max 변수 선언, 초기값 인덱스 0
        boolean multiMax = false; // 가장 많이 사용된 알파벳 체크 boolean
        for (int i = 0; i < str.length(); i++) { // 알파벳 별로 개수 체크
            arr[str.charAt(i) - 'A']++;
        }
        for (int i = 0; i < arr.length; i++) { // 가장 많이 사용된 알파벳 체크
            if (arr[max] < arr[i]) max = i;
        }
        for (int i = 0; i < arr.length; i++) { // 가장 많이 사용된 알파벳 제외하고 비교
            if (i == max) { // max에 저장된 알파벳은 건너뛰기
                continue;
            } else if (arr[max] == arr[i]) { // 값 비교 후 여러 개 체크
                multiMax = true;
                break;
            }
        }
//        max += 'A';
//        if (multiMax) {
//            System.out.print("?");
//        } else {
//            System.out.print((char)(max));
//        }
        System.out.print(multiMax ? "?" : ((char)max + 'A')); // 출력
    }
}
