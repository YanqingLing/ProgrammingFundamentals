package com.ling.nov5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    public ArrayList<Contact> addAContact (Contact contact){

        contacts.add(contact);
        return contacts;
    }

    public Contact findAContact(String firstName){
        for(Contact contact : contacts){
            if(firstName == contact.firstName){
               return contact;
            }
        }
        return new Contact();
    }



    public static void main(String[] args) {
       Contact a = new Contact();
       a.setFirstName("KIKI");
       a.setPhoneNumber("111");
        a.setLastName("L");


        Contact b = new Contact();
        b.setFirstName("KIM");
        b.setLastName("L");
        b.setPhoneNumber("222");

        Contact c = new Contact();
        b.setFirstName("JENNY");
        b.setLastName("L");
        b.setPhoneNumber("333");


       AddressBook method = new AddressBook();
       System.out.println(method.addAContact(a));
       System.out.println(method.findAContact("KIKI"));
       method.findAContact("KIKI").getPhoneNumber();


    }



}
