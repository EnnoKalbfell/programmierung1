package Week41.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter id: ");
        int id = in.nextInt();
        in.nextLine();  // Consume the leftover newline

        System.out.println("Enter company name: ");
        String name = in.nextLine();

        System.out.println("Enter town name of company: ");
        String town = in.nextLine();

        System.out.println("Enter the number of employees: ");
        int numOfEmployees = in.nextInt();

        in.close();

        Company company = new Company(id,name, town, numOfEmployees);

        System.out.println(company.getId());
        System.out.println(company.getName());
        System.out.println(company.getTown());
        System.out.println(company.getNumberOfEmployees());
    }
}
