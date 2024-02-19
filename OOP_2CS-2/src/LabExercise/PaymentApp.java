package LabExercise;


public class PaymentApp {
    public static void main(String[] args){

        Order transaction1 = new Order("keyboard", 10, 300, new GCash());

        System.out.println("Order item is " + transaction1.getItem());
        System.out.println("Unit Price is "+ transaction1.getUnitPrice());
        System.out.println("Quantity is " + transaction1.getQuantity());

        System.out.println("\nPayment Order details if " + transaction1.getMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + transaction1.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + transaction1.getTotalAmount());

        Order transaction2 = new Order("keyboard", 10, 300, new Maya());

        System.out.println("\nPayment Order details if " + transaction2.getMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + transaction2.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + transaction2.getTotalAmount());

        Order transaction3 = new Order("keyboard", 10, 300, new ShopeePay());

        System.out.println("\nPayment Order details if " + transaction3.getMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + transaction3.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + transaction3.getTotalAmount());
    }
}
