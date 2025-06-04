package main.java;

public class ControlFlowDemo {
    public static void main(String[] args) {
        // IF-ELSE statement
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // SWITCH statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // FOR loop
        System.out.println("Counting from 1 to 5 using a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // WHILE loop
        System.out.println("Counting down from 5 using a while loop:");
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        // DO-WHILE loop
        System.out.println("Printing numbers from 1 to 3 using a do-while loop:");
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 3);
    }
}