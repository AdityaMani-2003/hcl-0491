package Generics;

class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class GenericsExample {
    public static void main(String[] args) {

        // Box storing a String
        Box<String> b1 = new Box<>("Learned about generics");
        b1.display();

        // Box storing an Integer
        Box<Integer> b2 = new Box<>(100);
        b2.display();

        // Box storing a Double
        Box<Double> b3 = new Box<>(95.5);
        b3.display();
    }
}
