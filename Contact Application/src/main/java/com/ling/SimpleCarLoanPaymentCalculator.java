package com.ling;

public class SimpleCarLoanPaymentCalculator {
    public static void main(String[] args) {

        int carLoan = 20000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 3000;

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
            System.out.println(monthlyPayment);
        }



    }
}
