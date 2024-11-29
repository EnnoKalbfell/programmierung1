package Week48;

import java.util.Arrays;

public class ExerciseFour {
    public static void main(String[] args) {
        boolean[] flags = new boolean[6];

        for (int i = 0; i < flags.length; i++) {
            flags[i] = (i % 2 == 0);
        }
        System.out.println(Arrays.toString(flags));
    }
}

