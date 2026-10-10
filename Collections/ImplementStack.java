
package Collections;

import java.util.ArrayDeque;

public class ImplementStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> st = new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Stack: " + st);
        System.out.println("Top element: " + st.peek());

        System.out.println("Popped: " + st.pop());

        System.out.println("Stack after pop: " + st);
        System.out.println("Top element: " + st.peek());
    }
}
