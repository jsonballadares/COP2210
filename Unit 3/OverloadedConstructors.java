// File: OverloadedConstructors.java

// Uses BankAccount2 class to show how to call overloaded constructors

public class OverloadedConstructors
{
	public static void main(String[] args)
	{
		// create BankAccount2 obj with given account number and initial balance
		BankAccount2 myAccount = new BankAccount2("1234567", 10000.0) ;
		
		// create BankAccount2 obj with given account number and default initial
		// balance of zero
		BankAccount2 myOtherAccount = new BankAccount2("2345678") ;
		
		// print data for both objects
		
		System.out.println("Account# " + myAccount.getAccountNumber() + 
			                " has initial balance of $" + myAccount.getBalance()
			                + "\n") ;
		
		System.out.println("Account# " + myOtherAccount.getAccountNumber() + 
			                " has initial balance of $" + 
			                myOtherAccount.getBalance()) ;
	}
}

/*  program output
 
Account# 1234567 has initial balance of $10000.0

Account# 2345678 has initial balance of $0.0

*/