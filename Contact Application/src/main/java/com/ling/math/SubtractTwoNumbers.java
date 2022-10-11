package com.ling.math;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Hello, This is my simple calculator that subtracts two numbers");
        int numberOne;
        int numberTwo;
        int difference = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        numberOne = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        numberTwo = userInput.nextInt();
        difference = numberOne - numberTwo;
        System.out.println("The difference of " + numberOne + " and " + numberTwo + " is " + difference);
    }
}
