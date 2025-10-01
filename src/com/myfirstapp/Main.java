package com.myfirstapp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Programming is great fun!");
        System.out.println("I love Java");
        System.out.println(3 + 3);
        System.out.println("Franca is a girl");

        short myNum = -345;
        System.out.println(myNum);

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Has access:" + (isLoggedIn && !isAdmin));
        System.out.println("No access:" + (!isAdmin));

//        Using the length() method
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());

        char myChar = 'D';
        byte myByte = 127;
        float myFloat = 9.99f;
        double myDouble = 10.223d;
        double percentage = (int) myFloat/myDouble * 100;

        System.out.println(myByte + myChar);
        System.out.println(percentage);

//        Printing  out JAVA using (Asterisk) *

        System.out.println("      ******       ***       **         **      ***        ***     ");
        System.out.println("          **      ** **       **       **      ** **       ***     ");
        System.out.println("          **     **   **       **     **      **   **      ***     ");
        System.out.println("  **      **    ** *** **       **   **      ** *** **     ***     ");
        System.out.println("   **     **   **       **       ** **      **       **            ");
        System.out.println("      ***     **         **       ***      **         **    *      ");

//        Using ASCII character values( char ) = single letter
        char myVar1 = 68, myVar2 = 69, myVar3 = 79, myVar4 = 78;
        System.out.print(myVar1);
        System.out.print(myVar2);
        System.out.print(myVar3);
        System.out.print(myVar4);

        int getTime = (int)(Math.random() * 101);
        System.out.println(getTime);

    }
}


