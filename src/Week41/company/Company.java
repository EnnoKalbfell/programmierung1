package Week41.company;

public class Company {
    private final int id;
    private String name;
    private String town;
    private int numberOfEmployees;

    public Company(int id, String name, String town, int numberOfEmployees) {
        this.id = id;
        this.name = name;
        this.town = town;
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
