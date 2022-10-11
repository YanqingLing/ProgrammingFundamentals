package com.ling.math;

public class PrintEvenNumber {
    public static void main(String[] args) {
        int num;
        int upperLimit = 100;
        System.out.println("Welcome to the program that prints all even number between 1 and 100!");
        for(num = 1; num <= upperLimit; num++) {
            if(num % 2 == 0) {
                System.out.println(num + " is an even number.");
            }
        }

    }
}




