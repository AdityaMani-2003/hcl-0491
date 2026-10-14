package Abstraction;

public class Main {
    public static void main(String[] args) {
        Cards card = new Cards();
        card.payment();

        Payments payments = new Payments();
        payments.pay();

        Upi upi = new Upi();
        upi.payment();
    }
}