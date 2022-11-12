package com.ling.email;

public class EmailValidator {

    /*Create a package called email under your com.<lastname> package, and inside create a class called EmailValidator with one public method.

This method should accept a string and perform some validation checking.

If the email does not contain the @ symbol, return false; if the email is valid, return true.*/

    public boolean isValid(String emailAddress){
        if(emailAddress.contains("@")){
            return true;
        }else {
            return false;
        }
    }


}
