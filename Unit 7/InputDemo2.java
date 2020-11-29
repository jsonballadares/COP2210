//  File: InputDemo2.java

//  Revisits our old friend, the Purchase class, which is unchanged.
//  Purchase objects have the number of items purchased, a one-word
//  description of the item, and the price of the item.
//
//  The test class, InputDemo2, has been modified so that the user may
//  enter all three inputs at once, returned as a string by
//  showInputDialog.  A Scanner object associated with that string
//  is then created, and Scanner methods nextInt(), next(), and nextDouble()
//  are called to extract the individual "tokens" from the string

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * A class to represent a purchase - number of items, description, and 
 * price per item
 */
class Purchase
{
   // instance vars

   private int quantity ;         // number of each item purchased
   private String item ;          // description of the item
   private double unitPrice ;     // price per item
   private double cost ;          // total cost:  quantity * unitPrice
   public static final double TAX_RATE = 0.065;   // 6.5% (a constant)

   /**
    * Creates a purchase object
    *
    * @param quantity number of items bought
    * @param item one-word description of item
    * @param unitPrice price per item
    */
   public Purchase(int quantity, String item, double unitPrice)
   {
      this.quantity = quantity;
      this.item = item;
      this.unitPrice = unitPrice;
      // compute cost of purchase
      cost = quantity * unitPrice;
   }

   /**
    * Return the cost of a purchase.
    *
    * @return the cost of a purchase
    */
   public double getCost()
   {
      return cost;
   }

   /**
    * Returns a String containing the input data for a purchase
    *
    * @return the quantity, description, and price per item as a String Example:
    * "5 widgets @ $1.23
    */
   public String getData()
   {
      return quantity + " " + item + " @ $" + unitPrice;
      // example:	"5 widgets @ $1.23
   }

   /**
    * Compute and return the tax on a purchase.
    *
    * @return the tax on a purchase
    */
   public double getTax()
   {
      double tax = cost * TAX_RATE;		// tax on purchase
      return tax;
   }

   /**
    * Compute and return total cost of a purchase, including tax
    *
    * @return the total cost of a purchase, tax included
    */
   public double getTotal()
   {
      // call getTax() to compute the tax, and add to cost
      return getTax() + cost;
   }
} // end of Purchase class definition ========================================

/**
 * Test class for Purchase class
 */
public class InputDemo2
{
   public static void main(String[] args)
   {
      String input = JOptionPane.showInputDialog("Enter number of items "
              + "purchased, one-word description, and unit price "
              + "\n(Separated by spaces)");

      // create Scanner object associated with the string read
      Scanner in = new Scanner(input);

      // extract the 3 tokens
      int quantity = in.nextInt();
      String item = in.next();
      double price = in.nextDouble();

      // create a Purchase object, using input data
      Purchase current = new Purchase(quantity, item, price);

      // print purchase, tax, and total cost
      System.out.println("\nYour purchase:\n");
      System.out.println(current.getData() + 
                         String.format(" = $%.2f", current.getCost())) ;
      System.out.printf("\n\t%1.2f%1s tax = $%1.2f",
                         Purchase.TAX_RATE * 100, "%", current.getTax()) ;
      System.out.printf("\n\n\tTotal cost = $%1.2f", current.getTotal()) ;
      System.out.println() ;
   }
}

/*  sample output:

 Your purchase:

 8 hockeypuck @ $4.37 = $34.96
 Tax = $2.2724
 Total cost = $37.2324


 */