package new_project;

import java.awt.Image;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import new_project.GUI;

public class GUI_Customer_Side extends javax.swing.JFrame {

      private double total = 0.0;
      private int x = 0;
      private double tax = 0.0;
      // Queue to hold orders
      private CustomQueue<Order> orderQueue;

      public GUI_Customer_Side() {
            initComponents();
            init();
      }

      public void init() {
            setImage();
            setTime();
      }
      

      public void setImage() {
            ImageIcon icon1 = new ImageIcon(getClass().getResource("/image/img1.jpg"));
            ImageIcon icon2 = new ImageIcon(getClass().getResource("/image/img2.jpg"));
            ImageIcon icon3 = new ImageIcon(getClass().getResource("/image/img3.jpg"));
            ImageIcon icon4 = new ImageIcon(getClass().getResource("/image/img4.jpg"));
            ImageIcon icon5 = new ImageIcon(getClass().getResource("/image/img5.jpg"));
            ImageIcon icon6 = new ImageIcon(getClass().getResource("/image/img6.jpg"));
            ImageIcon icon7 = new ImageIcon(getClass().getResource("/image/img7.jpg"));
            ImageIcon icon8 = new ImageIcon(getClass().getResource("/image/img8.jpg"));
            ImageIcon icon9 = new ImageIcon(getClass().getResource("/image/img9.jpg"));
            ImageIcon icon10 = new ImageIcon(getClass().getResource("/image/img10.jpg"));
            ImageIcon icon11 = new ImageIcon(getClass().getResource("/image/img11.jpg"));
            ImageIcon icon12 = new ImageIcon(getClass().getResource("/image/img12.jpg"));
            ImageIcon icon13 = new ImageIcon(getClass().getResource("/image/img13.jpg"));
            ImageIcon icon14 = new ImageIcon(getClass().getResource("/image/img14.jpg"));
            ImageIcon icon15 = new ImageIcon(getClass().getResource("/image/img15.jpg"));

            Image img1 = icon1.getImage().getScaledInstance(jLabelimage1.getWidth(), jLabelimage1.getHeight(), Image.SCALE_SMOOTH);
            Image img2 = icon2.getImage().getScaledInstance(jLabelimage2.getWidth(), jLabelimage2.getHeight(), Image.SCALE_SMOOTH);
            Image img3 = icon3.getImage().getScaledInstance(jLabelimage3.getWidth(), jLabelimage3.getHeight(), Image.SCALE_SMOOTH);
            Image img4 = icon4.getImage().getScaledInstance(jLabelimage4.getWidth(), jLabelimage4.getHeight(), Image.SCALE_SMOOTH);
            Image img5 = icon5.getImage().getScaledInstance(jLabelimage5.getWidth(), jLabelimage5.getHeight(), Image.SCALE_SMOOTH);
            Image img6 = icon6.getImage().getScaledInstance(jLabelimage6.getWidth(), jLabelimage6.getHeight(), Image.SCALE_SMOOTH);
            Image img7 = icon7.getImage().getScaledInstance(jLabelimage7.getWidth(), jLabelimage7.getHeight(), Image.SCALE_SMOOTH);
            Image img8 = icon8.getImage().getScaledInstance(jLabelimage8.getWidth(), jLabelimage8.getHeight(), Image.SCALE_SMOOTH);
            Image img9 = icon9.getImage().getScaledInstance(jLabelimage9.getWidth(), jLabelimage9.getHeight(), Image.SCALE_SMOOTH);
            Image img10 = icon10.getImage().getScaledInstance(jLabelimage10.getWidth(), jLabelimage10.getHeight(), Image.SCALE_SMOOTH);
            Image img11 = icon11.getImage().getScaledInstance(jLabelimage11.getWidth(), jLabelimage11.getHeight(), Image.SCALE_SMOOTH);
            Image img12 = icon12.getImage().getScaledInstance(jLabelimage12.getWidth(), jLabelimage12.getHeight(), Image.SCALE_SMOOTH);
            Image img13 = icon13.getImage().getScaledInstance(jLabelimage13.getWidth(), jLabelimage13.getHeight(), Image.SCALE_SMOOTH);
            Image img14 = icon14.getImage().getScaledInstance(jLabelimage14.getWidth(), jLabelimage14.getHeight(), Image.SCALE_SMOOTH);
            Image img15 = icon15.getImage().getScaledInstance(jLabelimage15.getWidth(), jLabelimage15.getHeight(), Image.SCALE_SMOOTH);

            jLabelimage1.setIcon(new ImageIcon(img1));
            jLabelimage2.setIcon(new ImageIcon(img2));
            jLabelimage3.setIcon(new ImageIcon(img3));
            jLabelimage4.setIcon(new ImageIcon(img4));
            jLabelimage5.setIcon(new ImageIcon(img5));
            jLabelimage6.setIcon(new ImageIcon(img6));
            jLabelimage7.setIcon(new ImageIcon(img7));
            jLabelimage8.setIcon(new ImageIcon(img8));
            jLabelimage9.setIcon(new ImageIcon(img9));
            jLabelimage10.setIcon(new ImageIcon(img10));
            jLabelimage11.setIcon(new ImageIcon(img11));
            jLabelimage12.setIcon(new ImageIcon(img12));
            jLabelimage13.setIcon(new ImageIcon(img13));
            jLabelimage14.setIcon(new ImageIcon(img14));
            jLabelimage15.setIcon(new ImageIcon(img15));

      }

      public void reset() {
            total = 0.0;
            x = 0;
            tax = 0.0;
            btnTotal.setEnabled(true);
            quantitySpinners1.setValue(0);
            quantitySpinners1.setValue(0);
            quantitySpinners2.setValue(0);
            quantitySpinners3.setValue(0);
            quantitySpinners4.setValue(0);
            quantitySpinners5.setValue(0);
            quantitySpinners7.setValue(0);
            quantitySpinners6.setValue(0);
            quantitySpinners8.setValue(0);
            quantitySpinners9.setValue(0);
            quantitySpinners10.setValue(0);
            quantitySpinners11.setValue(0);
            quantitySpinners12.setValue(0);
            quantitySpinners13.setValue(0);
            quantitySpinners14.setValue(0);
            jTextFieldTax.setText("0.0");
            jTextFieldSubTotal.setText("0.0");
            jTextFieldTotal.setText("0.0");
            jTextArea.setText("");
            fishCheckBoxes1.setSelected(false);
            fishCheckBoxes2.setSelected(false);
            fishCheckBoxes3.setSelected(false);
            fishCheckBoxes4.setSelected(false);
            fishCheckBoxes5.setSelected(false);
            fishCheckBoxes6.setSelected(false);
            fishCheckBoxes7.setSelected(false);
            fishCheckBoxes8.setSelected(false);
            fishCheckBoxes9.setSelected(false);
            fishCheckBoxes10.setSelected(false);
            fishCheckBoxes11.setSelected(false);
            fishCheckBoxes12.setSelected(false);
            fishCheckBoxes13.setSelected(false);
            fishCheckBoxes14.setSelected(false);
            fishCheckBoxes15.setSelected(false);

      }

      public void dudate() {
            jTextFieldTax.setText(String.valueOf(tax));
            jTextFieldSubTotal.setText(String.valueOf(total));
            jTextFieldTotal.setText(String.valueOf(total + tax));

      }

