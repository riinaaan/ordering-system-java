package ordering;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {
    
    private DefaultTableModel orderTableModel;
    private int loggedInCustomerId = -1;

    public Dashboard() {
        initComponents();
        orderTableModel = (DefaultTableModel) orderTBL.getModel();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTBL = new javax.swing.JTable();
        payBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalFIELD = new javax.swing.JTextField();
        amountFIELD = new javax.swing.JTextField();
        changeFIELD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        processorLABEL = new javax.swing.JLabel();
        processorSPINNER = new javax.swing.JSpinner();
        processorADD = new javax.swing.JButton();
        processorPRICE = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        motherboardLABEL = new javax.swing.JLabel();
        motherboardSPINNER = new javax.swing.JSpinner();
        motherboardADD = new javax.swing.JButton();
        motherboardPRICE = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        graphicscardLABEL = new javax.swing.JLabel();
        graphicscardSPINNER = new javax.swing.JSpinner();
        graphicscardADD = new javax.swing.JButton();
        graphicscardPRICE = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        memoryLABEL = new javax.swing.JLabel();
        memorySPINNER = new javax.swing.JSpinner();
        memoryADD = new javax.swing.JButton();
        memoryPRICE = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        pccaseLABEL = new javax.swing.JLabel();
        pccaseSPINNER = new javax.swing.JSpinner();
        pccaseADD = new javax.swing.JButton();
        pccasePRICE = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        ssdLABEL = new javax.swing.JLabel();
        ssdSPINNER = new javax.swing.JSpinner();
        ssdADD = new javax.swing.JButton();
        ssdPRICE = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        monitorLABEL = new javax.swing.JLabel();
        monitorSPINNER = new javax.swing.JSpinner();
        monitorADD = new javax.swing.JButton();
        monitorPRICE = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        powersupplyLABEL = new javax.swing.JLabel();
        powersupplySPINNER = new javax.swing.JSpinner();
        powersupplyADD = new javax.swing.JButton();
        powersupplyPRICE = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        keyboardLABEL = new javax.swing.JLabel();
        keyboardSPINNER = new javax.swing.JSpinner();
        keyboardADD = new javax.swing.JButton();
        keyboardPRICE = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        mouseLABEL = new javax.swing.JLabel();
        mouseSPINNER = new javax.swing.JSpinner();
        mouseADD = new javax.swing.JButton();
        mousePRICE = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        headsetLABEL = new javax.swing.JLabel();
        headsetSPINNER = new javax.swing.JSpinner();
        headsetADD = new javax.swing.JButton();
        headsetPRICE = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        avrLABEL = new javax.swing.JLabel();
        avrSPINNER = new javax.swing.JSpinner();
        avrADD = new javax.swing.JButton();
        avrPRICE = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        logoutBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EASYPC");

        jLabel12.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Build, Upgrade, Conquer");

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("W");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        orderTBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Unit Price", "Quantity", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTBL);
        if (orderTBL.getColumnModel().getColumnCount() > 0) {
            orderTBL.getColumnModel().getColumn(0).setResizable(false);
            orderTBL.getColumnModel().getColumn(1).setResizable(false);
            orderTBL.getColumnModel().getColumn(2).setResizable(false);
            orderTBL.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );

        payBTN.setBackground(new java.awt.Color(0, 0, 51));
        payBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payBTN.setForeground(new java.awt.Color(255, 255, 255));
        payBTN.setText("PAY");
        payBTN.setPreferredSize(new java.awt.Dimension(100, 35));
        payBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBTNActionPerformed(evt);
            }
        });

        clearBTN.setBackground(new java.awt.Color(0, 0, 51));
        clearBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBTN.setForeground(new java.awt.Color(255, 255, 255));
        clearBTN.setText("CLEAR");
        clearBTN.setPreferredSize(new java.awt.Dimension(100, 35));
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TOTAL:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("AMOUNT:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CHANGE:");

        totalFIELD.setEditable(false);
        totalFIELD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalFIELD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFIELDActionPerformed(evt);
            }
        });

        amountFIELD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amountFIELD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amountFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountFIELDActionPerformed(evt);
            }
        });

        changeFIELD.setEditable(false);
        changeFIELD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        changeFIELD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        changeFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFIELDActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/philippine-peso_7812413.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/philippine-peso_7812413.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/philippine-peso_7812413.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/processor.jpg"))); // NOI18N

        processorLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        processorLABEL.setForeground(new java.awt.Color(0, 0, 51));
        processorLABEL.setText("Processor");

        processorSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        processorSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        processorADD.setBackground(new java.awt.Color(0, 0, 51));
        processorADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        processorADD.setForeground(new java.awt.Color(255, 255, 255));
        processorADD.setText("ADD");
        processorADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processorADDActionPerformed(evt);
            }
        });

        processorPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        processorPRICE.setForeground(new java.awt.Color(0, 0, 51));
        processorPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        processorPRICE.setText("6, 199.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(processorLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processorPRICE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(processorSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(processorADD)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processorLABEL)
                    .addComponent(processorPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processorSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processorADD))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/motherboard.jpg"))); // NOI18N

        motherboardLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        motherboardLABEL.setForeground(new java.awt.Color(0, 0, 51));
        motherboardLABEL.setText("Motherboard");

        motherboardSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        motherboardSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        motherboardADD.setBackground(new java.awt.Color(0, 0, 51));
        motherboardADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        motherboardADD.setForeground(new java.awt.Color(255, 255, 255));
        motherboardADD.setText("ADD");
        motherboardADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherboardADDActionPerformed(evt);
            }
        });

        motherboardPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        motherboardPRICE.setForeground(new java.awt.Color(0, 0, 51));
        motherboardPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        motherboardPRICE.setText("4, 205.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(motherboardLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(motherboardPRICE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(motherboardSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(motherboardADD)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motherboardLABEL)
                    .addComponent(motherboardPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motherboardSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motherboardADD))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/graphics card.jpg"))); // NOI18N

        graphicscardLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        graphicscardLABEL.setForeground(new java.awt.Color(0, 0, 51));
        graphicscardLABEL.setText("Graphics card");

        graphicscardSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        graphicscardSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        graphicscardADD.setBackground(new java.awt.Color(0, 0, 51));
        graphicscardADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        graphicscardADD.setForeground(new java.awt.Color(255, 255, 255));
        graphicscardADD.setText("ADD");
        graphicscardADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphicscardADDActionPerformed(evt);
            }
        });

        graphicscardPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        graphicscardPRICE.setForeground(new java.awt.Color(0, 0, 51));
        graphicscardPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        graphicscardPRICE.setText("9, 380.00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(graphicscardLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(graphicscardPRICE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(graphicscardSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(graphicscardADD)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graphicscardLABEL)
                    .addComponent(graphicscardPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graphicscardSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graphicscardADD))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/memory.jpg"))); // NOI18N

        memoryLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        memoryLABEL.setForeground(new java.awt.Color(0, 0, 51));
        memoryLABEL.setText("Memory");

        memorySPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        memorySPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        memoryADD.setBackground(new java.awt.Color(0, 0, 51));
        memoryADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        memoryADD.setForeground(new java.awt.Color(255, 255, 255));
        memoryADD.setText("ADD");
        memoryADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryADDActionPerformed(evt);
            }
        });

        memoryPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        memoryPRICE.setForeground(new java.awt.Color(0, 0, 51));
        memoryPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        memoryPRICE.setText("1, 049.00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(memoryLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(memoryPRICE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(memorySPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(memoryADD)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memoryLABEL)
                    .addComponent(memoryPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memorySPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memoryADD))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/pc case.jpg"))); // NOI18N

        pccaseLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pccaseLABEL.setForeground(new java.awt.Color(0, 0, 51));
        pccaseLABEL.setText("PC case");

        pccaseSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pccaseSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        pccaseADD.setBackground(new java.awt.Color(0, 0, 51));
        pccaseADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pccaseADD.setForeground(new java.awt.Color(255, 255, 255));
        pccaseADD.setText("ADD");
        pccaseADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pccaseADDActionPerformed(evt);
            }
        });

        pccasePRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pccasePRICE.setForeground(new java.awt.Color(0, 0, 51));
        pccasePRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        pccasePRICE.setText("1, 445.00");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pccaseLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pccasePRICE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pccaseSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(pccaseADD)))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pccaseLABEL)
                    .addComponent(pccasePRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pccaseSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pccaseADD))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/motherboard.jpg"))); // NOI18N

        ssdLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ssdLABEL.setForeground(new java.awt.Color(0, 0, 51));
        ssdLABEL.setText("SSD");

        ssdSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ssdSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        ssdADD.setBackground(new java.awt.Color(0, 0, 51));
        ssdADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ssdADD.setForeground(new java.awt.Color(255, 255, 255));
        ssdADD.setText("ADD");
        ssdADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssdADDActionPerformed(evt);
            }
        });

        ssdPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ssdPRICE.setForeground(new java.awt.Color(0, 0, 51));
        ssdPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        ssdPRICE.setText("2, 235.00");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(ssdLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ssdPRICE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(ssdSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(ssdADD)))
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssdLABEL)
                    .addComponent(ssdPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssdSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssdADD))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/monitor.jpg"))); // NOI18N

        monitorLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        monitorLABEL.setForeground(new java.awt.Color(0, 0, 51));
        monitorLABEL.setText("Monitor");

        monitorSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        monitorSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        monitorADD.setBackground(new java.awt.Color(0, 0, 51));
        monitorADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        monitorADD.setForeground(new java.awt.Color(255, 255, 255));
        monitorADD.setText("ADD");
        monitorADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorADDActionPerformed(evt);
            }
        });

        monitorPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        monitorPRICE.setForeground(new java.awt.Color(0, 0, 51));
        monitorPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        monitorPRICE.setText("3, 950.00");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(monitorLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(monitorPRICE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(monitorSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(monitorADD)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monitorLABEL)
                    .addComponent(monitorPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monitorSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monitorADD))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/power supply.jpg"))); // NOI18N

        powersupplyLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        powersupplyLABEL.setForeground(new java.awt.Color(0, 0, 51));
        powersupplyLABEL.setText("Power supply");

        powersupplySPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        powersupplySPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        powersupplyADD.setBackground(new java.awt.Color(0, 0, 51));
        powersupplyADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        powersupplyADD.setForeground(new java.awt.Color(255, 255, 255));
        powersupplyADD.setText("ADD");
        powersupplyADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powersupplyADDActionPerformed(evt);
            }
        });

        powersupplyPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        powersupplyPRICE.setForeground(new java.awt.Color(0, 0, 51));
        powersupplyPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        powersupplyPRICE.setText("1, 653.00");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(powersupplyLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(powersupplyPRICE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(powersupplySPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(powersupplyADD)))
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(powersupplyLABEL)
                    .addComponent(powersupplyPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(powersupplySPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powersupplyADD))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/keyboard.jpg"))); // NOI18N

        keyboardLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keyboardLABEL.setForeground(new java.awt.Color(0, 0, 51));
        keyboardLABEL.setText("Keyboard");

        keyboardSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keyboardSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        keyboardADD.setBackground(new java.awt.Color(0, 0, 51));
        keyboardADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keyboardADD.setForeground(new java.awt.Color(255, 255, 255));
        keyboardADD.setText("ADD");
        keyboardADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyboardADDActionPerformed(evt);
            }
        });

        keyboardPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keyboardPRICE.setForeground(new java.awt.Color(0, 0, 51));
        keyboardPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        keyboardPRICE.setText("1, 280.00");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(keyboardLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keyboardPRICE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(keyboardSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keyboardADD)))
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyboardLABEL)
                    .addComponent(keyboardPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyboardSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyboardADD))
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/mouse.jpg"))); // NOI18N

        mouseLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        mouseLABEL.setForeground(new java.awt.Color(0, 0, 51));
        mouseLABEL.setText("Mouse");

        mouseSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        mouseSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        mouseADD.setBackground(new java.awt.Color(0, 0, 51));
        mouseADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        mouseADD.setForeground(new java.awt.Color(255, 255, 255));
        mouseADD.setText("ADD");
        mouseADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouseADDActionPerformed(evt);
            }
        });

        mousePRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        mousePRICE.setForeground(new java.awt.Color(0, 0, 51));
        mousePRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        mousePRICE.setText("245.00");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(mouseLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mousePRICE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(mouseSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(mouseADD)))
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mouseLABEL)
                    .addComponent(mousePRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mouseSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mouseADD))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/headset.jpg"))); // NOI18N

        headsetLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        headsetLABEL.setForeground(new java.awt.Color(0, 0, 51));
        headsetLABEL.setText("Headset");

        headsetSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        headsetSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        headsetADD.setBackground(new java.awt.Color(0, 0, 51));
        headsetADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        headsetADD.setForeground(new java.awt.Color(255, 255, 255));
        headsetADD.setText("ADD");
        headsetADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headsetADDActionPerformed(evt);
            }
        });

        headsetPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        headsetPRICE.setForeground(new java.awt.Color(0, 0, 51));
        headsetPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        headsetPRICE.setText("789.00");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(headsetLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(headsetPRICE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(headsetSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(headsetADD)))
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headsetLABEL)
                    .addComponent(headsetPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headsetSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headsetADD))
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/avr.jpg"))); // NOI18N

        avrLABEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        avrLABEL.setForeground(new java.awt.Color(0, 0, 51));
        avrLABEL.setText("AVR");

        avrSPINNER.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        avrSPINNER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        avrADD.setBackground(new java.awt.Color(0, 0, 51));
        avrADD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        avrADD.setForeground(new java.awt.Color(255, 255, 255));
        avrADD.setText("ADD");
        avrADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avrADDActionPerformed(evt);
            }
        });

        avrPRICE.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        avrPRICE.setForeground(new java.awt.Color(0, 0, 51));
        avrPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/peso symbol.png"))); // NOI18N
        avrPRICE.setText("275.00");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(avrLABEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avrPRICE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(avrSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avrADD)))
                .addContainerGap())
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avrLABEL)
                    .addComponent(avrPRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avrSPINNER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avrADD))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(260, 260, 260))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(492, 492, 492)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(15, 15, 15))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(totalFIELD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(amountFIELD, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(changeFIELD, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalFIELD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(amountFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(21, 21, 21)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5))
                                    .addComponent(changeFIELD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jLabel46.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("E");

        jLabel47.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("L");

        jLabel48.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("C");

        jLabel49.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("O");

        jLabel50.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("M");

        jLabel51.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("E");

        logoutBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering/images/power_10761371.png"))); // NOI18N
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel46))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel47)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel47)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void amountFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountFIELDActionPerformed
        // TODO add your handling code here:
        try {
            double amountPaid = Double.parseDouble(amountFIELD.getText());
            double totalAmount = Double.parseDouble(totalFIELD.getText());
            double change = amountPaid - totalAmount;

        if (amountPaid >= totalAmount) {
            changeFIELD.setText(String.format("%.2f", change));
        } else {
            JOptionPane.showMessageDialog(this, "Insufficient amount. Please enter a sufficient amount.",
                    "Insufficient Amount", JOptionPane.ERROR_MESSAGE);
            amountFIELD.setText("");
            changeFIELD.setText("0.00");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid amount format. Please enter a valid number.",
                "Invalid Amount", JOptionPane.ERROR_MESSAGE);
        amountFIELD.setText("");
        changeFIELD.setText("0.00");
        }
    }//GEN-LAST:event_amountFIELDActionPerformed

    private void totalFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFIELDActionPerformed

    private void changeFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeFIELDActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to clear all added products?",
            "Clear Confirmation", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {

        orderTableModel.setRowCount(0);

        totalFIELD.setText("0.00");

        JOptionPane.showMessageDialog(this, "All added products have been cleared.",
                "Clear Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_clearBTNActionPerformed

    public void setLoggedInCustomerId(int customerId) {
        loggedInCustomerId = customerId;
    }
    
    private void payBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBTNActionPerformed
        // TODO add your handling code here:
        try {
            double amountPaid = Double.parseDouble(amountFIELD.getText());
            double totalAmount = Double.parseDouble(totalFIELD.getText());

            if (amountPaid >= totalAmount) {
                if (loggedInCustomerId != -1) {
                    storeTransactionToDatabase(loggedInCustomerId);

                    JOptionPane.showMessageDialog(this, "Payment successful!\nThank you for your purchase.",
                            "Payment Success", JOptionPane.INFORMATION_MESSAGE);

                    clearOrderTable();
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "User not authenticated. Please log in.",
                            "Authentication Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient amount. Please enter a sufficient amount.",
                        "Insufficient Amount", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid amount format. Please enter a valid number.",
                    "Invalid Amount", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clearOrderTable() {
        
        DefaultTableModel model = (DefaultTableModel) orderTBL.getModel();
        model.setRowCount(0);
}
    private void clearFields() {
        
        amountFIELD.setText("");
        totalFIELD.setText("0.00");
        changeFIELD.setText("0.00");
    }//GEN-LAST:event_payBTNActionPerformed

    private void storeTransactionToDatabase(int customerId) {
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ordering", "root", " ");

        String insertTransactionQUERY = "INSERT INTO tbl_transaction (Customer_ID, Product_ID, Quantity, Total_Price) VALUES (?, ?, ?, ?)";
        try (PreparedStatement insertTransactionStatement = connection.prepareStatement(insertTransactionQUERY)) {

            for (int row = 0; row < orderTableModel.getRowCount(); row++) {
                String productName = (String) orderTableModel.getValueAt(row, 0);
                Integer productId = getProductId(productName);

                if (productId != null && productId != -1) {
                    int quantity = 0;
                    Object quantityValue = orderTableModel.getValueAt(row, 2);
                    if (quantityValue instanceof Number) {
                        quantity = ((Number) quantityValue).intValue();
                    }

                    double totalPrice = 0.0;
                    Object totalPriceValue = orderTableModel.getValueAt(row, 3);
                    if (totalPriceValue instanceof Number) {
                        totalPrice = ((Number) totalPriceValue).doubleValue();
                    }
                    
                    insertTransactionStatement.setInt(1, customerId);
                    insertTransactionStatement.setInt(2, productId.intValue());
                    insertTransactionStatement.setInt(3, quantity);
                    insertTransactionStatement.setDouble(4, totalPrice);

                    insertTransactionStatement.executeUpdate();
                } else {
                    System.out.println("No product found for: " + productName);
                }
            }
        }

        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    // get product_id from db
    private Integer getProductId(String productName) {
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ordering", "root", " ")) {
        String selectProductSQL = "SELECT Product_ID FROM tbl_product WHERE Product_name = ?";
        try (PreparedStatement selectProductStatement = connection.prepareStatement(selectProductSQL)) {
            selectProductStatement.setString(1, productName);

            try (ResultSet resultSet = selectProductStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("Product_ID");
                } else {
                    return -1;
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return -1;
    }
}

    // functions sa each ADD button
    private void processorADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processorADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("Processor", processorSPINNER);
    }//GEN-LAST:event_processorADDActionPerformed

    private void motherboardADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherboardADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("Motherboard", motherboardSPINNER);
    }//GEN-LAST:event_motherboardADDActionPerformed

    private void graphicscardADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphicscardADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("Graphics Card", graphicscardSPINNER);
    }//GEN-LAST:event_graphicscardADDActionPerformed

    private void memoryADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryADDActionPerformed
        // TODO add your handling code here:
         addProductToOrder("Memory", memorySPINNER);
    }//GEN-LAST:event_memoryADDActionPerformed

    private void ssdADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssdADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("SSD", ssdSPINNER);
    }//GEN-LAST:event_ssdADDActionPerformed

    private void powersupplyADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powersupplyADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("Power Supply", powersupplySPINNER);
    }//GEN-LAST:event_powersupplyADDActionPerformed

    private void pccaseADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pccaseADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("PC Case", pccaseSPINNER);
    }//GEN-LAST:event_pccaseADDActionPerformed

    private void monitorADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("Monitor", monitorSPINNER);
    }//GEN-LAST:event_monitorADDActionPerformed

    private void keyboardADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyboardADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("Keyboard", keyboardSPINNER);
    }//GEN-LAST:event_keyboardADDActionPerformed

    private void mouseADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouseADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("Mouse", mouseSPINNER);
    }//GEN-LAST:event_mouseADDActionPerformed

    private void headsetADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headsetADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("Headset", headsetSPINNER);
    }//GEN-LAST:event_headsetADDActionPerformed

    private void avrADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avrADDActionPerformed
        // TODO add your handling code here:
        addProductToOrder("AVR", avrSPINNER);
    }//GEN-LAST:event_avrADDActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Logout", JOptionPane.YES_NO_OPTION);
    
        if (option == JOptionPane.YES_OPTION) {
            LogIn loginWindow = new LogIn();
            loginWindow.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutBTNActionPerformed
    
    // method to add the desired product to the table (console)
    private void addProductToOrder(String productName, javax.swing.JSpinner spinner) {
        try {
            int quantity = (int) spinner.getValue();

            if (productName != null && quantity > 0) {
                productName = productName.trim();

                System.out.println("Adding product to order: " + productName);

                double unitPrice = getProductUnitPrice(productName);
                double totalPrice = quantity * unitPrice;

                int existingRow = findExistingProductRow(productName);

            if (existingRow != -1) {
                int existingQuantity = (int) orderTableModel.getValueAt(existingRow, 2);
                int newQuantity = existingQuantity + quantity;
                double newTotalPrice = newQuantity * unitPrice;

                orderTableModel.setValueAt(newQuantity, existingRow, 2);
                orderTableModel.setValueAt(newTotalPrice, existingRow, 3);
            } else {
                Object[] rowData = {productName, unitPrice, quantity, totalPrice};
                orderTableModel.insertRow(0, rowData);
            }

                updateTotal();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid product or quantity.", "Invalid Product or Quantity", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
        }
    }


    private int findExistingProductRow(String productName) {
    for (int row = 0; row < orderTableModel.getRowCount(); row++) {
        String existingProductName = (String) orderTableModel.getValueAt(row, 0);
        if (productName.equalsIgnoreCase(existingProductName)) {
            return row;
        }
    }
    return -1;
}

    private double getProductUnitPrice(String productName) {
        switch (productName) {
            case "Processor":
                return 6199.00;
            case "Motherboard":
                return 4205.00;
            case "Graphics Card":
                return 9380.00;
            case "Memory":
                return 1049.00;
            case "SSD":
                return 2235.00;
            case "Power Supply":
                return 1653.00;
            case "PC Case":
                return 1445.00;
            case "Monitor":
                return 3950.00;
            case "Keyboard":
                return 1280.00;
            case "Mouse":
                return 245.00;
            case "Headset":
                return 789.00;
            case "AVR":
                return 275.00;
            default:
                return 0.00;
        }
    }

    /* manually added products to tbl_product
    INSERT INTO tbl_product (Product_name, Product_price) VALUES
('Processor', 6199.00),
('Motherboard', 4205.00),
('Graphics Card', 9380.00),
('Memory', 1049.00),
('SSD', 2235.00),
('Power Supply', 1653.00),
('PC Case', 1445.00),
('Monitor', 3950.00),
('Keyboard', 1280.00),
('Mouse', 245.00),
('Headset', 789.00),
('AVR', 275.00);
    */
    
    private void updateTotal() {
    double total = 0.0;

    for (int row = 0; row < orderTableModel.getRowCount(); row++) {
        Object totalValue = orderTableModel.getValueAt(row, 3);
        if (totalValue != null) {
            if (totalValue instanceof Number) {
                total += ((Number) totalValue).doubleValue();
            } else if (totalValue instanceof String) {
                // Try to parse the String as a Double
                try {
                    total += Double.parseDouble((String) totalValue);
                } catch (NumberFormatException e) {
                    // Handle the exception, e.g., log or show an error message
                }
            }
        }
    }

    totalFIELD.setText(String.format("%.2f", total));
}


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountFIELD;
    private javax.swing.JButton avrADD;
    private javax.swing.JLabel avrLABEL;
    private javax.swing.JLabel avrPRICE;
    private javax.swing.JSpinner avrSPINNER;
    private javax.swing.JTextField changeFIELD;
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton graphicscardADD;
    private javax.swing.JLabel graphicscardLABEL;
    private javax.swing.JLabel graphicscardPRICE;
    private javax.swing.JSpinner graphicscardSPINNER;
    private javax.swing.JButton headsetADD;
    private javax.swing.JLabel headsetLABEL;
    private javax.swing.JLabel headsetPRICE;
    private javax.swing.JSpinner headsetSPINNER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keyboardADD;
    private javax.swing.JLabel keyboardLABEL;
    private javax.swing.JLabel keyboardPRICE;
    private javax.swing.JSpinner keyboardSPINNER;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton memoryADD;
    private javax.swing.JLabel memoryLABEL;
    private javax.swing.JLabel memoryPRICE;
    private javax.swing.JSpinner memorySPINNER;
    private javax.swing.JButton monitorADD;
    private javax.swing.JLabel monitorLABEL;
    private javax.swing.JLabel monitorPRICE;
    private javax.swing.JSpinner monitorSPINNER;
    private javax.swing.JButton motherboardADD;
    private javax.swing.JLabel motherboardLABEL;
    private javax.swing.JLabel motherboardPRICE;
    private javax.swing.JSpinner motherboardSPINNER;
    private javax.swing.JButton mouseADD;
    private javax.swing.JLabel mouseLABEL;
    private javax.swing.JLabel mousePRICE;
    private javax.swing.JSpinner mouseSPINNER;
    private javax.swing.JTable orderTBL;
    private javax.swing.JButton payBTN;
    private javax.swing.JButton pccaseADD;
    private javax.swing.JLabel pccaseLABEL;
    private javax.swing.JLabel pccasePRICE;
    private javax.swing.JSpinner pccaseSPINNER;
    private javax.swing.JButton powersupplyADD;
    private javax.swing.JLabel powersupplyLABEL;
    private javax.swing.JLabel powersupplyPRICE;
    private javax.swing.JSpinner powersupplySPINNER;
    private javax.swing.JButton processorADD;
    private javax.swing.JLabel processorLABEL;
    private javax.swing.JLabel processorPRICE;
    private javax.swing.JSpinner processorSPINNER;
    private javax.swing.JButton ssdADD;
    private javax.swing.JLabel ssdLABEL;
    private javax.swing.JLabel ssdPRICE;
    private javax.swing.JSpinner ssdSPINNER;
    private javax.swing.JTextField totalFIELD;
    // End of variables declaration//GEN-END:variables
}
