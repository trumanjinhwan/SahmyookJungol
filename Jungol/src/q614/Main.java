package q614;

import java.util.Scanner;

class School{
	private String school;
	private String grade;
	
	public School(String school, String grade) {
		this.school = school;
		this.grade = grade;
	}
	
	void prt() {
		System.out.println(this.grade + " grade in " + this.school + " School");
	}
}
	


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String school = sc.next();
		String grade = sc.next();
		
		School b = new School(school, grade);
		School a = new School("Jejuelementary", "6");
		
		a.prt();
		b.prt();
		
		sc.close();

	}
}


