package q571;

import java.util.Scanner;

public class Main {

	public static void prt() {
		System.out.println("~!@#$^&*()_+|");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			prt();
		}

	}

}
