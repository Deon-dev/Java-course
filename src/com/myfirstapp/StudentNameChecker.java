package com.myfirstapp;

import java.util.Scanner;


public class StudentNameChecker {
    public static void main(String[] args) {
        // Array of students' names
        String[] students = {"Gideon", "Franca", "Koenraad", "Justice", "Emma"};

        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        // Using a for loop to repeatedly check input
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter a student name: ");
            String inputName = scanner.nextLine();

            // Check if input matches any name in the array
            for (String name : students) {
                if (name.equalsIgnoreCase(inputName)) {
                    System.out.println("Correct! " + name + " exists in the class.");
                    found = true;
                    break; // Exit inner loop
                }
            }

            if (found) {
                break; // Exit main for loop
            } else {
                System.out.println("Name not found. Please try again.");
                i--; // Decrease i so the loop keeps running until correct name entered
            }
        }

        scanner.close();
    }
}
