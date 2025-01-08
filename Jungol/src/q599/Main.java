package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) { // 아스키코드로 대문자 A-Z: 65-90 소문자 a-z: 97-122
				newStr += str.charAt(i);
			}
			else {
				newStr +="";
			}
		}
		
		System.out.println(newStr.toUpperCase());

	}
}
