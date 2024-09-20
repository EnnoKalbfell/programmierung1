package Week38;

public class Vat {
    public static void main(String[] args) {
        double price = 10;
        double vat = 8;
        double basePrice = price / ( 1 + (vat / 100));
        double vatAmount = price - basePrice;

        System.out.println("Bruttopreis: " + price);
        System.out.println("Nettopreis: " + basePrice);
        System.out.println("Mehrwertsteuer: " + vatAmount);
    }
}

