package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        // byte data type
        byte myCurrentAge = 29;
        System.out.println(
                myCurrentAge
        );

        // short data type
        short myMonthlySalary = 1300;
        System.out.println(
                myMonthlySalary
        );

        //char data type
        char firstNameLetter = 79;
        System.out.println(
                firstNameLetter
        );
        // int data type
        int dateOfBirth = 28081993;
        System.out.println(
                dateOfBirth
        );
        long populationOfLatvia = 1800000;
        System.out.println(
                populationOfLatvia
        );

        //float data type
        float lapTime = 32.30f;
        System.out.println(lapTime);

        // double data type
        double weight = 64.14;
        System.out.println(
                weight
        );

        // boolean data type
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;

        String name = "Oleg";
        String surName = "Bogdanov";

        // Concatenation
        String fullName = name + " " + surName;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;
        //System.out.println("");

        System.out.printf("My full name is: %s. I am %d years old.%n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.%n", fullName, myCurrentAge);

        //*
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);

        double d = (double) a / b;
        System.out.println(d);

        // %
        int number = 10 % 4;
        System.out.println(number);

        int[] numbers = {0, 1, 2 ,3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        
    }
}
