package com.MethodSample;

public class MethodTest{
    public static void main(String[] args) {

        MethodSample obj = new MethodSample();

        String text = obj.getText();

        System.out.println("Text = " + text);

        obj.setText("New Text");

        System.out.println("Text = " + obj.getText());


        int sum = MethodSample.sum(10, 20, 30);

        System.out.println("Sum  10,20,30= " + sum);

        int sum2 = obj.sum(20, 30, 40);

        System.out.println("Sum  20,30,40= " + sum2);
    }
}
