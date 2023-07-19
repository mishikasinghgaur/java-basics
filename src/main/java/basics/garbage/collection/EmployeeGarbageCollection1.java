package main.java.basics.garbage.collection;

public class EmployeeGarbageCollection1 {
    private int ID;
    private String name;
    private int age;
    private static int nextID = 1;

    EmployeeGarbageCollection1(String name, int age){
        this.name = name;
        this.age = age;
        this.ID = nextID++;
    }

    void display(){
        System.out.println("Name" + name + "age" + age);
    }

    void showNextId(){
        System.out.println(nextID++);
    }

    protected void finalize()
    {
        --nextID;
        // In this case,
        // gc will call finalize()
        // for 2 times for 2 objects.
    }
}

