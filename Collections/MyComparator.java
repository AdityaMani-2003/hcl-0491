
package Collections;

import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollNo, s.rollNo);
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo
                + ", Name: " + name
                + ", Age: " + age;
    }
}

public class MyComparator {
    public static void main(String[] args) {

        java.util.ArrayList<Student> list =
                new java.util.ArrayList<>();

        list.add(new Student(103, "Rahul", 22));
        list.add(new Student(101, "Aman", 20));
        list.add(new Student(104, "Priya", 21));
        list.add(new Student(102, "Neha", 20));

        System.out.println("Comparable - Roll No Ascending:");
        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println("\nComparator - Roll No Descending:");
        list.sort((a, b) ->
                Integer.compare(b.rollNo, a.rollNo));
        list.forEach(System.out::println);

        System.out.println("\nComparator - Age Ascending:");
        list.sort((a, b) ->
                Integer.compare(a.age, b.age));
        list.forEach(System.out::println);

        System.out.println("\nComparator - Age Descending:");
        list.sort((a, b) ->
                Integer.compare(b.age, a.age));
        list.forEach(System.out::println);
    }
}
