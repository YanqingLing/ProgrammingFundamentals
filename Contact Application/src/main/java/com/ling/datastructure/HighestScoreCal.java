package com.ling.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class HighestScoreCal {
    public static void main(String[] args) {
        System.out.println("Welcome to Highest Score Calculator!");
        System.out.println("How many grades do you want to enter?");
        Scanner userInput = new Scanner(System.in);
        int numberOfGrades = userInput.nextInt();
        ArrayList<Integer> studentGrades = new ArrayList<Integer>();

        do{
            System.out.println("Please enter your grades: ");
            int numberEntry = userInput.nextInt();
            studentGrades.add(numberEntry);
        } while( studentGrades.size() < numberOfGrades);

        int highestScore = studentGrades.get(0);

        for (int i = 1; i < studentGrades.size(); i++) {
            if (highestScore < studentGrades.get(i))
                highestScore = studentGrades.get(i);
        }
        /*for(Integer grade : studentGrades) {
            if(highestScore < grade) {
                highestScore = grade;
            }
        }*/
        System.out.println("The student highest score is " + highestScore);
    }
}
