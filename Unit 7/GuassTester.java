//   File:  GaussTester.java

//  The Gauss class computes the sum of the integers from 1 to n, 
//  using a "brute force" approach and also by Gauss' formula.
//  N is entered by the user.
//  Demonstrates a "for" loop and an accumulator

import javax.swing.JOptionPane;

/**
 * Computes the sum of the integers from 1 to n
 */
class Gauss
{

    private long sum;		// sum of int's from 1 to n
    private long highInt;	// n

    /**
     * Create a Gauss object.
     *
     * @param limit the highest int to be added
     */
    public Gauss(long limit)
    {
        sum = 0;
        highInt = limit;
    }

    /**
     * Computes the sum of the ints from 1 to highInt.
     * @return the sum, as a long
     */
    public long getSum()
    {
        // for each int from 1 to highInt...

        for (int number = 1; number <= highInt; number++)
        {
            sum = sum + number;	// ...add current number to sum
        }
        return sum;
    }
}

public class GaussTester
{

    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("I will compute the sum of "
                + "the integers from 1 to N.\n\nPlease enter N");
        long limit = Integer.parseInt(input);
        long n = limit ;
        Gauss karl = new Gauss(limit);
        System.out.println("\nThe sum of the integers from 1 to " + limit
                + " is " + karl.getSum());
        System.out.println("\nBy Gauss' formula: " + (((n*n) + n) / 2)) ;
        System.exit(0);
    }
}

/*  sample output:

The sum of the integers from 1 to 1000 is 500500

By Gauss' formula: 500500

*/