package com.ling.methods;
import java.util.ArrayList;
import java.util.Arrays;


/*

A method converts two number to an array of int

int[] toArray(int numberOne, int numberTwo, int numberThree)

A method that prints all the numbers on separate lines

void print(int[] numbers)

A method that returns the array with larger sum

int[] larger(int[] setOne, int setTwo)*/

public class JavaMethodExercisesOne {
    public static void main(String[] args) {
        JavaMethodExercisesOne methods = new JavaMethodExercisesOne();
        //System.out.println(Arrays.toString(methods.toArray(3,4,5)));
        //System.out.println(methods.addTwoNumbers(2,3));
        //System.out.println((methods.subtractTwoNumbers(3,1)));
        /*String[] studentNames = {"Nikki", "Mary","John"};
        methods.hello(studentNames);*/
        //System.out.println(methods.isOver30(31));
        /*int [] numbers = {1,2,3};
        System.out.println(methods.sum(numbers));*/
        //System.out.println(methods.difference(2,4));
        //System.out.println(methods.dayOfWeek(7));
        //System.out.println(methods.upperCase("hello"));
        String [] studentNames = {"Mary","Billy","John"};
        System.out.println(methods.numberOfStudents(studentNames));
        /*int [] numbers = {1,2,3,11,12};
        System.out.println(methods.greaterThan10(numbers));
        System.out.println(methods.lessThan10(numbers);*/
        /*int[] numbers = {1,2,3,4};
        methods.print(numbers);*/
        //System.out.println(methods.toArray(1,2,3));
        //System.out.println(methods.oddNumbers(50));
        //System.out.println(methods.evenNumbers(50));
        /*int[] setOne = {1,2};
        int[] setTwo = {3,0};
        System.out.println(methods.largerSum(setOne,setTwo));*/

    }

    //A method the adds two numbers
    public int addTwoNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;


    }
    //A method that subtracts two number
    public int subtractTwoNumbers(int numberOne, int numberTwo) {
        int difference = numberOne - numberTwo;
        return difference;
    }


    //A method says hello to each student. void hello(String[] studentNames)
    public void hello(String[] studentNames) {
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Hello," + studentNames[i]);
        }
    }

    //A method that tells if a age is over 30
    public boolean isOver30(int age) {
        if (age > 30) {
            return true;
        } else {
            return false;
        }
    }

    //A method that provides a sum off the number provided
    public int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    //A method that returns the absolute difference between two numbers

    public int difference(int numberOne, int numberTwo) {
        int difference = Math.abs(numberOne - numberTwo);
        return difference;
    }

    //A method that returns the day of the week for a number between 1 and 7
    public String dayOfWeek(int number) {
        String day = "";
        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Sunday";

        }
        return day;
    }

    //A method that converts a text to upperCase
    public String upperCase(String text) {
        String upperCaseText = text.toUpperCase();

        return upperCaseText;
    }

    //A method that returns the total number of students
    public int numberOfStudents(String[] studentNames) {
        return studentNames.length;
    }


    //A method that returns count of numbers that are greater than 10
    public int greaterThan10(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 10) {
                count = count + 1;
            }
        }
        return count;
    }

    //A method that returns count of numbers that are less than 10
    public int lessThan10(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 10) {
                count = count + 1;
            }
        }
        return count;

    }
    
    //A method converts three number to an array of int
    
    public String toArray(int numberOne, int numberTwo, int numberThree) {
        int[] array = {numberOne, numberTwo, numberThree};
        return Arrays.toString(array);
    }

    //A method that prints all the numbers on separate lines

    public void print(int[] numbers) {
        //for(int i = 0; i<= numbers.length;i++) {
            //System.out.println(numbers[i]);
             for(int number : numbers) {
                 System.out.println(number);
             }
        //}
    }

    //A method returns all the odd number between 1 and a number
    public ArrayList<Integer> oddNumbers(int upperLimits) {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for(int i = 1; i <= upperLimits; i++) {
            if(i % 2 != 0) {
                odds.add(i);
            }
        }
        return odds;
    }

    //A method that returns all even numbers between 1 and a number
    public ArrayList<Integer> evenNumbers(int upperLimits) {
        //int [] evenNumbers = new int[];
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for(int i = 1; i <= upperLimits; i++) {
            if(i % 2 == 0) {
                evens.add(i);
            }
        }
        return evens;
    }

   //A method that returns the array with larger sum
    //int[] larger(int[] setOne, int setTwo
    public String largerSum(int[] setOne, int[] setTwo) {
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < setOne.length; i++) {
            sumOne += setOne[i];
        }
        /*for(int number: setOne ) {
            sumOne = sumOne + number;
        }*/

        for (int j = 0; j < setTwo.length; j++) {
            sumTwo += setTwo[j];
        }

        if(sumOne > sumTwo) {
             return Arrays.toString(setOne);
         } else if(sumOne < sumTwo) {
             return Arrays.toString(setTwo);
         } else {
             return null;
        }

    }
}












