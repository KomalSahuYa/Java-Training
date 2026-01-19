package Question_5;

import java.util.ArrayList;

public class PaymentApp {
    public static void main(String[] args) {
        ArrayList<Payable> list = new ArrayList<>();

        list.add(new SalariedEmployee("Amit", 101, 20000));
        list.add(new HourlyEmployee("Neha", 102, 40, 600));
        list.add(new Invoice("INV01", "Laptop", 2, 45000));
        list.add(new Invoice("INV02", "Printer", 1, 12000));

        for (Payable p : list) {
            System.out.println(p.getPayment());
        }
    }
}
