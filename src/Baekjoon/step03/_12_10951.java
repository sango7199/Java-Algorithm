package Baekjoon.step03;

import java.io.*;
import java.util.StringTokenizer;

public class _12_10951 {
    // A+B - 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        while(true) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());
            if (num1 == 0 && num2 == 0) {
                break;
            }
            bw.write((num1 + num2) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
