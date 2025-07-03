package org.example;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double depositAmount;

    public BankAccount() {

    }

    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public BankAccount(String accountNumber, String accountName, double depositAmount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.depositAmount = depositAmount;
    }

    public void Deposit() {
        if (accountNumber.length() != 10) {
            System.out.println("Not a valid account number.");
        } else {
        }

    }

    public void Withdraw() {

    }

    public void displayInformation() {
        System.out.print("Account Name: " + this.accountName);
        System.out.print("Account Number: " + this.accountNumber);
        System.out.print("Current Balance: " + this.depositAmount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
