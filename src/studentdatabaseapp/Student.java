package studentdatabaseapp;

import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        setStudentID();
    }

    //Generate an ID
    private void setStudentID() {
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll () {
        //Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!Objects.equals(course, "Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else { break; }
        } while (1 != 0);
    }

    //View balance
    public void viewBalance () {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition () {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show status
    public String showInfo () {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }

}