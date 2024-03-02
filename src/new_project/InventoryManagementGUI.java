package new_project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class InventoryManagementGUI {

    private final FishLinkedList inventory;
    private final JFrame frame;

    public InventoryManagementGUI() {
        inventory = new FishLinkedList();
        populateDefaultEntries();

        frame = new JFrame("Fish Inventory Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Increased size
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50)); // FlowLayout with center alignment and increased vertical gap

        // Initialize UI components with increased button size
        JButton addButton = new JButton("Add Fish");
        customizeButton(addButton);
        addButton.addActionListener(e -> addFishToInventory());
        JButton deleteButton = new JButton("Delete Fish");
        customizeButton(deleteButton);
        deleteButton.addActionListener(e -> deleteFishFromInventory());
        JButton modifyButton = new JButton("Modify Fish");
        customizeButton(modifyButton);
        modifyButton.addActionListener(e -> modifyFishInInventory());
        JButton displayButton = new JButton("Display Inventory");
        customizeButton(displayButton);
        displayButton.addActionListener(e -> displayInventory());
        JButton sortBySpeciesButton = new JButton("Sort by Species");
        customizeButton(sortBySpeciesButton);
        sortBySpeciesButton.addActionListener(e -> sortInventoryBySpecies());
        JButton sortBySizeButton = new JButton("Sort by Size");
        customizeButton(sortBySizeButton);
        sortBySizeButton.addActionListener(e -> sortInventoryBySize());
        JButton sortByPriceButton = new JButton("Sort by Price");
        customizeButton(sortByPriceButton);
        sortByPriceButton.addActionListener(e -> sortInventoryByPrice());
        JButton exitButton = new JButton("Exit");
        customizeButton(exitButton);
        exitButton.addActionListener(e -> System.exit(0));

        frame.add(addButton);
        frame.add(deleteButton);
        frame.add(modifyButton);
        frame.add(displayButton);
        frame.add(sortBySpeciesButton);
        frame.add(sortBySizeButton);
        frame.add(sortByPriceButton);
        frame.add(exitButton);
    }

    private void customizeButton(JButton button) {
        button.setBackground(new Color(0, 128, 0)); // Set button color to green
        button.setForeground(Color.WHITE); // White text color
        button.setFont(new Font("Arial", Font.BOLD, 18)); // Adjust font size
        button.setPreferredSize(new Dimension(250, 80)); // Increase button size
        button.setFocusPainted(false); // Remove focus border
        button.setBorder(BorderFactory.createEmptyBorder(15, 30, 15, 30)); // Add padding to the button text
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(34, 139, 34)); // Dark green when mouse enters
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(0, 128, 0)); // Original color when mouse exits
            }
        });
    }
    private void populateDefaultEntries() {
        String[][] defaultEntries = {{"Salmon", "10", "20.0"}, {"Trout", "8", "15.0"}, {"Tuna", "12", "25.0"},
                {"Bass", "7", "22.0"}, {"Mackerel", "11", "17.5"}, {"Perch", "6", "14.0"}, {"Haddock", "8", "20.0"},
                {"Swordfish", "13", "30.0"}, {"Snapper", "9", "25.0"}, {"Catfish", "10", "19.0"}, {"Halibut", "12", "28.0"}};
        for (String[] entry : defaultEntries)
            inventory.addFish(new Fish(entry[0], Integer.parseInt(entry[1]), Double.parseDouble(entry[2])));
    }

    public void addFishToInventory() {
        String[] input = {"Enter fish species:", "Enter fish size:", "Enter fish price:"};
        Fish fish = new Fish(JOptionPane.showInputDialog(input[0]), Integer.parseInt(JOptionPane.showInputDialog(input[1])),
                Double.parseDouble(JOptionPane.showInputDialog(input[2])));
        inventory.addFish(fish);
        JOptionPane.showMessageDialog(null, "Fish added to inventory:\n" + fish);
    }

    public void deleteFishFromInventory() {
        int index = Integer.parseInt(JOptionPane.showInputDialog("Enter index of fish to delete:"));
        inventory.deleteFish(index);
        JOptionPane.showMessageDialog(null, "Fish at index " + index + " deleted from inventory.");
    }

    public void modifyFishInInventory() {
        int index = Integer.parseInt(JOptionPane.showInputDialog("Enter index of fish to modify:"));
        String[] input = {"Enter new fish species:", "Enter new fish size:", "Enter new fish price:"};
        Fish newFish = new Fish(JOptionPane.showInputDialog(input[0]), Integer.parseInt(JOptionPane.showInputDialog(input[1])),
                Double.parseDouble(JOptionPane.showInputDialog(input[2])));
        inventory.modifyFish(index, newFish);
        JOptionPane.showMessageDialog(null, "Fish at index " + index + " modified in inventory:\n" + newFish);
    }

  public void displayInventory() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Species");
    model.addColumn("Size");
    model.addColumn("Price");

    for (FishNode current = inventory.getHead(); current != null; current = current.next) {
        Fish fish = current.data;
        model.addRow(new Object[]{fish.getSpecies(), fish.getSize(), fish.getPrice()});
    }

    JTable table = new JTable(model);
    table.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font size
    table.setRowHeight(30); // Adjust row height

    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setPreferredSize(new Dimension(600, 400)); // Set preferred size for the scroll pane

    JOptionPane.showMessageDialog(null, scrollPane, "Fish Inventory", JOptionPane.PLAIN_MESSAGE);
}

    public void sortInventoryBySpecies() {
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"A to Z", "Z to A"});
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Select sorting order:"));
        panel.add(comboBox);
        if (JOptionPane.showConfirmDialog(null, panel, "Sort by Species", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            boolean reverse = ((String) comboBox.getSelectedItem()).equals("Z to A");
            inventory.sortLinkedListBySpecies(reverse);
            JOptionPane.showMessageDialog(null, "Inventory sorted by species (" + (reverse ? "Z to A" : "A to Z") + ").");
            displayInventory();
        }
    }

    public void sortInventoryBySize() {
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Min to Max", "Max to Min"});
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Select sorting order:"));
        panel.add(comboBox);
        if (JOptionPane.showConfirmDialog(null, panel, "Sort by Size", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            boolean minToMax = ((String) comboBox.getSelectedItem()).equals("Min to Max");
            inventory.sortLinkedListBySize(minToMax);
            JOptionPane.showMessageDialog(null, "Inventory sorted by size (" + ((minToMax) ? "Min to Max" : "Max to Min") + ").");
            displayInventory();
        }
    }

    public void sortInventoryByPrice() {
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Min to Max", "Max to Min"});
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Select sorting order:"));
        panel.add(comboBox);
        if (JOptionPane.showConfirmDialog(null, panel, "Sort by Price", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            boolean minToMax = ((String) comboBox.getSelectedItem()).equals("Min to Max");
            inventory.sortLinkedListByPrice(minToMax);
            JOptionPane.showMessageDialog(null, "Inventory sorted by price (" + ((minToMax) ? "Min to Max" : "Max to Min") + ").");
            displayInventory();
        }
    }

    public static void main(String[] args) {
    // Create and show the GUI
    SwingUtilities.invokeLater(() -> {
        InventoryManagementGUI gui = new InventoryManagementGUI();
        gui.frame.setVisible(true); // Make the frame visible
    });
}

}
