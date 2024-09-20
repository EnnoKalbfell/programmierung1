package Week39;

public class SubstringExercise {
    public static void main(String[] args) {
        // Teil 1
        String village = "Matterhorn";

        String firstHalf = village.substring(0, 6);
        System.out.println(firstHalf);
        String secondHalf = village.substring(6,10);
        System.out.println(secondHalf);

        // Teil 2
        String village2 = firstHalf + secondHalf;
        System.out.println(village + " == " + village2 + " => " + (village2 == village));
    }
}
