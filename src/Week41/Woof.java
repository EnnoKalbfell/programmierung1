package Week41;

public class Woof {
    private final int id;
    private static int nextId = 0;

    private static int getNextId(){
        return nextId ++;
    }

    public Woof(){
        this.id = getNextId();
    }


}
