/* File: BankAccount2.java
 
   Version 2 of the BankAccount class has "overloaded" constructors, allowing
   the user to specify the account number and balance, or to specify just the
   account number.  This is the only difference from the previous version.
*/

/**
   A bank account has an account number and a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount2
{  
   private String accountNumber ;	// ID number of an account
   private double balance ;			// amount on deposit in an account
   
   /**
      Create a Bank Account object with a specified account number and 
      initial balance.
      @param acctNum the account number
      @param initialBalance the initial balance
   */
   public BankAccount2(String acctNum, double initialBalance)
   {   
      accountNumber = acctNum  ;
      balance = initialBalance ;
   }

   /**
      Create a Bank Account object with a specified account number and
      "default" initial balance of 0.0
      @param acctNum the account number
      @param initialBalance the initial balance
   */
   public BankAccount2(String acctNum)
   {   
      accountNumber = acctNum  ;
      balance = 0.0;
   }
 
 /**
      Gets the account number of this bank account.
      @return the account number
   */
   public String getAccountNumber()
   {   
      return accountNumber;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}