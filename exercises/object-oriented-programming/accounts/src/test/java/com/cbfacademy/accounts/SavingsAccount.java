package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    // instance variable
    private double interestRate;

    // constructor 
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        deposit(getBalance() * interestRate);
    }

    // Correct Getter for interest rate
    public double getInterestRate() {
        return this.interestRate;
    }

    // Setter for interest rate
    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        }
    } 
}





