package Week40.Dice;

import java.util.Scanner;

public class SimulateDice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What size of dice should we use?");
        int sizeOfDice = scan.nextInt();
        scan.close();

        Dice dice = new Dice(sizeOfDice);

        double actualAvg = 0;
        actualAvg += dice.rollDice();
        actualAvg += dice.rollDice();
        actualAvg += dice.rollDice();
        actualAvg /= 3;

        System.out.println("The average should be: " + dice.theoreticalAverage());
        System.out.println("The average of three rolls was: " + actualAvg);
    }
}
