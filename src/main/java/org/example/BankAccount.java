package org.example;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double availableBalance;
    private double depositAmount;
    private double newBalance;

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

    public void Deposit() {


    }

    public void Withdraw() {
        System.out.print("Current Balance: " + this.availableBalance);
        this.newBalance = availableBalance - depositAmount;
        System.out.println("New Current Balance: " + this.newBalance);

    }

    public void displayInfo() {
        System.out.println("\nAccount Name: " + this.accountName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: " + this.availableBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
