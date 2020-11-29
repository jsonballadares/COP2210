
// File: SwitchDemo.java

// Author: Greg

// Purpose: Shows two examples of the "switch" statement - one without the 
//          default "fall through" behavior (i.e. with "break" statements)
//          and one with

import javax.swing.JOptionPane;

/**
 * A class to print the lyrics to "The Twelve Days of Christmas" for
 * one of the days
 */
public class SwitchDemo
{
    // this class has no instance variables so has only a 
    // "default" constructor, synthesized by Java

    /**
     * Returns the ordinal of a number (i.e., 1st, 2nd, 3rd, 4th, etc)
     *
     * @param number the number to get the ordinal of
     * @return the ordinal of number
     */
    public String getOrdinal(int number)
    {
        String ordinal;    // the ordinal of number (e.g., 37th)

        // First, check for special cases - numbers where the last 2 digits are 
        // 11, 12, or 13.  Those are the only numbers ending in 1, 2, or 3 
        // where the suffix is "th"  E.g. 11th, 611th, 1011th, vs 1st, 81st,
        // 971st, etc.  Same for 12 and 13.
        // Note: no default branch so no action taken otherwise

        switch (number % 100)   // check last 2 digits
        {
            case 11:
            case 12:
            case 13: return number + "th" ; // 11th, 12th, 13th
        }

        // Here if number does not end with 11, 12, or 13

        switch (number % 10)    // Check last digit
        {
            case 1: ordinal = number + "st" ; break ;   // e.g. 1st
            case 2: ordinal = number + "nd" ; break ;   // e.g. 32nd
            case 3: ordinal = number + "rd" ; break ;   // e.g. 23rd
            // default is numbers ending in 0, or 4 thru 9
            default: ordinal = number + "th" ;  
        }
        return ordinal ;
    }

    /**
     * Returns a multi-line string containing the gifts for a given day 
     * NOTE: shows the default "fall through" behavior of the switch
     * @param day the day for which to get the gifts
     * @return the gifts for the day
     */
    public String getGifts(int day)
    {
        String gift = "" ;

        switch (day)
        {
            case 12: gift = gift + "Twelve Drummers Drumming!\n" ;
            case 11: gift = gift + "Eleven Pipers Piping!\n" ;
            case 10: gift = gift + "Ten Lords A-Leaping!\n" ;
            case 9:  gift = gift + "Nine Ladies Dancing!\n" ;
            case 8:  gift = gift + "Eight Maids A-Milking!\n" ;
            case 7:  gift = gift + "Seven Swans A-Swimming!\n" ;
            case 6:  gift = gift + "Six Geese A-Laying!\n" ;
            case 5:  gift = gift + "Five Golden Rings!\n" ;
            case 4:  gift = gift + "Four Calling Birds!\n" ;
            case 3:  gift = gift + "Three French Hens!\n" ;
            case 2:  gift = gift + "Two Turtle Doves!\nAnd " ;
            case 1:  gift = gift + "A Partridge in a Pear Tree!\n" ;
        }
        return gift ;
    }

    public static void main(String[] args)
    {
        SwitchDemo twelveDays = new SwitchDemo();

        // get the day 
        String dayString = JOptionPane.showInputDialog("What day of Christmas?"
                                                       + "\n(1..12)") ;
        // convert to int and "echo print"
        int day = Integer.parseInt(dayString) ;
        System.out.println("You entered: " + day +"\n") ;

        // get the ordinal of the day
        String ordinal = twelveDays.getOrdinal(day) ;
            
        System.out.println("On the " + ordinal + " day of Christmas"
                            + " my True Love gave to me") ;
            
        // get the gifts for the day
        String gift = twelveDays.getGifts(day) ;
        
        System.out.println(gift) ;
    }
}

/*  output from 3 runs

You entered: 1

On the 1st day of Christmas my True Love gave to me
A Partridge in a Pear Tree!


You entered: 5

On the 5th day of Christmas my True Love gave to me
Five Golden Rings!
Four Calling Birds!
Three French Hens!
Two Turtle Doves!
And A Partridge in a Pear Tree!


You entered: 12

On the 12th day of Christmas my True Love gave to me
Twelve Drummers Drumming!
Eleven Pipers Piping!
Ten Lords A-Leaping!
Nine Ladies Dancing!
Eight Maids A-Milking!
Seven Swans A-Swimming!
Six Geese A-Laying!
Five Golden Rings!
Four Calling Birds!
Three French Hens!
Two Turtle Doves!
And A Partridge in a Pear Tree!

 */