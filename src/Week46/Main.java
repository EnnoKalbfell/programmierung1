package Week46;

public class Main {

    public static void main(String[] args) {
        testingOutput();
    }

    public static String extendString(String str, int len) {
        if (str.length() < len) {
            int zerosToAdd = len - str.length();
            String result = str;
            for (int i = 0; i < zerosToAdd; i++) {
                result += '0';
            }
            return result;
        }
        return str;
    }

    public static void genNumbers() {
        for (int i = 15; i <= 25; i++) {
            System.out.print(i + " ");
        }
    }

    public static void powersOfTwo(int max) {
        if (max >= 1 && max <= 10) {
            int power = 1;
            for (int i = 1; i <= max; i++) {
                power *= 2;
                System.out.print(power + " ");
            }
            System.out.println();
        } else {
            System.out.println("Error");
        }
    }

    private static void testingOutput(){
        for (int val = 10; val >= 0; val -= 1) {
            if (val % 4 != 0)
                System.out.print(val + " ");
        }
    }
}
