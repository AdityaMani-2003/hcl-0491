package Singleton;

public class SingleEmployee {

    private static final SingleEmployee obj = new SingleEmployee();

    private SingleEmployee() {
    }

    public static SingleEmployee getInstance() {
        return obj;
    }

    public String getMsg() {
        return "Hello, I am a Single Employee";
    }
}