package com.collabera.JAVA_Training;

public class VipPerson {

    // Create VipPerson Fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Create Complete Default VipPerson Constructor
    public VipPerson() {
        this("Default name", 50000.0, "default@email.com");
    }

    // Create Partial Default VipPerson Constructor
    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    // Create Main VipPerson Constructor
    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // Create getName Method
    public String getName() {
        return name;
    }

    // Create getCreditLimit Method
    public double getCreditLimit() {
        return creditLimit;
    }

    // Create getEmailAddress Method
    public String getEmailAddress() {
        return emailAddress;
    }
}
