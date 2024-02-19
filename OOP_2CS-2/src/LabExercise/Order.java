package LabExercise;

public class Order {

    private String item;
    private Integer quantity;
    private double unitPrice;
    private double totalAmount;
    private PaymentMode mode;

    public Order(String item, Integer quantity, double unitPrice, PaymentMode mode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.mode=mode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalAmount() {
        return (unitPrice*quantity)*(1-mode.determineDiscountRate());
    }


    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

}