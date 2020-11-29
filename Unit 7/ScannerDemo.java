// File:  ScannerDemo.java

// Uses showInputDialog() to read successive lines of text from the keyboard 
// until end-of-file.  
// A Scanner object associated with the input line is then created, and methods 
// hasNext() and next() are used to extract the individual "tokens" from the 
// line.   Also shows nested while loops

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ScannerDemo {

    public static void main(String args[]) {
        
           
        String line = JOptionPane.showInputDialog("Enter a sentence\n"
                                              + "(or press cancel to quit)");
         
        while ( line != null ) // while more input lines...
        {
            // create Scanner object asociated with line
            Scanner lineScan = new Scanner(line);

            System.out.println("The line read was: " + line);
            System.out.println("\nHere are the tokens of the line:\n");

            while (lineScan.hasNext()) // while line has more tokens...
            {
                String token = lineScan.next();     // ...get next token
                System.out.println(token);          // ...and print it
            }

            // print the tokenized line
            System.out.println("\nThe line just tokenized was:\n" + line + "\n");
     
            line = JOptionPane.showInputDialog("Enter next sentence\n"
                                               + "(or press cancel to quit)");
         }
         System.exit(0) ;
    }
}

/*  sample output

The line read was: I had one grunch, but the eggplant over there!

Here are the tokens of the line:

I
had
one
grunch,
but
the
eggplant
over
there!

The line just tokenized was:
I had one grunch, but the eggplant over there!

The line read was: It's crackers to slip a rozzer the dropsy in snide!

Here are the tokens of the line:

It's
crackers
to
slip
a
rozzer
the
dropsy
in
snide!

The line just tokenized was:
It's crackers to slip a rozzer the dropsy in snide!

 */