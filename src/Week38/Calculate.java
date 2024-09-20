package Week38;

public class Calculate {
    public static void main(String[] args) {
        final double k = 1000;
        final double mio = 1000000;

        double a = mio;
        double b = (a + 1) / k;
        double c = a / k;
        double d = b - c;
        double e = d * mio;
        double f = e - k;

        System.out.println((int)f);

        long i = 1000000000;
        i *= 1000;
        int j = (int) i;

        System.out.println(i + "000 = " +j);

    }
}
