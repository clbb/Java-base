package com.OperatorExample;

public class OperatorExample {
    public static void main(String args[]){
        test1();
        test2();
        test3();
        test4();
        test5();
    }


    public static void test1(){
    int x=10;
    System.out.println(x++);//10 (11)
    System.out.println(++x);//12
    System.out.println(x--);//12 (11)
    System.out.println(--x);//10
}

    public static void test2(){
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);// 10+12=22
        System.out.println(b++ + b++);// 10+11=21
    }

    public static void test3(){
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);// -11 (minus of total positive value which
        // starts from 0)
        System.out.println(~b);// 9 (positive of total minus, positive starts
        // from 0)
        System.out.println(!c);// false (opposite of boolean value)
        System.out.println(!d);// true
    }

    public static void test4(){
        int a = 10;
        int b = 5;
        System.out.println(a + b);// 15
        System.out.println(a - b);// 5
        System.out.println(a * b);// 50
        System.out.println(a / b);// 2
        System.out.println(a % b);// 0
    }

    public static void test5(){
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c);// true || true = true
        System.out.println(a > b | a < c);// true | true = true
        // || vs |
        System.out.println(a > b || a++ < c);// true || true = true
        System.out.println(a);// 10 because second condition is not checked
        System.out.println(a > b | a++ < c);// true | true = true
        System.out.println(a);// 11 because second condition is checked

    }
}

