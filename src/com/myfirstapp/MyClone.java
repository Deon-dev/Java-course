package com.myfirstapp;

public class MyClone {
    static void myClone (int x, int y) {     //Introducing parameters
        System.out.println(x + y);
    }

    static void aboutMethod (String name) {
        System.out.println(name);
    }

    static void aboutMethod (int age) {
        System.out.println(age);
    }

    public static void  main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            myClone(5, 6);
//        }
//        myClone(10, 2);

        aboutMethod(54);
        aboutMethod("Deon");

    }

}
