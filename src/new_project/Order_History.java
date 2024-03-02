package new_project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import new_project.Order;
import new_project.CustomQueue;
import new_project.GUI;


public class Order_History extends javax.swing.JFrame {

      private DefaultTableModel tableModel;
      private CustomQueue<Order> orderQueue;

      public Order_History(CustomQueue<Order> orderQueue) {
            this.orderQueue = orderQueue;
            initComponents();
            populateTableModel();

      }
 private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        orderTable.setBackground(new java.awt.Color(255, 255, 255));
        orderTable.setForeground(new java.awt.Color(0, 0, 0));
        tableModel = new DefaultTableModel(
            new Object[][]{
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String[]{
                "Order ID", "purChasedId", "Total"
            }
        );
        orderTable.setModel(tableModel);
        jScrollPane1.setViewportView(orderTable);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 243, Short.MAX_VALUE))
        );

        pack();
    }
 
public void populateTableModel() {
        if (orderQueue != null && !orderQueue.isEmpty()) {
            tableModel.setRowCount(0); // Clear existing rows
            while (!orderQueue.isEmpty()) {
                Order order = orderQueue.dequeue();
                String orderID = order.getOrderID();
                int purChasedId = order.getpurChasedId();
                double total = order.getTotalCost();

                // Add order details to the table model
                tableModel.addRow(new Object[]{orderID, purChasedId, total});
            }
        } else {
            System.out.println("Order queue is null or empty.");
        }
    }

/*
     @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jScrollPane2 = new javax.swing.JScrollPane();
            jScrollPane1 = new javax.swing.JScrollPane();
            orderTable = new javax.swing.JTable();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setForeground(new java.awt.Color(51, 51, 51));
            jPanel1.setPreferredSize(new java.awt.Dimension(1435, 812));

            orderTable.setBackground(new java.awt.Color(102, 102, 255));
            orderTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            orderTable.setForeground(new java.awt.Color(0, 0, 0));
            orderTable.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                  },
                  new String [] {
                        "Order ID", "purChasedId", "Total"
                  }
            ));
            orderTable.setFocusable(false);
            orderTable.setSelectionBackground(new java.awt.Color(232, 57, 95));
            orderTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
            orderTable.setShowGrid(true);
            orderTable.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(orderTable);

            jScrollPane2.setViewportView(jScrollPane1);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(295, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 236, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents
*/
      public static void main(String args[]) {

        CustomQueue<Order> orderQueue = new CustomQueue<>(10); // Assuming a capacity of 10 for the queue
        // Create an instance of GUI_Customer_Side or wherever the orderQueue is being managed
        GUI_Customer_Side customerGUI = new GUI_Customer_Side();
        customerGUI.setOrderQueue(orderQueue); // Set the order queue

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order_History(orderQueue).setVisible(true);
            }
        });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JTable orderTable;
      // End of variables declaration//GEN-END:variables
}
