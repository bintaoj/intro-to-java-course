package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

    public SavingsAccount(){
        super();
    }
    
    int accountNumber;
    double balance;
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;

    }
    public double calculateInterest(){

        return balance * interestRate;
    }

// public void applyInterest() applies interest to the account
    public void applyInterest(){
        double interest = calculateInterest();
        deposit(interest);
    }    

// public double getInterestRate() - returns the current interest rate
    public double getInterestRate(){

        return this.interestRate;
    }
    
// public void setInterestRate() - sets the interest rate
    public void setInterestRate(double newInterestRate){
        if (newInterestRate >= 0) {
            this.interestRate = newInterestRate;
        } else {
            System.out.println(" Cannot set a negative interest rate.");
        }
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
 

//     SavingsAccount with the following members, in addition to the attributes of the Account class:

// public SavingsAccount(int accountNumber, double balance, double interestRate) - constructor that accepts parameters representing the new account number, starting balance and interest rate



}
