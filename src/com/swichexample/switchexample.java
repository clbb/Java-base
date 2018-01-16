package com.swichexample;

public class switchexample {
        /*public static void main(String[] args) {

            // Declare a variable age
            int age = 20;

            // Check the value of age
            switch (age) {

                // Case age = 18
                case 18:
                    System.out.println("You are 18 year old");
                    break;

                // Case age = 20
                case 20:
                    System.out.println("You are 20 year old");
                    break;

                // Remaining cases
                default:
                    System.out.println("You are not 18 or 20 year old");
            }
        }*/

    public static void main(String[] args) {

        // Declare a variable age
        int age = 30;

        // Check the value of age
        switch (age) {

            // Case age = 18
            case 18:
                System.out.println("You are 18 year old");

                // Case age in 20, 30, 40
            case 20:
            case 30:
            case 40:
                System.out.println("You are " + age);
                break;

            // Remaining case:
            default:
                System.out.println("Other age");
        }

    }

}
