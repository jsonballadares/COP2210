// File:  MethodCalls.java

// Shows how to call methods that return a value - e.g. String class method 
// length() - and those that do not (e.g. println)
//
// The length() method is called two ways - first in an assignment statement 
// and again in an output statement
//
// Also shows variable declarations with and without initial values, the 
// assignment statement, and concatenation

public class MethodCalls
{
   public static void main(String[] args)
   {
      int numberOfChars;   // declares an int variable with no initial value

      String greeting = "Hello";  // creates a String object

      // call length() method in an assignment statement.  The  value returned
      // is stored in the variable to the left
      
      numberOfChars = greeting.length();

      System.out.println("The string \"" + greeting + "\" has "
              + numberOfChars + " characters.") ;

      greeting = greeting + ", World!" ;  // concatenation

      // call length() method in an output statement.  The value returned
      // becomes part of the output string via concatenation
      
      System.out.println("The string \"" + greeting + "\" has "
                         + greeting.length() + " characters.") ;
   }
}


/*  program output:
 
The string "Hello" has 5 characters.
The string "Hello, World!" has 13 characters.

*/