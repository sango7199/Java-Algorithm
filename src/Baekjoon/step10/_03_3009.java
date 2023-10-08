package Baekjoon.step10;

import java.util.Scanner;

public class _03_3009 {
    // 네 번째 점
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] row = new int[3];
        int[] cols = new int[3];

        for (int i = 0; i < 3; i++) {
            row[i] = sc.nextInt();
            cols[i] = sc.nextInt();
        }

        int x = 0, y = 0;

        // 한 번만 등장하는 x 좌표를 찾습니다.
        if (row[0] == row[1]) x = row[2];
        else if (row[0] == row[2]) x = row[1];
        else x = row[0];

        // 한 번만 등장하는 y 좌표를 찾습니다.
        if (cols[0] == cols[1]) y = cols[2];
        else if (cols[0] == cols[2]) y = cols[1];
        else y = cols[0];

        System.out.println(x + " " + y);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] row = new int[3];
//        int[] cols = new int[3];
//        for (int i = 0; i < 3; i++) {
//            row[i] = sc.nextInt();
//            cols[i] = sc.nextInt();
//        }
//        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
//        x1 = row[0];
//        y1 = cols[0];
//        for (int i = 1; i < row.length; i++) {
//            if (x1 != row[i]) x2 = row[i];
//            if (y1 != cols[i]) y2 = cols[i];
//        }
//        int x = 0;
//        int y = 0;
//        for (int i = 0; i < row.length; i++) {
//            x += row[i];
//            y += cols[i];
//        }
//        x -= x1 * 2 + x2 * 2;
//        y -= y1 * 2 + y2 * 2;
//        System.out.print(Math.abs(x) + " " + Math.abs(y));
//    }
}
