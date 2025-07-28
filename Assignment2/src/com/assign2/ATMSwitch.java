package com.assign2;

import java.util.Scanner;

public class ATMSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.0; // initial balance
        int choice;

        do {
            // Display menu
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 4);

        sc.close();
    }
}
