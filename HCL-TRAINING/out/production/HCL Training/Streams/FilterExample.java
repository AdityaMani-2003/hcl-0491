package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {

        // 1. Create a list of String names
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Rahul", "Amit", "Rohit", "Sneha", "Riya", "Karan")
        );

        // 2. Use stream to filter names starting with "R"
        List<String> rNames = names.stream()
                .filter(name -> name.startsWith("R")) // condition to check starting letter
                .collect(Collectors.toList());        // collects results into a new list

        // 3. Print the filtered names
        rNames.forEach(name -> System.out.println(name));
    }
}
