package org.example;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double depositAmount;

    public BankAccount() {

    }

    public BankAccount(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public BankAccount(int accountNumber, String accountName, double depositAmount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.depositAmount = depositAmount;
    }

    public void Deposit() {
        String accountNumberString = String.valueOf(this.accountNumber);
        if (accountNumberString.length() != 10) {
            System.out.println("Not a valid account number.");
        } else {

        }

    }

    public void Withdraw(int accountNumber) {

    }

    public void displayInformation() {
        System.out.print("Account Name: " + this.accountName);
        System.out.print("Account Number: " + this.accountNumber);
        System.out.print("Current Balance: " + this.depositAmount);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
