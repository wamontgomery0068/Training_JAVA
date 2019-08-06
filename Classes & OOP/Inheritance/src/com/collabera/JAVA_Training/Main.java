package com.collabera.JAVA_Training;

public class Main {

    public static void main(String[] args) {
        // Create a new Animal
        Animal animal = new Animal("Animal",1, 1, 5, 5);

        // Create a new Dog
        // Which include parameters from the "Animal Class" and "Dog Class"
        Dog dog = new Dog("Red Fox Labrador",1,80,2,4,1,30, "red");

        // Use the "Eat Behavior/Method" from the "Animal Class"
//        dog.eat();

        dog.walk();

//        dog.run();
    }
}
