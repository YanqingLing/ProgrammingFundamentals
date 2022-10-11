package com.ling.game;

import java.util.Scanner;

public class RockPaperScissorsOneTry {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        Scanner userInput = new Scanner(System.in);

        //Get user’s move through user input
        System.out.print("What is your move? To make a move, enter rock, paper, or scissors. : ");
        String usersMove = userInput.nextLine();

        //Check if user’s move is valid
        if (!usersMove.equals("rock")
                && !usersMove.equals("paper")
                && !usersMove.equals("scissors")) {
            System.out.println("Your move is invalid!");
        } else {
            // Generate a random 1 2 3
            //Set the opponent’s move based on the randomNumber using if statements
            int randomNumber = (int) ((Math.random() * (4 - 1)) + 1);
            String opponentsMove = "";
            if (randomNumber == 1) {
                opponentsMove = "rock";
            } else if (randomNumber == 2) {
                opponentsMove = "scissors";
            } else {
                opponentsMove = "paper";
            }
            System.out.println(opponentsMove);

            //Print the results of the game: tie, lose, win
            if (usersMove.equals(opponentsMove)) {
                System.out.println("It's a tie!");
            } else if (usersMove.equals("rock") && opponentsMove.equals("scissors") || usersMove.equals("paper") && opponentsMove.equals("rock") || usersMove.equals("scissors") && opponentsMove.equals("paper")) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }

        }
    }
}

