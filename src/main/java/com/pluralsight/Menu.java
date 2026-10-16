package com.pluralsight;

public class Menu {
    public static void main(String[] args) {
        displayMenu(1. + "coffee" + " - " + "$" + 4.99 );
        displayMenu(2. + "tea " + " - " + "$"  + 2.99);
        displayMenu(3. + "cookie " + " - " + "$" + 1.99);

    }
    public static void displayMenu(String menu) {
        System.out.println(menu);
    }
}