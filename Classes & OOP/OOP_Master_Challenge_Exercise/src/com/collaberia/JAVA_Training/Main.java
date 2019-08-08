package com.collaberia.JAVA_Training;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Angus Beef", 3.56, "White");

        // The price for a basic hamburger
        // double price = hamburger.itemizeHamburger();

        // Customer Hamburger addition 1
        hamburger.addHamburgerAddition1("Barbecue Sauce", 0.25);

        // Customer Hamburger addition 2
        hamburger.addHamburgerAddition2("Bacon", 1.50);

        // Customer Hamburger addition 3
        hamburger.addHamburgerAddition3("Cheese", 1.00);

        // Customer Hamburger addition 4
        hamburger.addHamburgerAddition4("Fries", 2.00);

        // Price for a basic hamburger with additional items
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Steak", 8.50);
        healthyBurger.addHamburgerAddition1("Lettuce", 1.27);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        System.out.println();
        DeluxeBurger deluxeburger = new DeluxeBurger();
        deluxeburger.itemizeHamburger();




    }
}
