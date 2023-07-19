package main.java.basics.garbage.collection;

public class NextEmployeeGarbageCollection {
    public static void main(String[] args){
        EmployeeGarbageCollection1 A = new EmployeeGarbageCollection1("Mishika", 26);
        EmployeeGarbageCollection1 B = new EmployeeGarbageCollection1("Sagar", 28);
        A.display();
        B.display();

        A.showNextId();
        B.showNextId();

        {
        // It is sub block to keep
        // all those interns.
            EmployeeGarbageCollection1 X = new EmployeeGarbageCollection1("GFG4", 23);
            EmployeeGarbageCollection1 Y = new EmployeeGarbageCollection1("GFG5", 21);
        X.display();
        Y.display();
        X.showNextId();
        Y.showNextId();
        X = Y = null;
        System.gc();
        System.runFinalization();
    }
    }
}
