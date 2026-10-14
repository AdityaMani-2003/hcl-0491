
package Collections;

import java.util.*;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Stack: " + st);
        System.out.println("Top element: " + st.peek());
        System.out.println("Removed element: " + st.pop());
        System.out.println("Stack after pop: " + st);
        System.out.println("Size: " + st.size());
        System.out.println("Is empty: " + st.empty());
        System.out.println("Search 20: " + st.search(20));
        System.out.println("Contains 30: " + st.contains(30));
        System.out.println("Element at index 1: " + st.get(1));
        System.out.println("First element: " + st.firstElement());
        System.out.println("Last element: " + st.lastElement());
        System.out.println("Index of 30: " + st.indexOf(30));
        System.out.println("Capacity: " + st.capacity());

        st.set(0, 100);
        System.out.println("After update: " + st);

        st.remove(Integer.valueOf(30));
        System.out.println("After remove: " + st);

        st.add(50);
        System.out.println("After add: " + st);

        System.out.println("Contains 50: " + st.contains(50));

        st.clear();
        System.out.println("After clear: " + st);
        System.out.println("Is empty: " + st.isEmpty());
    }
}
