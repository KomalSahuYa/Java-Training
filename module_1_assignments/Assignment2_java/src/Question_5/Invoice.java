package Question_5;

public class Invoice implements Payable {
    private String invoiceId;
    private String itemDescription;
    private int quantity;
    private double pricePerUnit;

    public Invoice(String invoiceId, String itemDescription, int quantity, double pricePerUnit) {
        this.invoiceId = invoiceId;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public double getPayment() {
        return quantity * pricePerUnit;
    }
}
