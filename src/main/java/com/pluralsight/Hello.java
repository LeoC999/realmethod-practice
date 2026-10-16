package com.pluralsight;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
     sayHello();// This code is saving the method to use later
     sayBye();
     sayMorning();
     sayWowThisWasALotOfWork();
    }
    public static void sayHello() { //this code is pulling from main to print it out
        System.out.println(" Leo says Hello World ");

    }

    public static void sayBye() {
        System.out.println(" Leo says Bye World");
    }

    public static void sayMorning() {
        System.out.println(" Leo says Morning to all");
    }
    public static void sayWowThisWasALotOfWork() {
        System.out.println(" Leo Thinks this was a lot of work for something so easy ");
    }
}
