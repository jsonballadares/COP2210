// File: PassWordTester.java

// The Password class creates a password and uses a "do-while" loop to
// allow 3 attempts to match it.  
//
// Shows a loop postcondition, i.e. what must be true when a loop terminates.
//
// If a loop may end for more than one reason, you must test which one occurred! 

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * A class that creates a password and allows 3 attempts to match it
 */
class Password
{
   private String password;			// the stored password

   /**
    * Creates a Password object
    * @param thePassword the stored password
    */
   public Password(String thePassword)
   {
      password = thePassword;
   }

   /**
    * Gives the user 3 tries to match the password
    * @return true if the user enters the right password; otherwise false
    */
   public boolean checkPassword()
   {
      String input;              // user's attempt to match password
      boolean correctPassword;    // did user enter correct password?
      int tries = 0;            // counts number of attempts

      do
      {
         input = JOptionPane.showInputDialog("Enter Password");
         correctPassword = input.equals(password);
         if (!correctPassword)
         {
            tries++;
            JOptionPane.showMessageDialog(null, "Incorrect password!");
         }
      }
      while (!correctPassword && tries < 3);

      // Loop postcondition: either password is correct or maximum number
      // of tries have been made.  Must test which!

      if (correctPassword)		// user entered correct password
      {
         return true;
      }
      else  				  // user made 3 attempts
      {
         JOptionPane.showMessageDialog(null,
               "Sorry, maximum number of attempts exceeded!");
         return false;
      }
   }
}

// A test class for the Password class
public class PasswordTester
{
   public static void main(String[] args)
   {
      // create password

      String input = JOptionPane.showInputDialog("Create the password " +
                                            "for this account");
      Password myPassword = new Password(input);

      // try to match it

      if (myPassword.checkPassword())
      {
         System.out.println("Welcome!");
      }
      else
      {
         System.out.println("Try again later.");
      }
      System.exit(0) ;
   }
}