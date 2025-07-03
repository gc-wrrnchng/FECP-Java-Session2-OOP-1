package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> bankAccount = new ArrayList<>();

        int getChoice = 0;

        do {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            getChoice = scanner.nextInt();
            scanner.nextLine();

            switch(getChoice) {
                case 1: {
                    System.out.print("Account Number (2025XXXXXX): ");
                    int getAccountNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Account name: ");
                    String getAccountName = scanner.nextLine();
                    System.out.print("Amount to Deposit: ");
                    double getDepositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    bankAccount.add(new BankAccount(getAccountNumber, getAccountName, getDepositAmount));
                    break;
                }
                case 2: {
                    for(BankAccount myBankAccount : bankAccount) {
                        myBankAccount.displayInfo();
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter Account number to check: ");
                    int getAccountNumber = scanner.nextInt();
                    scanner.nextLine();
                    for(BankAccount myBankAccount : bankAccount) {
                        if(myBankAccount.getAccountNumber() == getAccountNumber) {
                            myBankAccount.displayInfo();
                            break;
                        } else {
                            System.out.println("No account number in record.");
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter account number to check: ");
                    int getAccountNumber = scanner.nextInt();
                    scanner.nextLine();
                    for(BankAccount myBankAccount : bankAccount) {
                        if(myBankAccount.getAccountNumber() == getAccountNumber) {
                            System.out.println("Current Balance: " + myBankAccount.getAvailableBalance());
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            scanner.nextLine();
                            myBankAccount.Deposit(depositAmount);
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.print("Enter account number to withdraw from: ");
                    int getAccountNumber = scanner.nextInt();
                    scanner.nextLine();
                    for(BankAccount myBankAccount : bankAccount) {
                        if(myBankAccount.getAccountNumber() == getAccountNumber) {
                            System.out.println("Current Balance: " + myBankAccount.getAvailableBalance());
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            scanner.nextLine();
                            myBankAccount.Withdraw(withdrawAmount);
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("=== Thank you! ===");
                    break;
                }
                default: {
                    break;
                }
            }
        } while (getChoice != 6);

    }
}