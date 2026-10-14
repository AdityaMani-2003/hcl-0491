package Streams;

import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(10, 15, 20, 25, 30, 35, 40)
        );

        ArrayList<Integer> evenList = new ArrayList<>();

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> evenList.add(n));

        evenList.forEach(n -> System.out.println(n));
    }
}