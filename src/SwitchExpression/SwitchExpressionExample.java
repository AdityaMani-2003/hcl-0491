package SwitchExpression;

import java.util.*;

public class SwitchExpressionExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day name: ");
        String day = sc.nextLine();

        String result = switch (day) {
            case "Monday" -> "Day 1";
            case "Tuesday" -> "Day 2";
            case "Wednesday" -> "Day 3";
            case "Thursday" -> "Day 4";
            case "Friday" -> "Day 5";
            case "Saturday" -> "Day 6";
            case "Sunday" -> "Day 7";
            default -> "Invalid day!";
        };

        System.out.println("Day name: " + day);
        System.out.println("Result: " + result);
    }
}