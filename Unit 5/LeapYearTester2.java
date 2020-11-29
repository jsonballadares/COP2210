/*
File:  LeapYearTester2.java

Purpose:  Indicates whether or not a year - entered by the user - is a 
leap year.  A year is a leap year if either one of the following is true:
  1.  the year is divisible by 4 and not by 100
  2.  the year is divisible by 400

Demonstrates all things boolean: a boolean variable, boolean assignment
statements, boolean operators, a boolean method, and how to call one!
*/

import javax.swing.JOptionPane;

/**
 * A class thats tests whether a given year is a leap year
 */
public class LeapYearTester2
{
    private int year ; // 4-digit year being tested

    /**
     * Create a LeapYearTester object.
     * @param inputYear the year being tested
     * Precondition: inputYear >= 1583
     */
    public LeapYearTester2(int inputYear)
    {
        year = inputYear ;
    }

    /**
     * Is a year a leap year?
     * @return true if year is a leap year, false if not
     */
    public boolean isLeapYear()
    {
        boolean isLeap = false ;    // assume year is not a leap year
        
        if ( year % 4 == 0          // divisible by 4 and ...
                && 
            !(year % 100 == 0) )    // not by 100
        {                                         
            isLeap = true ;                       // leap year!
        } 
        else if  (year % 400 == 0)                // divisible by 400
        {
            isLeap = true ;                       // leap year!
        }
        
        return isLeap ;
    }

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a 4-digit year");

        int inputYear = Integer.parseInt(input);

        LeapYearTester testYear = new LeapYearTester(inputYear);

        // Is it a leap year?

        if (testYear.isLeapYear()) // calls boolean method
        {
            System.out.println(inputYear + " is a leap year.") ;
        } 
        else
        {
            System.out.println(inputYear + " is not a leap year.") ;
        }
        System.exit(0) ;
    }
}

/* sample output:

2010 is not a leap year.

2020 is a leap year.

2100 is not a leap year.

2000 is a leap year.

*/

 
/*
BTW, here is the shortest possible version of method isLeapYear:

public boolean isLeapYear()
{
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
}

;-)

 */