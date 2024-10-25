package Week41;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter gender (MALE, FEMALE, OTHER): ");
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Enter favorite color (RED, GREEN, BLUE, YELLOW, OTHER): ");
        Color color = Color.valueOf(scanner.nextLine().toUpperCase());

        scanner.close();

        // Create Person object
        Person person = new Person(lastName, firstName, gender, color);

        // Output the person's details
        System.out.println("Person created:");
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Favorite Color: " + person.getFavColor());

    }
}
