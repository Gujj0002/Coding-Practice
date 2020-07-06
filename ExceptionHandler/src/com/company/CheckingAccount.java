package com.company;

public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }
    public void deposit(double amount){
        balance  = balance + amount;
    }
    public void withdraw(double amount) throws FundException{

        if(amount <= balance) {
            balance -= amount;
        }else {
            double need = amount - balance;
            throw new FundException(need);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}
