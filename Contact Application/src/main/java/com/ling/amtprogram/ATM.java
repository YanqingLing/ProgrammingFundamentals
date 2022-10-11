package com.ling.amtprogram;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int withdraw;
        int deposit;
        int balance = 100000;
        int decision;
        do {
            //menu
            System.out.println("Welcome to the ATM!\nPress 1 for withdraw;\nPress 2 for deposit;\nPress 3 for check your balance.\nPress 0 for exiting out;\nPlease enter your selection now:");
            Scanner userInput = new Scanner(System.in);
            int userSelection = userInput.nextInt();

            //customers' selection -- withdraw
            if (userSelection == 1) {
                System.out.println("Please enter the amount to be withdrawn: ");
                withdraw = userInput.nextInt();

                if (balance >= withdraw) {

                    System.out.println("Withdraw successfully!Please collect your money");
                    balance = balance - withdraw;

                } else {
                    System.out.println("Insufficient Balance");
                }

                //customers' selection -- deposit
            } else if (userSelection == 2) {
                System.out.println("Please enter the amount to be deposited: ");
                deposit = userInput.nextInt();
                System.out.println("Deposit successfully!");
                balance = balance + deposit;

            // customers' selection -- print balance;
            } else if (userSelection == 3) {
                System.out.println("Your total balance is " + balance);

            } else {
                System.exit(0);
            }
            System.out.println("Do you want to continue? Press 1 to continue or press 0 to exit");
            decision = userInput.nextInt();

        } while ( decision != 0);

        System.out.println("Thank you! Have a good day!");
    }
}
