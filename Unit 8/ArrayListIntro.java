//	File:  ArrayListIntro.java   

// Uses an "ArrayList of Integer" object to show list processing basics: 
// using a for statement to traverse a list, and ArrayList methods add(), 
// size(), and get(). 
import java.util.ArrayList;
import java.util.Random;

/**
 * A class to demonstrate the basics of list processing
 */
public class ArrayListIntro {

    public static void main(String[] args) 
    {
        Random r = new Random();

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // ***** POPULATE the list *****
        
        // add 10 random ints between 10 and 99 to the list
        for (int i = 1; i <= 10 ; i++) 
        {
            int next = r.nextInt(90) + 10 ;
            list.add(next);
        }
        
        // ***** PROCESS the list *****
        
        // print the list
        System.out.print("The list:  ");
        for (int i = 0; i < list.size(); i++) 
        {
            int num = list.get(i) ;
            System.out.print( num + "  " );
        }       
        System.out.println();

        // compute the sum of all ints on the list
        int sum = 0;
        for (int i = 0; i < list.size(); i++) 
        {
            int num = list.get(i);	// get next int from the list...
            sum = sum + num;		// ...and add to sum
        }
        System.out.println("\nThe sum of the numbers on the list is " + sum);
 
        // the average is the sum divided by the number of objcts on the list
        double average = sum / (double) list.size() ;
        System.out.println("\nThe average of the numbers on the list is " + 
                           average) ;
        
        // find the largest value on the list and its position
        int max = list.get(0);  	// assume max is in first element
        int indexOfMax = 0;     	// first element has index 0

        // for all other elements...
        for (int i = 1; i < list.size(); i++) 
        {
            int current = list.get(i);	// get next int from list
            if (current > max)          // if greater than current max...
            {
                max = current;		// ...we have a new max
                indexOfMax = i;         // ... at this index (position)
            }
        }
        System.out.println("\nThe largest value on the list is " + max
                + ", at index " + indexOfMax);
        
        // print the list backwards
        System.out.print("\nPrinting the list backwards:  ");
        for (int i = list.size() - 1; i >= 0; i--) 
        {
            int number = list.get(i) ;
            System.out.print( number + "  " );
        }
        System.out.println("\n") ;
    }
}

/*  sample output

The list:  98  62  74  19  27  40  75  35  74  64  

The sum of the numbers on the list is 568

The average of the numbers on the list is 56.8

The largest value on the list is 98, at index 0

Printing the list backwards:  64  74  35  75  40  27  19  74  62  98 

*/