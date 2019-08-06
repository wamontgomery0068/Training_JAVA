package com.collabera.JAVA_Training;

// If we want to inherit from another class we use the keyword "extends"
// We are now allowed to use the "State" and "Behaviors" from the animal class

public class Dog extends Animal {

    // Create the Dog Object's State/Fields
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Initialized the base characteristics from the "Animal Class"
    // We can now assign extra state or extra fields and behaviors that are unique to a dog
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        // Initialize the Dog Object's State/Fields
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");

    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    // Create a "walk" behavior/method
    // "walk" behavior/method unique to the "Dog Class"
    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    // Create a "run" behavior/method
    // "run" behavior/method unique to the "Dog Class"
    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    // Create a "moveLegs" behavior/method
    // Adding "int speed" as a parameter
    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