      public boolean qtyIsZero(int qty) {
            if (qty == 0) {
                  JOptionPane.showMessageDialog(null, "Please increse the item quntity");
                  return false;
            }
            return true;
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jPanel2 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jTxTime = new javax.swing.JLabel();
            jTxtDate = new javax.swing.JLabel();
            jPanel3 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jPanel5 = new javax.swing.JPanel();
            jLabelimage1 = new javax.swing.JLabel();
            jLabel11 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            fihsname1 = new javax.swing.JLabel();
            jLabel15 = new javax.swing.JLabel();
            quantitySpinners1 = new javax.swing.JSpinner();
            fishCheckBoxes1 = new javax.swing.JCheckBox();
            jPanel6 = new javax.swing.JPanel();
            jLabelimage2 = new javax.swing.JLabel();
            jLabel17 = new javax.swing.JLabel();
            jLabel18 = new javax.swing.JLabel();
            jLabel19 = new javax.swing.JLabel();
            fihsname2 = new javax.swing.JLabel();
            jLabel21 = new javax.swing.JLabel();
            quantitySpinners2 = new javax.swing.JSpinner();
            fishCheckBoxes2 = new javax.swing.JCheckBox();
            jPanel7 = new javax.swing.JPanel();
            jLabelimage3 = new javax.swing.JLabel();
            jLabel23 = new javax.swing.JLabel();
            jLabel24 = new javax.swing.JLabel();
            jLabel25 = new javax.swing.JLabel();
            fihsname3 = new javax.swing.JLabel();
            jLabel27 = new javax.swing.JLabel();
            quantitySpinners3 = new javax.swing.JSpinner();
            fishCheckBoxes3 = new javax.swing.JCheckBox();
            jPanel8 = new javax.swing.JPanel();
            jLabelimage4 = new javax.swing.JLabel();
            jLabel29 = new javax.swing.JLabel();
            jLabel30 = new javax.swing.JLabel();
            jLabel31 = new javax.swing.JLabel();
            fihsname4 = new javax.swing.JLabel();
            jLabel33 = new javax.swing.JLabel();
            quantitySpinners4 = new javax.swing.JSpinner();
            fishCheckBoxes4 = new javax.swing.JCheckBox();
            jPanel9 = new javax.swing.JPanel();
            jLabelimage5 = new javax.swing.JLabel();
            jLabel35 = new javax.swing.JLabel();
            jLabel36 = new javax.swing.JLabel();
            jLabel37 = new javax.swing.JLabel();
            fihsname5 = new javax.swing.JLabel();
            jLabel39 = new javax.swing.JLabel();
            quantitySpinners5 = new javax.swing.JSpinner();
            fishCheckBoxes5 = new javax.swing.JCheckBox();
            jPanel10 = new javax.swing.JPanel();
            jLabelimage6 = new javax.swing.JLabel();
            jLabel41 = new javax.swing.JLabel();
            jLabel42 = new javax.swing.JLabel();
            jLabel43 = new javax.swing.JLabel();
            fihsname7 = new javax.swing.JLabel();
            jLabel45 = new javax.swing.JLabel();
            quantitySpinners7 = new javax.swing.JSpinner();
            fishCheckBoxes7 = new javax.swing.JCheckBox();
            jPanel11 = new javax.swing.JPanel();
            jLabelimage7 = new javax.swing.JLabel();
            jLabel47 = new javax.swing.JLabel();
            jLabel48 = new javax.swing.JLabel();
            jLabel49 = new javax.swing.JLabel();
            fihsname6 = new javax.swing.JLabel();
            jLabel51 = new javax.swing.JLabel();
            quantitySpinners6 = new javax.swing.JSpinner();
            fishCheckBoxes6 = new javax.swing.JCheckBox();
            jPanel12 = new javax.swing.JPanel();
            jLabelimage8 = new javax.swing.JLabel();
            jLabel53 = new javax.swing.JLabel();
            jLabel54 = new javax.swing.JLabel();
            jLabel55 = new javax.swing.JLabel();
            fihsname8 = new javax.swing.JLabel();
            jLabel57 = new javax.swing.JLabel();
            quantitySpinners8 = new javax.swing.JSpinner();
            fishCheckBoxes8 = new javax.swing.JCheckBox();
            jPanel13 = new javax.swing.JPanel();
            jLabelimage9 = new javax.swing.JLabel();
            jLabel59 = new javax.swing.JLabel();
            jLabel60 = new javax.swing.JLabel();
            jLabel61 = new javax.swing.JLabel();
            fihsname9 = new javax.swing.JLabel();
            jLabel63 = new javax.swing.JLabel();
            quantitySpinners9 = new javax.swing.JSpinner();
            fishCheckBoxes9 = new javax.swing.JCheckBox();
            jPanel14 = new javax.swing.JPanel();
            jLabelimage10 = new javax.swing.JLabel();
            jLabel65 = new javax.swing.JLabel();
            jLabel66 = new javax.swing.JLabel();
            jLabel67 = new javax.swing.JLabel();
            fihsname10 = new javax.swing.JLabel();
            jLabel69 = new javax.swing.JLabel();
            quantitySpinners10 = new javax.swing.JSpinner();
            fishCheckBoxes10 = new javax.swing.JCheckBox();
            jPanel15 = new javax.swing.JPanel();
            jLabelimage11 = new javax.swing.JLabel();
            jLabel71 = new javax.swing.JLabel();
            jLabel72 = new javax.swing.JLabel();
            jLabel73 = new javax.swing.JLabel();
            fihsname11 = new javax.swing.JLabel();
            jLabel75 = new javax.swing.JLabel();
            quantitySpinners11 = new javax.swing.JSpinner();
            fishCheckBoxes11 = new javax.swing.JCheckBox();
            jPanel16 = new javax.swing.JPanel();
            jLabelimage12 = new javax.swing.JLabel();
            jLabel77 = new javax.swing.JLabel();
            jLabel78 = new javax.swing.JLabel();
            jLabel79 = new javax.swing.JLabel();
            fihsname12 = new javax.swing.JLabel();
            jLabel81 = new javax.swing.JLabel();
            quantitySpinners12 = new javax.swing.JSpinner();
            fishCheckBoxes12 = new javax.swing.JCheckBox();
            jPanel17 = new javax.swing.JPanel();
            jLabelimage13 = new javax.swing.JLabel();
            jLabel83 = new javax.swing.JLabel();
            jLabel84 = new javax.swing.JLabel();
            jLabel85 = new javax.swing.JLabel();
            fihsname13 = new javax.swing.JLabel();
            jLabel87 = new javax.swing.JLabel();
            quantitySpinners13 = new javax.swing.JSpinner();
            fishCheckBoxes13 = new javax.swing.JCheckBox();
            jPanel18 = new javax.swing.JPanel();
            jLabelimage14 = new javax.swing.JLabel();
            jLabel89 = new javax.swing.JLabel();
            jLabel90 = new javax.swing.JLabel();
            jLabel91 = new javax.swing.JLabel();
            fihsname14 = new javax.swing.JLabel();
            jLabel93 = new javax.swing.JLabel();
            quantitySpinners14 = new javax.swing.JSpinner();
            fishCheckBoxes14 = new javax.swing.JCheckBox();
            jPanel19 = new javax.swing.JPanel();
            jLabelimage15 = new javax.swing.JLabel();
            jLabel95 = new javax.swing.JLabel();
            jLabel96 = new javax.swing.JLabel();
            jLabel97 = new javax.swing.JLabel();
            fihsname15 = new javax.swing.JLabel();
            jLabel99 = new javax.swing.JLabel();
            quantitySpinners15 = new javax.swing.JSpinner();
            fishCheckBoxes15 = new javax.swing.JCheckBox();
            jPanel4 = new javax.swing.JPanel();
            orderHistoryButton = new javax.swing.JButton();
            btnReceipt = new javax.swing.JButton();
            btn_reset = new javax.swing.JButton();
            btnTotal = new javax.swing.JButton();
            confirmButton1 = new javax.swing.JButton();
            btn_exsit1 = new javax.swing.JButton();
            jPanel20 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTextArea = new javax.swing.JTextArea();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jTextFieldTax = new javax.swing.JTextField();
            jTextFieldSubTotal = new javax.swing.JTextField();
            jTextFieldTotal = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);
            addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowOpened(java.awt.event.WindowEvent evt) {
                        formWindowOpened(evt);
                  }
            });

            jPanel1.setBackground(new java.awt.Color(250, 250, 250));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel1.setForeground(new java.awt.Color(0, 0, 0));

            jPanel2.setBackground(new java.awt.Color(235, 235, 235));
            jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel2.setForeground(new java.awt.Color(0, 0, 0));
            jPanel2.setToolTipText("");
            jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jPanel2MouseDragged(evt);
                  }
            });
            jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        jPanel2MousePressed(evt);
                  }
            });

            jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setText("Bright Aqwa");
            jLabel1.setToolTipText("");

            jTxTime.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

            jTxtDate.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jTxtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jTxTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );

            jPanel3.setBackground(new java.awt.Color(250, 250, 250));
            jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel3.setForeground(new java.awt.Color(0, 0, 0));
            jPanel3.setAutoscrolls(true);

            jLabel2.setBackground(new java.awt.Color(240, 240, 240));
            jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Fish menu");

            jPanel5.setBackground(new java.awt.Color(250, 250, 250));
            jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel5.setForeground(new java.awt.Color(0, 0, 0));

            jLabel11.setBackground(new java.awt.Color(240, 240, 240));
            jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(0, 0, 0));
            jLabel11.setText("Price:");

            jLabel12.setBackground(new java.awt.Color(240, 240, 240));
            jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(0, 0, 0));
            jLabel12.setText("Quantity:");

            jLabel13.setBackground(new java.awt.Color(240, 240, 240));
            jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel13.setForeground(new java.awt.Color(0, 0, 0));
            jLabel13.setText("Purchese:");

            fihsname1.setBackground(new java.awt.Color(240, 240, 240));
            fihsname1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname1.setForeground(new java.awt.Color(0, 0, 0));
            fihsname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname1.setText("Rock gold Fish");

            jLabel15.setBackground(new java.awt.Color(240, 240, 240));
            jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel15.setForeground(new java.awt.Color(0, 0, 0));
            jLabel15.setText("$3");

            quantitySpinners1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            quantitySpinners1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes1.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes1.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes1ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes1))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel5Layout.setVerticalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelimage1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel12)
                              .addComponent(quantitySpinners1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes1)
                              .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel6.setBackground(new java.awt.Color(250, 250, 250));
            jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel6.setForeground(new java.awt.Color(0, 0, 0));

            jLabel17.setBackground(new java.awt.Color(240, 240, 240));
            jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel17.setForeground(new java.awt.Color(0, 0, 0));
            jLabel17.setText("Price:");

            jLabel18.setBackground(new java.awt.Color(240, 240, 240));
            jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel18.setForeground(new java.awt.Color(0, 0, 0));
            jLabel18.setText("Quantity:");

            jLabel19.setBackground(new java.awt.Color(240, 240, 240));
            jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel19.setForeground(new java.awt.Color(0, 0, 0));
            jLabel19.setText("Purchese:");

            fihsname2.setBackground(new java.awt.Color(240, 240, 240));
            fihsname2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname2.setForeground(new java.awt.Color(0, 0, 0));
            fihsname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname2.setText("Yellow Butterfly Fish");

            jLabel21.setBackground(new java.awt.Color(240, 240, 240));
            jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel21.setForeground(new java.awt.Color(0, 0, 0));
            jLabel21.setText("$4");

            quantitySpinners2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes2.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes2.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes2ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes2))))
                                    .addGap(0, 48, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel6Layout.setVerticalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel18)
                              .addComponent(quantitySpinners2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes2)
                              .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel7.setBackground(new java.awt.Color(250, 250, 250));
            jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel7.setForeground(new java.awt.Color(0, 0, 0));

            jLabel23.setBackground(new java.awt.Color(240, 240, 240));
            jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel23.setForeground(new java.awt.Color(0, 0, 0));
            jLabel23.setText("Price:");

            jLabel24.setBackground(new java.awt.Color(240, 240, 240));
            jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel24.setForeground(new java.awt.Color(0, 0, 0));
            jLabel24.setText("Quantity:");

            jLabel25.setBackground(new java.awt.Color(240, 240, 240));
            jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel25.setForeground(new java.awt.Color(0, 0, 0));
            jLabel25.setText("Purchese:");

            fihsname3.setBackground(new java.awt.Color(240, 240, 240));
            fihsname3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname3.setForeground(new java.awt.Color(0, 0, 0));
            fihsname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname3.setText("Red terpon fish");

            jLabel27.setBackground(new java.awt.Color(240, 240, 240));
            jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel27.setForeground(new java.awt.Color(0, 0, 0));
            jLabel27.setText("$5");

            quantitySpinners3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes3.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes3.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes3ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
            jPanel7.setLayout(jPanel7Layout);
            jPanel7Layout.setHorizontalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes3))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel7Layout.setVerticalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel24)
                              .addComponent(quantitySpinners3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes3)
                              .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel8.setBackground(new java.awt.Color(250, 250, 250));
            jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel8.setForeground(new java.awt.Color(0, 0, 0));

            jLabel29.setBackground(new java.awt.Color(240, 240, 240));
            jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel29.setForeground(new java.awt.Color(0, 0, 0));
            jLabel29.setText("Price:");

            jLabel30.setBackground(new java.awt.Color(240, 240, 240));
            jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel30.setForeground(new java.awt.Color(0, 0, 0));
            jLabel30.setText("Quantity:");

            jLabel31.setBackground(new java.awt.Color(240, 240, 240));
            jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel31.setForeground(new java.awt.Color(0, 0, 0));
            jLabel31.setText("Purchese:");

            fihsname4.setBackground(new java.awt.Color(240, 240, 240));
            fihsname4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname4.setForeground(new java.awt.Color(0, 0, 0));
            fihsname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname4.setText("Clown Fish");

            jLabel33.setBackground(new java.awt.Color(240, 240, 240));
            jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel33.setForeground(new java.awt.Color(0, 0, 0));
            jLabel33.setText("$6");

            quantitySpinners4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes4.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes4.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes4ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
            jPanel8.setLayout(jPanel8Layout);
            jPanel8Layout.setHorizontalGroup(
                  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes4))))
                                    .addContainerGap(52, Short.MAX_VALUE))))
            );
            jPanel8Layout.setVerticalGroup(
                  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabelimage4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel30)
                              .addComponent(quantitySpinners4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes4)
                              .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel9.setBackground(new java.awt.Color(250, 250, 250));
            jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel9.setForeground(new java.awt.Color(0, 0, 0));

            jLabel35.setBackground(new java.awt.Color(240, 240, 240));
            jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel35.setForeground(new java.awt.Color(0, 0, 0));
            jLabel35.setText("Price:");

            jLabel36.setBackground(new java.awt.Color(240, 240, 240));
            jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel36.setForeground(new java.awt.Color(0, 0, 0));
            jLabel36.setText("Quantity:");

            jLabel37.setBackground(new java.awt.Color(240, 240, 240));
            jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel37.setForeground(new java.awt.Color(0, 0, 0));
            jLabel37.setText("Purchese:");

            fihsname5.setBackground(new java.awt.Color(240, 240, 240));
            fihsname5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname5.setForeground(new java.awt.Color(0, 0, 0));
            fihsname5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname5.setText("Ruvul Fish");

            jLabel39.setBackground(new java.awt.Color(240, 240, 240));
            jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel39.setForeground(new java.awt.Color(0, 0, 0));
            jLabel39.setText("$5");

            quantitySpinners5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes5.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes5.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes5.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes5ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
            jPanel9.setLayout(jPanel9Layout);
            jPanel9Layout.setHorizontalGroup(
                  jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes5))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel9Layout.setVerticalGroup(
                  jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabelimage5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel36)
                              .addComponent(quantitySpinners5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes5)
                              .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel10.setBackground(new java.awt.Color(250, 250, 250));
            jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel10.setForeground(new java.awt.Color(0, 0, 0));

            jLabel41.setBackground(new java.awt.Color(240, 240, 240));
            jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel41.setForeground(new java.awt.Color(0, 0, 0));
            jLabel41.setText("Price:");

            jLabel42.setBackground(new java.awt.Color(240, 240, 240));
            jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel42.setForeground(new java.awt.Color(0, 0, 0));
            jLabel42.setText("Quantity:");

            jLabel43.setBackground(new java.awt.Color(240, 240, 240));
            jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel43.setForeground(new java.awt.Color(0, 0, 0));
            jLabel43.setText("Purchese:");

            fihsname7.setBackground(new java.awt.Color(240, 240, 240));
            fihsname7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname7.setForeground(new java.awt.Color(0, 0, 0));
            fihsname7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname7.setText("Lion Fish");
            fihsname7.setAutoscrolls(true);

            jLabel45.setBackground(new java.awt.Color(240, 240, 240));
            jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel45.setForeground(new java.awt.Color(0, 0, 0));
            jLabel45.setText("$9");

            quantitySpinners7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes7.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes7.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes7.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes7ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
            jPanel10.setLayout(jPanel10Layout);
            jPanel10Layout.setHorizontalGroup(
                  jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes7))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel10Layout.setVerticalGroup(
                  jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabelimage6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel42)
                              .addComponent(quantitySpinners7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes7)
                              .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel11.setBackground(new java.awt.Color(250, 250, 250));
            jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel11.setForeground(new java.awt.Color(0, 0, 0));

            jLabel47.setBackground(new java.awt.Color(240, 240, 240));
            jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel47.setForeground(new java.awt.Color(0, 0, 0));
            jLabel47.setText("Price:");

            jLabel48.setBackground(new java.awt.Color(240, 240, 240));
            jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel48.setForeground(new java.awt.Color(0, 0, 0));
            jLabel48.setText("Quantity:");

            jLabel49.setBackground(new java.awt.Color(240, 240, 240));
            jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel49.setForeground(new java.awt.Color(0, 0, 0));
            jLabel49.setText("Purchese:");

            fihsname6.setBackground(new java.awt.Color(240, 240, 240));
            fihsname6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname6.setForeground(new java.awt.Color(0, 0, 0));
            fihsname6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname6.setText("Electric blue Fish");
            fihsname6.setAutoscrolls(true);

            jLabel51.setBackground(new java.awt.Color(240, 240, 240));
            jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel51.setForeground(new java.awt.Color(0, 0, 0));
            jLabel51.setText("$8");

            quantitySpinners6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes6.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes6.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes6.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes6ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
            jPanel11.setLayout(jPanel11Layout);
            jPanel11Layout.setHorizontalGroup(
                  jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes6))))
                                    .addContainerGap(52, Short.MAX_VALUE))))
            );
            jPanel11Layout.setVerticalGroup(
                  jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelimage7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel48)
                              .addComponent(quantitySpinners6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes6)
                              .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel12.setBackground(new java.awt.Color(250, 250, 250));
            jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel12.setForeground(new java.awt.Color(0, 0, 0));

            jLabel53.setBackground(new java.awt.Color(240, 240, 240));
            jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel53.setForeground(new java.awt.Color(0, 0, 0));
            jLabel53.setText("Price:");

            jLabel54.setBackground(new java.awt.Color(240, 240, 240));
            jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel54.setForeground(new java.awt.Color(0, 0, 0));
            jLabel54.setText("Quantity:");

            jLabel55.setBackground(new java.awt.Color(240, 240, 240));
            jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel55.setForeground(new java.awt.Color(0, 0, 0));
            jLabel55.setText("Purchese:");

            fihsname8.setBackground(new java.awt.Color(240, 240, 240));
            fihsname8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname8.setForeground(new java.awt.Color(0, 0, 0));
            fihsname8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname8.setText("Fariy blastfelt Fish");
            fihsname8.setAutoscrolls(true);

            jLabel57.setBackground(new java.awt.Color(240, 240, 240));
            jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel57.setForeground(new java.awt.Color(0, 0, 0));
            jLabel57.setText("$10");

            quantitySpinners8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes8.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes8.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes8.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes8ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
            jPanel12.setLayout(jPanel12Layout);
            jPanel12Layout.setHorizontalGroup(
                  jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes8))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel12Layout.setVerticalGroup(
                  jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabelimage8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel54)
                              .addComponent(quantitySpinners8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(fishCheckBoxes8)))
            );

            jPanel13.setBackground(new java.awt.Color(250, 250, 250));
            jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel13.setForeground(new java.awt.Color(0, 0, 0));

            jLabel59.setBackground(new java.awt.Color(240, 240, 240));
            jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel59.setForeground(new java.awt.Color(0, 0, 0));
            jLabel59.setText("Price:");

            jLabel60.setBackground(new java.awt.Color(240, 240, 240));
            jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel60.setForeground(new java.awt.Color(0, 0, 0));
            jLabel60.setText("Quantity:");

            jLabel61.setBackground(new java.awt.Color(240, 240, 240));
            jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel61.setForeground(new java.awt.Color(0, 0, 0));
            jLabel61.setText("Purchese:");

            fihsname9.setBackground(new java.awt.Color(240, 240, 240));
            fihsname9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname9.setForeground(new java.awt.Color(0, 0, 0));
            fihsname9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname9.setText("Stingray Fish");

            jLabel63.setBackground(new java.awt.Color(240, 240, 240));
            jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel63.setForeground(new java.awt.Color(0, 0, 0));
            jLabel63.setText("$11");

            quantitySpinners9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes9.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes9.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes9.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes9ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
            jPanel13.setLayout(jPanel13Layout);
            jPanel13Layout.setHorizontalGroup(
                  jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes9))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel13Layout.setVerticalGroup(
                  jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabelimage9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel60)
                              .addComponent(quantitySpinners9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes9)
                              .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel14.setBackground(new java.awt.Color(250, 250, 250));
            jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel14.setForeground(new java.awt.Color(0, 0, 0));

            jLabel65.setBackground(new java.awt.Color(240, 240, 240));
            jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel65.setForeground(new java.awt.Color(0, 0, 0));
            jLabel65.setText("Price:");

            jLabel66.setBackground(new java.awt.Color(240, 240, 240));
            jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel66.setForeground(new java.awt.Color(0, 0, 0));
            jLabel66.setText("Quantity:");

            jLabel67.setBackground(new java.awt.Color(240, 240, 240));
            jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel67.setForeground(new java.awt.Color(0, 0, 0));
            jLabel67.setText("Purchese:");

            fihsname10.setBackground(new java.awt.Color(240, 240, 240));
            fihsname10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname10.setForeground(new java.awt.Color(0, 0, 0));
            fihsname10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname10.setText(" Butterfly Fish");

            jLabel69.setBackground(new java.awt.Color(240, 240, 240));
            jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel69.setForeground(new java.awt.Color(0, 0, 0));
            jLabel69.setText("$12");

            quantitySpinners10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes10.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes10.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes10.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes10ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
            jPanel14.setLayout(jPanel14Layout);
            jPanel14Layout.setHorizontalGroup(
                  jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes10))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel14Layout.setVerticalGroup(
                  jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabelimage10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel66)
                              .addComponent(quantitySpinners10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes10)
                              .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel15.setBackground(new java.awt.Color(250, 250, 250));
            jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel15.setForeground(new java.awt.Color(0, 0, 0));

            jLabel71.setBackground(new java.awt.Color(240, 240, 240));
            jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel71.setForeground(new java.awt.Color(0, 0, 0));
            jLabel71.setText("Price:");

            jLabel72.setBackground(new java.awt.Color(240, 240, 240));
            jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel72.setForeground(new java.awt.Color(0, 0, 0));
            jLabel72.setText("Quantity:");

            jLabel73.setBackground(new java.awt.Color(240, 240, 240));
            jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel73.setForeground(new java.awt.Color(0, 0, 0));
            jLabel73.setText("Purchese:");

            fihsname11.setBackground(new java.awt.Color(240, 240, 240));
            fihsname11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname11.setForeground(new java.awt.Color(0, 0, 0));
            fihsname11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname11.setText("Discus Fish");

            jLabel75.setBackground(new java.awt.Color(240, 240, 240));
            jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel75.setForeground(new java.awt.Color(0, 0, 0));
            jLabel75.setText("$13");

            quantitySpinners11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes11.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes11.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes11.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes11ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
            jPanel15.setLayout(jPanel15Layout);
            jPanel15Layout.setHorizontalGroup(
                  jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes11))))
                                    .addContainerGap(52, Short.MAX_VALUE))))
            );
            jPanel15Layout.setVerticalGroup(
                  jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabelimage11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel75))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel72)
                              .addComponent(quantitySpinners11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes11)
                              .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel16.setBackground(new java.awt.Color(250, 250, 250));
            jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel16.setForeground(new java.awt.Color(0, 0, 0));

            jLabel77.setBackground(new java.awt.Color(240, 240, 240));
            jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel77.setForeground(new java.awt.Color(0, 0, 0));
            jLabel77.setText("Price:");

            jLabel78.setBackground(new java.awt.Color(240, 240, 240));
            jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel78.setForeground(new java.awt.Color(0, 0, 0));
            jLabel78.setText("Quantity:");

            jLabel79.setBackground(new java.awt.Color(240, 240, 240));
            jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel79.setForeground(new java.awt.Color(0, 0, 0));
            jLabel79.setText("Purchese:");

            fihsname12.setBackground(new java.awt.Color(240, 240, 240));
            fihsname12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname12.setForeground(new java.awt.Color(0, 0, 0));
            fihsname12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname12.setText("See hourseFish");

            jLabel81.setBackground(new java.awt.Color(240, 240, 240));
            jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel81.setForeground(new java.awt.Color(0, 0, 0));
            jLabel81.setText("$14");

            quantitySpinners12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes12.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes12.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes12.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes12ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
            jPanel16.setLayout(jPanel16Layout);
            jPanel16Layout.setHorizontalGroup(
                  jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes12))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel16Layout.setVerticalGroup(
                  jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabelimage12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel78)
                              .addComponent(quantitySpinners12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes12)
                              .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel17.setBackground(new java.awt.Color(250, 250, 250));
            jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel17.setForeground(new java.awt.Color(0, 0, 0));

            jLabel83.setBackground(new java.awt.Color(240, 240, 240));
            jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel83.setForeground(new java.awt.Color(0, 0, 0));
            jLabel83.setText("Price:");

            jLabel84.setBackground(new java.awt.Color(240, 240, 240));
            jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel84.setForeground(new java.awt.Color(0, 0, 0));
            jLabel84.setText("Quantity:");

            jLabel85.setBackground(new java.awt.Color(240, 240, 240));
            jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel85.setForeground(new java.awt.Color(0, 0, 0));
            jLabel85.setText("Purchese:");

            fihsname13.setBackground(new java.awt.Color(240, 240, 240));
            fihsname13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname13.setForeground(new java.awt.Color(0, 0, 0));
            fihsname13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname13.setText("Long tail fish");

            jLabel87.setBackground(new java.awt.Color(240, 240, 240));
            jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel87.setForeground(new java.awt.Color(0, 0, 0));
            jLabel87.setText("$15");

            quantitySpinners13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes13.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes13.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes13.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes13ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
            jPanel17.setLayout(jPanel17Layout);
            jPanel17Layout.setHorizontalGroup(
                  jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel17Layout.createSequentialGroup()
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes13))))
                                    .addContainerGap(52, Short.MAX_VALUE))))
            );
            jPanel17Layout.setVerticalGroup(
                  jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabelimage13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel84)
                              .addComponent(quantitySpinners13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes13)
                              .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel18.setBackground(new java.awt.Color(250, 250, 250));
            jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel18.setForeground(new java.awt.Color(0, 0, 0));

            jLabel89.setBackground(new java.awt.Color(240, 240, 240));
            jLabel89.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel89.setForeground(new java.awt.Color(0, 0, 0));
            jLabel89.setText("Price:");

            jLabel90.setBackground(new java.awt.Color(240, 240, 240));
            jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel90.setForeground(new java.awt.Color(0, 0, 0));
            jLabel90.setText("Quantity:");

            jLabel91.setBackground(new java.awt.Color(240, 240, 240));
            jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel91.setForeground(new java.awt.Color(0, 0, 0));
            jLabel91.setText("Purchese:");

            fihsname14.setBackground(new java.awt.Color(240, 240, 240));
            fihsname14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname14.setForeground(new java.awt.Color(0, 0, 0));
            fihsname14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname14.setText("Rock beatuy Fish");

            jLabel93.setBackground(new java.awt.Color(240, 240, 240));
            jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel93.setForeground(new java.awt.Color(0, 0, 0));
            jLabel93.setText("$16");

            quantitySpinners14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes14.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes14.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes14.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes14ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
            jPanel18.setLayout(jPanel18Layout);
            jPanel18Layout.setHorizontalGroup(
                  jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes14))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel18Layout.setVerticalGroup(
                  jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabelimage14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel93))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel90)
                              .addComponent(quantitySpinners14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes14)
                              .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            jPanel19.setBackground(new java.awt.Color(250, 250, 250));
            jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel19.setForeground(new java.awt.Color(0, 0, 0));

            jLabel95.setBackground(new java.awt.Color(240, 240, 240));
            jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel95.setForeground(new java.awt.Color(0, 0, 0));
            jLabel95.setText("Price:");

            jLabel96.setBackground(new java.awt.Color(240, 240, 240));
            jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel96.setForeground(new java.awt.Color(0, 0, 0));
            jLabel96.setText("Quantity:");

            jLabel97.setBackground(new java.awt.Color(240, 240, 240));
            jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel97.setForeground(new java.awt.Color(0, 0, 0));
            jLabel97.setText("Purchese:");

            fihsname15.setBackground(new java.awt.Color(240, 240, 240));
            fihsname15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            fihsname15.setForeground(new java.awt.Color(0, 0, 0));
            fihsname15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            fihsname15.setText("SpotFin Fish");

            jLabel99.setBackground(new java.awt.Color(240, 240, 240));
            jLabel99.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel99.setForeground(new java.awt.Color(0, 0, 0));
            jLabel99.setText("$5");

            quantitySpinners15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

            fishCheckBoxes15.setBackground(new java.awt.Color(240, 240, 240));
            fishCheckBoxes15.setForeground(new java.awt.Color(0, 0, 0));
            fishCheckBoxes15.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fishCheckBoxes15ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
            jPanel19.setLayout(jPanel19Layout);
            jPanel19Layout.setHorizontalGroup(
                  jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelimage15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fihsname15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel19Layout.createSequentialGroup()
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel19Layout.createSequentialGroup()
                                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel19Layout.createSequentialGroup()
                                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(quantitySpinners15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(fishCheckBoxes15))))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel19Layout.setVerticalGroup(
                  jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabelimage15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fihsname15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel99))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel96)
                              .addComponent(quantitySpinners15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(fishCheckBoxes15)
                              .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                      .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel3Layout.createSequentialGroup()
                                                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addGroup(jPanel3Layout.createSequentialGroup()
                                                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(0, 14, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(17, Short.MAX_VALUE))
            );

            jPanel4.setBackground(new java.awt.Color(250, 250, 250));
            jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel4.setForeground(new java.awt.Color(0, 0, 0));

            orderHistoryButton.setBackground(new java.awt.Color(0, 153, 0));
            orderHistoryButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            orderHistoryButton.setForeground(new java.awt.Color(255, 255, 255));
            orderHistoryButton.setText("Order history ");
            orderHistoryButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        orderHistoryButtonActionPerformed(evt);
                  }
            });

            btnReceipt.setBackground(new java.awt.Color(255, 153, 0));
            btnReceipt.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            btnReceipt.setForeground(new java.awt.Color(255, 255, 255));
            btnReceipt.setText("Receipt");
            btnReceipt.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnReceiptActionPerformed(evt);
                  }
            });

            btn_reset.setBackground(new java.awt.Color(102, 51, 255));
            btn_reset.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            btn_reset.setForeground(new java.awt.Color(255, 255, 255));
            btn_reset.setText("Restart");
            btn_reset.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_resetActionPerformed(evt);
                  }
            });

            btnTotal.setBackground(new java.awt.Color(255, 102, 255));
            btnTotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            btnTotal.setForeground(new java.awt.Color(255, 255, 255));
            btnTotal.setText("Total ");
            btnTotal.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnTotalActionPerformed(evt);
                  }
            });

            confirmButton1.setBackground(new java.awt.Color(0, 204, 255));
            confirmButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            confirmButton1.setForeground(new java.awt.Color(255, 255, 255));
            confirmButton1.setText("Order ");
            confirmButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        confirmButton1ActionPerformed(evt);
                  }
            });

            btn_exsit1.setBackground(new java.awt.Color(255, 51, 100));
            btn_exsit1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
            btn_exsit1.setForeground(new java.awt.Color(255, 255, 255));
            btn_exsit1.setText("exist");
            btn_exsit1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_exsit1ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(confirmButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_exsit1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(199, Short.MAX_VALUE))
                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                              .addGap(43, 43, 43)
                              .addComponent(orderHistoryButton)
                              .addContainerGap(816, Short.MAX_VALUE)))
            );
            jPanel4Layout.setVerticalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(btnReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                              .addComponent(confirmButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(btnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(btn_exsit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(orderHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                              .addContainerGap()))
            );

            jPanel20.setBackground(new java.awt.Color(204, 204, 204));
            jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel20.setForeground(new java.awt.Color(0, 0, 0));

            jTextArea.setBackground(new java.awt.Color(255, 255, 255));
            jTextArea.setColumns(20);
            jTextArea.setForeground(new java.awt.Color(0, 0, 0));
            jTextArea.setRows(5);
            jScrollPane1.setViewportView(jTextArea);

            jLabel3.setBackground(new java.awt.Color(255, 255, 255));
            jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setText("Tax");

            jLabel4.setBackground(new java.awt.Color(255, 255, 255));
            jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setText("Sub Total");

            jLabel5.setBackground(new java.awt.Color(255, 255, 255));
            jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setText("Total");

            jTextFieldTax.setBackground(new java.awt.Color(255, 255, 255));
            jTextFieldTax.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jTextFieldTax.setForeground(new java.awt.Color(0, 0, 0));

            jTextFieldSubTotal.setBackground(new java.awt.Color(255, 255, 255));
            jTextFieldSubTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jTextFieldSubTotal.setForeground(new java.awt.Color(0, 0, 0));

            jTextFieldTotal.setBackground(new java.awt.Color(255, 255, 255));
            jTextFieldTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jTextFieldTotal.setForeground(new java.awt.Color(0, 0, 0));

            javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
            jPanel20.setLayout(jPanel20Layout);
            jPanel20Layout.setHorizontalGroup(
                  jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );
            jPanel20Layout.setVerticalGroup(
                  jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel3)
                              .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel4)
                              .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel5)
                              .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 78, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 6, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
            if (total == 0.0) {
                  JOptionPane.showMessageDialog(null, "You haven't selected any item");
            } else {
                  jTextArea.setText(jTextArea.getText()
                          + "\n********************************************************************\n"
                          + "Tax: \t\t\t" + tax + "\n"
                          + "Sub Total: \t\t\t" + total + "\n"
                          + "Total: \t\t\t" + (total + tax) + "\n\n"
                          + "\"**********************Thnak You*****************************\n"
                  );
                  btnTotal.setEnabled(false);

            }

      }//GEN-LAST:event_btnTotalActionPerformed
      // Method to get the total value from outside the actionPerformed method

      public double getTotal() {
            return total;

      }

      public void getTax(int t) {
            if (t >= 10.0 && t <= 20.0) {
                  tax = 0.5;
            } else if (t > 20.0 && t <= 40.0) {
                  tax = 1.0;
            } else if (t > 40.0 && t <= 60.0) {
                  tax = 2.0;
            } else if (t > 60.0 && t <= 80.0) {
                  tax = 3.0;
            } else if (t > 80.0 && t <= 100.0) {
                  tax = 4.0;
            } else if (t > 100.0 && t <= 150.0) {
                  tax = 8.0;
            } else if (t > 150.0 && t <= 200.0) {
                  tax = 10.0;
            } else if (t > 200.0) {
                  tax = 15.0;
            }
      }
      private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
            // TODO add your handling code here:
            reset();

      }//GEN-LAST:event_btn_resetActionPerformed

      private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
            if (total != 0) {
                  if (!btnTotal.isEnabled()) {
                        try {
                              jTextArea.print();
                        } catch (PrinterException ex) {
                              Logger.getLogger(GUI_Customer_Side.class.getName()).log(Level.SEVERE, null, ex);
                        }
                  } else {
                        JOptionPane.showMessageDialog(null, "Fist You should calculate the total price");
                  }
            } else {
                  JOptionPane.showMessageDialog(null, "You haven't purchansed any Order");
            }

      }//GEN-LAST:event_btnReceiptActionPerformed

      private void orderHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderHistoryButtonActionPerformed
            // Call the fishaqwarim() method to generate the purchaseId
            // int generatedPurchaseId = fishaqwarim();

            // Now you can access the generated purChasedId here
            if (orderQueue != null) {
                  Order_History orderHistoryGUI = new Order_History(orderQueue);
                  orderHistoryGUI.populateTableModel();
                  orderHistoryGUI.setVisible(true); // Show the OrderHistoryGUI
            } else {
                  System.out.println("Order queue is not set.");
            }

      }//GEN-LAST:event_orderHistoryButtonActionPerformed

      // Define a class-level variable to store the generated purchaseId
      private int purChasedId;

