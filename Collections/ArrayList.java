package Collections;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);

        list.add(2, 25);
        System.out.println("After adding at index 2: " + list);

        list.set(2, 100);
        System.out.println("After updating index 2: " + list);

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Size: " + list.size());
        System.out.println("Contains 30: " + list.contains(30));
        System.out.println("Index of 40: " + list.indexOf(40));
        System.out.println("Last index of 20: " + list.lastIndexOf(20));
        System.out.println("Is Empty: " + list.isEmpty());

        list.remove(2);
        System.out.println("After removing index 2: " + list);

        list.remove(Integer.valueOf(40));
        System.out.println("After removing value 40: " + list);

        list.add(20);
        System.out.println("After adding duplicate: " + list);

        Collections.sort(list);
        System.out.println("Ascending Order: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order: " + list);

        Collections.reverse(list);
        System.out.println("After reverse: " + list);

        System.out.println("Minimum: " + Collections.min(list));
        System.out.println("Maximum: " + Collections.max(list));
        System.out.println("Frequency of 20: " +
                Collections.frequency(list, 20));

        java.util.ArrayList<Integer> copy = new java.util.ArrayList<>(list);
        System.out.println("Copied List: " + copy);

        java.util.ArrayList<Integer> subList =
                new java.util.ArrayList<>(list.subList(0, 2));
        System.out.println("SubList: " + subList);

        list.addAll(subList);
        System.out.println("After addAll: " + list);

        System.out.println("Equals Copy: " + list.equals(copy));

        Iterator<Integer> iterator = list.iterator();
        System.out.print("Using Iterator: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        list.removeIf(n -> n == 20);
        System.out.println("After removeIf: " + list);

        list.replaceAll(n -> n * 2);
        System.out.println("After replaceAll: " + list);

        list.clear();
        System.out.println("After clear: " + list);
        System.out.println("Is Empty: " + list.isEmpty());
    }
}