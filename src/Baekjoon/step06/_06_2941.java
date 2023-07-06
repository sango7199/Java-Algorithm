package Baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _06_2941 {
    // 크로아티아 알파벳
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 크로아티아 알파벳 배열로 미리 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] Alphabet = { "c=", "c-", "dz=","d-","lj","nj","s=","z="};
        int count = 0;
        while(st.hasMoreTokens()) { // 입력받은 문자에서 크로아티아 알파벳 찾기
            String str = st.nextToken();
            for (int j = 0; j < Alphabet.length; j++) {
                if (str.contains(Alphabet[j])) {
                    str = str.substring(str.indexOf(Alphabet[j]), str.indexOf(Alphabet[j]) + Alphabet[j].length());
                }
                st =
            }
        }
        System.out.println(count);
    }
}
