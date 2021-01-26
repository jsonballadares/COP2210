/*
 * File: ArrayDataSetTest.java
 * 
 * A simple test class for the ArrayDataSet class.  Stores any number of  
 * integer scores in an array, passes the array to the ArrayDataSet constructor,
 * and calls the methods of the ArrayDataSet class
 *
 * In this example the scores are generated randomly, but the ArrayDataSet
 * class would not have to be modified in any way if they were read from the 
 * keyboard or from a data file instead
 *
 * Also shows how to use a while loop to "coerce" good input
 */

import java.util.Random;
import javax.swing.JOptionPane;

public class ArrayDataSetTest {
    public static void main(String[] args) {
        // get number of scores from the user
        String input = JOptionPane.showInputDialog("How many scores?");
        int numberOfScores = Integer.parseInt(input);

        // check for illegal number of scores
        while (numberOfScores <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Sorry, number of scores must be " + "positive!\n(You entered " + numberOfScores + ")");
            input = JOptionPane.showInputDialog("How many scores?");
            numberOfScores = Integer.parseInt(input);
        }

        // declare array to hold that number of scores
        int[] theScores = new int[numberOfScores];

        Random r = new Random();

        // generate exactly "numberOfScores" random scores between 0 and 100,
        // inclusive and store them in the array
        for (int i = 0; i < numberOfScores; i++) {
            theScores[i] = r.nextInt(101);
        }

        ArrayDataSet set = new ArrayDataSet(theScores);

        System.out.println("The scores: " + set.toString());
        System.out.println("The average is: " + String.format("%.2f", set.getAverage()));
        System.out.println("The maximum is: " + set.getMaximum());
        System.out.println("The standard deviation is: " + String.format("%.2f", set.getStanDev()));
    }
}