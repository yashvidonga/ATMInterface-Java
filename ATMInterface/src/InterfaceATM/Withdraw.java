/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfaceATM;
import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yashvi
 */
public class Withdraw extends javax.swing.JFrame {
    String cardNo;
    /**
     * Creates new form HomePage
     */
    public Withdraw(String cardNo) {
        initComponents();
        this.cardNo = cardNo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        deposite = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pinChange = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        withdraw = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        balance = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        no1 = new javax.swing.JButton();
        no2 = new javax.swing.JButton();
        no3 = new javax.swing.JButton();
        no4 = new javax.swing.JButton();
        no5 = new javax.swing.JButton();
        no6 = new javax.swing.JButton();
        no7 = new javax.swing.JButton();
        no8 = new javax.swing.JButton();
        no9 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        option = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        withdrawAmt = new javax.swing.JTextField();
        pinLabel = new javax.swing.JLabel();
        pinField = new javax.swing.JTextField();
        no0 = new javax.swing.JButton();
        status1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        enter = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome To XYZ ATM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 11, -1, 26));

        deposite.setText(">>>");
        deposite.setEnabled(false);
        deposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeActionPerformed(evt);
            }
        });
        getContentPane().add(deposite, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Deposite");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 65, -1, -1));

        pinChange.setText(">>>");
        pinChange.setEnabled(false);
        pinChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinChangeActionPerformed(evt);
            }
        });
        getContentPane().add(pinChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Change Pin");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 122, -1, -1));

        withdraw.setText("<<<");
        withdraw.setEnabled(false);
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 61, 65, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Withdraw");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 65, -1, -1));

        balance.setText("<<<");
        balance.setEnabled(false);
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 118, 65, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Balance");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 122, -1, -1));

        exit.setText(">>>");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 198, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Exit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 207, -1, -1));

        no1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no1.setText("1");
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });
        getContentPane().add(no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 243, 49, 40));

        no2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no2.setText("2");
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });
        getContentPane().add(no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 243, 49, 40));

        no3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no3.setText("3");
        no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no3ActionPerformed(evt);
            }
        });
        getContentPane().add(no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 243, 49, 40));

        no4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no4.setText("4");
        no4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no4ActionPerformed(evt);
            }
        });
        getContentPane().add(no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 301, 49, 40));

        no5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no5.setText("5");
        no5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no5ActionPerformed(evt);
            }
        });
        getContentPane().add(no5, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 301, 49, 40));

        no6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no6.setText("6");
        no6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no6ActionPerformed(evt);
            }
        });
        getContentPane().add(no6, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 301, 49, 40));

        no7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no7.setText("7");
        no7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no7ActionPerformed(evt);
            }
        });
        getContentPane().add(no7, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 364, 49, 40));

        no8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no8.setText("8");
        no8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no8ActionPerformed(evt);
            }
        });
        getContentPane().add(no8, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 363, 49, 42));

        no9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no9.setText("9");
        no9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no9ActionPerformed(evt);
            }
        });
        getContentPane().add(no9, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 364, 49, 40));

        clear.setBackground(new java.awt.Color(255, 249, 0));
        clear.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 245, 79, 36));

        cancel.setBackground(new java.awt.Color(255, 51, 0));
        cancel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 301, 79, 37));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 118, -1, -1));

        next.setBackground(new java.awt.Color(51, 204, 0));
        next.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 361, 79, 35));
        getContentPane().add(option, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 39, 105, 16));

        amt.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        amt.setText("Enter the Amount To be Withdrawn");
        getContentPane().add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 89, -1, -1));

        withdrawAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawAmtActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 86, 125, -1));

        pinLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pinLabel.setText("Enter the Pin");
        pinLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pinLabel.setEnabled(false);
        getContentPane().add(pinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 162, 209, -1));

        pinField.setEnabled(false);
        pinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinFieldActionPerformed(evt);
            }
        });
        getContentPane().add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 159, 125, -1));

        no0.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        no0.setText("0");
        no0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no0ActionPerformed(evt);
            }
        });
        getContentPane().add(no0, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 434, 183, 34));
        getContentPane().add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 207, 166, -1));

        back.setBackground(new java.awt.Color(102, 102, 102));
        back.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 434, 79, 34));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 50));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, 190));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        enter.setText("<<<");
        enter.setEnabled(false);
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Continue");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 140, 190));

        jPanel5.setBackground(new java.awt.Color(126, 190, 253));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 400, 190));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 380, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositeActionPerformed

    private void pinChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinChangeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(null);
        }
        else{
            withdrawAmt.setText(null);
        }
        
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        String amtStr = withdrawAmt.getText();
        String pinStr = pinField.getText();
        if (pinField.isEnabled() && pinStr.length() > 0){
            pinStr = pinStr.substring(0, pinStr.length() - 1);
            pinField.setText(pinStr);
        }
        else if (withdrawAmt.isEnabled() && amtStr.length() > 0){
            amtStr = amtStr.substring(0, amtStr.length() - 1);
            withdrawAmt.setText(amtStr);
        }
        else{
            status.setText("Field Empty");
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        PreparedStatement pst = null;
        Connection connector = null;
        int pin = Integer.parseInt(pinField.getText());
        double amt1 = Double.parseDouble(withdrawAmt.getText());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connector = DriverManager.getConnection("jdbc:mysql://localhost:8111/atm_users?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            pst = connector.prepareStatement("SELECT * FROM `users` WHERE `Card No.` = ?");
            pst.setString(1,cardNo);
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                int pinDatabase = rs.getInt(2);
                double amtDatabase = rs.getDouble(3);
                if (pin == pinDatabase){
                    if (amt1 <= amtDatabase){
                        amtDatabase -= amt1;
                        String amtT = Double.toString(amtDatabase);
                        String query = "UPDATE `users` SET `balance_amount` = " + amtT + " WHERE `Card No.` = " + cardNo;
                        pst.executeUpdate(query);
                        status1.setText("Amount Withdrawn");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Deposite.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        setVisible(false);
                        Thankyou form1;
                        form1 = new Thankyou();
                        form1.setVisible(true);
                    }
                    else{
                        status1.setText("Invalid Amount");
                        pinField.setEnabled(false);
                        pinLabel.setEnabled(false);
                        withdrawAmt.setEnabled(true);
                        amt.setEnabled(true);
                    }
                }
                else{
                    status1.setText("Incorrent Pin");
                }
            }
            
            pst.close();
            connector.close();
            }
        catch(ClassNotFoundException | SQLException e){ System.out.println("ERROR"+ e); }
    }//GEN-LAST:event_enterActionPerformed

    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no1ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "1");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "1");
        }
    }//GEN-LAST:event_no1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        pinField.setEnabled(true);
        pinLabel.setEnabled(true);
        withdrawAmt.setEnabled(false);
        back.setEnabled(false);
        amt.setEnabled(false);
        enter.setEnabled(true);
    }//GEN-LAST:event_nextActionPerformed

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no2ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "2");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "2");
        }
    }//GEN-LAST:event_no2ActionPerformed

    private void no3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no3ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "3");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "3");
        }
    }//GEN-LAST:event_no3ActionPerformed

    private void no4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no4ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "4");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "4");
        }
    }//GEN-LAST:event_no4ActionPerformed

    private void no5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no5ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "5");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "5");
        }
    }//GEN-LAST:event_no5ActionPerformed

    private void no6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no6ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "6");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "6");
        }
    }//GEN-LAST:event_no6ActionPerformed

    private void no7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no7ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "7");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "7");
        }
    }//GEN-LAST:event_no7ActionPerformed

    private void no8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no8ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "8");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "8");
        }
    }//GEN-LAST:event_no8ActionPerformed

    private void no9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no9ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "9");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "9");
        }
    }//GEN-LAST:event_no9ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void withdrawAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawAmtActionPerformed

    private void pinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinFieldActionPerformed

    private void no0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no0ActionPerformed
        status.setText("");
        if (pinField.isEnabled()){
            pinField.setText(pinField.getText() + "0");
        }
        else{
            withdrawAmt.setText(withdrawAmt.getText() + "0");
        }
    }//GEN-LAST:event_no0ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        HomePage form1 = new HomePage();
        form1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amt;
    private javax.swing.JButton back;
    private javax.swing.JButton balance;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton deposite;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton next;
    private javax.swing.JButton no0;
    private javax.swing.JButton no1;
    private javax.swing.JButton no2;
    private javax.swing.JButton no3;
    private javax.swing.JButton no4;
    private javax.swing.JButton no5;
    private javax.swing.JButton no6;
    private javax.swing.JButton no7;
    private javax.swing.JButton no8;
    private javax.swing.JButton no9;
    private javax.swing.JLabel option;
    private javax.swing.JButton pinChange;
    private javax.swing.JTextField pinField;
    private javax.swing.JLabel pinLabel;
    private javax.swing.JLabel status;
    private javax.swing.JLabel status1;
    private javax.swing.JButton withdraw;
    private javax.swing.JTextField withdrawAmt;
    // End of variables declaration//GEN-END:variables
}
