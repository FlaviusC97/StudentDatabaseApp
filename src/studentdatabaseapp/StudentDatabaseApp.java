package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        //Ask how many new students we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        Student [] students = new Student[numberOfStudents];

        //Create a number of new students
        for(int n=0; n < numberOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for(int n = 0; n < numberOfStudents; n++) {
            System.out.println(students[n].showInfo());
        }

    }
}
