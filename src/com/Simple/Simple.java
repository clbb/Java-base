package com.Simple;

class A{
    int data=50;//实例变量
    static int m=100;// 静态变量
    void method(){
        int n=90;//局部变量
    }
}//end of class

public class Simple{
    public static void main(String[] args){

        test1();
        test2();
        test3();
        test4();
        test5();


    }
    //两个数字相加
    public static void test1(){
        int a = 10;
        int b = 10;
        int c = a + b;
        System.out.println(c);
    }
    //加宽
    public static void test2(){
        int a=10;
        float f=a;
        System.out.println(a);
        System.out.println(f);
    }
    //缩小
    public static void test3(){
        float f=10.5f;
        //int a=f;//Compile time error
        int a=(int)f;
        System.out.println(f);
        System.out.println(a);
    }
    //溢出
    public static  void test4(){
        //Overflow
        int a=130;
        byte b=(byte)a;
        System.out.println(a);
        System.out.println(b);
    }
    //较低类型相加
    public static  void test5(){
        byte a=10;
        byte b=10;
        //byte c=a+b;//Compile Time Error: because a+b=20 will be int
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}
