package com.Arraylist;

import java.util.ArrayList;

public class ArraylistTest {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("java");

        String s1 = (String)arrayList.get(0);
        String s2 = (String)arrayList.get(1);
        String s3 = (String)arrayList.get(2);
        String s4 = (String)arrayList.get(3);


       // arrayList.remove(0);
        //arrayList.remove("java");
        for(int i = 0; i<arrayList.size();++i){
            System.out.println(arrayList.get(i));
        }


        arrayList.clear();
     //   System.out.println(arrayList.size());
          System.out.println(arrayList.isEmpty());
          arrayList.add("aaa");
          arrayList.add("vvv");
        System.out.println(arrayList.indexOf("aaa"));
        System.out.println(arrayList.indexOf("vvv"));

        System.out.println(arrayList.indexOf("world"));
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);

    }
}
