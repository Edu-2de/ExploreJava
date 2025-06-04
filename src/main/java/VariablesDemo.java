public class VariablesDemo {
    public static void main(String[] args) {
        // This is a Java program to demonstrate variables and primitive types

        // Integer type
        int age = 25;
        System.out.println("Age: " + age);

        // Double type (for decimals)
        double salary = 3500.75;
        System.out.println("Salary: " + salary);

        // Boolean type (true or false)
        boolean isStudent = false;
        System.out.println("Is student? " + isStudent);

        // Character type (single character)
        char grade = 'A';
        System.out.println("Grade: " + grade);

        // String (not a primitive type, but very common)
        String name = "Alice";
        System.out.println("Name: " + name);

        // You can also declare multiple variables in one line
        int x = 10, y = 20, z = 30;
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);

        // Constants (value cannot be changed)
        final double PI = 3.14159;
        System.out.println("Constant PI: " + PI);
    }
}