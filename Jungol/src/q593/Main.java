package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
        int num = 0; 
		
		while(true) {
			System.out.print("ASCII code =? ");
			num = sc.nextInt();
			if (num < 33 || num > 127) {
				break;
			}
			
			System.out.printf( "%c\n", num);
			}
		sc.close();

	}

}
