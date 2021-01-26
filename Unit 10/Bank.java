//  File: Bank.java

//  Array version of our old friend, the Bank class.  Same methods, but the
//  implementation has been changed from an ArrayList to an array.

//  Note that the test class did not have to be modified at all because the
//  "interface" - the set of public methods - remains the same.  This is an 
//  example of the OOP principle of "information hiding."  And why we never 
//  allow programmers using our classes to access the instance variables 
//  without going through the methods of the class.
//
//  Data file oriented.

import java.io.FileWriter;
import java.util.ArrayList;
import java.io.PrintWriter; // for output file
import java.io.IOException; // for output file

/**
 * This bank contains a collection of bank accounts.
 */
public class Bank {
    private BankAccount[] accounts; // a list of BankAccount objects
    private int count; // number of accounts in the bank
    private static final int MAX_SIZE = 100; // maximum number of accounts

    /**
     * Create a new Bank with no accounts
     */
    public Bank() {
        accounts = new BankAccount[MAX_SIZE];
        count = 0; // no accounts yet
    }

    /**
     * Adds an account to this bank.
     * 
     * @param a the account to add
     */
    public void addAccount(BankAccount a) {
        // store new account at index "count"
        accounts[count] = a;

        // update number of accounts (and index where next one will be stored)
        count++;
    }

    /**
     * Print data for all accounts
     */
    public void printList() throws IOException {
        // create output file in default folder
        FileWriter myFileWriter = new FileWriter("BankAccounts.out");
        PrintWriter toFile = new PrintWriter(myFileWriter);

        // print headings to screen and to file
        System.out.printf("%15s%20s%n", "Account Number", "Account Balance");
        System.out.printf("%15s%20s%n", "==============", "===============");

        toFile.printf("%15s%20s%n", "Account Number", "Account Balance");
        toFile.printf("%15s%20s%n", "==============", "===============");

        // for each account in this bank...
        for (int i = 0; i < count; i++) {
            BankAccount current = accounts[i]; // get next account

            // print account number and balamce to screen and to file
            System.out.printf("%15s     $%14.2f%n", current.getAccountNumber(), current.getBalance());
            toFile.printf("%15s     $%14.2f%n", current.getAccountNumber(), current.getBalance());
        }
        toFile.close(); // always remember to close file!
    }

    /**
     * Gets the sum of the balances of all accounts in this bank.
     * 
     * @return the sum of the balances
     */
    public double getTotalBalance() {
        double total = 0; // accumulator for total balances

        // for each account in this bank...
        for (int i = 0; i < count; i++) {
            BankAccount current = accounts[i]; // get the account
            total = total + current.getBalance(); // add its balance to total
        }
        return total;
    }

    /**
     * Counts the number of bank accounts whose balance is at least a specified
     * minimum
     * 
     * @param atLeast the balance required to count an account
     * @return the number of accounts having least the given balance
     */
    public int count(double atLeast) {
        int matches = 0; // counts for number of qualifying accounts

        // for each account in the bank...
        for (int i = 0; i < count; i++) {
            BankAccount current = accounts[i]; // get the account
            if (current.getBalance() >= atLeast) // if it qualifies...
                matches++; // ...increment the counter
        }
        return matches;
    }

    /**
     * Linear search to find a bank account with a given account number.
     * 
     * @param target the number to find
     * @return the account with the given number, or null if there is no such
     *         account
     */
    public BankAccount find(String target) {
        // for each account in the bank...
        for (int i = 0; i < count; i++) {
            BankAccount next = accounts[i]; // get the account
            String acctNum = next.getAccountNumber(); // get the account number
            if (acctNum.equals(target)) // if it matches the target
                return next; // ...we're done
        }
        return null; // no match in the entire array list
    }

    /**
     * Gets the bank account with the largest balance.
     * 
     * @return the account with the largest balance, or null if the bank has no
     *         accounts
     */
    public BankAccount getMaximum() {
        if (count == 0) // if no accounts, return null
            return null;

        // assume first account has largest balance
        BankAccount largest = accounts[0];

        // for all other accounts...
        for (int i = 1; i < count; i++) {
            BankAccount current = accounts[i]; // get next account
            double currentBalance = current.getBalance(); // get its balance
            // see if current account balance > highest so far
            if (currentBalance > largest.getBalance()) // if so...
                largest = current; // update largest
        }
        return largest;
    }
}