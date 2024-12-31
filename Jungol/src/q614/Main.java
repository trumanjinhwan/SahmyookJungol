package q614;

import java.util.Scanner;

class Jeju{
	final private String school =  "Jejuelementary";
	final private String grade = "6";
	
	void prt() {
		System.out.println(this.grade + " grade in " + this.school + " School");
	}
}
	
class Seo{
	private String school;
	private String grade;
	
	public Seo(String school, String grade) {
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
		Seo b = new Seo(school, grade);
		Jeju a = new Jeju();
		a.prt();
		b.prt();
		
		sc.close();

	}
}


