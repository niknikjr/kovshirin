package work93;

public class Id {
    private int id;
    private static int nextId;

    static  {
        nextId = ((int) (Math.random()*100));
    }

    public Id() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
