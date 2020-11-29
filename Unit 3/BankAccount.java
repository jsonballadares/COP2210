// File: BankAccount.java

// The BankAccount class provides examples of everything we need to know to
// get started creating our own classes, including:
// 
//   1. instance variables
//   2. a constructor 
//   3. accessor and mutator methods
//   4. parameter variables and local variables 
//
//*****************************************************************************

/**
 * A class to represent a bank account with an account number and a balance
 * that can be changed by deposits and withdrawals.
 */
public class BankAccount
{
    // instance variables
    private String accountNum;      // the account number
    private double balance;         // the amount on deposit

    /**
     * Constructs a bank account with an account number and initial balance
     * @param acctNum the account number
     * @param initialBalance the initial balance
     */
    public BankAccount(String acctNum, double initialBalance)
    {
        accountNum = acctNum;
        balance = initialBalance;
    }

    /**
     *  Deposits money into the bank account.
     *  @param amount the amount to deposit
     */
    public void deposit(double amount)          // note "mutator" method
    {
        double newBalance = balance + amount;
        balance = newBalance;                   // modifies instance var
    }

    /**
     *  Withdraws money from the bank account.
     *  @param amount the amount to withdraw
     */
    public void withdraw(double amount)         // another "mutator" method
    {
        double newBalance = balance - amount;
        balance = newBalance;			// modifies instance var
    }

    /**
     *  Gets the account number
     *  @return the account number
     */
    public String getAccount()          // note "accessor" method
    {
        return accountNum;		// returns value of instance var
    }

    /**
     *  Gets the current balance
     *  @return the balance
     */
    public double getBalance()          // another "accessor" method
    {
        return balance;			// returns value of instance var
    }
}
//******************** end of BankAccount class definition ********************