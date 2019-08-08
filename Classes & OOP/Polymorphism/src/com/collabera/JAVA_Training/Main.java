package com.collabera.JAVA_Training;

// ***** Polymorphism *****

// Create a new class and name it "Movie"
// The Movie Class will be considered the "base class"
class Movie {
    // Create the Movie Fields
    private String name;

    // Create the Movie Constructor
    public Movie(String name) {
        this.name = name;
    }

    // Create a method and name it "Plot"
    public String plot() {
        // Have the method return a default plot
        return "No plot here";
    }

    // Create a get method to return the name of the movie
    public String getName() {
        return name;
    }
}

// *** 1st Movie ***

// Create a new class called "Aquaman" and have it extend/inherit to the "Movie Class"
class Aquaman extends Movie {
    public Aquaman() {
        super("Aquaman");
    }

    // Create a method and name it "Plot"

    @Override
    public String plot() {
        return "Once home to the most advanced civilization on Earth, the city of Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people -- and then the surface world. Standing in his way is Aquaman, Orm's half-human, half-Atlantean brother and true heir to the throne. With help from royal counselor Vulko, Aquaman must retrieve the legendary Trident of Atlan and embrace his destiny as protector of the deep.";
    }
}

// *** 2nd Movie ***

// Create a new class called "AvengersEndGame" and have it extend/inherit to the "Movie Class"
class AvengersEndGame extends Movie {
    public AvengersEndGame() {
        super("Avengers: Endgame");
    }

    // Create method and name it "Plot"
    @Override
    public String plot() {
        return "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.";
    }
}

// *** 3rd Movie ***

// Create a new class called "Gladiator" and have it extend/inherit to the "Movie Class"
class Gladiator extends Movie {
    public Gladiator() {
        super("Gladiator");
    }

    // Create a method and name it "Plot"
    @Override
    public String plot() {
        return "A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery.";
    }
}

// *** 4th Movie ***

// Create a new class called "StarWarsEpisodeVTheEmpireStrikesBack" and have it extend/inherit to the "Movie Class"
class StarWarsEpisodeVTheEmpireStrikesBack extends Movie {
    public StarWarsEpisodeVTheEmpireStrikesBack() {
        super("Star Wars: Episode V - The Empire Strikes Back ");
    }

    // Create a method and name it "Plot"
    @Override
    public String plot() {
        return "After the Rebels are brutally overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda, while his friends are pursued by Darth Vader.";

    }
}

// *** 5th Movie ***

// Create a new class called "Forgettable" and have it extend/inherit to the "Movie Class"
class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    // No plot method
}

public class Main {

    public static void main(String[] args) {
        // *** Polymorphism in action ***
        // create a for loop
        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    // Create a static method called random movie
    // Why Static Method?
    // Because it's part of this main.java and not a separate class
    // Purpose: Is to return 1 of the 5 movies that were created
    public static Movie randomMovie() {

        // The randomNumberGenerator will return a number between 0 and 5
        int randomNumberGenerator = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumberGenerator);

        switch(randomNumberGenerator) {
            case 1:
                return new Aquaman();

            case 2:
                return new AvengersEndGame();

            case 3:
                return new Gladiator();

            case 4:
                return new StarWarsEpisodeVTheEmpireStrikesBack();

            case 5:
                return new Forgettable();
        }

        return null;

    }

}
