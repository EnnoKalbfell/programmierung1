package Week40;

public class Skyscraper {
    private final String name;
    private double height;
    private int numberOfFloors;

    public Skyscraper(String name, int height, int numberOfFloors) {
        this.name = name;
        this.height = height;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return name + ": height " + height + "m, " + numberOfFloors + " floors";
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
