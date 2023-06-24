package Baekjoon.step03;

import java.io.*;
import java.util.StringTokenizer;

public class _12_10951 {
    // A+B - 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);;
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            bw.write((num1 + num2) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
