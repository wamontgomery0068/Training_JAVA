package com.collabera.JAVA_Training;

import static com.collabera.JAVA_Training.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public synchronized void start() {
        // Create a message from the "AnotherThread Class Thread"
        System.out.println(ANSI_BLUE + "Hello from another thread.");
    }
}
