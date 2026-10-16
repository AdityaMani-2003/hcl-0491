package Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.display();
        s2.display();

    }
}