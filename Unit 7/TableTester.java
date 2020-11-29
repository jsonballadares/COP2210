//  File: TableTester.java
// Demonstrates nested for loops

/**  Class MultiplicationTable prints two multiplication table for 1's through 
 *   10's.  One contains duplicate values and the other does not
 */
class MultiplicationTable
{
    /*
     * Creates a MultiplicationTable object
     */
    public MultiplicationTable()  // a "default" constructor
    {}

    // "utility" method prints the column headings for the table
    private void printColHeadings()
    {
        System.out.print("         ");		// indents 9 spaces

        // for each column from 1 to 10...
        for (int i = 1; i <= 10; i++)
        {
            // ... print column number right-aligned in a field 5 spaces wide
            System.out.printf("%5d",i) ;
        }
        System.out.print("\n         ");	// new line and indent

        for (int i = 1; i <= 50; i++) // underline col headings
        {
            System.out.print('-');
        }
        System.out.println();
    }

    /**
     * Prints a multiplication table for 1's through 10's with duplicate
     * value.  E.g. 3 x 7 and 7 x 3
     */
    public void printTableWithDupes()
    {
        this.printColHeadings();   // prints the column headings

        // for each row from 1 to 10...
        for (int row = 1; row <= 10; row++)
        {
            // ...print row headings
            System.out.printf("%8d|",row);

            // for each column from 1 to 10
            for (int col = 1; col <= 10; col++)
            {
                // ...multiply row number by column number
                int product = row * col;
                System.out.printf("%5d",product);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
        
    /**
     * Prints a multiplication table for 1's through 10's with no duplicates.
     * E.g. contains 3 x 7 but not 7 x 3
     * 
     */
    public void printTableNoDupes()
    {
        this.printColHeadings();   // prints the column headings

        // for each row from 1 to 10...
        for (int row = 1; row <= 10; row++)
        {
            // ...print row headings
            System.out.printf("%8d|",row);

            // for each column from 1 to the current row number
            for (int col = 1; col <= row; col++)
            {
                // ...multiply row number by column number
                int product = row * col;
                System.out.printf("%5d",product);
            }
            System.out.println();
        }
        System.out.println("\n");
    }    
}

/**
 * A test class for the MultiplicationTable class
 */
public class TableTester
{
    public static void main(String[] args)
    {
        MultiplicationTable table = new MultiplicationTable();

        System.out.println("       "
                + "Multiplication table with duplicate values:\n");
        table.printTableWithDupes();

        System.out.println("       "
                + "Multiplication table with no duplicate values:\n");
        table.printTableNoDupes();
    }
}
/*  program output:
       
       Multiplication table with duplicate values:

             1    2    3    4    5    6    7    8    9   10
         --------------------------------------------------
       1|    1    2    3    4    5    6    7    8    9   10
       2|    2    4    6    8   10   12   14   16   18   20
       3|    3    6    9   12   15   18   21   24   27   30
       4|    4    8   12   16   20   24   28   32   36   40
       5|    5   10   15   20   25   30   35   40   45   50
       6|    6   12   18   24   30   36   42   48   54   60
       7|    7   14   21   28   35   42   49   56   63   70
       8|    8   16   24   32   40   48   56   64   72   80
       9|    9   18   27   36   45   54   63   72   81   90
      10|   10   20   30   40   50   60   70   80   90  100

       
       Multiplication table with no duplicate values:

             1    2    3    4    5    6    7    8    9   10
         --------------------------------------------------
       1|    1
       2|    2    4
       3|    3    6    9
       4|    4    8   12   16
       5|    5   10   15   20   25
       6|    6   12   18   24   30   36
       7|    7   14   21   28   35   42   49
       8|    8   16   24   32   40   48   56   64
       9|    9   18   27   36   45   54   63   72   81
      10|   10   20   30   40   50   60   70   80   90  100

*/