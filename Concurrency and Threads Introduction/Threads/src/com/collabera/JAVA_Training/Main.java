package com.collabera.JAVA_Training;

// Notes:
// Project Type: Basic Console Application
// Project Description: Learning about Threads

import static com.collabera.JAVA_Training.ThreadColor.*;


public class Main {

    public static void main(String[] args) {
        // Create a message from the "Main Class Thread"
        System.out.println(ANSI_GREEN + "Hello from the main thread.");

        // Create an instance of "AnotherThread"
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        // Create an anonymous class
        new Thread() {
            public void run() {
                // Create a message from the "Anonymous Class Thread"
                System.out.println(ANSI_RED + "Hello from the anonymous class thread");
            }
        }.start();

        // Create an instance of "myRunnableThread"
        Thread myRunnableThread = new Thread(new MyRunnable() {

            // Create an "Anonymous Class" within myRunnableThread
            @Override
            public void run() {
                System.out.println(ANSI_PURPLE + "Hello from the anonymous class's implementation of run()");
            }
        });

        myRunnableThread.start();

        // Create a message from the "Main Class Thread"
        System.out.println(ANSI_GREEN + "Hello again from the main thread.");


    }
}
