package com.collabera.JAVA_Training;

public class Main {

    public static void main(String[] args) {

        // Create a new account
        Account bobsAccount = new Account("12345",  0.00, "Bob Brown", "myemail@bob.com", "(123) 456-7899");

        // Print the information in Bob's Account

        // Empty space in console
        System.out.println();
        System.out.println("Account information of " + bobsAccount.getCustomerName());
        // Empty space in console
        System.out.println();
        System.out.println("Account number: " + bobsAccount.getNumber());
        System.out.println("Account balance: " + bobsAccount.getBalance());
        System.out.println("Customer name: " + bobsAccount.getCustomerName());
        System.out.println("Customer E-mail: " + bobsAccount.getCustomerEmailAddress());
        System.out.println("Customer Phone Number: " + bobsAccount.getCustomerPhoneNumber());

        // Empty space in console
        System.out.println();

        // Make a "withdrawal" from Bob's Account
        bobsAccount.withdrawal(100.00);

        // Make a "deposit" to Bob's Account
        bobsAccount.deposit(50.00);
        // Make a "withdrawal" from Bob's Account
        bobsAccount.withdrawal(100.00);

        // Make a "deposit" to Bob's Account
        bobsAccount.deposit(51.00);
        // Make a "withdrawal" from Bob's Account
        bobsAccount.withdrawal(100.00);

        // Empty space in console
        System.out.println();

        System.out.println("Test the VipPerson Class");

        // Empty space in console
        System.out.println();

        // Create a new VipPerson
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());


        // Empty space in console
        System.out.println();

        // Create a new VipPerson
        VipPerson person2 = new VipPerson("Joel", 25000.00);
        System.out.println(person2.getName());

        // Empty space in console
        System.out.println();

        // Create a new VipPerson
        VipPerson person3 = new VipPerson("Daniel", 100.00, "Daniel@email.com");
        System.out.println(person3.getName());


    }
}
