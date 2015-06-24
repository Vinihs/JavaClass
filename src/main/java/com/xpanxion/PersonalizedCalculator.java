package com.xpanxion;

import org.junit.Assert;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/24/2015.
 */
public class PersonalizedCalculator {

    private static void promptForNumbers() {
        System.out.println("");
        System.out.print("Please enter numbers separated by spaces: ");
    }

    public static void main(String[] args) {
        System.out.print("What is your name? ");

        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.next();
        System.out.print("Hello, " + name);

        System.out.println(". I can perform the following operations:");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.print("Select an option by numeric value? ");
        int operation = keyboard.nextInt();

        if(operation == 1) {
            promptForNumbers();

            int addBeg = keyboard.nextInt();
            int addEnd = keyboard.nextInt();
            int sum = addBeg + addEnd;

            System.out.print("\nResults: " + addBeg + " + " + addEnd + " = " + sum);

        } else if (operation == 2) {
            promptForNumbers();

            int minBeg= keyboard.nextInt();
            int subEnd = keyboard.nextInt();
            int difference = minBeg - subEnd;

            System.out.println("");
            System.out.print("\nResults: " + minBeg + " - " + subEnd + " = " + difference);

        } else if (operation == 3) {

            promptForNumbers();

            int multiplier = keyboard.nextInt();
            int multiplicand = keyboard.nextInt();
            int product = multiplier * multiplicand;

            System.out.println("");
            System.out.print("\nResults: " + multiplier + " * " + multiplicand + " = " + product);

        } else if (operation == 4) {
            promptForNumbers();

            int dividend = keyboard.nextInt();
            int divisor = keyboard.nextInt();

            if (divisor == 0) {
                System.out.println("You cannot divide by zero!");
            } else {
                int quotient = dividend / divisor;

                System.out.println("");
                System.out.print("\nResults: " + dividend + " / " + divisor + " = " + quotient);
            }

        } else {
            System.out.println(String.format("Invalid operation: %s", operation));
        }
    }
}
