package Baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_2941 {
    // 크로아티아 알파벳
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 입력
        String[] Alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; // 크로아티아 알파벳 배열
        int count = 0; // 글자 수 체크할 변수
        // 입력받은 문자에서 크로아티아 알파벳 찾기
        int i = 0; // 문자열의 현재 위치
        while (i < str.length()) { // 문자열의 현재 위치가 문자열 끝에 도달하면 종료
            boolean found = false; // 크로아티아 알파벳과 일치했는지 체크
            for (String alph : Alphabet) { // 크로아티아 알파벳 순회
                if (str.startsWith(alph, i)) { // 문자열의 현재위치(i)부터 크로아티아 알파벳과 일치하는 것이 있는지 체크
                    count++;
                    i += alph.length(); // 현재위치(i)는 크로아티아 알파벳 글자 개수만큼 이동
                    found = true; // 일치하는 문자를 찾았으니 true로 변경 후 이번 반복은 종료
                    break;
                }
            }
            if (!found) { // 일치하지 않는다면 일반 알파벳이므로 count++, 현재 위치도 i++
                count++;
                i++;
            }
        }
        System.out.print(count); // 출력
    }
}
