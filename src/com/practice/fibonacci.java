package com.practice;

public class fibonacci {
    public static void main(String args[]){
        int a = 0;
        int b = 1;

        int count = 10;
        int sum = 0;
        System.out.println(a);

        for(int i=1; i<count; ++i){
            sum = a + b;
            System.out.println(sum);
            b = a;
            a = sum;

        }

        System.out.println("sssssssss");
        int value = 10;
        System.out.println(n1+"\n"+n2);

        subTest(value-2);

    }
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;
    static void subTest(int count){


        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            subTest(count-1);
        }
       // return  sum = subTest(a) + subTest(a-1);

    }
}
