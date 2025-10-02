package com.myfirstapp;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String questionDay = "What day is it?";
        System.out.println(questionDay);
        String day = input.nextLine();


        switch (day) {
//            String gender = input.nextLine();
            case "Monday":
                System.out.println("Are you a boy or a girl?");

                if (input.nextLine().equals("boy")) {
                    System.out.println("You are called Kojo");
                } else System.out.println("You are called Adjoa");
                break;

            case "Tuesday":
                System.out.println("Are you a boy or a girl?");

                if (input.nextLine().equals("boy")) {
                    System.out.println("You are called Kwabena");
                } else System.out.println("You are called Abena");
                break;

            case "Wednesday":
                System.out.println("Are you a boy or a girl?");

                if (input.nextLine().equals("boy")) {
                    System.out.println("You are called Kwaku");
                } else System.out.println("You are called Akua");
                break;

            case "Thursday":
                System.out.println("Are you a boy or a girl?");

                if (input.nextLine().equals("boy")) {
                    System.out.println("You are called Yaw");
                } else System.out.println("You are called Afua");
                break;

            case "Friday":
                System.out.println("Are you a boy or a girl?");

                if (input.nextLine().equals("boy")) {
                    System.out.println("You are called Kofi");
                } else System.out.println("You are called Ama");
                break;

            case "Saturday":
                System.out.println("Are you a boy or a girl?");

                if (input.nextLine().equals("boy")) {
                    System.out.println("You are called Kwame");
                } else System.out.println("You are called Sefa");
                break;

            case "Sunday":
                System.out.println("Are you a boy or a girl?");

                if (input.nextLine().equals("boy")) {
                    System.out.println("You are called Kwesi");
                } else System.out.println("You are called Esi");
                break;
        }


    }

}
