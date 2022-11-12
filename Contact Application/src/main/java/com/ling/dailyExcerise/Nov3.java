package com.ling.dailyExcerise;

import java.util.Arrays;

public class Nov3 {
    public static void main(String[] args) {
        // create a string variable
        String a = "HELLO";
        // create a second string variable which has the same value as the first
        String b = "HELLO";
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if(a.equals(b)) {
            System.out.println("a and b are equal");
        }
       // create an `if` statement which compares the two variables and prints to the console if they are equal ignoring case
        if(a.equalsIgnoreCase(b)) {
            System.out.println("a and b are equal ignoring case");
        }

        //Output -- lions and tiger;
        String[] animals = {"cat", "dog", "lions", "tiger"};
        Nov3 method= new Nov3();
        method.findAllLongestStrings(animals);


    }

    public void findAllLongestStrings(String[] strings) {
        int longestStringLength = 0;

        for (int i = 0; i < strings.length; i++) {
            int size = strings[i].length();
            if (size > longestStringLength){
                longestStringLength = size;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() == longestStringLength){
                System.out.println(strings[i]);
            }
        }
    }

}

