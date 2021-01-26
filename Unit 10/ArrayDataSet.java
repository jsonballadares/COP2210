
/*
* File:  ArrayDataSet.java
*
* A class with an array instance variable 
*/

/**
 * Computes average, maximum, and standard deviation of any number of scores
 */
public class ArrayDataSet {
    // instance var
    private int[] scores; // array object variable

    /**
     * Creates a data set with any number of scores
     * 
     * @param theScores an array of scores to be added to the set
     */
    public ArrayDataSet(int[] theScores) {
        // point instance var "scores" at the array parameter
        scores = theScores;
    }

    /**
     * Returns a string containing all the scores in the DataSet
     * 
     * @return all the scores
     */
    public String toString() {
        String scoreString = ""; // create empty string

        // for each score in the set...
        for (int i = 0; i < scores.length; i++) {
            // ...concatenate it to scoreString
            scoreString += "  " + scores[i];
        }
        return scoreString;
    }

    /**
     * Returns the average of the scores in the DataSet
     * 
     * @return the average score
     */
    public double getAverage() {
        int sum = 0;
        // for each score in the DataSet
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return (double) sum / scores.length;
    }

    /**
     * Returns the largest score in the DataSet
     * 
     * @return the largest score
     */
    public int getMaximum() {
        int max = scores[0]; // assume first score is largest

        // check all other scores
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) // if next score . current max...
            {
                max = scores[i]; // ...save as new max
            }
        }
        return max;
    }

    /**
     * Computes and returns the population standard deviation
     * 
     * @return the population standard deviation
     */
    public double getStanDev() {
        // 1. get the average of all the scores
        double average = this.getAverage();

        // 2. compute the sum of the squares of the differences between
        // each score and the average

        double sumOfSquares = 0.0;

        // for each score in the array...
        for (int i = 0; i < scores.length; i++) {
            double diff = scores[i] - average; // difference from average
            sumOfSquares += Math.pow(diff, 2); // add square of difference
        } // to accumulator

        // 3. divide by number of scores
        double variance = sumOfSquares / scores.length;

        // 4. standard deviation is square root of the variance
        return Math.sqrt(variance);
    }
}