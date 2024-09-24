package Week39;

import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert first number");
        int num1 = scan.nextInt();
        System.out.println("Insert second number");
        int num2 = scan.nextInt();
        System.out.println("Insert third number");
        int num3 = scan.nextInt();

        System.out.println("");
        System.out.println("The sum is " + ( num1 + num2 + num3 ));
    }
}
