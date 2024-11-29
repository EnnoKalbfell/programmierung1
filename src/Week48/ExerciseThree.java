package Week48;

import java.util.Arrays;

public class ExerciseThree {
    private static final int INITIAL = 7;

    public static void main(String[] args) {
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = INITIAL;
        }

        System.out.println(Arrays.toString(nums));
    }
}