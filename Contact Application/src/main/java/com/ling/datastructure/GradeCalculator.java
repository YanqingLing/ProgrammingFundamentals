package com.ling.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to GradeCalculator!");
        System.out.println("How many grades do you want to enter?");
        Scanner userInput = new Scanner(System.in);
        int numberOfGrades = userInput.nextInt();
        ArrayList<Integer> studentGrades = new ArrayList<Integer>();

        do{
            System.out.println("Please enter your grades: ");
            int numberEntry = userInput.nextInt();
            studentGrades.add(numberEntry);
        } while( studentGrades.size() < numberOfGrades);

        int sum = 0;
        double average;
        for (Integer grade : studentGrades) {
            sum = sum + grade;
        }

        average =  sum/numberOfGrades;
        System.out.println("The student grades your entered are: " + studentGrades);
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);

    }
}

