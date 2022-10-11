package com.ling.amtprogram;

import java.util.Scanner;

public class ATMSwitchStatement {
    public int withdrawMoney(int balance, int withdrawAmount) {
        System.out.println("Please enter the amount to be withdrawn: ");
        if (balance >= withdrawAmount) {
            System.out.println("Withdraw successfully!Please collect your money");
            balance = balance - withdrawAmount;

        } else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }

    public int depositMoney(int balance, int depositAmount) {
        System.out.println("Please enter the amount to be deposited: ");
        System.out.println("Deposit successfully!");
        balance = balance + depositAmount;
        return balance;
    }

    public void printBalance(int balance) {
        System.out.println("Your total balance is " + balance);
    }

    public static void main(String[] args) {
        int withdrawAmount = 0;
        int depositAmount = 0;
        int balance = 100000;
        int decision;
        ATMSwitchStatement atm = new ATMSwitchStatement();

        do {
            //menu
            System.out.println("Welcome to the ATM!\nPress 1 for withdraw;\nPress 2 for deposit;\nPress 3 for check your balance.\nPress 0 for exiting out;\nPlease enter your selection now:");
            Scanner userInput = new Scanner(System.in);
            int userSelection = userInput.nextInt();

            //customers' selection -- withdraw
            switch (userSelection) {
                case 1:
                    System.out.println("Please enter the amount to be withdrawn: ");
                    withdrawAmount = userInput.nextInt();
                    balance = atm.withdrawMoney(balance,withdrawAmount);

                    break;

                //customers' selection -- deposit
                case 2:
                    System.out.println("Please enter the amount to be deposited: ");
                    depositAmount = userInput.nextInt();
                    atm.depositMoney(balance, depositAmount);
                    balance = atm.depositMoney(balance,depositAmount);

                    break;

                // customers' selection -- print balance;
                case 3:
                    atm.printBalance(balance);
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");

            }
            System.out.println("Do you want to continue? Press 1 to continue or press 0 to exit");
            decision = userInput.nextInt();

        } while(decision != 0);
        System.out.println("Thank you! Have a good day!");
    }
}
