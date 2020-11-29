/*
 * Uses String methods length(), indexOf(), and substring() to solve
 * two unrelated problems.
 *
 * Shows how to call methods that return a value (the 3 String methods)
 * and those that do not (println).  Also, variable declarations and 
 * the assignment statement
 */
public class StringMethodsDemo
{
   public static void main(String[] args)
   {
      /*********************************************************
       *  format a 9-digit String by inserting dashes so that  *
       *  it looks like a Social Security Number: xxx-xx-xxxx  *
       *********************************************************/
      
      String nineDigits = "987654321" ;
      
      // get the first 3 digits
      String first3 = nineDigits.substring(0,3) ;
      
      // get the middle 2 digits
      String middle2 = nineDigits.substring(3,5) ;
      
      // get the last 4 digits
      String last4 =  nineDigits.substring(5,9) ;
      
      // concatenate them with dashes between
      String socialSecNbr = first3 + "-" + middle2 + "-" + last4 ;
      
      /*
      
      Here is the whole thing done in one statement
      
      String socialSecNbr = 
              nineDigits.substring(0,3)            // first 3 digits
              + "-" + nineDigits.substring(3,5)    // 4th and 5th digits
              + "-" + nineDigits.substring(5,9) ;  // 6th thru 9th digits
      
      */
      
      System.out.println( "Original string: " + nineDigits +
                          "\nFormatted as SS#: " + socialSecNbr ) ;
      
      /************************************************************
       *  rearrange a name in the form "First Last" so that       *
       *  it looks like this: "Last, First"                       *
       *  Assume that the name contains a space (sorry, Beyonce)  *
       ************************************************************/
      
      String fullName = "Edsgar Dijkstra" ;
      
      // 1. locate the space in the name
      
      int indexOfSpace = fullName.indexOf(" ") ;
      
      // 2. first name = substring of fullName beginning with the first
      //    character and ending with the character just before the space
      
      String firstName = fullName.substring( 0, indexOfSpace ) ;
      
      // 3. last name = substring of fullName from the first character after 
      //    the space thru the last character  
      
      String lastName = fullName.substring( indexOfSpace + 1, 
                                            fullName.length() ) ;
      
      // 4. concatenate last name with comma, space, and first name
      
      String lastNameFirst = lastName + ", " + firstName ;
            
      System.out.println("\nThe name " + fullName + " can also be written "
                         + "like this: " + lastNameFirst);            
   }
}

/* program output:

Original string: 987654321
Formatted as SS#: 987-65-4321

The name Edsgar Dijkstra can also be written like this: Dijkstra, Edsgar

*/