package work81;

public class Book {
    private int id;
    private String name;
    private String author;
    private String oublisher;
    private int year;
    private int page;
    private double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOublisher() {
        return oublisher;
    }

    public void setOublisher(String oublisher) {
        this.oublisher = oublisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }



    public Book(String name, String author, String oublisher) {
        this.name = name;
        this.author = author;
        this.oublisher = oublisher;
    }

    public Book(int id, String name, String author, String oublisher, int year, int page, double cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.oublisher = oublisher;
        this.year = year;
        this.page = page;
        this.cost = cost;
    }


    public void viewBook(){
        System.out.println("Name = " + name + ", author= " + author + ", publisher=" + oublisher + ", year=" + year + ", page=" + page + ", cost=" + cost);
    }
}
