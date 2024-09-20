package Week38;

public class Shop {
    public static void main(String[] args) {
        int weeks = 52;
        int weekdays = 5;

        // Turnover in weekdays
        int turnover = weeks * weekdays * 20 * 10;

        // Turnover on saturdays
        int turnoverSaturday = weeks * 30 * 8;

        // Total turnover
        int total = turnoverSaturday + turnover;

        System.out.println("Gesamtumsatz: " + total);
    }
}
