package Week38;

public class BoolExercise {
    public static void main(String[] args) {
        int i = 2;
        int j = 4;
        int k = 3;

        boolean i_largest = i > j && i > k;

        System.out.println("i is the largest: " + i_largest);

        boolean j_not_smallest = j > i || j > k;
        System.out.println("j is not the smallest: " + j_not_smallest);

        boolean k_between = (k > j && k < i) || ( k < j && k > i );
        System.out.println("k is between i and j: " + k_between);

        boolean same_value = (i == j) && (i == k);
        System.out.println("Numbers have the same value: " + same_value);

        boolean two_same = (i == j) || (i == k) || (k == j);
        System.out.println("2 Numbers have the same value: " + two_same);

    }
}
