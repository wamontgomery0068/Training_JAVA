package com.collabera.JAVA_Training;

// Create a base class called Car
// We do not use the word "static" because we are not in the main class
class Car {
    // It should have a few fields that would be appropriate for a generic car class
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructor should initialize cylinders (number of) and name, and sett wheels to
    // 4 and engine to true. Cylinders and names would be passed parameters.
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    // Create appropriate getters
    public int getCylinders() {
        return cylinders;
    }

    // Create appropriate getters
    public String getName() {
        return name;
    }

    // Create a method called startEngine
    public String startEngine() {
        // Show a message for each in the base class
        return "Car -> startEngine()";
    }

    // Create a method called accelerate
    public String accelerate() {
        // Show a message for each in the base class
        return "Car -> accelerate()";
    }

    // Create a method called brake
    public String brake() {
        // Show a message for each in the base class
        return "Car -> brake";
    }
}

// Now create 3 sub classes for your favorite vehicles
// We do not use the word "static" because we are not in the main class
class Toyota extends Car {

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    // Override the appropriate methods to demonstrate polymorphism in use
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    // Override the appropriate methods to demonstrate polymorphism in use
    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    // Override the appropriate methods to demonstrate polymorphism in use
    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake";
    }
}

// Now create 3 sub classes for your favorite vehicles
// We do not use the word "static" because we are not in the main class
class Honda extends Car {

    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    // Override the appropriate methods to demonstrate polymorphism in use
    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    // Override the appropriate methods to demonstrate polymorphism in use
    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    // Override the appropriate methods to demonstrate polymorphism in use
    @Override
    public String brake() {
        return "Honda -> brake";
    }
}

// Now create 3 sub classes for your favorite vehicles
// We do not use the word "static" because we are not in the main class
class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    // Override the appropriate methods to demonstrate polymorphism in use
    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    // Override the appropriate methods to demonstrate polymorphism in use
    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    // Override the appropriate methods to demonstrate polymorphism in use
    @Override
    public String brake() {
        return "Ford -> brake";
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Parent: Base Class");
        Car car = new Car(8, "Car Class");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println();


        System.out.println("Child: Toyota Class");
        System.out.println();
        Toyota toyota = new Toyota (4, "4Runner Trd Pro");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());
        System.out.println();


        System.out.println("Child: Honda Class");
        Honda honda = new Honda (4, "Pilot");
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
        System.out.println();


        System.out.println("Child: Ford Class");
        Ford ford = new Ford (6, "Bronco");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }
}
