package application;

import aspirant.Aspirant;
import student.Student;

public class Main {

    public static void main(String[] args) {
        Student aspirant = new Aspirant();
        Student student = new Student();
        Student[] stud = new Student[2];
        stud[0] = new Student();
        stud[1] = new Aspirant();

        stud[0].getScholarship(4.33);
        stud[1].getScholarship(5);
    }
}
