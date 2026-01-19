package Question_4;

import java.util.ArrayList;

public class PayrollApp {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("Amit", 101, 15000));
        employees.add(new HourlyEmployee("Neha", 102, 40, 500));
        employees.add(new CommissionEmployee("Rahul", 103, 10, 80000));

        for (Employee e : employees) {
            System.out.println(e.getPayment());
        }
    }
}