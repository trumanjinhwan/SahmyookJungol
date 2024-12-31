package q558;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ar = new int[100];  // 100개의 정수를 저장할 배열
        Scanner sc = new Scanner(System.in);

        // 최대 100번까지 입력 받기
        for (int i = 0; i < ar.length; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break;  // 0이 입력되면 종료
            }
            ar[i] = num;  // 배열에 정수 저장
        }

        // 배열을 역순으로 출력
        for (int i = 99; i >= 0; i--) {
            if (ar[i] != 0) {  // 0은 출력하지 않기
                System.out.print(ar[i] + " ");
            }
        }

        sc.close();
    }
}

