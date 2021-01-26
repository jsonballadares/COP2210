// File:  ArrayIntro.java   

// Shows array processing basics: declaring an array, using "for" 
// statements to traverse it, and the "length" instance variable

import java.util.Random;

/**
 * A class to demonstrate the basics of array processing
 */
public class ArrayIntro {
    public static void main(String[] args) {
        Random r = new Random();

        int[] list = new int[10]; // an array that can hold up to 10 ints

        // ***** POPULATE the array *****

        // store 10 random ints between 0 and 99 in the array
        for (int i = 0; i <= 9; i++) {
            int next = r.nextInt(100);
            list[i] = next;
        }

        // ***** PROCESS the array *****

        // 1. print the array
        System.out.print("The array:  ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
        System.out.println();

        // 2. compute the sum of the ints in the array
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        System.out.println("\nThe sum of the ints in the array: " + sum);

        // 3. find the largest value in the array and its index
        int max = list[0]; // assume largest is in first element
        int indexOfMax = 0; // first element has index 0

        // for all other elements...
        for (int i = 1; i < list.length; i++) {
            int current = list[i]; // get next int from list
            if (current > max) // if greater than current max...
            {
                max = current; // ...we have a new max
                indexOfMax = i; // ... at this index (position)
            }
        }
        System.out.println("\nThe largest value in the array is " + max + " (at index " + indexOfMax + ")");

        // print the list backwards
        System.out.print("\nPrinting the array in reverse order:  ");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + "  ");
        }
        System.out.println("\n");
    }
}

/*
 * sample output
 * 
 * The list: 69 61 69 42 85 52 73 38 40 89
 * 
 * The sum of the ints on the list is 618
 * 
 * The largest value on the list is 89 (at index 9)
 * 
 * Printing the list in reverse order: 89 40 38 73 52 85 42 69 61 69
 * 
 */