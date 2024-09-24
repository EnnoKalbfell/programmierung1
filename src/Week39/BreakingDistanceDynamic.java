package Week39;

import java.util.Scanner;

public class BreakingDistanceDynamic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie die gefahrene Geschwindigkeit an:");
        double speedKmh = scan.nextDouble();
        System.out.println("Geben Sie die Reaktionszeit an:");
        double reactionTime = scan.nextDouble();
        final double breakingCoefficient = 16;
        double breakingDistanceTotal;
        double speed = mstokmh(speedKmh);
        breakingDistanceTotal = reactionDistance(speed, reactionTime) + breakingDistance(speed, breakingCoefficient);
        System.out.println(breakingDistanceTotal);
    }

    private static double mstokmh(double kmh) {
        final double factor = 3.6;
        return kmh / factor;
    }

    private static double reactionDistance(double speed, double time) {
        return speed * time;
    }

    private static double breakingDistance(double speed, double breakingCoefficient) {
        return Math.pow(speed, 2) / breakingCoefficient;
    }
}
