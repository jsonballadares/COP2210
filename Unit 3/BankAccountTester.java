/**
 *  A class to test the BankAccount class.
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        // local vars
        String acctNum;  // the account number
        double balance;  // amount on deposit
        double amount;   // amount to be deposited/withdrawn

        // create account #1234567 with balance of $10000
        BankAccount one = new BankAccount("1234567", 10000);

        // create account #8765432 with balance of $20000
        BankAccount two = new BankAccount("8765432", 20000);

        // print data for first account

        acctNum = one.getAccount();
        balance = one.getBalance();

        System.out.println("Account #" + acctNum + " has initial balance of $"
                           + balance + "\n");

        // print data for other account

        System.out.println("Account #" + two.getAccount()
                + " has initial balance of $" + two.getBalance() + "\n");

        // make a deposit and a withdrawal and print new balance after each

        one.deposit(500.75);
        balance = one.getBalance();
        System.out.println("After depositing $500.75, account #"
                           + one.getAccount() + " has new balance of $"
                           + balance + "\n");
        amount = 987.64;
        two.withdraw(amount);
        System.out.println("After withdrawing " + amount + ", account #"
                           + two.getAccount() + " has a new balance of $"
                           + two.getBalance() + "\n") ;

        // compute sum of balances of both accounts

        double totalBalances;           // declaring new local var
        totalBalances = one.getBalance() + two.getBalance();

        System.out.println("Total amount on deposit: $" + totalBalances + "\n");
    }
}

/* program output
 
Account #1234567 has initial balance of $10000.0

Account #8765432 has initial balance of $20000.0

After depositing $500.75, account #1234567 has new balance of $10500.75

After withdrawing 987.64, account #8765432 has a new balance of $19012.36

Total amount on deposit: $29513.11

Press any key to continue...

*/