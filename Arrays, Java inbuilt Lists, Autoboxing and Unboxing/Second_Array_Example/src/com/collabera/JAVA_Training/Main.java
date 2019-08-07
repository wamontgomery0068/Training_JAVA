package com.collabera.JAVA_Training;

import java.util.Scanner;

public class Main {

    // "System.in" allows users to type input into the console that gets returned back to the program
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);

        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            // "scanner.nextInt()" automatically accepts an integer from the console and
            // that then returns an integer, and that's going to be stored in our array.
            values[i] = scanner.nextInt();
        }

        return values;
    }

    // Create an method the averages numbers
    public static double getAverage(int[] array) {
        // Define the local variable
        int sum = 0;
        // Create a for loop
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;

    }
}
