package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    
public CurrentAccount(){
    super();
}

int accountNumber;
double balance;
double overdraftLimit;


public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
    this.accountNumber =accountNumber;
    this.balance = balance;
    this.overdraftLimit = overdraftLimit;
}



public double getOverdraftLimit(){

    return this.overdraftLimit;
}

public void setOverdraftLimit(double overdraftLimit){

    this.overdraftLimit = overdraftLimit;

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
        double availableBalance = balance + overdraftLimit;

        if (requested > 0 && requested <= availableBalance) {
            balance -= requested;
            return requested;  // Return the withdrawn amount
        } else {
            return 0;
        }
         
    }
 




    }


    

    


// public CurrentAccount(int accountNumber, double balance, double overdraftLimit) - constructor that accepts parameters representing the new account number, starting balance and overdraft limit
// public double getOverdraftLimit() - returns the current overdraft limit
// public void setOverdraftLimit() - sets the overdraft limit


