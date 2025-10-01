package com.myfirstapp;

import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String quarrel = "What is your name";
        System.out.println(quarrel);
        String name = input.nextLine();
        System.out.println("You entered:" + name);

        System.out.println("How old are You");
        int age = input.nextInt();
        System.out.println("You are" + " " + age + " year old");

        System.out.println("Where do you stay?");
        String location = input.next();
        System.out.println("You stay at " + location);


    }
}
