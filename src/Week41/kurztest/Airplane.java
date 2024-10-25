package Week41.kurztest;

public class Airplane {
    private static int nextId = 0;
    private final int id;
    private String type;
    private int weight;
    private int seats;

    public Airplane() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.length() > 5) {
            this.type = type;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats > 1) {
            this.seats = seats;
        }
    }

    @Override
    public String toString() {
        return "(" + id + ") " + type + " (" + seats + " seats)";
    }
}