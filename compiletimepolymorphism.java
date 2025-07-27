// Helper class to demonstrate method overloading
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        System.out.println("Called add(int, int)");
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        System.out.println("Called add(int, int, int)");
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        System.out.println("Called add(double, double)");
        return a + b;
    }
}

public class compiletimepolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // The compiler knows exactly which 'add' method to call based on the arguments.
        // This decision is made at compile time.
        System.out.println("Sum is: " + calc.add(10, 20));       // Calls the first method
        System.out.println("Sum is: " + calc.add(10, 20, 30));    // Calls the second method
        System.out.println("Sum is: " + calc.add(10.5, 20.5));    // Calls the third method
    }
}