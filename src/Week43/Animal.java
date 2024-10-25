package Week43;

public class Animal {
    private final String name;
    private final int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public String toString(){
        return this.name + " has " + this.legs + " legs";
    }
}
