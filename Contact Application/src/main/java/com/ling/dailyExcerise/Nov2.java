package com.ling.dailyExcerise;

import java.util.Arrays;

public class Nov2 {
    public static void main(String[] args) {
        // declare an empty integer array of length = 4
        int array[] = new int[4];
        // iterate of the array and print the value to console
        for(int i : array) {
            System.out.println(i);
        }
        // fill it with the number `3`
        array[0] = 3;
        array[1] = 3;
        array[2] = 3;
        array[3] = 3;
        // print the array to the console
        System.out.println(Arrays.toString(array));

        // declare an empty integer array of length = 7
        // fill it with the number `2`
        int array1[] = {2,2,2,2,2,2,2};

        // reassign the second value in the array to the number `23`
        array1[1] = 23;
        // print the array to the console
        System.out.println(Arrays.toString(array1));

        // create an integer variable
        int a = 2;
        // create a second integer variable
        int b = 2;
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if(a == b){
            System.out.println("a and b are equal");
        } else{
            System.out.println("a and b are not equal");

        }

    }




}
