package com.collabera.JAVA_Training;

public class Animal {

    // Create Animal Fields
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // Create Animal Constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // Create an "eat" behavior/method
    public void eat() {
        // Test to make sure the eat() is running
        System.out.println("Animal.eat() called");
    }

    // Create a "move" behavior/method
    // Add the parameter "int speed" to the "move" behavior/method
    public void move(int speed) {
        System.out.println("Animal.move() is called. Animal is moving at " + speed);

    }

    // Create a getName method
    public String getName() {
        return name;
    }

    // Create a getBrain method
    public int getBrain() {
        return brain;
    }

    // Create a getBody method
    public int getBody() {
        return body;
    }

    // Create a getSize method
    public int getSize() {
        return size;
    }

    // Create a getWeight method
    public int getWeight() {
        return weight;
    }
}
