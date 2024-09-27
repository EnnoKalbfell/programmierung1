package Week39;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of faces of the dice:");
        int faces = scan.nextInt();
        scan.close();
        Random dice = new Random();

        for (int i = 0; i <= 10; i++) {
            int value = dice.nextInt(faces) + 1;
            System.out.println(value);
        }
    }
}
