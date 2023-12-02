package com.cbfacademy.accounts;

public class Account {
    
    private int accountNumber;

    protected double balance;
    public Account(){

    }

    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
         this.balance = balance; 

    }
//returns the current account balance
    public double getBalance(){

        return this.balance;
    }
// returns the account number
    public int getAccountNumber(){

        return this.accountNumber;
    }
//deposits funds to the account and returns the new balance
    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double requested){
    
//withdraws funds from the account and returns the requested amount or 0 if the account has an insufficient balance
        if (balance >= requested && requested > 0){

           balance -= requested  ;
            return requested;
        }else {
            
        return 0;
        }
         
    }
 
//Notes
//This account doesn't have an overdraft facility.
//The balance of an account may only be modified through the deposit() and withdraw() methods.
//Consider the necessary instance variables and the appropriate access modifiers to allow any sub-classes to access those values

}
