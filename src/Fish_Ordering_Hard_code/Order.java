// Order.java
package Fish_Ordering_Hard_code;

public class Order {
    private static int orderCount = 0;
    private String orderID;
    private double totalCost;
    private String telephoneNumber;

    public Order(double totalCost, String telephoneNumber) {
        this.orderID = "Order" + (++orderCount);
        this.totalCost = totalCost;
        this.telephoneNumber = telephoneNumber;
    }

    public String getOrderID() {
        return orderID;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
