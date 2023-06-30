package Baekjoon.step05;

import java.util.Arrays;
import java.util.Scanner;

public class _06_10809 {
    // 알파벳 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(); // 문자열 입력
        char[] str = S.toCharArray(); // 입력받은 문자열 배열로 전환
        int[] alphabet = new int[26]; // 알파벳 개수로 배열 선언
        Arrays.fill(alphabet, -1); // 전부 -1로 초기값
        for (int i = 0; i < S.length(); i++) {
            // S.charAt(i) - 97 : 알파벳 처음 등장 위치
            // S.indexOf(i) : 알파벳 단어의 위치
            alphabet[S.charAt(i) - 97] = S.indexOf(str[i]);
        }
        for (int alp:alphabet) { // 출력
            System.out.print(alp + " ");
        }
        sc.close();
    }
}
