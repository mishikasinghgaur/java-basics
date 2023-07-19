package main.java.basics.constructors;

class BaseClass {
    public BaseClass(int baseParam) {
        System.out.println("BaseClass constructor called." + baseParam);
    }
}

class DerivedClass extends BaseClass {
    public DerivedClass(int baseParam, int derivedParam) {
        super(baseParam);  // Calling the constructor of the base class
        System.out.println("DerivedClass constructor called.");
    }
}

public class copyConstructorUsingSuper {
    public static void main(String[] args) {
        DerivedClass derivedObj = new DerivedClass(10, 20);
    }
}