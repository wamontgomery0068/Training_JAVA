package com.collabera.JAVA_Training;

public class Player {

    // Player Object Fields
    // Set Scope to "Public" to allow other Classes to access the "Player Fields"
    public String fullName;
    public int health;
    public String weapon;

    // Create a loseHealth method
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    // Create a healthRemaining method
    public int healthRemaining() {
        return  this.health;
    }

}
