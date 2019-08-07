package com.collabera.JAVA_Training;

public class Main {

    public static void main(String[] args) {

        // Create a new player object
//        Player player = new Player();

        // Manually set player field
//        player.name = "Andrew";
//        player.health = 20;
//        player.weapon = "Sword";

//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Andrew", 50, "sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
