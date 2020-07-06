package com.company;

public class Main {

    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(100);
        System.out.println("Adding $400 in account....");
        checkingAccount.deposit(400.00);

        try {
            System.out.println("\nWithdrawing $100 from account.");
            checkingAccount.withdraw(100.00);
            System.out.println("\nWithdrawing $600 from account.");
            checkingAccount.withdraw(600.00);
        } catch (FundException e) {
            System.out.println("\nSorry, your account does not have enough money $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
