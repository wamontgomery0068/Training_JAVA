package com.collabera.JAVA_Training;

import static com.collabera.JAVA_Training.ThreadColor.ANSI_CYAN;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_CYAN + "Hello from MyRunnable's implementation of run()");
    }
}
