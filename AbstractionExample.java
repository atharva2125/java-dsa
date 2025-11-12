abstract class Shape {    
    abstract double calculateArea();

    void display() {
        System.out.println("Calculating area...");
    }
}

// Concrete class extending abstract class
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class extending abstract class
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Cannot create an object of an abstract class
        // Shape shape = new Shape(); // This will cause a compile-time error

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.display();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

// Explanation:
// 1. Abstract Class: Shape is an abstract class with an abstract method calculateArea().
//    It provides a common interface for its subclasses.
// 2. Abstract Method: calculateArea() is an abstract method, meaning it has no implementation in the Shape class.
//    Subclasses must provide their own implementation.
// 3. Concrete Classes: Circle and Rectangle are concrete classes that extend the Shape class.
//    They provide specific implementations for the calculateArea() method.
// 4. Concrete Method: The display() method in the Shape class is a concrete method that can be used by subclasses.
// 5. Main Method: In the main method, we create instances of Circle and Rectangle and call their methods.