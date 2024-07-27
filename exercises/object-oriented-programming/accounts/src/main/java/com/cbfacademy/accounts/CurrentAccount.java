package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double overdraftLimit(double overdraftLimit){
        return this.overdraftLimit;
    }
    
    public void setoverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }
}
