package Week39;

import java.util.Scanner;

public class TravelTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for inputs
        System.out.println("How far do you have to travel (km)?");
        int distance = in.nextInt();
        System.out.println("How are you travelling? 1 = walk, 2 = bicycle, 3 = car, 4 = train");
        int mode = in.nextInt();
        in.close();

        // Check the inputs for correctness
        if (distance > 0 && mode >= 1 && mode <= 4) {
            // Array for speed in km/h: index corresponds to travel mode
            int[] speeds = {0, 5, 15, 50, 70};  // 0 is a placeholder for index 0
            int speed = speeds[mode];  // Access speed based on mode

            // Calculate the travel time (in minutes)
            double travelTime = ((double) distance / speed) * 60;

            // Get hours and minutes from travel time
            int hours = (int) (travelTime / 60);
            int minutes = (int) (travelTime % 60);

            // Output the result
            System.out.println("Time required is " + hours + " hours and " + minutes + " minutes");
        } else {
            System.out.println("Error in your inputs");
        }
    }
}
