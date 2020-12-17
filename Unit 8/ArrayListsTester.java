import java.util.ArrayList;

public class ArrayListsTester {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Emily");
        System.out.println(names.toString());
        names.add("Bob");
        System.out.println(names.toString());
        names.add("Cindy");
        System.out.println(names.toString());
        names.set(2, "Carolyn");
        System.out.println(names.toString());
        names.add(1, "Ann");
        System.out.println(names.toString());
        names.remove("Ann");
        System.out.println(names.toString());
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
    }
}
