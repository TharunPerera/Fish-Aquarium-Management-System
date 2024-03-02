package new_project;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import new_project.GUI_Customer_Side;

import new_project.Order_History;

public class GUI extends javax.swing.JFrame {
      private CustomQueue<Order> orderQueue;

      private FishLinkedList inventory;
      private DefaultTableModel tableModel;

      public GUI() {
            initComponents();
            inventory = new FishLinkedList();
            populateDefaultEntries(); // Call method to populate default entries
            setupTableModel(); // Initialize tableModel and populate with default entries
            setVisible(true); // Make the GUI visible after setting up the table            
      }

      // Method to setup table model
      private void setupTableModel() {
            tableModel = new DefaultTableModel(); // Initialize tableModel
            jTable1.setModel(tableModel); // Set tableModel to the JTable

            // Add column headers
            tableModel.addColumn("Species");
            tableModel.addColumn("Size");
            tableModel.addColumn("Price");

            // Add default entries to the table model
            for (FishNode current = inventory.getHead(); current != null; current = current.next) {
                  Fish fish = current.data;
                  tableModel.addRow(new Object[]{fish.getSpecies(), fish.getSize(), fish.getPrice()});
            }
      }

      // Method to populate default entries
      private void populateDefaultEntries() {
            // Add default fish entries to the inventory
            inventory.addFish(new Fish("Rock gold Fish", 10, 3.0));
            inventory.addFish(new Fish("Yellow Butterfly Fish", 8, 4.0));
            inventory.addFish(new Fish("Red terpon fish", 12, 5.0));
            inventory.addFish(new Fish("Clown Fish", 7, 6.0));
            inventory.addFish(new Fish("Ruvul Fish", 11, 7.0));
            inventory.addFish(new Fish("Electric blue Fish", 6, 8.0));
            inventory.addFish(new Fish("Lion Fish", 8, 9.0));
            inventory.addFish(new Fish("Fariy blastfelt Fish", 13, 10.0));
            inventory.addFish(new Fish("Stingray Fish", 9, 11.0));
            inventory.addFish(new Fish(" Butterfly Fish", 10, 12.0));
            inventory.addFish(new Fish("Discus Fish", 12, 13.0));

      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            speciesTextField = new javax.swing.JTextField();
            sizeTextField = new javax.swing.JTextField();
            priceTextField = new javax.swing.JTextField();
            addButton = new javax.swing.JButton();
            jPanel4 = new javax.swing.JPanel();
            jLabel10 = new javax.swing.JLabel();
            jLabel11 = new javax.swing.JLabel();
            indexTextFieldD = new javax.swing.JTextField();
            deleteButton = new javax.swing.JButton();
            jPanel5 = new javax.swing.JPanel();
            jLabel12 = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            jLabel15 = new javax.swing.JLabel();
            speciesTextFieldU = new javax.swing.JTextField();
            sizeTextFieldU = new javax.swing.JTextField();
            priceTextFieldU = new javax.swing.JTextField();
            jLabel6 = new javax.swing.JLabel();
            modifyButton = new javax.swing.JButton();
            indexTextFieldU = new javax.swing.JTextField();
            jPanel6 = new javax.swing.JPanel();
            exitButton = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            jPanel7 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTable1 = new javax.swing.JTable();
            jLabel1 = new javax.swing.JLabel();
            sortBySpeciesComboBox = new javax.swing.JComboBox<>();
            jLabel3 = new javax.swing.JLabel();
            sortBySizeComboBox1 = new javax.swing.JComboBox<>();
            jLabel2 = new javax.swing.JLabel();
            sortByPriceComboBox1 = new javax.swing.JComboBox<>();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setForeground(new java.awt.Color(0, 0, 0));

            jLabel4.setBackground(new java.awt.Color(204, 204, 255));
            jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setText("        Add Fish Variety");

            jLabel7.setBackground(new java.awt.Color(255, 255, 255));
            jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(0, 0, 0));
            jLabel7.setText("Enter fish variety Name");

