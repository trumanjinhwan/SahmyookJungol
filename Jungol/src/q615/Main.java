package q615;

import java.util.Scanner;

class Student {
    private String name;
    private int kScore;
    private int eScore;

    public Student(String name, int kScore, int eScore) {
        this.name = name;
        this.kScore = kScore;
        this.eScore = eScore;
    }

    public String getName() {
        return name;
    }

    public int getKScore() {
        return kScore;
    }

    public int getEScore() {
        return eScore;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String student1_name = sc.next();
        int student1_Kscore = sc.nextInt();
        int student1_Escore = sc.nextInt();
        
        String student2_name = sc.next();
        int student2_Kscore = sc.nextInt();
        int student2_Escore = sc.nextInt();

        Student student1 = new Student(student1_name, student1_Kscore, student1_Escore);
        Student student2 = new Student(student2_name, student2_Kscore, student2_Escore);

        int avgKScore = (student1.getKScore() + student2.getKScore()) / 2;
        int avgEScore = (student1.getEScore() + student2.getEScore()) / 2;

        System.out.println(student1.getName() + " " + student1.getKScore() + " " + student1.getEScore());
        System.out.println(student2.getName() + " " + student2.getKScore() + " " + student2.getEScore());
        System.out.println("avg " + avgKScore + " " + avgEScore);
    }
}

