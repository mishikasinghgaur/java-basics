package main.java.basics.oops;


// Java Program to Illustrate
// that an instance of Abstract
// Class can not be created

// Class 1
// Abstract class
abstract class Base {
    abstract void fun();

}

// Class 2
abstract class Derived extends Base {

    void display() {
        System.out.println("Display");
    }
}

class B extends Derived{
    void fun(){
        System.out.println("Have fun");
    }
}

// Class 3
public class abstractClassesConcept {
    // Main driver method
    public static void main(String args[])
    {

        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();

        // We can have references of Base type.
        Derived b = new B();
        b.fun();
        b.display();
    }
}
