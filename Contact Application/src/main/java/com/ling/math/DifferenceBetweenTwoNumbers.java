package com.ling.math;

import java.util.Scanner;

public class DifferenceBetweenTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Hello, This is my simple calculator for the difference between two numbers");
        int numberOne;
        int numberTwo;
        int difference = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        numberOne = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        numberTwo = userInput.nextInt();
        difference = Math.abs(numberOne - numberTwo);
        if(difference == 0) {
            System.out.println("Error!Two numbers can not be the same");
        } else {
            System.out.println("The difference of " + numberOne + " and " + numberTwo + " is " + difference);
        }
    }
}
