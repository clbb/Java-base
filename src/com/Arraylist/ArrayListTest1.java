package com.Arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        list.add("hello");
        list.add(new Integer(2));
        //ArrayList本身接收的是对象，取出来的时候我们需要把他转换成我们放进去的相应的类型
        String s = (String)list.get(0);
        Integer i = (Integer)list.get(1);

        System.out.println(s);
        System.out.println(i);
    }
}
