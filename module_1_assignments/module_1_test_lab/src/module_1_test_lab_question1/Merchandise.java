package module_1_test_lab_question1;

public class Merchandise {
    private String itemCode;
    private int quantity;
    private double unitprice;

    public Merchandise(String itemCode, int quantity, double unitprice) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.unitprice = unitprice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    @Override
    public String toString() {
        return itemCode + " " + quantity + " " + unitprice;
    }
}
