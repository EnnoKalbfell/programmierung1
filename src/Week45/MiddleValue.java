package Week45;

public class MiddleValue {

    // Main nur zum Testen der Methode
    public static void main(String[] args) {
        // Expected 2
        System.out.println(middleInteger(1, 2, 2));
        // Expected 2
        System.out.println(middleInteger(2, 1, 2));
    }

    /**
     * Schreiben Sie eine Methode, die drei int-Werte als Parameter akzeptiert ✅
     * und den mittleren Wert zurückgibt.
     * Dies ist schwieriger als man denkt, da zwei oder sogar drei Werte gleich sein könnten. Beispiele:
     *
     * Für Parameter 1, 3, 2 ist die Antwort 2
     * Für Parameter 10, 10, 10 ist die Antwort 10
     * Für Parameter 5, 6, 5 ist die Antwort 5
     */

    // TODO Your method must be "public static", and must be named "middleInteger"
    // TODO The return type must be "int", and the method must have three "int" input parameters
    public static int middleInteger(int zahl1, int zahl2, int zahl3) {
        double sum = zahl1 + zahl2 + zahl3;
        int middleValue = (int)(sum / 3 + 0.5);
        return middleValue;
    }


}
