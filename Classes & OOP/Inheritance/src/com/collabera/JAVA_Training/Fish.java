package com.collabera.JAVA_Training;

public class Fish extends Animal {

    // Create the Fish Object's State/Fields
    private int gills;
    private int eyes;
    private int fins;

    // Initialized the base characteristics from the "Animal Class"
    // We can now assign extra state or extra fields and behaviors that are unique to a fish
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        // Initialize the Fish Object's State/Fields
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    // Create a "rest" behavior/method
    public void rest() {

    }

    // Create a "moveMuscles" behavior/method
    public void moveMuscles() {

    }

    // Create a "moveBackFin" behavior/method
    public void moveBackFin() {

    }

    // Create a "swim" behavior/method
    // Swimming is a combination of "moveMuscles()" and "moveBackFin()"
    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
