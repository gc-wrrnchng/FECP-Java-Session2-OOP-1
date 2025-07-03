package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> bankAccount = new ArrayList<>();
        BankAccount bankDeposit = new BankAccount();

        int getChoice = 0;

        do {
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            getChoice = scanner.nextInt();
            scanner.nextLine();

            switch(getChoice) {
                case 1: {
                    System.out.print("Account Number (10-digits): ");
                    String getAccountNumber = scanner.nextLine();
                    System.out.print("Account name: ");
                    String getAccountName = scanner.nextLine();
                    System.out.print("Amount to Deposit: ");
                    double getDepositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    bankAccount.add(new BankAccount(getAccountNumber, getAccountName, getDepositAmount));
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    System.out.print("Enter account number to check: ");
                    String getAccountNumber = scanner.nextLine();
                    break;
                }
            }
        } while (getChoice != 6);

    }
}