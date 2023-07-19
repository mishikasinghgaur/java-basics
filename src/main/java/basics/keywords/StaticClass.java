package main.java.basics.keywords;

public class StaticClass {
    // Java program to demonstrate execution
    // of static blocks and variables

        // static variable
        static int a = m1();



        // static method
        static int m1() {
            System.out.println("from m1");
            return 20;
        }

        // static block
        static {
            System.out.println("Inside static block");
        }

        // static method(main !!)
        public static void main(String[] args)
        {
            System.out.println("Value of a : "+a);
            System.out.println("from main");
        }
    }

