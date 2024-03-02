
package new_project;

public class Order {
    private static int orderCount = 0;
    private String orderID;
    private double total;
    private int purChasedId;

    public Order(double total, int purChasedId) {
        this.orderID = "Order" + (++orderCount);
        this.total = total;
        this.purChasedId = purChasedId;
    }

    public String getOrderID() {
        return orderID;
    }

    public double getTotalCost() {
        return total;
    }

    public int getpurChasedId() {
        return purChasedId;
    }
}