package com.ling.game;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int guessedNumber;
        int number = (int) ((Math.random() * (100 - 1)) + 1);
        int trail;
        System.out.println("Welcome to the number guessing game!");
        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trial.");

        for (trail = 1; trail < 6; trail++) {
            System.out.println("Guess a number between 1 and 100");
            Scanner userInput = new Scanner(System.in);
            guessedNumber = userInput.nextInt();
            System.out.println("Attempt: " + trail);
            if (guessedNumber > number) {
                System.out.println("too high.");
            } else if (guessedNumber < number) {
                System.out.println("too low.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
        }
    }
}


