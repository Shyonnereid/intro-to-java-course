package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    // instance variable
    protected double overdraftLimit;

    // constructor 
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getoverdraftLimit() {
        return this.overdraftLimit;
    }
    
    public void setOverdraftLimit(double newoverdraftLimit) {
        if (newoverdraftLimit >=0) {
            this.overdraftLimit = newoverdraftLimit;
        }

        }

    }