package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    //creating a scanner to take in user input
    public static Scanner i = new Scanner(System.in);

    public static void main(String[] args) {

        //this is using System.out.print* to display questions to the user
        System.out.println("Please enter your name ");
        System.out.print("First name: ");

        //this is capturing the answer given for the first name question and storing
        //in the firstName variable
        String firstName = i.nextLine();


        //asking for middle and putting it on a string
        System.out.print("Middle Name: ");

        //this is capturing the answer given for the mid name question and storing
        //in the midName variable
        String midName = i.nextLine();

        //asking for last name and putting it on a string
        System.out.print("Last name: ");

        //this is capturing the answer given for the last name question and storing
        //in the lastName variable
        String lastName = i.nextLine();

        //asking for suffix and putting it on a string
        System.out.print("Suffix: ");

        //this is capturing the answer given for the suffix question and storing
        //in the suffix variable
        String suffix = i.nextLine();

        //start a full name variable and start with the first name
        String fullName = firstName;

        //if the midName is not empty
        //then contact the middle initial
        if(!midName.trim().isEmpty()){
            fullName += " " + midName;
        }

        //append the last name
        fullName += " " + lastName;

        //if the suffix is not empty
        //then contact the suffix
        if(!suffix.trim().isEmpty()) {
            fullName += ", " + suffix;
        }

        //line break
        System.out.println();

        //printing out the
        System.out.println("Full Name: " + fullName.trim());



    }
}
