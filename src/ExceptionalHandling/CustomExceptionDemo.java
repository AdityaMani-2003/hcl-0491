
package ExceptionalHandling;

import java.util.Scanner;

class AgeNotEligibleException extends Exception {
    public AgeNotEligibleException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void checkAge(int age) throws AgeNotEligibleException {
        if (age < 18) {
            throw new AgeNotEligibleException(
                    "You are not eligible to vote."
            );
        }

        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (AgeNotEligibleException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
