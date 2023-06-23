package Baekjoon.step03;

import java.io.*;
import java.util.StringTokenizer;

public class _11_10952 {
    // A+B - 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if (num1 == 0 && num2 == 0) {
                break;
            }
            bw.write((num1+num2)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
