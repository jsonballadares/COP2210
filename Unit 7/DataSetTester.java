/*
 *  File: DataSetTester.java
 *
 *  Test class for the DataSet class.  Shows how to use JOptionPane to read
 *  any number of input values until end-of-file.
 *  Note: To indicate end-of-file, click the Cancel button and test for null
 */

import javax.swing.JOptionPane;

public class DataSetTester
{
    public static void main(String[] args)
    {
        DataSet set = new DataSet();	// create empty data set

        String input = JOptionPane.showInputDialog("Enter first data value "
                + "\n(or press Cancel to quit)");  // "primimg read"

        System.out.println("Data entered:");

        while (input != null) // while not end-of-file...
        {
            double value = Double.parseDouble(input);

            // "echo print" input data
            System.out.println(value);

            set.add(value);     // add data value to set

            input = JOptionPane.showInputDialog("Enter next data value "
                                               + "(or press Cancel to quit)");
        }
        // here at eof

        //if (set.isEmpty())      // if set is empty, print error message
        {
            //System.out.println("ERROR! No data entered!");
        } 
       // else                    // set is non-empty, print stats
        {
            System.out.println("\nThe average is:\t" + set.getAverage()
                    + "\nThe maximum is:\t" + set.getMaximum());
        }
        System.exit(0) ;
    }
}

/*
 * sample output from two runs:
 *
 * Data entered: 1.0 4.0 2.0
 *
 * The average is: 2.3333333333333335 The maximum is: 4.0
 *
 * Data entered: ERROR! No data entered!
 *
 */