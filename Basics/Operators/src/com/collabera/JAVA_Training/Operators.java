package com.collabera.JAVA_Training;

public class Operators {

    public static void main(String[] args) {

        int five = 5;
        int three = 3;
        int num1 = 5;

        // **** Arithmetic Operators Start ****

        // Example: Addition Operator
        System.out.println(five + three);

        // Example: Multiplication Operator
        System.out.println(five * three);

        // Example: Modulus Operator
        System.out.println(five % three);

        // Example: Increment Operator
        //five++; // Do everything on this line first and add one to the number
//        System.out.println(++five);

        // Example: Decrement Operator
        //three--; // Do everything on this line first and subtract one to the number
//        System.out.println(--three);


        // **** Relational Operators Start ****

        // Relational Operators

        // == -> equal to
        System.out.println(five == three);
        // Expected output should be "FALSE"

        // != -> not equal to
        System.out.println(five != three);
        // Expected output should be "TRUE"

        // > greater than
        System.out.println( five > three);
        // Expected output should be "TRUE"

        // >= greater than or equal to
        System.out.println(five >= num1);
        // Expected output should be "TRUE"

        // **** Bitwise Operators Start ****
        System.out.println(five & three);

        boolean var1 = true;
        boolean var2 = true;
        boolean var3 = false;
        boolean var4 = false;


        // **** Logical Operators Start ****

        // && --> Conditional And
        // Same as &, but if the operand on the left returns false,
        // it returns false without evaluating the operand on the right
        System.out.println(var1 && var2);
        // Expected outcome should return "TRUE"
        // Because both of the variables are "TRUE"
        System.out.println(var1 && var3);
        // Expected outcome should return "FALSE"
        // Because at least one of the variables is "FALSE"

        // || --> Conditional Or
        // Same as |, but if the operand on the left returns true,
        // it returns true without evaluating the right
        System.out.println(var1 || var2);
        // Expected outcome should return "TRUE"
        // Because at least one of the variables is "TRUE"
        System.out.println(var3 || var1);
        // Expected outcome should return "TRUE"
        // Because at least one of the variables is "TRUE"





    }
}
