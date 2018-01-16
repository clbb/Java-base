package com.ArrayExample;

public class ArrayExample {

    public static void main(String[] args) {
        //数组
        int[] myArray = new int[5];

        myArray[0] = 10;

        myArray[1] = 14;

        myArray[2] = 36;
        myArray[3] = 27;

        myArray[4] = 18;

        System.out.println("Array Length=" + myArray.length);

        System.out.println("myArray[3]=" + myArray[3]);

        for (int index = 0; index < myArray.length; index++) {
            System.out.println("Element " + index + " = " + myArray[index]);
        }

        int [] array = new int[5];
        System.out.println("Array Length=" + array.length);

        for(int index = 0; index < array.length; ++index){
            array[index] = 100 * index * index + 3;
        }
        System.out.println("array[3] = " + array[3]);

    }
}