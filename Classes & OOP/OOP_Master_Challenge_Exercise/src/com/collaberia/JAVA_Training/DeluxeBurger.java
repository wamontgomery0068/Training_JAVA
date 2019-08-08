package com.collaberia.JAVA_Training;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {

        super("Deluxe", "Angus Beef & Bacon", 15.20, "White");

        super.addHamburgerAddition1("Fries", 2.75);
        super.addHamburgerAddition2("Drink", 1.45);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burgers.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burgers.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burgers.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burgers.");
    }
}
