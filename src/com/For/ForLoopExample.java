package com.For;

public class ForLoopExample {

//    public static void main(String[] args) {
//        int step = 1;
//
//        for (int value = 0; value < 10; value = value + 3) {
//
//            System.out.println("Step =" + step + "  value = " + value);
//            step = step + 1;
//        }
//    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i = i + 1) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("---------");
        test1();
        System.out.println("---------");
        test2();
        System.out.println("---------");
        test3();
        System.out.println("---------");
        test4();
    }

    //for-each
    public static void test1(){
        int arr[] = { 12, 23, 44, 56, 78 };
        for (int i : arr) {
            System.out.println(i);
        }
    }

    //标记for循环
    public static void test2() {
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }

    public static void test3(){
        aa: for (int i = 1; i <= 3; i++) {
            bb: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break bb;
                }
                System.out.println(i + " " + j);
            }
        }
    }


    public static void test4(){
        for (;;) {
            System.out.println("infinitive loop");
        }
    }
}

