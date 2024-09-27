package Week39;

import java.util.Scanner;

public class Woof {
    public static void main(String[] args) {
        System.out.println("Pleas enter your name: ");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        scan.close();

        System.out.println("Your name is " + name);

        int position = name.toLowerCase().indexOf('a');
        if (position >= 0){
            System.out.println("First 'a' at position " + position);
        } else {
            System.out.println("No 'a' found");
        }
    }
}
