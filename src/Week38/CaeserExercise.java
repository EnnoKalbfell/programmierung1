package Week38;

public class CaeserExercise {
    public static void main(String[] args) {
        char originalCharacter = 'Z';
        char decodedCharacter;
        int offset = 3;
        int encodedValue;

        System.out.println("Original character: " + originalCharacter);
        encodedValue = originalCharacter + offset;
        System.out.println((char)encodedValue);
        decodedCharacter = (char)(encodedValue - offset);
        System.out.println(decodedCharacter);
    }
}
