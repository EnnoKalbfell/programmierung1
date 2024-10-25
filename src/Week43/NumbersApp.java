package Week43;

public class NumbersApp {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.createNumbers();
        System.out.println("We have " + numbers.getAllNumbers().size() + " numbers");
        numbers.findOddNumbers();
        System.out.println("We have " + ((numbers.getOddNumbers().size() > 0) ? "some" : "no") + " odd numbers");
    }

}
