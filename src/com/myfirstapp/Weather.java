package com.myfirstapp;

import java.util.Scanner;

public class Weather {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String weatherReport = "What is the weather like Today?";
        System.out.println(weatherReport);

        String weatherAnswer = input.nextLine();
        if (weatherAnswer.equalsIgnoreCase("Warm")) {
            System.out.println("Take a cold shower");
        } else if (weatherAnswer.equalsIgnoreCase("Cold")) {
            System.out.println("Do you have a coat?");
            String response = input.nextLine();
            if (response.equals("Yes")) {
                System.out.println("Wear it before going out");
            } else if (response.equals("No")) {
                System.out.println("You can not go out");
            } else {
                throw new IllegalArgumentException("Invalid response");
            }
        } else System.out.println(weatherReport);
    }
}
