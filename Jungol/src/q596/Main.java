package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();

		String[] arr = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = String.valueOf(str.charAt(i));
		}

		if (num > arr.length) {                         //문자열보다 숫자가 더 클때
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i]);                     
			}
		} else {
			for (int i = arr.length - 1; i >= arr.length - num; i--) {       
				System.out.print(arr[i]);
			}
		}
	}
}
