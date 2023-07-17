package Baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class _08_25206 {
    // 너의 평점은
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float total = 0f; // 출력할 전공평점
        int crdTotal = 0; // 학점 총합
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken(); // 과목명
            float credit = Float.parseFloat(st.nextToken()); // 학점
            String grade = st.nextToken(); // 과목평점
            switch (grade) { // 성적 별로 학점 부여 후 과목평점과 학점 계산
                case "A+":
                    total += credit * 4.5f;
                    break;
                case "A0":
                    total += credit * 4.0f;
                    break;
                case "B+":
                    total += credit * 3.5f;
                    break;
                case "B0":
                    total += credit * 3.0f;
                    break;
                case "C+":
                    total += credit * 2.5f;
                    break;
                case "C0":
                    total += credit * 2.0f;
                    break;
                case "D+":
                    total += credit * 1.5f;
                    break;
                case "D0":
                    total += credit * 1.0f;
                    break;
                case "F":
                    total += credit * 0.0f;
                    break;
                case "P":
                    continue;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
            crdTotal += credit; // 학점 총합 계산
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.######"); // 6자리 설정
        System.out.println(decimalFormat.format(total / crdTotal)); // 출력
        br.close();
    }
}
