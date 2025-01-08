package q9018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("두 개의 수를 입력하시오.");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		Cal cal = new Cal(num1, num2);

		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		cal.remain();

	}

}

class Cal {
	private int num1;
	private int num2;

	Cal(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	void add() {
		System.out.println(this.num1 + " + " + this.num2 + " = " + (this.num1 + this.num2));
	}

	void sub() {
		System.out.println(this.num1 + " - " + this.num2 + " = " + (this.num1 - this.num2));
	}

	void mul() {
		System.out.println(this.num1 + " * " + this.num2 + " = " + (this.num1 * this.num2));
	}

	void div() {
		System.out.println(this.num1 + " / " + this.num2 + " = " + (this.num1 / this.num2));
	}

	void remain() {
		System.out.println(this.num1 + " % " + this.num2 + " = " + (this.num1 % this.num2));
	}
}
