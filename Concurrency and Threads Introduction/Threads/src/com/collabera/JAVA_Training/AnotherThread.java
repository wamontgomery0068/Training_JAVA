package com.collabera.JAVA_Training;

import static com.collabera.JAVA_Training.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        // Create a message from the "AnotherThread Class Thread"
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        // Example of a try catch block
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }

        System.out.println(ANSI_BLUE + "Three seconds have passes and I'm awake");

    }
}
