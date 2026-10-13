package Collections;
import java.util.Collections;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> digit = new java.util.LinkedList<>();

        digit.add(10);
        digit.add(20);
        digit.add(30);
        digit.add(40);
        System.out.println("Original List: " + digit);

        digit.addFirst(5);
        digit.addLast(50);
        System.out.println("After adding: " + digit);

        System.out.println("First Element: " + digit.getFirst());
        System.out.println("Last Element: " + digit.getLast());
        System.out.println("Element at index 2: " + digit.get(2));

        digit.set(2, 100);
        System.out.println("After updating: " + digit);

        digit.removeFirst();
        digit.removeLast();
        digit.remove(Integer.valueOf(30));
        System.out.println("After removing: " + digit);

        System.out.println("Contains 20: " + digit.contains(20));
        System.out.println("Size: " + digit.size());
        System.out.println("Is Empty: " + digit.isEmpty());

        Collections.sort(digit);
        System.out.println("Sorted List: " + digit);

        Collections.reverse(digit);
        System.out.println("Reversed List: " + digit);

        int element=40;
        int to_add=100;
        int index=digit.indexOf(element);
        digit.add(index,to_add);

        System.out.println(digit);

        digit.clear();
        System.out.println("After clear: " + digit);
    }
}