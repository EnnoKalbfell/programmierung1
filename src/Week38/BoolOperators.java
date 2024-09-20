package Week38;

public class BoolOperators {
    public static void main(String[] args) {
        int x = 234;
        int y = 2354;
        int z = 4321;

        boolean x_largest = x > y && y < z;
        boolean y_larges = x < y && y > z;
        boolean z_largest = x < y && y < z;

        System.out.println("x is the largest: " + x_largest);
        System.out.println("y is the largest: " + y_larges);
        System.out.println("z is the largest: " + z_largest);
    }
}