// Your fishaqwarim() method
      public int fishaqwarim() {
            purChasedId = 15020 + (int) (Math.random() * 80800);
            jTextArea.setText("**********************Bright Aqwa*****************************\n"
                    + "Time: " + jTxTime.getText() + "     " + " Date: " + jTxtDate.getText() + "\n"
                    + "Prchase id: " + purChasedId + "\n"
                    + "********************************************************************\n"
                    + "Item Name :\t\t\t\t" + "Price($)\n");
            return purChasedId; // Return the generated purchaseId
      }

      private void fishCheckBoxes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes1ActionPerformed
            int qty = Integer.parseInt(quantitySpinners1.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes1.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 3.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname1.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes1.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes1ActionPerformed

      private void fishCheckBoxes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes2ActionPerformed
            int qty = Integer.parseInt(quantitySpinners2.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes2.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 4.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname2.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes2.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes2ActionPerformed

      private void fishCheckBoxes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes3ActionPerformed
            int qty = Integer.parseInt(quantitySpinners3.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes3.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 5.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname3.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes3.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes3ActionPerformed

      private void fishCheckBoxes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes4ActionPerformed
            int qty = Integer.parseInt(quantitySpinners4.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes4.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 6.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname4.getText() + "\t\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes4.setSelected(false);
            }
            System.out.println(total);
      }//GEN-LAST:event_fishCheckBoxes4ActionPerformed

      private void fishCheckBoxes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes5ActionPerformed
            int qty = Integer.parseInt(quantitySpinners5.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes5.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 7.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname5.getText() + "\t\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes5.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes5ActionPerformed

      private void fishCheckBoxes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes6ActionPerformed
            int qty = Integer.parseInt(quantitySpinners6.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes6.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 8.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname6.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes6.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes6ActionPerformed

      private void fishCheckBoxes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes7ActionPerformed
            int qty = Integer.parseInt(quantitySpinners7.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes7.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 9.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname7.getText() + "\t\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes7.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes7ActionPerformed

      private void fishCheckBoxes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes8ActionPerformed
            int qty = Integer.parseInt(quantitySpinners8.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes8.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 10.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname8.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes8.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes8ActionPerformed

      private void fishCheckBoxes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes9ActionPerformed
            int qty = Integer.parseInt(quantitySpinners9.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes9.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 11.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname9.getText() + "\t\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes9.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes9ActionPerformed

      private void fishCheckBoxes10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes10ActionPerformed
            int qty = Integer.parseInt(quantitySpinners10.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes10.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 12.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname10.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes10.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes10ActionPerformed

      private void fishCheckBoxes11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes11ActionPerformed
            int qty = Integer.parseInt(quantitySpinners11.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes11.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 13.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname11.getText() + "\t\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes11.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes11ActionPerformed

      private void fishCheckBoxes12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes12ActionPerformed
            int qty = Integer.parseInt(quantitySpinners12.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes12.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 14.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname12.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes12.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes12ActionPerformed

      private void fishCheckBoxes13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes13ActionPerformed
            int qty = Integer.parseInt(quantitySpinners13.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes13.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 15.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname13.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes13.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes13ActionPerformed

      private void fishCheckBoxes14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes14ActionPerformed
            int qty = Integer.parseInt(quantitySpinners14.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes14.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 16.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname14.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes14.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes14ActionPerformed

      private void fishCheckBoxes15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishCheckBoxes15ActionPerformed
            int qty = Integer.parseInt(quantitySpinners15.getValue().toString());
            if (qtyIsZero(qty) && fishCheckBoxes15.isSelected()) {
                  x++;
                  if (x == 1) {
                        fishaqwarim();
                  }
                  double price = qty * 17.0;
                  total += price;
                  getTax((int) total);
                  jTextArea.setText(jTextArea.getText() + x + ". " + fihsname15.getText() + "\t\t\t" + price + "\n");
                  dudate();
            } else {
                  fishCheckBoxes15.setSelected(false);
            }
      }//GEN-LAST:event_fishCheckBoxes15ActionPerformed

      private void confirmButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButton1ActionPerformed

            System.out.println(purChasedId);
            System.out.println(getTotal());

            // Logic to finalize the order (enqueue into order queue, generate order ID, etc.)
            finalizeOrder(total, purChasedId);

            // Show a message box confirming the order
            String message = "Your order has been confirmed!";
            JOptionPane.showMessageDialog(this, message, "Order Confirmation", JOptionPane.INFORMATION_MESSAGE);
                        reset();

      }//GEN-LAST:event_confirmButton1ActionPerformed

      // Method to finalize an order
      private void finalizeOrder(double total, int purChasedId) {
            // Logic to finalize the order (enqueue into order queue, generate order ID, etc.)
            // This part will be implemented in your application
            // For demonstration, printing the order details
            double totalWithTax = total + tax; // Calculate total cost including tax
            //  System.out.println("Order Finalized: Total Cost: $" + total + ", Customer Telephone: " + purChasedId);

            // Add this line to update the order history table
            if (orderQueue != null) {
                  orderQueue.enqueue(new Order(totalWithTax, purChasedId));
            }
      }

      public void setOrderQueue(CustomQueue<Order> orderQueue) {
            this.orderQueue = orderQueue;
      }
      
      int xx, xy;
      private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xx, y - xy);
      }//GEN-LAST:event_jPanel2MouseDragged

      private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
            xx = evt.getX();
            xy = evt.getY();
      }//GEN-LAST:event_jPanel2MousePressed

      private void btn_exsit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exsit1ActionPerformed
            // TODO add your handling code here:
            System.exit(0);

      }//GEN-LAST:event_btn_exsit1ActionPerformed

      private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            // TODO add your handling code here:
            for (double i = 0.0; i <= 1.0; i += 0.1) {
                  String s = i + "";
                  float f = Float.valueOf(s);
                  this.setOpacity(f);
                  try {
                        Thread.sleep(40);
                  } catch (InterruptedException ex) {
                        Logger.getLogger(GUI_Customer_Side.class.getName()).log(Level.SEVERE, null, ex);
                  }
            }
      }//GEN-LAST:event_formWindowOpened

      public void setTime() {

            new Thread(new Runnable() {
                  @Override
                  public void run() {
                        while (true) {
                              try {
                                    Thread.sleep(1000);
                              } catch (InterruptedException ex) {
                                    Logger.getLogger(GUI_Customer_Side.class.getName()).log(Level.SEVERE, null, ex);
                              }

                              Date date = new Date();
                              SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                              SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                              String time = tf.format(date);
                              String[] parts = time.split(" ");
                              jTxTime.setText(parts[0] + " " + parts[1]);
                              jTxtDate.setText(df.format(date));
                        }
                  }

            }).start();
      }

      public static void main(String args[]) {

            CustomQueue<Order> orderQueue = new CustomQueue<>(10); // Assuming a capacity of 10 for the queue
            GUI_Customer_Side customerInformationGUI = new GUI_Customer_Side();
            customerInformationGUI.setOrderQueue(orderQueue); // Set the order queue

            // Use the same instance of GUI_Customer_Side throughout your application
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        customerInformationGUI.setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnReceipt;
      private javax.swing.JButton btnTotal;
      private javax.swing.JButton btn_exsit1;
      private javax.swing.JButton btn_reset;
      private javax.swing.JButton confirmButton1;
      private javax.swing.JLabel fihsname1;
      private javax.swing.JLabel fihsname10;
      private javax.swing.JLabel fihsname11;
      private javax.swing.JLabel fihsname12;
      private javax.swing.JLabel fihsname13;
      private javax.swing.JLabel fihsname14;
      private javax.swing.JLabel fihsname15;
      private javax.swing.JLabel fihsname2;
      private javax.swing.JLabel fihsname3;
      private javax.swing.JLabel fihsname4;
      private javax.swing.JLabel fihsname5;
      private javax.swing.JLabel fihsname6;
      private javax.swing.JLabel fihsname7;
      private javax.swing.JLabel fihsname8;
      private javax.swing.JLabel fihsname9;
      private javax.swing.JCheckBox fishCheckBoxes1;
      private javax.swing.JCheckBox fishCheckBoxes10;
      private javax.swing.JCheckBox fishCheckBoxes11;
      private javax.swing.JCheckBox fishCheckBoxes12;
      private javax.swing.JCheckBox fishCheckBoxes13;
      private javax.swing.JCheckBox fishCheckBoxes14;
      private javax.swing.JCheckBox fishCheckBoxes15;
      private javax.swing.JCheckBox fishCheckBoxes2;
      private javax.swing.JCheckBox fishCheckBoxes3;
      private javax.swing.JCheckBox fishCheckBoxes4;
      private javax.swing.JCheckBox fishCheckBoxes5;
      private javax.swing.JCheckBox fishCheckBoxes6;
      private javax.swing.JCheckBox fishCheckBoxes7;
      private javax.swing.JCheckBox fishCheckBoxes8;
      private javax.swing.JCheckBox fishCheckBoxes9;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel13;
      private javax.swing.JLabel jLabel15;
      private javax.swing.JLabel jLabel17;
      private javax.swing.JLabel jLabel18;
      private javax.swing.JLabel jLabel19;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel21;
      private javax.swing.JLabel jLabel23;
      private javax.swing.JLabel jLabel24;
      private javax.swing.JLabel jLabel25;
      private javax.swing.JLabel jLabel27;
      private javax.swing.JLabel jLabel29;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel30;
      private javax.swing.JLabel jLabel31;
      private javax.swing.JLabel jLabel33;
      private javax.swing.JLabel jLabel35;
      private javax.swing.JLabel jLabel36;
      private javax.swing.JLabel jLabel37;
      private javax.swing.JLabel jLabel39;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel41;
      private javax.swing.JLabel jLabel42;
      private javax.swing.JLabel jLabel43;
      private javax.swing.JLabel jLabel45;
      private javax.swing.JLabel jLabel47;
      private javax.swing.JLabel jLabel48;
      private javax.swing.JLabel jLabel49;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel51;
      private javax.swing.JLabel jLabel53;
      private javax.swing.JLabel jLabel54;
      private javax.swing.JLabel jLabel55;
      private javax.swing.JLabel jLabel57;
      private javax.swing.JLabel jLabel59;
      private javax.swing.JLabel jLabel60;
      private javax.swing.JLabel jLabel61;
      private javax.swing.JLabel jLabel63;
      private javax.swing.JLabel jLabel65;
      private javax.swing.JLabel jLabel66;
      private javax.swing.JLabel jLabel67;
      private javax.swing.JLabel jLabel69;
      private javax.swing.JLabel jLabel71;
      private javax.swing.JLabel jLabel72;
      private javax.swing.JLabel jLabel73;
      private javax.swing.JLabel jLabel75;
      private javax.swing.JLabel jLabel77;
      private javax.swing.JLabel jLabel78;
      private javax.swing.JLabel jLabel79;
      private javax.swing.JLabel jLabel81;
      private javax.swing.JLabel jLabel83;
      private javax.swing.JLabel jLabel84;
      private javax.swing.JLabel jLabel85;
      private javax.swing.JLabel jLabel87;
      private javax.swing.JLabel jLabel89;
      private javax.swing.JLabel jLabel90;
      private javax.swing.JLabel jLabel91;
      private javax.swing.JLabel jLabel93;
      private javax.swing.JLabel jLabel95;
      private javax.swing.JLabel jLabel96;
      private javax.swing.JLabel jLabel97;
      private javax.swing.JLabel jLabel99;
      private javax.swing.JLabel jLabelimage1;
      private javax.swing.JLabel jLabelimage10;
      private javax.swing.JLabel jLabelimage11;
      private javax.swing.JLabel jLabelimage12;
      private javax.swing.JLabel jLabelimage13;
      private javax.swing.JLabel jLabelimage14;
      private javax.swing.JLabel jLabelimage15;
      private javax.swing.JLabel jLabelimage2;
      private javax.swing.JLabel jLabelimage3;
      private javax.swing.JLabel jLabelimage4;
      private javax.swing.JLabel jLabelimage5;
      private javax.swing.JLabel jLabelimage6;
      private javax.swing.JLabel jLabelimage7;
      private javax.swing.JLabel jLabelimage8;
      private javax.swing.JLabel jLabelimage9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel10;
      private javax.swing.JPanel jPanel11;
      private javax.swing.JPanel jPanel12;
      private javax.swing.JPanel jPanel13;
      private javax.swing.JPanel jPanel14;
      private javax.swing.JPanel jPanel15;
      private javax.swing.JPanel jPanel16;
      private javax.swing.JPanel jPanel17;
      private javax.swing.JPanel jPanel18;
      private javax.swing.JPanel jPanel19;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel20;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel jPanel4;
      private javax.swing.JPanel jPanel5;
      private javax.swing.JPanel jPanel6;
      private javax.swing.JPanel jPanel7;
      private javax.swing.JPanel jPanel8;
      private javax.swing.JPanel jPanel9;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JTextArea jTextArea;
      private javax.swing.JTextField jTextFieldSubTotal;
      private javax.swing.JTextField jTextFieldTax;
      private javax.swing.JTextField jTextFieldTotal;
      private javax.swing.JLabel jTxTime;
      private javax.swing.JLabel jTxtDate;
      private javax.swing.JButton orderHistoryButton;
      private javax.swing.JSpinner quantitySpinners1;
      private javax.swing.JSpinner quantitySpinners10;
      private javax.swing.JSpinner quantitySpinners11;
      private javax.swing.JSpinner quantitySpinners12;
      private javax.swing.JSpinner quantitySpinners13;
      private javax.swing.JSpinner quantitySpinners14;
      private javax.swing.JSpinner quantitySpinners15;
      private javax.swing.JSpinner quantitySpinners2;
      private javax.swing.JSpinner quantitySpinners3;
      private javax.swing.JSpinner quantitySpinners4;
      private javax.swing.JSpinner quantitySpinners5;
      private javax.swing.JSpinner quantitySpinners6;
      private javax.swing.JSpinner quantitySpinners7;
      private javax.swing.JSpinner quantitySpinners8;
      private javax.swing.JSpinner quantitySpinners9;
      // End of variables declaration//GEN-END:variables
}
