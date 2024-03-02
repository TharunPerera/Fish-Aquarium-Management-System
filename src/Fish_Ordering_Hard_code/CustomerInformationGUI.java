package Fish_Ordering_Hard_code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerInformationGUI extends JFrame {

    // GUI components
    private JTextField firstNameField, lastNameField, telephoneNumberField, emailField;
    private JCheckBox[] fishCheckBoxes;
    private JSpinner[] quantitySpinners;
    private JButton confirmButton;
    private JButton orderHistoryButton;

    // Additional GUI components
    private JButton btn_exsit;
    private JButton btn_reset;

    // Queue to hold orders
    private CustomQueue<Order> orderQueue;

    // Prices for each fish type (assuming 15 fish types)
    private double[] fishPrices = {10.0, 15.0, 20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0};

    // Constructor
    public CustomerInformationGUI() {
        setTitle("Customer Information");
        setSize(800, 600); // Adjusted size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for customer information
        JPanel customerInfoPanel = new JPanel(new GridBagLayout());
        customerInfoPanel.setBorder(BorderFactory.createTitledBorder("Customer Information"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10); // Increased insets for spacing

        // Adding fields for customer information
        customerInfoPanel.add(new JLabel("First Name:"), gbc);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        firstNameField = new JTextField(20);
        firstNameField.setPreferredSize(new Dimension(150, 25)); // Set preferred size
        customerInfoPanel.add(firstNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.weightx = 0.0;
        gbc.fill = GridBagConstraints.NONE;
        customerInfoPanel.add(new JLabel("Last Name:"), gbc);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        lastNameField = new JTextField(20);
        lastNameField.setPreferredSize(new Dimension(150, 25)); // Set preferred size
        customerInfoPanel.add(lastNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.weightx = 0.0;
        gbc.fill = GridBagConstraints.NONE;
        customerInfoPanel.add(new JLabel("Telephone Number:"), gbc);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        telephoneNumberField = new JTextField(20);
        telephoneNumberField.setPreferredSize(new Dimension(150, 25)); // Set preferred size
        customerInfoPanel.add(telephoneNumberField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.weightx = 0.0;
        gbc.fill = GridBagConstraints.NONE;
        customerInfoPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        emailField = new JTextField(20);
        emailField.setPreferredSize(new Dimension(150, 25)); // Set preferred size
        customerInfoPanel.add(emailField, gbc);

        add(customerInfoPanel, BorderLayout.NORTH);

        // Panel for fish selection
        JPanel fishSelectionPanel = new JPanel(new GridLayout(0, 2));
        fishSelectionPanel.setBorder(BorderFactory.createTitledBorder("Fish Selection"));

        // Adding checkboxes and spinners for fish selection
        fishCheckBoxes = new JCheckBox[15]; // Assuming there are 15 fish types
        quantitySpinners = new JSpinner[15]; // Spinners for quantity input

        for (int i = 0; i < fishCheckBoxes.length; i++) {
            fishCheckBoxes[i] = new JCheckBox("Fish Type " + (i + 1));
            fishSelectionPanel.add(fishCheckBoxes[i]);

            SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1); // Initial value, min value, max value, step
            quantitySpinners[i] = new JSpinner(spinnerModel);
            fishSelectionPanel.add(quantitySpinners[i]);
        }

        add(fishSelectionPanel, BorderLayout.CENTER);

        // Add Order History button
        orderHistoryButton = new JButton("Order History");
        orderHistoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open Order History GUI
                if (orderQueue != null) {
                    OrderHistoryGUI orderHistoryGUI = new OrderHistoryGUI(orderQueue);
                    orderHistoryGUI.populateTableModel();
                    orderHistoryGUI.setVisible(true); // Show the OrderHistoryGUI
                } else {
                    System.out.println("Order queue is not set.");
                }
            }
        });
        add(orderHistoryButton, BorderLayout.EAST);

        // Confirm Order button
        confirmButton = new JButton("Confirm Order");
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get customer information
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String telephoneNumber = telephoneNumberField.getText();
                String email = emailField.getText();

                // Build a string with selected fish types and quantities, and calculate total cost
                StringBuilder selectedFish = new StringBuilder();
                double totalCost = 0.0;
                for (int i = 0; i < fishCheckBoxes.length; i++) {
                    if (fishCheckBoxes[i].isSelected()) {
                        int quantity = (int) quantitySpinners[i].getValue();
                        double fishPrice = fishPrices[i];
                        selectedFish.append("Fish Type ").append(i + 1).append(": ").append(quantity).append(" ");
                        totalCost += fishPrice * quantity;
                    }
                }

                // Print customer information and order details
                System.out.println("Customer Information: ");
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Telephone Number: " + telephoneNumber);
                System.out.println("Email: " + email);
                System.out.println("Selected Fish Types and Quantities: " + selectedFish.toString());
                System.out.println("Total Cost: $" + totalCost);

                // Logic to finalize the order (enqueue into order queue, generate order ID, etc.)
                finalizeOrder(totalCost, telephoneNumber);
            }
        });
        add(confirmButton, BorderLayout.SOUTH);

        // Additional GUI components
        btn_exsit = new JButton("Exit");
        btn_reset = new JButton("Reset");

        // Add action listeners for exit and reset buttons
        btn_exsit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btn_reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear all fields and reset checkboxes and spinners
                firstNameField.setText("");
                lastNameField.setText("");
                telephoneNumberField.setText("");
                emailField.setText("");
                for (JCheckBox checkBox : fishCheckBoxes) {
                    checkBox.setSelected(false);
                }
                for (JSpinner spinner : quantitySpinners) {
                    spinner.setValue(0);
                }
            }
        });

        // Create JPanel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(confirmButton);
        buttonPanel.add(orderHistoryButton);
        buttonPanel.add(btn_reset);
        buttonPanel.add(btn_exsit);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Method to finalize an order
    private void finalizeOrder(double totalCost, String customerTelephone) {
        // Logic to finalize the order (enqueue into order queue, generate order ID, etc.)
        // This part will be implemented in your application
        // For demonstration, printing the order details
        System.out.println("Order Finalized: Total Cost: $" + totalCost + ", Customer Telephone: " + customerTelephone);

        // Add this line to update the order history table
        if (orderQueue != null) {
            orderQueue.enqueue(new Order(totalCost, customerTelephone));
        }
    }

    // Method to set the order queue
    public void setOrderQueue(CustomQueue<Order> orderQueue) {
        this.orderQueue = orderQueue;
    }

    // Main method
    public static void main(String[] args) {
        CustomQueue<Order> orderQueue = new CustomQueue<>(10); // Assuming a capacity of 10 for the queue
        CustomerInformationGUI customerInformationGUI = new CustomerInformationGUI();
        customerInformationGUI.setOrderQueue(orderQueue); // Set the order queue
    }
}