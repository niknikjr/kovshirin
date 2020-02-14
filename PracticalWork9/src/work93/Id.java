package work93;

public class Id {
    private int id;
    private static int nextId;



    public Id(int id) {
        nextId = ((int) (Math.random()*100));
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
