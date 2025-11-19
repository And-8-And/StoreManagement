import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;

public class ShopChainFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ShopChainFrame.class.getName());

    final DefaultListModel<String> notificationModel = new DefaultListModel<>();
    
    private final List<Store> stores = new ArrayList<>();
    
    public ShopChainFrame() 
    {
        initComponents();
        
        initializeCategories();  
        
        jList1.setModel(notificationModel);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                if (evt.getClickCount() == 2) 
                {
                    int index = jList1.locationToIndex(evt.getPoint());
                    
                    if (index >= 0) 
                    {
                        String selected = notificationModel.getElementAt(index);
                        handleNotificationClick(selected);
                    }
                }
            }
        });
    }
    
    
    private void initializeCategories() 
    {
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Food");
        jComboBox2.addItem("Clothing");
        jComboBox2.addItem("Electronics");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Store Name", "Store Adress"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("    Store Name");

        jLabel2.setText("   Store Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Stores", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Product Price (lei)", "Product Quantity", "Product Category", "Store Name"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Stores");

        jLabel7.setText("Product");

        jButton11.setText("Add");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel3.setText("     Product Name");

        jLabel4.setText("   Product Price (lei)");

        jLabel5.setText("    Product Quantity");

        jLabel8.setText("   Product Category");

        jButton13.setText("Remove");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Products", jPanel2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Product Price (lei)", "Product Quantity", "Product Category", "Store Name", "Discount"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Remove");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel10.setText("%");

        jLabel9.setText("     Store Name");

        jLabel11.setText("   Product Name");

        jLabel12.setText("        Discount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextField11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Discount", jPanel3);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Price (Lei)", "Product Quantity", "Product Category", "Total Sold (Lei)"
            }
        ));
        jScrollPane7.setViewportView(jTable6);

        jButton12.setText("Sell");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel16.setText("     Store Name");

        jLabel17.setText("   Product Name");

        jLabel18.setText(" Product Quantity");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField15)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Sell Products", jPanel7);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Store Name", "Store Address"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel13.setText("    Search Store");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Search Stores", jPanel5);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Product Price", "Product Quantity", "Product Category", "Store Name"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel14.setText("   Product Name");

        jLabel15.setText("     Store Name");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Search Products", jPanel6);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        jButton8.setText("Delete Notifications");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jButton8)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Reports", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Stores");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Search Products Tab //
    
    // Search Button
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        Thread t = new Thread(new Runnable()
        {
            public void run()
            {
                final String productSearch = getTextFieldText(jTextField9).toLowerCase();
                final String storeSearch = getTextFieldText(jTextField12).toLowerCase();

                SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        DefaultTableModel productModel = (DefaultTableModel) jTable2.getModel();
                        DefaultTableModel resultModel = (DefaultTableModel) jTable5.getModel();

                        while (resultModel.getRowCount() > 0)
                        {
                            resultModel.removeRow(0);
                        }

                        boolean found = false;

                        for (int i = 0; i < productModel.getRowCount(); i++)
                        {
                            Object nameObj = productModel.getValueAt(i, 0);
                            Object priceObj = "";
                            Object quantityObj = "";
                            Object categoryObj = "";
                            Object storeObj = "";

                            if (productModel.getColumnCount() > 1)
                            {
                                priceObj = productModel.getValueAt(i, 1);
                            }

                            if (productModel.getColumnCount() > 2)
                            {
                                quantityObj = productModel.getValueAt(i, 2);
                            }

                            if (productModel.getColumnCount() > 3)
                            {
                                categoryObj = productModel.getValueAt(i, 3);
                            }

                            if (productModel.getColumnCount() > 4)
                            {
                                storeObj = productModel.getValueAt(i, 4);
                            }

                            if (nameObj != null && storeObj != null)
                            {
                                String name = nameObj.toString().toLowerCase();
                                String store = storeObj.toString().toLowerCase();

                                boolean matchesProduct = false;
                                if (productSearch.length() == 0 || name.equalsIgnoreCase(productSearch))
                                {
                                    matchesProduct = true;
                                }

                                boolean matchesStore = false;
                                if (storeSearch.length() == 0 || name.equalsIgnoreCase(storeSearch))
                                {
                                    matchesStore = true;
                                }

                                if (matchesProduct && matchesStore)
                                {
                                    if (productModel.getColumnCount() == 5)
                                    {
                                        resultModel.addRow(new Object[]
                                        {
                                            nameObj,
                                            priceObj,
                                            quantityObj,
                                            categoryObj,
                                            storeObj
                                        });
                                    }
                                    else
                                    {
                                        resultModel.addRow(new Object[]
                                        {
                                            nameObj,
                                            priceObj,
                                            quantityObj,
                                            categoryObj,
                                            storeObj
                                        });
                                    }
                                
                                    found = true;
                                    
                                }
                            }
                        }

                        if (!found)
                        {
                           JOptionPane.showMessageDialog(ShopChainFrame.this, "No matching products found");
                        }
                    }
                });
            }
        });

    t.start();
    }//GEN-LAST:event_jButton10ActionPerformed

    // Search Stores Tab //
    
    // Search Button
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Thread t = new Thread(new Runnable()
            {
                public void run()
                {
                    final String searchName = getTextFieldText(jTextField8);

                    if (searchName.isEmpty())
                    {
                        SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Enter store name to search");
                                }
                            });
                            return;
                        }

                        SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    DefaultTableModel storeModel = (DefaultTableModel) jTable1.getModel();
                                    DefaultTableModel resultModel = (DefaultTableModel) jTable4.getModel();

                                    // Clear previous results
                                    while (resultModel.getRowCount() > 0)
                                    {
                                        resultModel.removeRow(0);
                                    }

                                    boolean found = false;

                                    for (int i = 0; i < storeModel.getRowCount(); i++)
                                    {
                                        Object storeNameObj = storeModel.getValueAt(i, 0);
                                        Object storeAddressObj = storeModel.getValueAt(i, 1);

                                        if (storeNameObj != null)
                                        {
                                            String name = storeNameObj.toString().toLowerCase();
                                            String search = searchName.toLowerCase();

                                            if (name.equalsIgnoreCase(search))
                                            {
                                                String address = "";

                                                if (storeAddressObj != null)
                                                {
                                                    address = storeAddressObj.toString();
                                                }

                                                resultModel.addRow(new Object[] { storeNameObj.toString(), address });
                                                found = true;
                                            }
                                        }
                                    }

                                    if (!found)
                                    {
                                        JOptionPane.showMessageDialog(ShopChainFrame.this, "No stores found with name: " + searchName);
                                    }
                                }
                            });
                        }
                    });
                    t.start();
    }//GEN-LAST:event_jButton9ActionPerformed

    // Reports Tab //
    
    // Delete Notifications Button
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Thread t = new Thread(new Runnable()
            {
                public void run()
                {
                    SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                if (notificationModel.isEmpty())
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "No notifications to delete")
                                    ;
                                    return;
                                }

                                int confirm = JOptionPane.showConfirmDialog
                                (
                                    ShopChainFrame.this,
                                    "Are you sure you want to delete all notifications?",
                                    "Confirm Deletion",
                                    JOptionPane.YES_NO_OPTION
                                );

                                if (confirm == JOptionPane.YES_OPTION)
                                {
                                    notificationModel.clear();
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "All notifications deleted");
                                }
                            }
                        });
                    }
                });

                t.start();
    }//GEN-LAST:event_jButton8ActionPerformed

    //Remove Button
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Thread t = new Thread(new Runnable()
            {
                public void run()
                {
                    SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                int selectedRow = jTable3.getSelectedRow();

                                if (selectedRow != -1)
                                {
                                    DefaultTableModel model = (DefaultTableModel) jTable3.getModel();

                                    String removedProduct = model.getValueAt(selectedRow, 0).toString();
                                    String removedStore = model.getValueAt(selectedRow, 4).toString();

                                    model.removeRow(selectedRow);

                                    addNotification("Discount removed: " + removedProduct + " in store " + removedStore);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Select a row to remove");
                                }
                            }
                        });
                    }
                });

                t.start();
    }//GEN-LAST:event_jButton7ActionPerformed

    // Discounted Tab //
    
    // Add Button
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Thread t = new Thread(new Runnable()
            {
                public void run()
                {
                    final String storeName = getTextFieldText(jTextField11);
                    final String productName = getTextFieldText(jTextField6);
                    final String discountStr = getTextFieldText(jTextField7);

                    if (productName.isEmpty () || discountStr.isEmpty())
                    {
                        SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Fill all fields");
                                }
                            });

                            return;

                        }

                        double discountPercent;

                        try
                        {
                            discountPercent = Double.parseDouble(discountStr);
                        }
                        catch (NumberFormatException e)
                        {
                            SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Discount must be a valid number");
                                }
                            });

                                return;
                            }

                            SwingUtilities.invokeLater(new Runnable()
                                {
                                    public void run()
                                    {
                                        DefaultTableModel productModel = (DefaultTableModel) jTable2.getModel();
                                        DefaultTableModel discountModel = (DefaultTableModel) jTable3.getModel();

                                        Product foundProduct = null;
                                        double price = 0;
                                        int quantity = 0;
                                        String category = null;
                                        int rowIndex = -1;

                                        for (int i = 0; i < productModel.getRowCount(); i++)
                                        {
                                            Object pName = productModel.getValueAt(i, 0);
                                            Object pStore = productModel.getValueAt(i, 4);

                                            if (pName != null && pStore != null && pName.toString().equalsIgnoreCase(productName) && pStore.toString().equalsIgnoreCase(storeName))
                                            {
                                                price = Double.parseDouble(productModel.getValueAt(i, 1).toString());
                                                quantity = Integer.parseInt(productModel.getValueAt(i, 2).toString());
                                                category = productModel.getValueAt(i, 3).toString();

                                                rowIndex = i;

                                                if (category.equalsIgnoreCase("Food"))
                                                {
                                                    foundProduct = new FoodProduct(i, productName, price, quantity, "");
                                                }
                                                else if (category.equalsIgnoreCase("Clothing"))
                                                {
                                                    foundProduct = new ClothingProduct(i, productName, price, quantity, "");
                                                }
                                                else if (category.equalsIgnoreCase("Electronics"))
                                                {
                                                    foundProduct = new ElectronicProduct(i, productName, price, quantity, 0);
                                                }

                                                break;
                                            }
                                        }

                                        if (foundProduct == null || rowIndex == -1)
                                        {
                                            JOptionPane.showMessageDialog(ShopChainFrame.this, "Product not found in any store");

                                            return;
                                        }

                                        productModel.setValueAt(price, rowIndex, 1);
                                        double discountedPrice = foundProduct.calculateDiscountedPrice(discountPercent);

                                        String formattedDiscountedPrice = String.format("%.1f (%.0f%% discount)", discountedPrice, discountPercent);

                                        while (discountModel.getRowCount() > 0)
                                        {
                                            discountModel.removeRow(0);
                                        }

                                        discountModel.addRow(new Object[]
                                            {
                                                productName,
                                                price,
                                                quantity,
                                                category,
                                                storeName,
                                                formattedDiscountedPrice
                                            });

                                            addNotification("New discount added: " + productName + " (" + discountPercent + "%) in store " + storeName);

                                            jTextField6.setText("");
                                            jTextField7.setText("");
                                            jTextField11.setText("");
                                        }
                                    });
                                }
                            });

                            t.start();
    }//GEN-LAST:event_jButton6ActionPerformed

    // Add Category Button
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        Thread t = new Thread(new Runnable()
            {
                public void run()
                {
                    final String newCategoryName = getTextFieldText(jTextField10);

                    if (newCategoryName.isEmpty())
                    {
                        SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Please enter a product category name.");
                                }
                            });

                            return;
                        }

                        SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    boolean exists = false;

                                    for (int i = 0; i < jComboBox2.getItemCount(); i++)
                                    {
                                        if (jComboBox2.getItemAt(i).toString().equalsIgnoreCase(newCategoryName))
                                        {
                                            exists = true;

                                            break;
                                        }
                                    }

                                    if (exists)
                                    {
                                        JOptionPane.showMessageDialog(ShopChainFrame.this, "This product category already exists");

                                        return;
                                    }

                                    jComboBox2.addItem(newCategoryName);

                                    addNotification("New category added: " + newCategoryName);

                                    jTextField10.setText("");
                                }
                            });
                        }
                    });

                    t.start();
    }//GEN-LAST:event_jButton11ActionPerformed

    // Remove Button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Thread t = new Thread(new Runnable()
            {
                public void run()
                {
                    final int row = jTable2.getSelectedRow();

                    SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                if (row != -1)
                                {
                                    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

                                    String productName = model.getValueAt(row, 0).toString();
                                    String storeName = model.getValueAt(row, 4).toString();

                                    model.removeRow(row);

                                    addNotification("Product removed: " + productName + " from store " + storeName);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Select a row to remove");
                                }
                            }
                        });
                    }
                });

                t.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Products Tab //
    
    // Add Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Thread t = new Thread(new Runnable()
        {
            public void run()
            {
                final String name = getTextFieldText(jTextField3);
                final String price = getTextFieldText(jTextField4);
                final String quantity = getTextFieldText(jTextField5);
                final Object tempStore = jComboBox1.getSelectedItem();
                final Object tempCategory = jComboBox2.getSelectedItem();

                final String store;
                final String category;

                if (tempStore != null)
                {
                    store = tempStore.toString();
                }
                else
                {
                    store = null;
                }

                if (tempCategory != null)
                {
                    category = tempCategory.toString();
                }
                else
                {
                    category = null;
                }

                if (name.isEmpty() || price.isEmpty() || quantity.isEmpty())
                {
                    SwingUtilities.invokeLater(new Runnable()
                    {
                        public void run()
                        {
                            JOptionPane.showMessageDialog(null, "Fill all fields");
                        }
                    });

                    return;
                }

                int priceValue;
                int quantityValue;

                try
                {
                    priceValue = toStrintInt(jTextField4, "Price");
                    quantityValue = toStrintInt(jTextField5, "Quantity");
                }
                catch (NumberFormatException e)
                {
                    final String errorMessage = e.getMessage();

                    SwingUtilities.invokeLater(new Runnable()
                    {
                        public void run()
                        {
                            JOptionPane.showMessageDialog(null, errorMessage);
                        }
                    });

                    return;
                }

                SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        Store selectedStore = null;

                        for (int i = 0; i < stores.size(); i++)
                        {
                            Store s = stores.get(i);

                            if (s.getName().equalsIgnoreCase(store))
                            {
                                selectedStore = s;

                                break;
                            }
                        }

                        if (selectedStore != null)
                        {
                            Product newProduct = null;

                            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                            
                            switch (category)
                            {
                                case "Food":

                                    newProduct = new FoodProduct(Product.getNextId(), name, priceValue, quantityValue, "");

                                    break;

                                case "Clothing":

                                    newProduct = new ClothingProduct(Product.getNextId(), name, priceValue, quantityValue, "");

                                    break;

                                case "Electronics":

                                    newProduct = new ElectronicProduct(Product.getNextId(), name, priceValue, quantityValue, 0);

                                    break;
                            }

                            if (newProduct != null)
                            {
                                try
                                {
                                    selectedStore.addProduct(newProduct);

                                    SwingUtilities.invokeLater(new Runnable()
                                    {
                                        public void run()
                                        {
                                            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

                                            for (int i = model.getRowCount() - 1; i >= 0; i--)
                                            {
                                                boolean empty = true;

                                                for (int j = 0; j < model.getColumnCount(); j++)
                                                {
                                                    if (model.getValueAt(i, j) != null)
                                                    {
                                                        empty = false;

                                                        break;
                                                    }
                                                }

                                                if (empty)
                                                {
                                                    model.removeRow(i);
                                                }
                                            }

                                            for (int i = 0; i < model.getRowCount(); i++)
                                            {
                                                Object existingName = model.getValueAt(i, 0);
                                                Object existingCategory = model.getValueAt(i, 3);
                                                Object existingStore = model.getValueAt(i, 4);

                                                if (existingName != null && existingCategory != null && existingStore != null)
                                                {
                                                    boolean sameName = existingName.toString().equalsIgnoreCase(name);
                                                    boolean sameCategory = existingCategory.toString().equalsIgnoreCase(category);
                                                    boolean sameStore = existingStore.toString().equalsIgnoreCase(store);

                                                    if (sameName && sameCategory && sameStore)
                                                    {
                                                        JOptionPane.showMessageDialog(ShopChainFrame.this, "This product already exists in this store and category");

                                                        return;
                                                    }
                                                }
                                            }

                                            model.addRow(new Object[]{name, price, quantity, category, store});
                                           
                                            addNotification("New product added: " + name + " in store " + store);
                                                                
                                            jTextField3.setText("");
                                            jTextField4.setText("");
                                            jTextField5.setText("");
                                        }
                                    });
                                }
                                catch (InvalidStockOperationException e)                 
                                {
                                    final String errorMsg = e.getMessage();

                                    JOptionPane.showMessageDialog(ShopChainFrame.this, errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            catch (Exception e)
                            {
                                final String errorMsg = "An unexpected error occurred: " + e.getMessage();

                                JOptionPane.showMessageDialog(ShopChainFrame.this, errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });
        }
    });

    t.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Remove button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Thread t = new Thread(new Runnable()
            {
                public void run()
                {
                    final int selectedRow = jTable1.getSelectedRow();

                    if (selectedRow == -1)
                    {
                        SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Please select a store to remove");
                                }
                            });

                            return;
                        }

                        SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                    String removedStore = model.getValueAt(selectedRow, 0).toString();

                                    for (int i = 0; i < stores.size(); i++)
                                    {
                                        if (stores.get(i).getName().equalsIgnoreCase(removedStore))
                                        {
                                            stores.remove(i);

                                            break;
                                        }
                                    }

                                    model.removeRow(selectedRow);

                                    addNotification("Store removed: " + removedStore);
                                }
                            });
                        }
                    });

                    t.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Stores Tab //
    
    // Add Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Thread t = new Thread(new Runnable()
            {
                public void run()
                {
                    final String storeName = getTextFieldText(jTextField1);
                    final String storeAddress = getTextFieldText(jTextField2);

                    if (storeName.isEmpty() || storeAddress.isEmpty())
                    {
                        SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Please enter both store name and address");
                                }
                            });

                            return;
                        }

                        SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                                    for (int i = 0; i < model.getRowCount(); i++)
                                    {
                                        Object existingName = model.getValueAt(i, 0);

                                        if (existingName != null && existingName.toString().equalsIgnoreCase(storeName))
                                        {
                                            JOptionPane.showMessageDialog(ShopChainFrame.this, "A store with this name already exists");

                                            return;
                                        }
                                    }

                                    for (int i = model.getRowCount() - 1; i >= 0; i--)
                                    {
                                        if (model.getValueAt(i, 0) == null && model.getValueAt(i, 1) == null)
                                        {
                                            model.removeRow(i);
                                        }
                                    }

                                    Store newStore = new Store(storeName, storeAddress);
                                    stores.add(newStore);

                                    model.addRow(new Object[]{storeName, storeAddress});

                                    addNotification("New store added: " + storeName);

                                    jTextField1.setText("");
                                    jTextField2.setText("");

                                    refreshStoresComboBox();
                                }
                            });
                        }
                    });

                    t.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Sell Product Button
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Thread t = new Thread(new Runnable()
        {
            public void run()
            {
                final String storeName = getTextFieldText(jTextField13);
                final String productName = getTextFieldText(jTextField14);
                final String quantityStr = getTextFieldText(jTextField15);
                
                if (storeName.isEmpty() || productName.isEmpty() || quantityStr.isEmpty()) 
                {
                    SwingUtilities.invokeLater(new Runnable() 
                    {
                        public void run() 
                        {
                            JOptionPane.showMessageDialog(ShopChainFrame.this, "Please fill all fields for selling a product.");
                        }
                    });
                    
                    return;
                }
                
                int quantityToSell;
                
                try
                {
                    quantityToSell = toStrintInt(jTextField15, "Quantity");
                    
                    if (quantityToSell <= 0)
                    {
                        throw new NumberFormatException("Quantity to sell must be a positive number");
                    }
                }
                catch (NumberFormatException e)
                {
                    final String errorMessage = e.getMessage();
                    SwingUtilities.invokeLater(new Runnable()
                    {
                        public void run() 
                        {
                            JOptionPane.showMessageDialog(ShopChainFrame.this, errorMessage, "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });
                
                    return;
                }
                
                SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        DefaultTableModel productModel = (DefaultTableModel) jTable2.getModel();
                        DefaultTableModel sellResultModel = (DefaultTableModel) jTable6.getModel();
                        
                        int productRowIndex = -1;
                        int currentQuantity = 0;
                        double price = 0;
                        String category = "";
                        Object productId = null;
                        
                        for (int i = 0; i < productModel.getRowCount(); i++)
                        {
                            Object pName = productModel.getValueAt(i, 0); 
                            Object pStore = productModel.getValueAt(i, 4); 

                            if (pName != null && pStore != null && pName.toString().equalsIgnoreCase(productName) && pStore.toString().equalsIgnoreCase(storeName))
                            {
                                try
                                {
                                    productId = i + 1; 
                                
                                    price = Double.parseDouble(productModel.getValueAt(i, 1).toString());
                                    currentQuantity = Integer.parseInt(productModel.getValueAt(i, 2).toString());
                                    category = productModel.getValueAt(i, 3).toString();
                                    
                                    productRowIndex = i;
                                }
                                catch (NumberFormatException ex)
                                {
                                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Invalid price or quantity format in product table", "Data Error", JOptionPane.ERROR_MESSAGE);
                                
                                    return;
                                }
                                
                                break;
                            }
                        }
                        
                        if (productRowIndex == -1) 
                        {
                            JOptionPane.showMessageDialog(ShopChainFrame.this, "Product " + productName + " not found in store");
                        
                            return;
                        }
                        
                        if (currentQuantity < quantityToSell) 
                        {
                            JOptionPane.showMessageDialog(ShopChainFrame.this, "Insufficient stock");
                        
                            return;
                        }
                        
                        int newQuantity = currentQuantity - quantityToSell;
                        productModel.setValueAt(newQuantity, productRowIndex, 2);
                        
                        double totalSaleValue = price * quantityToSell;
                        String formattedSaleValue = String.format("%.2f", totalSaleValue);
                        
                        for (int i = sellResultModel.getRowCount() - 1; i >= 0; i--) 
                        {
                            boolean empty = true;
                            
                            for (int j = 0; j < sellResultModel.getColumnCount(); j++) 
                            {
                                if (sellResultModel.getValueAt(i, j) != null) 
                                {
                                    empty = false;
                                    
                                    break;
                                }
                            }
        
                            if (empty) 
                            {
                                sellResultModel.removeRow(i);
                            }
                        }
                        
                        sellResultModel.addRow(new Object[]
                        {
                            productId, 
                            productName, 
                            price, 
                            quantityToSell,
                            category,
                            formattedSaleValue
                        });
                        
                        DefaultTableModel searchResultModel = (DefaultTableModel) jTable5.getModel();
                        for (int i = 0; i < searchResultModel.getRowCount(); i++)
                        {
                            Object sName = searchResultModel.getValueAt(i, 0);
                            Object sStore = searchResultModel.getValueAt(i, 4);
                            
                            if (sName != null && sStore != null && sName.toString().equalsIgnoreCase(productName) && sStore.toString().equalsIgnoreCase(storeName))
                            {
                                searchResultModel.setValueAt(newQuantity, i, 2);
                            }
                        }
                        
                        addNotification("Product sold: " + quantityToSell + ", " + productName);
                        
                        jTextField13.setText("");
                        jTextField14.setText("");
                        jTextField15.setText("");
                    }
                });
            }
        });
        
        t.start();
    }//GEN-LAST:event_jButton12ActionPerformed

    // Remove Category Button
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Thread t = new Thread(new Runnable()
        {
            public void run() 
            {
                Object selectedCategoryObj = jComboBox2.getSelectedItem();
                    
                if (selectedCategoryObj == null) 
                {
                    JOptionPane.showMessageDialog(ShopChainFrame.this, "No category selected to remove");
                        
                    return;
                }
                    
                final String selectedCategory = selectedCategoryObj.toString();
                    
                if (selectedCategory.equalsIgnoreCase("Food") || selectedCategory.equalsIgnoreCase("Clothing") || selectedCategory.equalsIgnoreCase("Electronics"))
                {
                    JOptionPane.showMessageDialog(ShopChainFrame.this, "Cannot remove default categories");
                        
                    return;
                }
                    
                DefaultTableModel productModel = (DefaultTableModel) jTable2.getModel();  
                for (int i = 0; i < productModel.getRowCount(); i++) 
                {
                    Object categoryObj = productModel.getValueAt(i, 3);
                        
                    if (categoryObj != null && categoryObj.toString().equalsIgnoreCase(selectedCategory)) 
                    {
                        JOptionPane.showMessageDialog(ShopChainFrame.this, "Cannot remove category: it is currently used by one or more products");
                            
                        return;
                    }
                }
                    
                jComboBox2.removeItem(selectedCategory);
                addNotification("Category removed: " + selectedCategory);
                JOptionPane.showMessageDialog(ShopChainFrame.this, "Category '" + selectedCategory + "' successfully removed");
            }
        });
        
        t.start();
    }//GEN-LAST:event_jButton13ActionPerformed

   
    private String getTextFieldText(JTextField textField) 
    {
        return textField.getText().trim();
    }
    
    private int toStrintInt(JTextField textField, String fieldName) throws NumberFormatException 
    {
        String text = textField.getText().trim();

        if (text.isEmpty()) 
        {
            throw new NumberFormatException(fieldName + " cannot be empty");
        }
        
        try 
        {
            return Integer.parseInt(text);
        } 
        catch (NumberFormatException e) 
        {
            throw new NumberFormatException(fieldName + " must be a valid integer");
        }
    }
    
    private void refreshStoresComboBox() 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {   
            public void run() 
            {
                DefaultTableModel storeModel = (DefaultTableModel) jTable1.getModel();
                Object selectedItem = jComboBox1.getSelectedItem();

                jComboBox1.removeAllItems();

                for (int i = 0; i < storeModel.getRowCount(); i++) 
                {
                    Object storeName = storeModel.getValueAt(i, 0);
                    
                    if (storeName != null) 
                    {
                        jComboBox1.addItem(storeName.toString());
                    }
                }

                if (selectedItem != null) 
                {
                    jComboBox1.setSelectedItem(selectedItem);
                }

                if (jComboBox1.getSelectedIndex() == -1) 
                {
                    if (jComboBox1.getItemCount() > 0) 
                    {
                        jComboBox1.setSelectedIndex(0);
                    }
                }
            }
        });
    }
    
    private void addNotification(String message) 
    {
        notificationModel.addElement(message);
    }

    private void handleNotificationClick(String notification)
{
    if (notification.contains("store added") || notification.contains("store removed"))
    {
        jTabbedPane1.setSelectedIndex(0);
        
        String storeName = notification.substring(notification.indexOf(":") + 1).trim();
        storeName = storeName.replace("in store", "").trim();

        for (int i = 0; i < jTable1.getRowCount(); i++)
        {
            Object value = jTable1.getValueAt(i, 0);
            if (value != null && value.toString().equalsIgnoreCase(storeName))
            {
                jTable1.setRowSelectionInterval(i, i);
                jTable1.scrollRectToVisible(jTable1.getCellRect(i, 0, true));
                
                break;
            }
        }
    }
    else if (notification.contains("Product sold:"))
    {
        jTabbedPane1.setSelectedIndex(3);

        String productName = "";
        String storeName = "";

        try 
        {
            String rawData = notification.substring(notification.indexOf(":") + 1).trim(); 
            
            productName = rawData.substring(rawData.indexOf("x ") + 2, rawData.indexOf(" for total")).trim(); 
            
            if (rawData.contains("in store")) 
            {
                int storeStart = rawData.indexOf("in store") + 8;
                int storeEnd = rawData.indexOf(". Remaining");
                
                if (storeEnd != -1) 
                {
                    storeName = rawData.substring(storeStart, storeEnd).trim();
                } else 
                {
                    storeName = rawData.substring(storeStart).trim();
                }
            }
            
        } 
        catch (Exception e) 
        {
            return;
        }

        for (int i = 0; i < jTable6.getRowCount(); i++)
        {
            Object pName = jTable6.getValueAt(i, 1);
            Object pStore = jTable6.getValueAt(i, 5);
            
            if (pName != null && pStore != null && pName.toString().equalsIgnoreCase(productName) && pStore.toString().equalsIgnoreCase(storeName))
            {
                jTable6.setRowSelectionInterval(i, i);
                jTable6.scrollRectToVisible(jTable6.getCellRect(i, 0, true));
                break;
            }
        }
    }
    else if (notification.contains("product") || notification.contains("category"))
    {
        jTabbedPane1.setSelectedIndex(1);

        if (notification.contains("added") || notification.contains("removed"))
        {
            String productName = "";
            String storeName = "";
            
            try 
            {
                String rawData = notification.split(":")[1].trim(); 
                
                String[] finalParts = rawData.split(" (from store|in store) ");
                productName = finalParts[0].trim().replace("Discount removed:", "").trim(); 
                
                if (finalParts.length > 1) 
                {
                    storeName = finalParts[1].trim();
                } 
                else 
                {
                    storeName = "";
                }
            } 
            catch (Exception e) 
            {
                 return;
            }

            for (int i = 0; i < jTable2.getRowCount(); i++)
            {
                Object pName = jTable2.getValueAt(i, 0);
                Object pStore = jTable2.getValueAt(i, 4);

                if (pName != null && pStore != null && pName.toString().equalsIgnoreCase(productName) && pStore.toString().equalsIgnoreCase(storeName))
                {
                    jTable2.setRowSelectionInterval(i, i);
                    jTable2.scrollRectToVisible(jTable2.getCellRect(i, 0, true));
                    
                    break;
                }
            }
        }
        else if (notification.contains("category"))
        {
            String categoryName = notification.substring(notification.indexOf(":") + 1).trim();

            for (int i = 0; i < jComboBox2.getItemCount(); i++)
            {
                if (jComboBox2.getItemAt(i).toString().equalsIgnoreCase(categoryName))
                {
                    jComboBox2.setSelectedIndex(i);
                    
                    break;
                }
            }
        }
    }
    else if (notification.contains("discount"))
    {
        jTabbedPane1.setSelectedIndex(2);
        
        String[] parts = notification.split(":")[1].split("\\(");
        String productName = parts[0].trim();
        String storeName = "";
        
        if (notification.contains("in store"))
        {
            storeName = notification.substring(notification.indexOf("in store") + 8).trim();
        }

        for (int i = 0; i < jTable3.getRowCount(); i++)
        {
            Object pName = jTable3.getValueAt(i, 0);
            Object pStore = jTable3.getValueAt(i, 4);

            if (pName != null && pStore != null && pName.toString().equalsIgnoreCase(productName) && pStore.toString().equalsIgnoreCase(storeName))
            {
                jTable3.setRowSelectionInterval(i, i);
                jTable3.scrollRectToVisible(jTable3.getCellRect(i, 0, true));
                
                break;
            }
        }
    }
}
    
    public static void main(String args[]) 
    { 
        java.awt.EventQueue.invokeLater(() -> new ShopChainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}