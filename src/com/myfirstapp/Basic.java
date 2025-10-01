package com.myfirstapp;

import java.util.Scanner;

public class Basic {
    public static void main(String[] arg) {
//        boolean isRaining = true;
//
//        if (isRaining) {
//            System.out.println("Bring an Umbrella");
//        } else System.out.println(" Don't come ");

//        int ageToVote = (int)(Math.random() * 61);
//
//        if (ageToVote >= 18 &&  ageToVote< 61) {
//            System.out.println("You can Vote" + " " + ageToVote);
//        } else System.out.println("You can not vote" + " " + ageToVote);

        Scanner input = new Scanner(System.in);
        String approval = "How Old are you?";
        System.out.println(approval);
        int age = input.nextInt();
        input.nextLine();

        if (18 < age && age<61) {
            String region = "What Region are you from?";
            System.out.println(region);
            String regionInput = input.nextLine();
            if(regionInput.equals("Ashanti")) {
                System.out.println("You entered " + age + " You can vote because you are from Ashanti");
            } else if (regionInput.equals("Central")) {
                System.out.println("You entered " + age + " You can vote because you are from Central");
            } else if (regionInput.equals("Greater Accra")) {
                System.out.println("You entered " + age + " You can vote because you are from Greater Accra");
            } else System.out.println("Region not recognized.");
        } else System.out.println("You can not vote");



    }
}
