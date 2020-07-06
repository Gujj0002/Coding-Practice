package com.company;

public class FundException extends Exception {

    private double amount;

    public FundException(double amount) {
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
