package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    ArrayList<Student> students = new ArrayList<Student>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

        void viewAll() {
            System.out.println("View All Students: ");

            for (Student student: students) {
                System.out.println("name: " + student.name);
            }
        }

        void viewSingleStudent() {
            System.out.println("Viewing Student by index");
            System.out.println("Enter index of student to view: ");

            int index = intScanner.nextInt();
            Student student = students.get(index);
            System.out.println("Name" + student.name);
        }

        void removeStudent() {
            System.out.println("Remove Student with index");
            System.out.println("Enter index of student to remove");

            int index = intScanner.nextInt();
            students.remove(index);

            System.out.println("Students removed successfully");
        }

        void addStudent() {
            System.out.println("Add Student");
            //Name
            //Grade
            System.out.println("Please provide the name of student");
            String name = scanner.nextLine();

            System.out.println("Please provide students grade: ");
            String grade = scanner.nextLine();

            Student student = new Student();
            student.name = name;
            student.setGrade(grade);

            students.add(student);
        }

        void updateStudentFees() {
            System.out.println("Update student fees");

            System.out.println("Please provide student index");
            int index = intScanner.nextInt();

            System.out.println("Please provide fee amount");
            int amount = intScanner.nextInt();

            Student student = students.get(index);

            student.setFeesPaid(amount);

            System.out.println(amount + " added to students balance");
        }
    }

