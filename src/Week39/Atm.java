package Week39;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        final int DEFINED_PIN = 1234;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gebe deinen PIN ein:");

        int pin = scan.nextInt();
        if (DEFINED_PIN == pin) {
            System.out.println("Korrekter Pin");
            System.out.println();
            System.out.println("Wie viel Geld wollen Sie beziehen?");
            int amount_retrieved = scan.nextInt();
            if ((amount_retrieved % 10) == 0 && amount_retrieved > 0) {
                System.out.println("Value acceptable. Returns " + amount_retrieved + " CHF");
            } else {
                System.out.println("Amount must be dividable by 10");
            }
        } else {
            System.out.println("Pin inkorrekt");
        }
        scan.close();
    }
}
