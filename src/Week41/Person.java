package Week41;

public class Person {
    private final int id;

    private String lastName;
    private String firstName;
    private Gender gender;

    private Color favColor;

    private static int nextId = 0;

    private static int getNextId(){
        return nextId++;
    }

    public Person(String lastName, String firstName, Gender gender, Color favColor) {
        this.id = getNextId();
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.favColor = favColor;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFavColor(Color favColor) {
        this.favColor = favColor;
    }

    public String getFavColor() {
        return toString(favColor);
    }

    public String toString(Color color){
        return color.toString();
    }
}
