package com.collabera.JAVA_Training;

// Import JAVA packages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println();

        System.out.println("Enter your first name below: ");
        String firstName = reader.readLine();

        System.out.println("Enter your last name below: ");
        String lastName = reader.readLine();

        System.out.println();

        System.out.println( firstName + " " + lastName);

    }
}
