package main.java.basics.keywords;

public class FinalClass {
    public static void main(String[] args) {
        final int VALUE = 10; // declaring a final variable

        System.out.println("The value is: " + VALUE);
        // VALUE = 20; // uncommenting this line will cause a compiler error
        // System.out.println("The new value is: " + VALUE);

        final String MESSAGE = "Hello, world!"; // declaring a final variable
        System.out.println(MESSAGE);

        MyOtherClass myObj = new MyOtherClass();
        myObj.printMessage();
        myObj.printFinalMessage();


    }
}

class MyClass {
    final String message = "Hello!"; // declaring a final instance variable

    void printMessage() {
        System.out.println(message);
    }

    void printFinalMessage() {
        final String finalMessage = "Hello, final!";
        System.out.println(finalMessage);
    }
}

final class MyOtherClass extends MyClass { // declaring a final class
    // ...
}
