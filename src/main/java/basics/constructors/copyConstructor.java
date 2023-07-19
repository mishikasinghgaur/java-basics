package main.java.basics.constructors;

public class copyConstructor {
    String name;
    int id;

    copyConstructor(String name, int id){
        this.name=name;
        this.id=id;
        System.out.println(this.name);
    }

    copyConstructor(copyConstructor c1){
        name = c1.name;
        id=c1.id;
        System.out.println(this.id);
    }

    public static void main(String[] args){
        copyConstructor x1 = new copyConstructor("Mishika",12);
        copyConstructor x2 = new copyConstructor(x1);
        System.out.println(x2);
    }
}
