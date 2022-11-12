package com.ling.accessmodifier;


import com.ling.email.EmailValidator;

/*Create a package called accessmodifier under your com.<lastname> package and create a class AccessModifierTest that calls your EmailValidator method*/
public class AccessModifierTest {

    public static void main(String[] args) {
        EmailValidator a = new EmailValidator();
        System.out.println(a.isValid("123gmail.com"));

    }

    //Now change your EmailValidator public method to private and try to run. What happens?
    //Not able to use the class from another package.


}
