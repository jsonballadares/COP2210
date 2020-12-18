import java.util.ArrayList;
import java.util.Scanner;

public class AutoUnboxing {
    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(29.95);
        double x = values.get(0);
        ArrayList<String> inputs = new ArrayList<String>();
        inputs.add("Welcome");
        inputs.add("to");
        inputs.add("the");
        inputs.add("island");
        int i = 0;
        while (i < inputs.size()) {
            String word = inputs.get(i);
            if (word.length() < 4) {
                inputs.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(inputs);

        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        for (int j = primes.size() - 1; j >= 0; j--) {
            System.out.println(primes.get(j));
        }

        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("Emily");
        names1.add("Bob");
        names1.add("Cindy");
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Dave");
        append(names1, names2);
        System.out.println(names1);

        primes.forEach(p -> System.out.println(p.getClass().getName()));

    }

    public static void append(ArrayList<String> target, ArrayList<String> source) {
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }
}
