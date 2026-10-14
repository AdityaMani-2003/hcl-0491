
package Task1;

import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int rollNo;
    int age;
    double marks;

    Student(String name, int rollNo, int age, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " " + rollNo + " " + age + " " + marks;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        java.util.ArrayList<Student> students = new java.util.ArrayList<>();

        students.add(new Student("Aditya", 1, 22, 85.5));
        students.add(new Student("Rahul", 2, 21, 78.0));
        students.add(new Student("Aman", 3, 23, 91.0));
        students.add(new Student("Priya", 4, 20, 88.5));
        students.add(new Student("Rohit", 5, 22, 76.0));
        students.add(new Student("Neha", 6, 21, 95.0));
        students.add(new Student("Karan", 7, 24, 82.0));
        students.add(new Student("Simran", 8, 20, 90.0));
        students.add(new Student("Vikas", 9, 23, 72.5));
        students.add(new Student("Anjali", 10, 22, 89.0));

        System.out.println("Original Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students,
                Comparator.comparingInt((Student s) -> s.age));

        System.out.println("\nSorted by Age:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students,
                Comparator.comparingDouble((Student s) -> s.marks));

        System.out.println("\nSorted by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
