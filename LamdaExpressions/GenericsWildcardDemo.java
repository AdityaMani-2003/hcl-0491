
import java.util.*;

class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class NumberBox<T extends Number> {
    private T value;

    NumberBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsWildcardDemo {

    // Generic method
    public static <T> void printItem(T item) {
        System.out.println(item);
    }

    // Unbounded wildcard: accepts any type of list
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Upper-bounded wildcard: Number or its subclasses
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }

    // Lower-bounded wildcard: Integer or its supertypes
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }

    public static void main(String[] args) {

        System.out.println("1. GENERICS");

        Box<String> stringBox = new Box<>("Hello Java");
        Box<Integer> integerBox = new Box<>(100);

        System.out.println(stringBox.getValue());
        System.out.println(integerBox.getValue());

        System.out.println("\n2. BOUNDED GENERICS");

        NumberBox<Integer> intBox = new NumberBox<>(50);
        NumberBox<Double> doubleBox = new NumberBox<>(25.5);

        System.out.println(intBox.getValue());
        System.out.println(doubleBox.getValue());

        // NumberBox<String> invalid = new NumberBox<>("Hello");

        System.out.println("\n3. GENERIC METHOD");

        printItem("Aditya");
        printItem(500);
        printItem(45.6);

        System.out.println("\n4. UNBOUNDED WILDCARD");

        List<String> names = Arrays.asList("Aman", "Rahul", "Aditya");
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        printList(names);
        printList(numbers);

        System.out.println("\n5. UPPER-BOUNDED WILDCARD");

        List<Integer> integers = Arrays.asList(10, 20, 30);
        List<Double> decimals = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println(sumNumbers(integers));
        System.out.println(sumNumbers(decimals));

        System.out.println("\n6. LOWER-BOUNDED WILDCARD");

        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addNumbers(integerList);
        addNumbers(numberList);
        addNumbers(objectList);
    }
}
