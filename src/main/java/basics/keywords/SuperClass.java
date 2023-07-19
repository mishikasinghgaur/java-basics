package main.java.basics.keywords;

// Java program to demonstrate the use
// of super keyword with Method
// Overloading

class BaseClass {
    int a;
    BaseClass(){
        a=10;
    }
    // Class DP method learn
    // with 0 parameter.
    public void learn() { System.out.println("Dynamic"); }
}

// Class CP extends class DP
class ChildClass1 extends BaseClass {

    ChildClass1(){
        super();

    }
    // Class CP method learn
    // with 0 parameter.
    public void learn()
    {
        // Using super keyword
        // here learn will be
        // called from class DP.
        super.learn();
        System.out.println("Competitive");
    }

}

// Class programming extends class
// CP that is extends class DP.
class ChildClass2 extends ChildClass1 {

    // Class programming method
    // learn with 0 parameter.
    public void learn()
    {
        // Here, learn method from class CP
        // and learn method from class DP
        // which called inside class CP learn
        // method.
        super.learn();
        System.out.println("Programming");
    }
}

// Main Class
public class SuperClass {
    public static void main(String[] args)
    {
        // Creating object for class Programming.
        BaseClass obj = new ChildClass2();
        // here, learn method will be called
        // from Programming class.

        // method will be also called
        // from programming class extends
        // class CP that is extends
        // class DP.
        obj.learn();
    }
}

