package Singleton;

public class EmployeeMain {
    public static void main(String[] args) {

        SingleEmployee e1 = SingleEmployee.getInstance();
        SingleEmployee e2 = SingleEmployee.getInstance();

        System.out.println(e1.getMsg());

        System.out.println("Hashcode of e1: " + e1.hashCode());
        System.out.println("Hashcode of e2: " + e2.hashCode());

        System.out.println(e1 == e2);
    }
}