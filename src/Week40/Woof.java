package Week40;

public class Woof {
    private int woof;

    public Woof(int woof) {
        this.woof = woof;
    }
    public void setWoof(int woof) {
        this.woof = woof;
    }
    public int getWoof() {
        return woof;
    }
    public static void main(String[] args) {
        Woof woof1 = new Woof(2);
        Woof woof2 = new Woof(4);
        System.out.print(woof1.getWoof() + woof2.getWoof());
        woof1 = woof2;
        woof2.setWoof(4);
        System.out.println(woof1.getWoof() + woof2.getWoof());
    }
}
