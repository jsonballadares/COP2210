/**
 * Person
 */
public class Person {
    private String name;
    private int billions;

    public Person(String name, int billions) {
        this.name = name;
        this.billions = billions;
    }

    public String getName() {
        return name;
    }

    public int getBillions() {
        return billions;
    }
}