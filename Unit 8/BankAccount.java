/**
* A class to represent a bank account with an account number and a balance
* that can be changed by deposits and withdrawals.
*/
public class BankAccount
{
   // instance variable
   private String accountNum ;      // the account number
   private double balance ;         // the amount on deposit

   /**
   * Constructs a bank account with an account number and initial balance
   * @param acctNum the account number
   * @param initialBalance the initial balance
   */
   public BankAccount(String acctNum, double initialBalance)
   {
      accountNum = acctNum ;
      balance = initialBalance;
   }

   /**
   *  Deposits money into the bank account.
   *  @param amount the amount to deposit
   */
   public void deposit(double amount)
   {
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
   *  Withdraws money from the bank account.
   *  @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {
      double newBalance = balance - amount ;
      balance = newBalance ;
   }

   /**
   *  Gets the account number
   *  @return the account number
   */
   public String getAccountNumber()
   {
      return accountNum ;
   }

   /**
   *  Gets the current balance
   *  @return the balance
   */
   public double getBalance()
   {
      return balance ;
   }
}
//******************** end of BankAccount class definition ********************