package com.ling;

import java.util.Scanner;

public class SimpleCarLoanPaymentCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input car loan amount: ");
        int carLoan = userInput.nextInt();
        System.out.println("Please input car loan length: ");
        int loanLength = userInput.nextInt();
        System.out.println("Please input interest rate: ");
        int interestRate = userInput.nextInt();
        System.out.println("Please input downPayment amount: ");
        int downPayment = userInput.nextInt();

        if(loanLength == 0 || interestRate == 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if(downPayment >= carLoan) {
            System.out.println("The car is paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthly payment is " + monthlyPayment);
        }



    }
}
