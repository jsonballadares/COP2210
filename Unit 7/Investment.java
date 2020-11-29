// File: InvestmentTester.java

// Shows a while loop, for loop, accumulators, and counters

import javax.swing.JOptionPane;

/**
 * A class to monitor the growth of an investment that accumulates 
 * interest at a fixed annual rate.
 */
class Investment
{
    // instance variables
    private double balance;	// initial investment + accumulted interest
    private double rate;	// annual interest rate, as a per cent
    
    /**
     * Creates an Investment object from a starting balance and interest rate.
     *
     * @param aBalance the starting balance
     * @param aRate the interest rate in percent
     */
    public Investment(double aBalance, double aRate)
    {
        balance = aBalance;
        rate = aRate;
    }

    /**
     * Keeps accumulating interest until a target balance has been reached.
     *
     * @param targetBalance the desired balance
     * @return the number of years required for the balance to meet or 
     * exceed the target balance
     */
    public int waitForBalance(double targetBalance)
    { 
        int years = 0 ;  // the number of years
        //System.out.printf("%n%10s%13s%12s%n","years","interest","balance") ;
        //System.out.printf("%10s%13s%12s%n","=====","========","=======") ;
        while (balance < targetBalance)
        {
            years++;
            double interest = balance * rate / 100;
            balance = balance + interest;
            //System.out.printf("%10d%13.2f%12.2f%n",years,interest,balance) ;
        }
        // Loop postcondition: balance >= targetBalance
        return years ;
    }

    /**
     * Keeps accumulating interest for a given number of years.
     *
     * @param numberOfYears the number of years to wait
     */
    public void waitYears(int numberOfYears)
    {
        for (int year = 1; year <= numberOfYears; year++)
        {
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
    }

    /**
     * Gets the current investment balance.
     *
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
}

public class InvestmentTester
{

    public static void main(String[] args)
    {
        double principal;	// initial amount invested
        double rate;		// annual percentage rate of interest
        double target;          // desired value for investment to reach
        int years;		// number of years

        String input = JOptionPane.showInputDialog(
                "What is the initial amount invested?");

        principal = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("What is the annual interest rate"
                + " (as a per cent)?" + "\n(ex: for 6 1/2%, enter 6.5)");

        rate = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("What is the desired \"target\""
                + " amount for the investment to reach?");

        target = Double.parseDouble(input);
        // "echo print" inputs
        System.out.println("Principal: $" + String.format("%,.2f",principal)
                           + "\nAnnual interest rate: " + rate + "%");

        // first, test the method with the "while"

        // create Investment object using inputs
        Investment invest = new Investment(principal, rate);

        if (principal >= target)  // if initial balance already greater...
        {
            System.out.println("\nThe initial blance of " + String.format
                              ("$%,.2f",principal) 
                              + " already exceeds the target balance of "
                              + String.format("$%,.2f",target));
        }
        else
        {        
            years = invest.waitForBalance(target);

            System.out.println("\nIt took " + years + " years for $"
                               + String.format("%,.2f",principal)
                               + " to reach a target value of $"
                               + String.format("%,.2f",invest.getBalance() ));
        }

        // now test the method with the "for"

        input = JOptionPane.showInputDialog("What is the term of the "
                                            + "investment in years?");
        years = Integer.parseInt(input);

        // create new object with previous inputs (since original balance
        // was changed in the object)

        invest = new Investment(principal, rate);
        invest.waitYears(years);
        double balance = invest.getBalance();
        System.out.printf("%nAfter %d years, our initial investment of $%,.2f"
                          + " would be worth $%,.2f%n",years,principal,balance);
        System.exit(0) ;
    }
}

/*   Sample output:

Principal: $1,000.00
Annual interest rate: 10.0%

It took 8 years for $1,000.00 to reach a target value of $2,143.59

After 25 years, our initial investment of $1,000.00 would be worth $10,834.71

*/