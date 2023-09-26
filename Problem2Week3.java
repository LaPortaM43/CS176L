package edu.monmouth;

public class Problem2Week3 {
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
        System.out.println("Default Constructor");
        System.out.println("Account Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());
        
        BankAccount account2 = new BankAccount(5000);
        
        System.out.println("\nOne Argument Constructor:");
        System.out.println("Account Name: " + account2.getName());
        System.out.println("Balance: " + account2.getBalance());
        
        BankAccount account3 = new BankAccount("John Doe", 500.0);
        
        System.out.println("\nTwo Argument Constructor:");
        System.out.println("Account Name: " + account3.getName());
        System.out.println("Balance: " + account3.getBalance());
        
        account3.deposit(500);
        
        System.out.println("\nAfter Deposit:");
        System.out.println("Balance: " + account3.getBalance());
        
        account3.withdraw(300);
        
        System.out.println("\nAfter Withdraw:");
        System.out.println("Balance: " + account3.getBalance());
        
      
	}
}

class BankAccount { 
	private String account_name;
    private double balance;

    // No argument constructor with default values
    public BankAccount() {
        this.account_name = "Unknown";
        this.balance = 0;
    }

    // One argument constructor with balance parameter
    public BankAccount(double balance) {
        this.account_name = "Unknown";
        this.balance = balance;
    }

    // Two argument constructor with account name and balance parameters
    public BankAccount(String account_name, double balance) {
        this.account_name = account_name;
        this.balance = balance;
    }
    public String getName() {
    	return account_name;
    }
    
    public void setName(String account_name) { 
    	this.account_name = account_name;
    }
    
    // Method to deposit money into the account
    public void deposit(double amount) {
    	balance = balance + amount;
       
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
    	balance = balance - amount;  
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

}