/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.SQLStatisticsManager;
import java.awt.Component;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class Dashboard1_2 extends javax.swing.JFrame {

    public Dashboard1_2()   {
        initComponents();
        
        jScrollPane1.getViewport().setBackground(new java.awt.Color(34, 40, 49));
        jScrollPane1.setBorder(null);
        jScrollPane1.getViewport().setBorder(null);
        JTableHeader header = jTable1.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setBackground(new java.awt.Color(118,171,174)); // Set your desired header background color
                return this;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(49, 54, 63));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        jProgressBar1.setVisible(false);

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(34, 40, 49));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(34, 40, 49));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jCheckBox1.setBackground(new java.awt.Color(49, 54, 63));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(238, 238, 238));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Month history");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(49, 54, 63));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(238, 238, 238));
        jCheckBox2.setText("Select time range");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(49, 54, 63));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Analytics");

        jLabel2.setBackground(new java.awt.Color(49, 54, 63));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("From");

        jLabel3.setBackground(new java.awt.Color(49, 54, 63));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("To");

        jTextField1.setBackground(new java.awt.Color(34, 40, 49));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("");
        jTextField1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField1.setEnabled(false);

        jTextField2.setBackground(new java.awt.Color(34, 40, 49));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setToolTipText("");
        jTextField2.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField2.setEnabled(false);

        jTextField3.setBackground(new java.awt.Color(34, 40, 49));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setToolTipText("");
        jTextField3.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField3.setEnabled(false);

        jTextField4.setBackground(new java.awt.Color(34, 40, 49));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setToolTipText("");
        jTextField4.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField4.setEnabled(false);

        jTextField5.setBackground(new java.awt.Color(34, 40, 49));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setToolTipText("");
        jTextField5.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField5.setEnabled(false);

        jTextField6.setBackground(new java.awt.Color(34, 40, 49));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setToolTipText("");
        jTextField6.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField6.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(118, 171, 174));
        jSeparator1.setForeground(new java.awt.Color(118, 171, 174));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Total summery", "Overall Amount", "Size Amount", "Color Amount", "Overall Quantity", "Size Quantity", "Color Quantity", "Overall Profit", "SIze Profit", "Color Profit", "Stock Profit" }));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        Boolean flag = jCheckBox1.isSelected();
        jTextField1.setEnabled(!flag);
        jTextField2.setEnabled(!flag);
        jTextField3.setEnabled(!flag);
        jTextField4.setEnabled(!flag);
        jTextField5.setEnabled(!flag);
        jTextField6.setEnabled(!flag);
        jCheckBox2.setSelected(!flag);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        Boolean isPressed = jCheckBox2.isSelected();
        jTextField1.setEnabled(isPressed);
        jTextField2.setEnabled(isPressed);
        jTextField3.setEnabled(isPressed);
        jTextField4.setEnabled(isPressed);
        jTextField5.setEnabled(isPressed);
        jTextField6.setEnabled(isPressed);
        jCheckBox1.setSelected(!isPressed);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (jComboBox1.getSelectedIndex()){
            case 0:
                getUserInput(1);
                break;
            case 1:
                getUserInput(2);
                break;
            case 2:
                getUserInput(3);
                break;
            case 3:
                getUserInput(4);
                break;
            case 4:
                getUserInput(5);
                break;
            case 5:
                getUserInput(6);
                break;
            case 6:
                getUserInput(7);
                break;
            case 7:
                getUserInput(8);
                break;
            case 8:
                getUserInput(9);
                break;
            case 9:
                getUserInput(10);
                break;
            case 10:
                getUserInput(11);
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel4.setText("");
        jComboBox1.setSelectedIndex(0);
        jTable1.setModel(new DefaultTableModel());
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        
        Boolean flag = jCheckBox1.isSelected();
        jTextField1.setEnabled(!flag);
        jTextField2.setEnabled(!flag);
        jTextField3.setEnabled(!flag);
        jTextField4.setEnabled(!flag);
        jTextField5.setEnabled(!flag);
        jTextField6.setEnabled(!flag);
        jCheckBox2.setSelected(!flag);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void getUserInput(int stMode){
        Thread newThread = new Thread(()->{
            try {
                jProgressBar1.setVisible(true);
                jProgressBar1.setValue(5);
                Thread.sleep(80);
            } catch (InterruptedException ex) {
                Logger.getLogger(Dashboard1_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        newThread.start();
        
        if(jCheckBox2.isSelected()){
            //date range
            if(validateInteger(jTextField1)==1 && validateInteger(jTextField2)==1 && validateInteger(jTextField3)==1 && validateInteger(jTextField4)==1 && validateInteger(jTextField5)==1 && validateInteger(jTextField6)==1){
                String sDate = jTextField1.getText()+"-"+jTextField2.getText()+"-"+jTextField3.getText();
                String eDate = jTextField4.getText()+"-"+jTextField5.getText()+"-"+jTextField6.getText();
                jLabel4.setText(sDate+" to "+eDate);
                jTextField1.setBackground(new java.awt.Color(34,40,49));
                jTextField2.setBackground(new java.awt.Color(34,40,49));
                jTextField3.setBackground(new java.awt.Color(34,40,49));
                jTextField4.setBackground(new java.awt.Color(34,40,49));
                jTextField5.setBackground(new java.awt.Color(34,40,49));
                jTextField6.setBackground(new java.awt.Color(34,40,49));
                
                try {
                    switch(stMode){
                        case 1:
                            this.loadTotalSummery(SQLStatisticsManager.getTotalSummery(sDate,eDate));
                            break;
                        case 2:
                            this.loadOverallAmountTable(SQLStatisticsManager.getOverallAmount(sDate,eDate));
                            break;
                        case 3:
                            this.loadSizeAmountTable(SQLStatisticsManager.getSizeAmount(sDate,eDate));
                            break;
                        case 4:
                            this.loadColorAmountTable(SQLStatisticsManager.getStockColorAmount(sDate,eDate));
                            break;
                        case 5:
                            this.loadOverallCountTable(SQLStatisticsManager.getOverallCount(sDate,eDate));
                            break;
                        case 6:
                            this.loadSizeCountTable(SQLStatisticsManager.getSizeCount(sDate,eDate));
                            break;
                        case 7:
                            this.loadColorCountTable(SQLStatisticsManager.getStockColorCount(sDate,eDate));
                            break;
                        case 8:
                            this.loadOverallProfitTable(SQLStatisticsManager.getOverallProfit(sDate,eDate));
                            break;
                        case 9:
                            this.loadSizeProfitTable(SQLStatisticsManager.getSizeProfit(sDate,eDate));
                            break;
                        case 10:
                            this.loadColorProfitTable(SQLStatisticsManager.getColorProfit(sDate,eDate));
                            break;
                        case 11:
                            this.loadStockProfitTable(SQLStatisticsManager.getStockProfit(sDate,eDate));
                            break;
                        default:
                            break;
                    }
                } 
                catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else {
                if (validateInteger(jTextField1)==-1) jTextField1.setBackground(new java.awt.Color(255,0,0));
                else jTextField1.setBackground(new java.awt.Color(34,40,49));
                if (validateInteger(jTextField2)==-1) jTextField2.setBackground(new java.awt.Color(255,0,0));
                else jTextField2.setBackground(new java.awt.Color(34,40,49));
                if (validateInteger(jTextField3)==-1) jTextField3.setBackground(new java.awt.Color(255,0,0));
                else jTextField3.setBackground(new java.awt.Color(34,40,49));
                if (validateInteger(jTextField4)==-1) jTextField4.setBackground(new java.awt.Color(255,0,0));
                else jTextField4.setBackground(new java.awt.Color(34,40,49));
                if (validateInteger(jTextField5)==-1) jTextField5.setBackground(new java.awt.Color(255,0,0));
                else jTextField5.setBackground(new java.awt.Color(34,40,49));
                if (validateInteger(jTextField6)==-1) jTextField6.setBackground(new java.awt.Color(255,0,0));
                else jTextField6.setBackground(new java.awt.Color(34,40,49));
            }
        }
        else{
            try {
                String sDate = getYearMonth()+"-01";
                jLabel4.setText(sDate+" to "+getYearMonthDate());
                switch(stMode){
                    case 1:
                        this.loadTotalSummery(SQLStatisticsManager.getTotalSummery(sDate,getYearMonthDate()));
                        break;
                    case 2:
                        this.loadOverallAmountTable(SQLStatisticsManager.getOverallAmount(sDate,getYearMonthDate()));
                        break;
                    case 3:
                        this.loadSizeAmountTable(SQLStatisticsManager.getSizeAmount(sDate,getYearMonthDate()));
                        break;
                    case 4:
                        this.loadColorAmountTable(SQLStatisticsManager.getStockColorAmount(sDate,getYearMonthDate()));
                        break;
                    case 5:
                        this.loadOverallCountTable(SQLStatisticsManager.getOverallCount(sDate,getYearMonthDate()));
                        break;
                    case 6:
                        this.loadSizeCountTable(SQLStatisticsManager.getSizeCount(sDate,getYearMonthDate()));
                        break;
                    case 7:
                        this.loadColorCountTable(SQLStatisticsManager.getStockColorCount(sDate,getYearMonthDate()));
                        break;
                    case 8:
                        this.loadOverallProfitTable(SQLStatisticsManager.getOverallProfit(sDate,getYearMonthDate()));
                        break;
                    case 9:
                        this.loadSizeProfitTable(SQLStatisticsManager.getSizeProfit(sDate,getYearMonthDate()));
                        break;
                    case 10:
                        this.loadColorProfitTable(SQLStatisticsManager.getColorProfit(sDate,getYearMonthDate()));
                        break;
                    case 11:
                        this.loadStockProfitTable(SQLStatisticsManager.getStockProfit(sDate,getYearMonthDate()));
                        break;
                    default:
                        break;
                }
            } 
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    private void createTable(List<Object[]> rows, String[] columnNames, int[] rsIndexes){
        Thread newThread = new Thread(()->{
            System.out.println("creating table");
            DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);
            jProgressBar1.setValue(10);
            int progressCount = 0;
            try{
                for(String name:columnNames){
                    model.addColumn(name);
                }
                jProgressBar1.setValue(20);
                for (Object[] row : rows) {
                    progressCount+=80/rows.size();
                    if(rsIndexes!=null){
                        //adding "Rs" for relavent columns in the row
                        for(int index : rsIndexes){
                            row[index] = "Rs." + row[index]; 
                        }
                    }
                    model.addRow(row);
                    jProgressBar1.setValue(progressCount);
                }
                Thread.sleep(80);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(Dashboard1_2.class.getName()).log(Level.SEVERE, null, ex);
            }
            jProgressBar1.setVisible(false);
        });
        newThread.start();
    }
    private int validateInteger(JTextField tf) {
        int result = -1;
        try {
            result = Integer.parseInt(tf.getText());
            return 1;
        } catch (NumberFormatException exc) {
            System.out.println(exc.getMessage());
        }
        return -1;
    }
   
    private void loadTotalSummery(List<Object[]> rows){
        createTable(rows, new String[]{"Sold Amount","Sold quantity","Income(Profit)","Cost"},new int[]{0,2,3});
    }
    
    private void loadOverallAmountTable(List<Object[]> rows) {
        createTable(rows, new String[]{"Category id","Category name","Amount"},new int[]{2});
    }
    private void loadSizeAmountTable(List<Object[]> rows){
        createTable(rows, new String[]{"Category id","Category name","Size","Amount"},new int[]{3});
    }
    private void loadColorAmountTable(List<Object[]> rows){
        createTable(rows, new String[]{"Stock id","Category id","Category name","Size","Color","Amount"},new int[]{5});
    }
    
    private void loadOverallCountTable(List<Object[]> rows){
        createTable(rows, new String[]{"Category id","Category name","sold item"},null);
    }
    private void loadSizeCountTable(List<Object[]> rows){
        createTable(rows,new String[]{"Category id","Category name","Size","sold item"},null);
    }
    private void loadColorCountTable(List<Object[]> rows){
        createTable(rows,new String[]{"Stock id","Category id","Category name","Size","color","sold item"},null);
    }
    
    private void loadOverallProfitTable(List<Object[]> rows){
        createTable(rows,new String[]{"Category id","Category name","Profit"},new int[]{2});
    }
    private void loadSizeProfitTable(List<Object[]> rows){
        createTable(rows,new String[]{"Category id","Category name","Size","Sold item","Profit"},null);
    }
    private void loadColorProfitTable(List<Object[]> rows){
        createTable(rows,new String[]{"Category id","Category name","Size","color","Sold item","Profit"},new int[]{5});
    }
    private void loadStockProfitTable(List<Object[]> rows){
        createTable(rows,new String[]{"Stock id","Category id","Category name","Size","color","sold item","buying price","selling price","Profit"},new int[]{6,7,8});
    }
    
    public static String getYearMonthDate(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);
        return formattedDate;
    }
    public static String getYearMonth(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        String formattedDate = date.format(formatter);
        return formattedDate;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
