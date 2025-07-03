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
        System.out.print("Current Balance: " + this.availableBalance);
        this.newBalance = availableBalance - depositAmount;
        System.out.println("New Current Balance: " + this.newBalance);

    }

    public void displayInformation() {
        System.out.print("Account Name: " + this.accountName);
        System.out.print("Account Number: " + this.accountNumber);
        System.out.print("Current Balance: " + this.availableBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
