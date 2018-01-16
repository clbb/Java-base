package com.var;

public class var {
    public static void main(String[] args) {

        // Declare three 64-bit integer (long)
        long firstNumber, secondNumber, thirdNumber;

        // Assign value to firstNumber
        // L at the end to tell java a long type, distinguished from type int.
        firstNumber = 100L;

        // Assign values to secondNumber
        secondNumber = 200L;

        // Assign values to thirdNumber
        thirdNumber = firstNumber + secondNumber;

        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);
        System.out.println("Third Number = " + thirdNumber);
    }
}
