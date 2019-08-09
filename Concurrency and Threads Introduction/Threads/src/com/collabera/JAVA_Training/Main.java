package com.collabera.JAVA_Training;

// Notes:
// Project Type: Basic Console Application
// Project Description: Learning about Threads

import static com.collabera.JAVA_Training.ThreadColor.ANSI_GREEN;
import static com.collabera.JAVA_Training.ThreadColor.ANSI_RED;



public class Main {

    public static void main(String[] args) {
        // Create a message from the "Main Class Thread"
        System.out.println(ANSI_GREEN + "Hello from the main thread.");

        // Create an instance of "AnotherThread"
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        // Create an anonymous class
        new Thread() {
            public void run() {
                // Create a message from the "Anonymous Class Thread"
                System.out.println(ANSI_RED + "Hello from the anonymous class thread");
            }
        }.start();

        // Create a message from the "Main Class Thread"
        System.out.println(ANSI_GREEN + "Hello again from the main thread.");


    }
}
