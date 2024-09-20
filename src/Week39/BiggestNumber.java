package Week39;

public class BiggestNumber {
    public static void main(String[] args) {
        int x = 345234;
        int y = 5345;
        int z = 456;

        if ( x > y && x > z){
            System.out.println("x is the biggest");
        } else if (y > z) {
            System.out.println("y ist the biggest");
        } else {
            System.out.println("z ist the biggest");
        }
    }
}
