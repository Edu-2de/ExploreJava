package main.java;

public class MethodsDemo {
    // This is a static method (can be called without creating an object)
    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Methods Demo!");
    }

    // This is a static method with parameters
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // This is a static method that returns a value
    public static int multiply(int x, int y) {
        return x * y;
    }

    // This is a non-static (instance) method
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // This is a private method (can only be called inside this class)
    private void privateMessage() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {
        // Calling static methods directly
        printWelcomeMessage();
        printSum(5, 10);

        int product = multiply(4, 7);
        System.out.println("Product: " + product);

        // To call non-static (instance) methods, create an object
        MethodsDemo demo = new MethodsDemo();
        demo.greet("Alice");

        // Private methods cannot be called here directly from main
        // demo.privateMessage(); // This will cause a compilation error if uncommented
    }
}