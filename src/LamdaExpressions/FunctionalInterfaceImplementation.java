package LamdaExpressions;

import java.util.function.*;

public class FunctionalInterfaceImplementation {
    public static void main(String[] args) {

        // Consumer: takes input, returns nothing
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello Java");

        // Supplier: takes no input, returns a value
        Supplier<Integer> supply = () -> 100;
        System.out.println(supply.get());

        // Function: takes input and returns output
        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(5));

        // Predicate: takes input, returns boolean
        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println(even.test(10));
        System.out.println(even.test(7));

        // BiFunction: takes two inputs and returns a result
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 5));
    }
}