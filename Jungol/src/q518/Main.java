package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		Cal cal = new Cal(arr[0], arr[1], arr[2]);
		cal.sum();
		cal.avg();

	}

}

class Cal {
	private int num1;
	private int num2;
	private int num3;

	Cal(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	void sum() {
		System.out.printf("sum : %d\n", this.num1 + this.num2 + this.num3);
	}

	void avg() {
		System.out.printf("avg : %d\n", (this.num1 + this.num2 + this.num3) / 3);
	}
}
