package Week38;

public class FibonacciExercise {
    public static void main(String[] args) {
        int num1 = 0,num2 = 0;
        num2++;

        for(int i=0;i<10;i++){
            System.out.println(num1);
            System.out.println(num2);

            num1=num1+num2;
            num2=num1+num2;
        }
    }
}
