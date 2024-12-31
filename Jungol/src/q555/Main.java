package q555;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 문자 10개를 저장할 배열 생성
        char[] charArray = new char[10];
        Scanner scanner = new Scanner(System.in);

        // 문자 10개 입력받기
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scanner.next().charAt(0);
        }

        // 입력받은 문자 출력
        for (char c : charArray) {
            System.out.print(c);
        }

        scanner.close();
    }
}
