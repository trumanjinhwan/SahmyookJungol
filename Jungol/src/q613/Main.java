package q613;

import java.util.Scanner;

class Student{
	private String name;
	private String school;
	private String grade;
	
	public Student(String name, String school, String grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
    }
	  
	void prt(){
		System.out.println("Name : " + this.name + "\n" + "School : " + this.school + "\n" + "Grade : " + this.grade);
	};
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		String age = sc.next();
		Student a = new Student(name, school, age);
		a.prt();
		sc.close();

	}

}
