// File:	TemperatureConverter.java

// Shows how to use the "for" statement to generate a series of values.
// Note: TemperatureConverter class depends on Align class to format output
import javax.swing.JOptionPane;

/**
 * Prints a table of Fahrenheit temperatures and their celsius equivalents, for
 * integral fahrenheit temps from some "low" temp to some "high" temp, where
 * these are entered by the user.
 */
public class TemperatureConverter
{

    private int lowFahren;	// lowest Fahrenheit temp to be converted
    private int highFahren;	// highest Fahrenheit temp to be converted

    /**
     * Create a TemperatureConverter object.
     *
     * @param low the lowest Fahrenheit temperature in the series
     * @param high the highest Fahrenheit temperature in the series
     */
    public TemperatureConverter(int low, int high)
    {
        // make sure low is <= high
        if (low <= high)
        {
            lowFahren = low;
            highFahren = high;
        }
        else
        {
            lowFahren = high;
            highFahren = low;
        }
    }

    /**
     * Create and print the table of temperatures.
     */
    public void printTable()
    {
        System.out.println("\n" + String.format("%20s","Fahrenheit")
                + String.format("%12s","Celsius"));	// print headings
        System.out.println(String.format("%20s","==========")
                + String.format("%12s","======="));

        // for each fahrenheit temperature from the low to the high...

        for (int fahren = lowFahren; fahren <= highFahren; fahren++)
        {
            double celsius = (fahren - 32) / 1.8;// ...convert to celsius			     

            // ...print line of table
            System.out.println(String.format("%20d",fahren)
                    + String.format("%12.2f", celsius));
        }
    }

    /**
     * Test the TemperatureConverter class.
     */
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "I will print a table of integral "
                + "Fahrenheit temperatures\nand their Celsius equivalents "
                + "for Fahrenheit temps\nbetween a low and a high.");

        String input = JOptionPane.showInputDialog("Enter the low fahrenheit "
                + "temperature (an integer)");

        int lowTemp = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the high fahrenheit "
                + "temperature (an integer)");

        int highTemp = Integer.parseInt(input);

        TemperatureConverter table = new TemperatureConverter(lowTemp, highTemp);
        table.printTable();
        System.exit(0) ;
    }
}

/*  sample output:

          Fahrenheit     Celsius
          ==========     =======
                  75       23.89
                  76       24.44
                  77       25.00
                  78       25.56
                  79       26.11
                  80       26.67
                  81       27.22
                  82       27.78
                  83       28.33
                  84       28.89
                  85       29.44
                  86       30.00
                  87       30.56
                  88       31.11
                  89       31.67
                  90       32.22
                  91       32.78
                  92       33.33
                  93       33.89
                  94       34.44
                  95       35.00
*/