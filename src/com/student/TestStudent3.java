package com.student;

class Student1 {
    int id;// field or data member or instance variable
    String name;
}
class TestStudent3 {
        public static void main(String args[]) {
        // Creating objects
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        // Initializing objects
        s1.id = 101;
        s1.name = "Sonoo";
        s2.id = 102;
        s2.name = "Amit";
        // Printing data
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
