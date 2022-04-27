package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Classroom");
        Classroom myClassroom = new Classroom();
        Scanner scanner = new Scanner(System.in);

        String userInput = "";

        do {
            System.out.println("Please choose an activity: ");
            System.out.println("""
                    1. Add student
                    2. View all students
                    3. View Single student
                    4. Remove student
                    5. Add fees to student
                    """);

            userInput = scanner.nextLine();

            switch(userInput) {
                case "1":
                    myClassroom.addStudent();
                    break;
                case "2":
                    myClassroom.viewAll();
                    break;
                case "3":
                    myClassroom.viewSingleStudent();
                    break;
                case "4":
                    myClassroom.removeStudent();
                    break;
                case "5":
                    myClassroom.updateStudentFees();
                    break;
                case "quit":
                        System.out.println("You are exiting application!");
                default:
                    System.out.println("Please provide a valid input");

            }
        } while (!userInput.equalsIgnoreCase("quit"));


        System.out.println(myClassroom);
    }
    }

