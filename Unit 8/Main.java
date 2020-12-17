import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int length = 1000000;
        for (int i = 0; i < length; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        final long startTimeLL = System.nanoTime();
        linkedList.remove(0);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arrayList.remove(0);
        final long endTimeAL = System.nanoTime();

        long totalTimeLL = endTimeLL - startTimeLL;
        long totalTimeAL = endTimeAL - startTimeAL;

        System.out.println("Linked List: " + totalTimeLL);
        System.out.println("Array List: " + totalTimeAL);

    }
}
