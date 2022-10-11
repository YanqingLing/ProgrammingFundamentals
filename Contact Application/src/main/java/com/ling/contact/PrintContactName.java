package com.ling.contact;
import java.util.Scanner;

public class PrintContactName {
    public static void main(String[] args) {
        Scanner userIput = new Scanner(System.in);
        System.out.println("Please provide the first name: ");
        String firstName = userIput.nextLine();
        System.out.println("Please provide the last name: ");
        String lastName = userIput.nextLine();
        System.out.println(firstName + " " + lastName);
    }

}
