
package new_project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.Queue;
import new_project.Order;
import new_project.CustomQueue;

public class Order_his extends JFrame {

      private DefaultTableModel tableModel;
      private JTable orderTable;
      private CustomQueue<Order> orderQueue;

      public Order_his(CustomQueue<Order> orderQueue) {
            this.orderQueue = orderQueue;

            setTitle("Order History");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create table model with columns: Order ID, Telephone Number, Total Cost
            tableModel = new DefaultTableModel();
            tableModel.addColumn("Order ID");
            tableModel.addColumn("purChasedId");
            tableModel.addColumn("Total ");

            // Create JTable with the populated table model
            orderTable = new JTable(tableModel);
            JScrollPane scrollPane = new JScrollPane(orderTable);

            // Add components to the frame
            add(scrollPane, BorderLayout.CENTER);

            setVisible(true);
      }

      public void populateTableModel() {
            tableModel.setRowCount(0); // Clear existing rows
            while (!orderQueue.isEmpty()) {
                  Order order = orderQueue.dequeue();
                  String orderID = order.getOrderID();
                  int purChasedId = order.getpurChasedId();
                  double total = order.getTotalCost();

                  // Add order details to the table model
                  tableModel.addRow(new Object[]{orderID, purChasedId, total});
            }
      }

      public static void main(String[] args) {
            CustomQueue<Order> orderQueue = new CustomQueue<>(10); // Assuming a capacity of 10 for the queue

            // Create an instance of GUI_Customer_Side or wherever the orderQueue is being managed
            GUI_Customer_Side customerGUI = new GUI_Customer_Side();
            customerGUI.setOrderQueue(orderQueue); // Set the order queue

      }

}
