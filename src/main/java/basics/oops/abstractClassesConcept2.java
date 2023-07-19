package main.java.basics.oops;

abstract class Shape {
    // Abstract method that must be implemented by subclasses
    abstract double calculateArea();

    // Common method shared by all subclasses
    protected void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class abstractClassesConcept2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("Circle area: " + circle.calculateArea());
        circle.display();

        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        rectangle.display();
    }
}
