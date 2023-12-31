package Baekjoon.step03;

import java.io.*;
import java.util.StringTokenizer;

public class _08_11022 {
    // A+B - 8
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1+num2) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
