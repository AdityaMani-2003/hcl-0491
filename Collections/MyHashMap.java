
package Collections;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Aditya");
        map.put(2, "Rahul");
        map.put(3, "Aman");
        map.put(4, "Priya");

        System.out.println("HashMap: " + map);

        System.out.println("Value of key 2: " + map.get(2));
        System.out.println("Missing key: " + map.get(10));
        System.out.println("Contains key 3: " + map.containsKey(3));
        System.out.println("Contains value Aman: " + map.containsValue("Aman"));
        System.out.println("Size: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());

        map.put(2, "Rohit");
        System.out.println("After updating key 2: " + map);

        map.putIfAbsent(5, "Neha");
        System.out.println("After putIfAbsent: " + map);

        map.replace(3, "Aman Kumar");
        System.out.println("After replace: " + map);

        map.remove(4);
        System.out.println("After removing key 4: " + map);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        System.out.println("Iterating HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        map.forEach((key, value) ->
                System.out.println(key + " = " + value)
        );

        map.clear();
        System.out.println("After clear: " + map);
        System.out.println("Is empty: " + map.isEmpty());
    }
}
