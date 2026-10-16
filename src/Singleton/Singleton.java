package Singleton;

public class Singleton {

    private static Singleton obj = new Singleton();

    private Singleton() {
        System.out.println("Private constructor called");
    }

    public static Singleton getInstance() {
        return obj;
    }

    public void display() {
        System.out.println("Hello from Singleton");
    }
}