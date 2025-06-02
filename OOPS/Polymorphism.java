package OOPS;

// Base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Derived class 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Derived class 2
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Method Overloading - Compile-time Polymorphism
class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Runtime Polymorphism
        Shape s1 = new Circle(); // Shape reference, Circle object
        Shape s2 = new Rectangle(); // Shape reference, Rectangle object

        s1.draw(); // Output: Drawing a circle.
        s2.draw(); // Output: Drawing a rectangle.

        // Compile-time Polymorphism
        Calculator calc = new Calculator();
        System.out.println("Multiplication (2 int): " + calc.multiply(2, 3));
        System.out.println("Multiplication (2 double): " + calc.multiply(2.5, 4.0));
        System.out.println("Multiplication (3 int): " + calc.multiply(2, 3, 4));
    }
}
