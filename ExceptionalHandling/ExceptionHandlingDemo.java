package ExceptionalHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. TRY-CATCH");

        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("\n2. MULTIPLE CATCH BLOCKS");

        try {
            int[] arr = {10, 20, 30};

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Value: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");

        } catch (Exception e) {
            System.out.println("Some other error occurred.");
        }

        System.out.println("\n3. FINALLY BLOCK");

        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");

        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("\n4. THROW AND THROWS");

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        System.out.println("\n5. NESTED TRY-CATCH");

        try {
            System.out.println("Outer try started.");

            try {
                int result = 10 / 0;
                System.out.println(result);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");
            }

            System.out.println("Outer try continues.");

        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        }

        System.out.println("\n6. NUMBER FORMAT EXCEPTION");

        try {
            String value = "abc";
            int number = Integer.parseInt(value);
            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }

        System.out.println("\n7. NULL POINTER EXCEPTION");

        try {
            String name = null;
            System.out.println(name.length());

        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered.");
        }

        sc.close();

        System.out.println("\nProgram completed successfully.");
    }
}
