package Study;

import java.util.Scanner;

public class StraightInsertionSort {
    public static void main(String[] args) {
        // 단순 선택 정렬이 너무 이해안돼서 실습
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수를 입력하세요 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }

        System.out.println("== 정렬 전. ==");
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        // 단순 선택 정렬
        for (int i = 1; i < n; i++) {
            int j;
            int temp = arr[i];
            for (j = i;  j > 0 && arr[j-1] > temp ; j--) {
                arr[j] = arr[j -1];
            }
            arr[j] = temp;
        }

        System.out.println("== 단순 선택 정렬이 완료되었습니다. ==");
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
