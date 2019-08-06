package com.collabera.JAVA_Training;

public class Main {

    public static void main(String[] args) {
        // Create a new car
        Car toyota = new Car();
        Car honda = new Car();

        toyota.setModel("four runner trd pro");


        System.out.println("Model: " + toyota.getModel());
    }
}
