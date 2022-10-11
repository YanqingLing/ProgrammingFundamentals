package com.ling.math;
import java.util.Scanner;


public class NumberGuessingGameOneTry {
    public static void main(String[] args) {
        int guessedNumber;
        int number = (int) ((Math.random() * (100 - 1)) + 1);
        System.out.println("Welcome to the number guessing game!");
        System.out.println("A number is chosen between 1 to 100. Guess the number within 1 trial.");
        System.out.println("Guess a number between 1 and 100");
        Scanner userInput = new Scanner(System.in);
        guessedNumber = userInput.nextInt();

        if(guessedNumber > number) {
            System.out.println("too high.");
        } else if(guessedNumber < number) {
            System.out.println("too low.");
        } else {
            System.out.println("Congratulations! You guessed the number.");
        }
    }
}
