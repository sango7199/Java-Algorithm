package Study;

import java.util.Scanner;

public class ShellSort {
    // 셸 정렬 너무 이해가 안돼서 실습
    static void shellSort(int[] a, int n) { // 예) 입력값이 7
        for (int h = n / 2; h > 0; h /= 2) { // h의 흐름 : 3 > 1
            for (int i = h; i < n; i++) { // i의 흐름 : 3,4,5,6 > 1,2,3,4,5,6
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j+h] = a[j];
                }
                a[j + h] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("셸 정렬(버전 1)");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        shellSort(x, nx);            // 배열 x를 셸정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
