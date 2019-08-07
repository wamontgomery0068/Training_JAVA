package com.collabera.JAVA_Training;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Example of an Integer Array's");

        // Empty Space in the console
        System.out.println();

        // Example of an Integer Array
        int[] myFirstIntArray = new int[3]; // First way to initialize an "Array"
        int[] mySecondIntArray = {1,2,3}; // Second way to initialize an "Array"
        // This is used when you know the exact integers inside the array
        int[] myThirdIntArray = new int[10]; // Third way to initialize an "Array"


        // Assign Integers to "myFirstIntArray"
        myFirstIntArray[0] = 10;
        myFirstIntArray[1] = 20;
        myFirstIntArray[2] = 30;

        // Test to console to see what you assigned in "myFirstIntArray"
        System.out.println("myFirstIntArray[0] = " + myFirstIntArray[0]);
        System.out.println("myFirstIntArray[1] = " + myFirstIntArray[1]);
        System.out.println("myFirstIntArray[2] = " + myFirstIntArray[2]);

        // Test to console to see what you assigned in "mySecondIntArray"
        System.out.println("mySecondIntArray[0] = " + mySecondIntArray[0]);
        System.out.println("mySecondIntArray[1] = " + mySecondIntArray[1]);
        System.out.println("mySecondIntArray[2] = " + mySecondIntArray[2]);

        // Empty Space in the console
        System.out.println();

        // Construct the "for loop"

        // First way to execute the for loop
//        for(int i = 0; i < 10; i++) {
//            myThirdIntArray[i] = i * 10;
//        }

        // Second way to execute the for loop
        for(int i = 0; i < myThirdIntArray.length; i++) {
            myThirdIntArray[i] = i * 10;
        }

        // Test to console to see what you assigned in "myThirdIntArray"
        // First way to execute the for loop
//        for(int i = 0; i < 10; i ++) {
//            System.out.println("Element " + i + ", value is  " + myThirdIntArray[i]);
//        }

        // Second way to execute the for loop
//        for(int i = 0; i < myThirdIntArray.length; i ++) {
//            System.out.println("Element " + i + ", value is  " + myThirdIntArray[i]);
//        }

        printArray(mrdIntArray);

    }

    // Create a method and call that method inside the "main()"
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            System.out.println("Element " + i + ", value is  " + array[i]);
        }
    }
}
