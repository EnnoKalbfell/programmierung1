package Week38;

public class BreakingDistance {
    public static void main(String[] args) {

        final double speedKmh = 100;
        final double reactionTime = 0.3;
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
