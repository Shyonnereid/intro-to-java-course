package com.cbfacademy.accounts;

public class Account {
    private int accountNumber;
    private double balance;

    // Constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Getter for balance 
    public Double getBalance() {
        return this.balance;
    }

    // Getter for Account Number 
    public int getaccountNumber(){
        return this.accountNumber;
    }

    // Setter for balance 
    public Double setBalance(double balance){
        return this.balance;
    }

    // Return the deposit
    public double deposit(double amount){
        if (amount> 0) {
            balance += amount;
        }
        return balance;
    }

   // Method to withdraw money and return requested amount or 0
   public double withdraw(double requested) {
    if (requested > 0 && requested <= balance) {
        balance -= requested; // equivalent to balance = balance - requested
        return requested;
    }
    return 0;
}

}
 