            jLabel8.setBackground(new java.awt.Color(255, 255, 255));
            jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(0, 0, 0));
            jLabel8.setText("Enter veriety  fish Price");

            jLabel9.setBackground(new java.awt.Color(255, 255, 255));
            jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(0, 0, 0));
            jLabel9.setText("Enter fish  variety Size");

            addButton.setBackground(new java.awt.Color(51, 255, 51));
            addButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            addButton.setForeground(new java.awt.Color(0, 0, 0));
            addButton.setText("Add  ");
            addButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        addButtonActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(jLabel8)
                                          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(priceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                          .addComponent(speciesTextField)
                                          .addComponent(sizeTextField))))
                        .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(addButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel7)
                              .addComponent(speciesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(sizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel8)
                              .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
            );

            jLabel10.setBackground(new java.awt.Color(204, 204, 255));
            jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(0, 0, 0));
            jLabel10.setText("       Delete Fish Variety ");

            jLabel11.setBackground(new java.awt.Color(255, 255, 255));
            jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(0, 0, 0));
            jLabel11.setText("Enter fish variety Index");

            deleteButton.setBackground(new java.awt.Color(51, 255, 51));
            deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            deleteButton.setForeground(new java.awt.Color(0, 0, 0));
            deleteButton.setText("Delete");
            deleteButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        deleteButtonActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6))
                              .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(indexTextFieldD, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))))
            );
            jPanel4Layout.setVerticalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(deleteButton))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel11)
                              .addComponent(indexTextFieldD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(114, Short.MAX_VALUE))
            );

            jLabel12.setBackground(new java.awt.Color(204, 204, 255));
            jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(0, 0, 0));
            jLabel12.setText("       Update Fish Variety");

            jLabel13.setBackground(new java.awt.Color(255, 255, 255));
            jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel13.setForeground(new java.awt.Color(0, 0, 0));
            jLabel13.setText("Enter fish variety Name");

            jLabel14.setBackground(new java.awt.Color(255, 255, 255));
            jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel14.setForeground(new java.awt.Color(0, 0, 0));
            jLabel14.setText("Enter veriety  fish Price");

            jLabel15.setBackground(new java.awt.Color(255, 255, 255));
            jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel15.setForeground(new java.awt.Color(0, 0, 0));
            jLabel15.setText("Enter fish  variety Size");

            jLabel6.setBackground(new java.awt.Color(255, 255, 255));
            jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 0, 0));
            jLabel6.setText("ENter fish variety index ");

            modifyButton.setBackground(new java.awt.Color(51, 255, 51));
            modifyButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            modifyButton.setForeground(new java.awt.Color(0, 0, 0));
            modifyButton.setText("Update ");
            modifyButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        modifyButtonActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(modifyButton)
                                    .addGap(13, 13, 13))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                          .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(indexTextFieldU, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                          .addComponent(speciesTextFieldU)
                                          .addComponent(sizeTextFieldU)
                                          .addComponent(priceTextFieldU))))
                        .addContainerGap())
            );
            jPanel5Layout.setVerticalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(modifyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel6)
                              .addComponent(indexTextFieldU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel13)
                              .addComponent(speciesTextFieldU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel15)
                              .addComponent(sizeTextFieldU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel14)
                              .addComponent(priceTextFieldU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
            );

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel6Layout.setVerticalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 433, Short.MAX_VALUE)
            );

            exitButton.setBackground(new java.awt.Color(255, 51, 51));
            exitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            exitButton.setForeground(new java.awt.Color(0, 0, 0));
            exitButton.setText("Exsit");
            exitButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        exitButtonActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 100, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 100, Short.MAX_VALUE)
            );

            jPanel7.setBackground(new java.awt.Color(204, 204, 204));
            jPanel7.setForeground(new java.awt.Color(0, 0, 0));

            jTable1.setBackground(new java.awt.Color(204, 204, 204));
            jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jTable1.setForeground(new java.awt.Color(0, 0, 0));
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                  },
                  new String [] {
                        "Species", "Size", "Price"
                  }
            ));
            jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
                  public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                        jTable1AncestorAdded(evt);
                  }
                  public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                  }
                  public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                  }
            });
            jScrollPane1.setViewportView(jTable1);

            jLabel1.setBackground(new java.awt.Color(102, 102, 255));
            jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setText("Sort by Species  :-");

            sortBySpeciesComboBox.setBackground(new java.awt.Color(255, 255, 255));
            sortBySpeciesComboBox.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            sortBySpeciesComboBox.setForeground(new java.awt.Color(0, 0, 0));
            sortBySpeciesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A to Z", "Z to A" }));
            sortBySpeciesComboBox.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        sortBySpeciesComboBoxActionPerformed(evt);
                  }
            });

            jLabel3.setBackground(new java.awt.Color(102, 102, 255));
            jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setText("Sort by price      :-");

            sortBySizeComboBox1.setBackground(new java.awt.Color(255, 255, 255));
            sortBySizeComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            sortBySizeComboBox1.setForeground(new java.awt.Color(0, 0, 0));
            sortBySizeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Max to Min ", "Min to Max" }));
            sortBySizeComboBox1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        sortBySizeComboBox1ActionPerformed(evt);
                  }
            });

            jLabel2.setBackground(new java.awt.Color(102, 102, 255));
            jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setText("Sort by Size       :-");

            sortByPriceComboBox1.setBackground(new java.awt.Color(255, 255, 255));
            sortByPriceComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            sortByPriceComboBox1.setForeground(new java.awt.Color(0, 0, 0));
            sortByPriceComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Max to Min", "Min to Max", " ", " " }));
            sortByPriceComboBox1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        sortByPriceComboBox1ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
            jPanel7.setLayout(jPanel7Layout);
            jPanel7Layout.setHorizontalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sortBySpeciesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(sortByPriceComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(sortBySizeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel7Layout.setVerticalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel1)
                              .addComponent(sortBySpeciesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel3)
                              .addComponent(sortByPriceComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(sortBySizeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(403, 403, 403)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
            String species = speciesTextField.getText().trim();
            String sizeText = sizeTextField.getText().trim();
            String priceText = priceTextField.getText().trim();
            if (species.isEmpty()) {
                  JOptionPane.showMessageDialog(null, "Species is required", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            if (sizeText.isEmpty()) {
                  JOptionPane.showMessageDialog(null, "Size of the fish is required", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            if (priceText.isEmpty()) {
                  JOptionPane.showMessageDialog(null, "Price of the fish is required", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            int size = 0;
            try {
                  size = Integer.parseInt(sizeText);
                  if (size <= 0) {
                        JOptionPane.showMessageDialog(null, "Size must be a positive integer", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                  }
            } catch (NumberFormatException e) {
                  JOptionPane.showMessageDialog(null, "Size must be a valid integer", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }
            double price = 0.0;
            try {
                  price = Double.parseDouble(priceText);
                  if (price <= 0) {
                        JOptionPane.showMessageDialog(null, "Price must be a positive number", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                  }
            } catch (NumberFormatException e) {
                  JOptionPane.showMessageDialog(null, "Price must be a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }
            Fish fish = new Fish(species, size, price);
            inventory.addFish(fish);
            tableModel.addRow(new Object[]{species, size, price});
            JOptionPane.showMessageDialog(null, "Fish added to inventory:\n" + fish);
            speciesTextField.setText("");
            sizeTextField.setText("");
            priceTextField.setText("");
      }//GEN-LAST:event_addButtonActionPerformed

      private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
            String indexText = indexTextFieldD.getText().trim();
            if (indexText.isEmpty()) {
                  JOptionPane.showMessageDialog(null, "Index is required", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            int index = 0;
            try {
                  index = Integer.parseInt(indexText);
                  if (index < 0 || index >= tableModel.getRowCount()) {
                        JOptionPane.showMessageDialog(null, "Index must be positive number", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                  }
            } catch (NumberFormatException e) {
                  JOptionPane.showMessageDialog(null, "Please enter a valid index", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            inventory.deleteFish(index);
            tableModel.removeRow(index);
            JOptionPane.showMessageDialog(null, "Fish at index " + index + " deleted from inventory");
            indexTextFieldD.setText("");
      }//GEN-LAST:event_deleteButtonActionPerformed

      private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
            String indexText = indexTextFieldU.getText().trim();
            if (indexText.isEmpty()) {
                  JOptionPane.showMessageDialog(this, "Index is required.", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            int index;
            try {
                  index = Integer.parseInt(indexText);
                  if (index < 0 || index >= tableModel.getRowCount()) {
                        throw new NumberFormatException();
                  }
            } catch (NumberFormatException e) {
                  JOptionPane.showMessageDialog(this, "Please enter a valid index.", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            String species = speciesTextFieldU.getText().trim();
            if (species.isEmpty()) {
                  JOptionPane.showMessageDialog(this, "Species is required.", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            String sizeText = sizeTextFieldU.getText().trim();
            if (sizeText.isEmpty()) {
                  JOptionPane.showMessageDialog(this, "Size is required.", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            int size;
            try {
                  size = Integer.parseInt(sizeText);
            } catch (NumberFormatException e) {
                  JOptionPane.showMessageDialog(this, "Please enter a valid numeric value for size.", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            String priceText = priceTextFieldU.getText().trim();
            if (priceText.isEmpty()) {
                  JOptionPane.showMessageDialog(this, "Price is required.", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            double price;
            try {
                  price = Double.parseDouble(priceText);
            } catch (NumberFormatException e) {
                  JOptionPane.showMessageDialog(this, "Please enter a valid numeric value for price.", "Error", JOptionPane.ERROR_MESSAGE);
                  return;
            }

            Fish newFish = new Fish(species, size, price);
            inventory.modifyFish(index, newFish);
            tableModel.setValueAt(species, index, 0); // Update species
            tableModel.setValueAt(size, index, 1);    // Update size
            tableModel.setValueAt(price, index, 2);   // Update price
            JOptionPane.showMessageDialog(null, "Fish at index " + index + " modified in inventory:\n" + newFish);
            indexTextFieldU.setText("");
            speciesTextFieldU.setText("");
            sizeTextFieldU.setText("");
            priceTextFieldU.setText("");
      }//GEN-LAST:event_modifyButtonActionPerformed

      private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
            System.exit(0);
      }//GEN-LAST:event_exitButtonActionPerformed

      private void sortBySpeciesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBySpeciesComboBoxActionPerformed
            String sortBy = (String) sortBySpeciesComboBox.getSelectedItem();
            boolean reverse = sortBy.equals("Z to A");
            inventory.sortLinkedListBySpecies(reverse);
            updateTableWithInventoryData();
      }//GEN-LAST:event_sortBySpeciesComboBoxActionPerformed

      private void sortByPriceComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByPriceComboBox1ActionPerformed
            String sortBy = (String) sortByPriceComboBox1.getSelectedItem();
            boolean minToMax = sortBy.equals("Min to Max");
            inventory.sortLinkedListByPrice(minToMax);
            updateTableWithInventoryData();


      }//GEN-LAST:event_sortByPriceComboBox1ActionPerformed

      private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
            // TODO add your handling code here:\

      }//GEN-LAST:event_jTable1AncestorAdded

      private void sortBySizeComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBySizeComboBox1ActionPerformed
            String sortBy = (String) sortBySizeComboBox1.getSelectedItem();
            boolean minToMax = sortBy.equals("Min to Max");
            inventory.sortLinkedListBySize(minToMax);
            updateTableWithInventoryData();
      }//GEN-LAST:event_sortBySizeComboBox1ActionPerformed
 public void setOrderQueue(CustomQueue<Order> orderQueue) {
            this.orderQueue = orderQueue;
      }
      private void updateTableWithInventoryData() {
            // Clear existing rows
            tableModel.setRowCount(0);

            // Retrieve updated inventory data and add it to the table model
            FishNode current = inventory.getHead();
            while (current != null) {
                  Fish fish = current.data;
                  // Add row to the JTable
                  tableModel.addRow(new Object[]{fish.getSpecies(), fish.getSize(), fish.getPrice()});
                  // Move to the next node
                  current = current.next;
            }
      }

      public static void main(String args[]) {

            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new GUI().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton addButton;
      private javax.swing.JButton deleteButton;
      private javax.swing.JButton exitButton;
      private javax.swing.JTextField indexTextFieldD;
      private javax.swing.JTextField indexTextFieldU;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel13;
      private javax.swing.JLabel jLabel14;
      private javax.swing.JLabel jLabel15;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel jPanel4;
      private javax.swing.JPanel jPanel5;
      private javax.swing.JPanel jPanel6;
      private javax.swing.JPanel jPanel7;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JTable jTable1;
      private javax.swing.JButton modifyButton;
      private javax.swing.JTextField priceTextField;
      private javax.swing.JTextField priceTextFieldU;
      private javax.swing.JTextField sizeTextField;
      private javax.swing.JTextField sizeTextFieldU;
      private javax.swing.JComboBox<String> sortByPriceComboBox1;
      private javax.swing.JComboBox<String> sortBySizeComboBox1;
      private javax.swing.JComboBox<String> sortBySpeciesComboBox;
      private javax.swing.JTextField speciesTextField;
      private javax.swing.JTextField speciesTextFieldU;
      // End of variables declaration//GEN-END:variables
}
