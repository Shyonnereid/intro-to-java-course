package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    private double interestRate;

    // Constructor 
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Applies interest to the account 
    public void applyInterest() {
        setBalance(getBalance() + getBalance() * interestRate / 100);
    }

    // Returns the current interest rate
    public double getInterestRate() {
        return this.interestRate;
    }

    // Sets the interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
