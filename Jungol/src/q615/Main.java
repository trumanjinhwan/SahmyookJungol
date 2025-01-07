package q615;

import java.util.Scanner;

class Student {
    private String name;
    private int Kscore;
    private int Escore;
    private int Mscore;

    public Student(String name, int Kscore, int Escore, int Mscore) {
        this.name = name;
        this.Kscore = Kscore;
        this.Escore = Escore;
        this.Mscore = Mscore;
    }

    public String getName() {
        return name;
    }

    public int getKscore() {
        return Kscore;
    }

    public int getEscore() {
        return Escore;
    }

    public int getMscore() {
        return Mscore;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[4];
        for (int i = 0; i < 4; i++) {
            String name = sc.next();
            int Kscore = sc.nextInt();
            int Escore = sc.nextInt();
            int Mscore = sc.nextInt();
            students[i] = new Student(name, Kscore, Escore, Mscore);
        }

        sc.close();

        int totalKscore = 0, totalEscore = 0, totalMscore = 0;
        for (Student student : students) {
            totalKscore += student.getKscore();
            totalEscore += student.getEscore();
            totalMscore += student.getMscore();
        }

        int avgKscore = totalKscore / students.length;
        int avgEscore = totalEscore / students.length;
        int avgMscore = totalMscore / students.length;

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getKscore() + " " + student.getEscore() + " " + student.getMscore());
        }

        System.out.println("avg " + avgKscore + " " + avgEscore + " " + avgMscore);
    }
}


