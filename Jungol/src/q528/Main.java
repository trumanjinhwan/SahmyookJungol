package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.print(num + "\n" + "minus");
		}
		
		else {
			System.out.print(num + "\n");
		}

	}

}
