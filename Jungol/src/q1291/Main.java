package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if ((num1 < 2 || num1 > 9) || num2 < 2 || num2 > 9) {
				System.out.println("INPUT ERROR!");
				continue;

			} else {
				if (num1 < num2) {
					for (int i = 1; i <= 9; i++) {
						for (int j = num1; j <= num2; j++) {
							System.out.printf("%d * %d = %2s   ", j, i, i * j);
						}
						if (i == 9)
							flag = false;

						System.out.println();
					}
				} else {
					for (int i = 1; i <= 9; i++) {
						for (int j = num1; j >= num2; j--) {
							System.out.printf("%d * %d = %2s   ", j, i, i * j);
						}
						if (i == 9)
							flag = false;
						System.out.println();
					}
				}
			}
		}
		sc.close();

	}

}
