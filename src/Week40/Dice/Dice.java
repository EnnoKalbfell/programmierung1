package Week40.Dice;

import java.util.Random;

public class Dice {
    private int numberOfSides;
    private static Random rnd = new Random();

    public Dice(int sides) {
        this.numberOfSides = sides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double theoreticalAverage() {
        double average = (1 + numberOfSides) / 2;
        return average;
    }

    public int rollDice() {
        return this.rnd.nextInt(numberOfSides) + 1;
    }
}
