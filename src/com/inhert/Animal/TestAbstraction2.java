package com.inhert.Animal;

//example of abstract class that have method body
abstract class Bike {
    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

class Honda extends Bike {
    void run() {
        System.out.println("running safely..");
    }
}

class TestAbstraction2 {
    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
//如果在类中有任何抽象方法，那个类必须声明为抽象的。


//class Bike12{
//    abstract void run();
//}x