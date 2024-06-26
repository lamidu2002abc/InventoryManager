/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JujubesInventoryManager.Frontend;

import JujubesInventoryManager.Backend.SQLStatisticsManager;
import java.awt.Color;
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
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author User
 */
public class ViewTransactions extends javax.swing.JFrame {

    /**
     * Creates new form ViewTransactions
     */
    public ViewTransactions() {
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
        jProgressBar1.setVisible(false);
        jButton1.setBackground(new java.awt.Color(118,171,174));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(49, 54, 63));

        jLabel1.setBackground(new java.awt.Color(49, 54, 63));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Transactions History");

        jSeparator1.setBackground(new java.awt.Color(118, 171, 174));
        jSeparator1.setForeground(new java.awt.Color(118, 171, 174));

        jCheckBox1.setBackground(new java.awt.Color(49, 54, 63));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(238, 238, 238));
        jCheckBox1.setText("Select time range");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

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
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(49, 54, 63));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(238, 238, 238));
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Month history");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jPanel4.setLayout(new java.awt.BorderLayout());

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
        jTable1.setGridColor(new java.awt.Color(124, 124, 124));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        Boolean isPressed = jCheckBox1.isSelected();
        jTextField1.setEnabled(isPressed);
        jTextField2.setEnabled(isPressed);
        jTextField3.setEnabled(isPressed);
        jTextField4.setEnabled(isPressed);
        jTextField5.setEnabled(isPressed);
        jTextField6.setEnabled(isPressed);
        jCheckBox2.setSelected(!isPressed);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Thread newThread = new Thread(()->{
            try{
                jProgressBar1.setVisible(true);
                if(jCheckBox1.isSelected()){
                    int intValidateFlag = 0;
                    if(validateInt(jTextField1)==-1){
                        intValidateFlag = 1;
                        jTextField1.setBackground(Color.red);
                    }else jTextField1.setBackground(new java.awt.Color(34,40,49));
                    if(validateInt(jTextField2)==-1){
                        intValidateFlag = 1;
                        jTextField2.setBackground(Color.red);
                    }else jTextField2.setBackground(new java.awt.Color(34,40,49));
                    if(validateInt(jTextField3)==-1){
                        intValidateFlag = 1;
                        jTextField3.setBackground(Color.red);
                    }else jTextField3.setBackground(new java.awt.Color(34,40,49));
                    if(validateInt(jTextField4)==-1){
                        intValidateFlag = 1;
                        jTextField4.setBackground(Color.red);
                    }else jTextField4.setBackground(new java.awt.Color(34,40,49));
                    if(validateInt(jTextField5)==-1){
                        intValidateFlag = 1;
                        jTextField5.setBackground(Color.red);
                    }else jTextField5.setBackground(new java.awt.Color(34,40,49));
                    if(validateInt(jTextField6)==-1){
                        intValidateFlag = 1;
                        jTextField6.setBackground(Color.red);
                    }else jTextField6.setBackground(new java.awt.Color(34,40,49));
                    
                    if(intValidateFlag==0){
                        String sDate = jTextField1.getText() + "-" +jTextField2.getText() + "-" + jTextField3.getText();
                        String eDate = jTextField4.getText() + "-" +jTextField5.getText() + "-" + jTextField6.getText();

                        System.out.println(sDate);
                        System.out.println(eDate);
                        jProgressBar1.setValue(5);
                        List<Object[]> rows = SQLStatisticsManager.getHistory(2,sDate,eDate);
                        jProgressBar1.setValue(10);
                        loadTable(rows);
                    }
                }
                else if (jCheckBox2.isSelected()){
                    String sDate = getYearMonth()+"-01";
                    jProgressBar1.setValue(5);
                    List<Object[]> rows = SQLStatisticsManager.getHistory(2,sDate,getYearMonthDate());
                    jProgressBar1.setValue(10);
                    
                    jTextField1.setText(getYear());
                    jTextField2.setText(getMonth());
                    jTextField3.setText("01");
                    jTextField4.setText(getYear());
                    jTextField5.setText(getMonth());
                    jTextField6.setText(getDate());
                    
                    loadTable(rows);
                }
            }
            catch(SQLException exc){
                System.out.println(exc.getMessage());
            }
        
        });
        newThread.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        Boolean flag = jCheckBox2.isSelected();
        jTextField1.setEnabled(!flag);
        jTextField2.setEnabled(!flag);
        jTextField3.setEnabled(!flag);
        jTextField4.setEnabled(!flag);
        jTextField5.setEnabled(!flag);
        jTextField6.setEnabled(!flag);
        jCheckBox1.setSelected(!flag);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private int validateInt(JTextField t){
        int x;
        try{
            x = Integer.parseInt(t.getText());
            return 1;
        }
        catch(NumberFormatException exc){
            System.out.println(exc.getMessage());
            return -1;
        }
    }
    private void loadTable(List<Object[]> rows) {
        Thread newThread = new Thread(()->{
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel();
            jTable1.setModel(model);
            model.addColumn("Date");
            model.addColumn("Customer Name");
            model.addColumn("Customer Number");
            model.addColumn("Customer Address");
            model.addColumn("Stock Id");
            model.addColumn("Category Id");
            model.addColumn("Category");
            model.addColumn("Color");
            model.addColumn("Size");
            model.addColumn("Count");

            TableColumn column0 = jTable1.getColumnModel().getColumn(0);
            TableColumn column4 = jTable1.getColumnModel().getColumn(4);
            TableColumn column5 = jTable1.getColumnModel().getColumn(5);
            TableColumn column8 = jTable1.getColumnModel().getColumn(8);
            TableColumn column9 = jTable1.getColumnModel().getColumn(9);

            column0.setPreferredWidth(50);
            column4.setPreferredWidth(40);
            column5.setPreferredWidth(40);
            column8.setPreferredWidth(30);
            column9.setPreferredWidth(40);

            int progressU = 90/rows.size();
            int progressC = 10; 
            for(Object[] row:rows){
                model.addRow(row);
                progressC += progressU;
                jProgressBar1.setValue(progressC);
                try {
                    Thread.sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ViewTransactions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jProgressBar1.setVisible(false);
        });
        newThread.start();
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
    public static String getYear(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String formattedDate = date.format(formatter);
        return formattedDate;
    }
    public static String getMonth(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM");
        String formattedDate = date.format(formatter);
        return formattedDate;
    }
    public static String getDate(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String formattedDate = date.format(formatter);
        return formattedDate;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
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
