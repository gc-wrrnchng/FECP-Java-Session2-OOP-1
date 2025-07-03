package org.example;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double availableBalance;

    public BankAccount() {

    }

    public BankAccount(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public BankAccount(int accountNumber, String accountName, double depositAmount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.availableBalance = depositAmount;
    }

    public void Deposit(double depositAmount) {
        if(depositAmount > 0) {
            this.availableBalance += depositAmount;
        } else {
            System.out.println("Not a valid amount.");
        }
    }

    public void Withdraw(double withdrawAmount) {
        if(withdrawAmount >= this.availableBalance || withdrawAmount > 0) {
            this.availableBalance -= withdrawAmount;
        } else {
            System.out.println("Not a valid amount.");
        }
    }

    public void displayInfo() {
        System.out.println("\nAccount Name: " + this.accountName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: " + this.availableBalance);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getAvailableBalance() {
        return this.availableBalance;
    }
}
