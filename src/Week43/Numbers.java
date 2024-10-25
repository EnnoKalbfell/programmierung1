package Week43;
import java.util.ArrayList;
import java.util.Random;

public class Numbers {
    private final ArrayList<Integer> allNumbers;
    private final ArrayList<Integer> oddNumbers;

    public Numbers() {
        this.allNumbers = new ArrayList<>();
        this.oddNumbers = new ArrayList<>();
    }

    public void createNumbers() {
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            allNumbers.add(rand.nextInt(100));
        }
    }

    public void findOddNumbers() {
        for (int number : allNumbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
    }

    public ArrayList<Integer> getAllNumbers() {
        return allNumbers;
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }
}
