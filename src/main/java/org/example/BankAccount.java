package org.example;

public class BankAccount {
    public void Deposit(int accountNumber, String accountName, double depositAmount) {
        String accountNumberString = Integer.toString(accountNumber);
        if (accountNumberString.length() != 10) {
            System.out.println("Not a valid account number.");
        }

    }

    public void Withdraw() {

    }

    public void displayInformation() {

    }

    public void getAccountNumber() {

    }
}
