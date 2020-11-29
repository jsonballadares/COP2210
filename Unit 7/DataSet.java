/**
 * Computes average and maximum of a set of data values.
 */
public class DataSet
{
    // instance vars

    private double sum;		// sum of the values in the set
    private int count;		// number of values in the set
    private double maximum;	// largest value

    /**
     * Create an empty data set.
     */
    public DataSet()
    {
        count = 0;
        sum = 0.0;
        maximum = Double.MIN_VALUE;	   // Java constant
    }

    /**
     * add a value to the data set.
     *
     * @param currentValue the number to be added to the set
     */
    public void add(double currentValue)
    {
        sum = sum + currentValue;     // add new value to the sum
        count++;                      // one more value was added

        if (currentValue > maximum)   // if current value is largest so far...	
        {			                    // (note: must be true first time)
            maximum = currentValue;   // ...current value becomes new largest
        }
    }

    /**
     * Return the largest value in the set. Note: if set is empty, will return
     * NEGATIVE INFINITY
     *
     * @return the largest value
     */
    public double getMaximum()
    {
        return maximum;
    }

    /**
     * Return the average of the values in the set. Note: if set is empty, will
     * return INFINITY
     *
     * @return average
     */
    public double getAverage()
    {
        return sum / count;
    }

    /**
     * Is the set empty?
     *
     * @return true if the set is empty, false if nonempty
     */
    public boolean isEmpty()
    {
        return count == 0;
    }
}