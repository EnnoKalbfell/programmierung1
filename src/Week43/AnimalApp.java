package Week43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalApp {
    private static List<Animal> animals = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int command = -1;

        while(command != 0){
            System.out.println("0 quit, 1 add, 2 print");
            command = scanner.nextInt();
            scanner.nextLine(); // nextInt() macht keine neue Zeile

            if( command == 1){
                addAnimal(scanner);
            } else if (command == 2) {
                printAnimals();
            }
        }
        System.out.println("Bye!");
        scanner.close();
    }

    private static void printAnimals() {
        for (Animal animal: animals) {
            System.out.println(animal.toString());
        }

        /**
         *
         * int position = o;
         *
         * while(position < animals.size()){
         *     Animal a = animals.get(position);
         *     System.out.println(a); // .toString() wird im Hintergrund automatisch ausgeführt
         *     position++;
         * }
         *
         */
    }

    private static void addAnimal(Scanner scanner) {
        System.out.println("Enter animal name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the number of legs of this animal: ");
        int legs = scanner.nextInt(); // Macht nicht automatisch eine neue Linie
        scanner.nextLine();

        Animal animal = new Animal(name, legs);
        animals.add(animal);
    }


}
