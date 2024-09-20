package Week38;

public class Factorial {
    public static void main(String[] args) {
        long answer = 1;

        for (int i = 1; i <= 20; i++){
            answer *= i;
            System.out.println(answer);
        }
    }
}
