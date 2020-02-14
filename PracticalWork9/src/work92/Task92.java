package work92;

public class Task92 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("firstname1", "lastname1", "ukr", 38065789);
        emp1.getNumberOfEmployees();
        System.out.println("kolvo " + emp1.getNumberOfEmployees());

        Employee emp2 = new Employee("firstname2", "lastname2", "ukr", 38065789);
        System.out.println("kolvo " + emp2.getNumberOfEmployees());
    }
}
