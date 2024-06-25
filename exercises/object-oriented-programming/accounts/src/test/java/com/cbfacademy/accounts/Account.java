package com.cbfacademy.accounts;

public class Account {
 // instance variables 
 private int accountNumber;
 private double balance;


// Constructors
 public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;   
 }

//Getter
public int getAccountNumber() {
    return this.accountNumber;
}

//Getter
public double getBalance(){
    return this.balance;
} 


public double deposit (double amount){
    this.balance += amount;
    return this.balance;
}

public double withdraw(double requested) {
    if (requested <= 0 || this.balance < requested) {
        return 0;
    } else {
        this.balance -= requested;
        return requested;
    }
}

}
