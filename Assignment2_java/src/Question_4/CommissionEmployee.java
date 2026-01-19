package Question_4;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double totalSales;

    public CommissionEmployee(String name, int employeeId, double commissionRate, double totalSales) {
        super(name, employeeId);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    @Override
    public double getPayment() {
        return (commissionRate * totalSales) / 100;
    }
}