/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfaceATM;
import java.sql.*;  

/**
 *
 * @author Yashvi
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        CardNo = new javax.swing.JTextField();
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
        enter = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        option = new javax.swing.JLabel();
        click = new javax.swing.JLabel();
        no0 = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Welcome To XYZ ATM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 11, 126, 26));

        jLabel2.setText("PLEASE ENTER YOUR CARD NO.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 61, 180, 29));

        CardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardNoActionPerformed(evt);
            }
        });
        getContentPane().add(CardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 65, 170, -1));

        deposite.setText(">>>");
        deposite.setEnabled(false);
        deposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeActionPerformed(evt);
            }
        });
        getContentPane().add(deposite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, -1, -1));

        jLabel3.setText("Deposite");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 68, -1, -1));

        pinChange.setText(">>>");
        pinChange.setEnabled(false);
        pinChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinChangeActionPerformed(evt);
            }
        });
        getContentPane().add(pinChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, -1, -1));

        jLabel4.setText("Change Pin");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 118, -1, -1));

        withdraw.setText("<<<");
        withdraw.setEnabled(false);
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 64, 65, -1));

        jLabel5.setText("Withdraw");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        balance.setText("<<<");
        balance.setEnabled(false);
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 114, 65, -1));

        jLabel6.setText("Balance");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        exit.setText(">>>");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 185, -1, -1));

        jLabel7.setText("Exit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 189, -1, -1));

        no1.setText("1");
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });
        getContentPane().add(no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 226, 49, 40));

        no2.setText("2");
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });
        getContentPane().add(no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 226, 49, 40));

        no3.setText("3");
        no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no3ActionPerformed(evt);
            }
        });
        getContentPane().add(no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 226, 49, 40));

        no4.setText("4");
        no4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no4ActionPerformed(evt);
            }
        });
        getContentPane().add(no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 284, 49, 40));

        no5.setText("5");
        no5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no5ActionPerformed(evt);
            }
        });
        getContentPane().add(no5, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 284, 49, 40));

        no6.setText("6");
        no6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no6ActionPerformed(evt);
            }
        });
        getContentPane().add(no6, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 284, 49, 40));

        no7.setText("7");
        no7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no7ActionPerformed(evt);
            }
        });
        getContentPane().add(no7, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 347, 49, 40));

        no8.setText("8");
        no8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no8ActionPerformed(evt);
            }
        });
        getContentPane().add(no8, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 346, 49, 42));

        no9.setText("9");
        no9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no9ActionPerformed(evt);
            }
        });
        getContentPane().add(no9, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 347, 49, 40));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 228, 79, 36));

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 284, 80, 37));

        enter.setText("<<<");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        getContentPane().add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 185, 65, -1));

        jLabel8.setText("Continue");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 114, -1, -1));

        next.setText("NEXT");
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 344, 79, 35));
        getContentPane().add(option, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 39, 105, 16));
        getContentPane().add(click, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 143, -1, -1));

        no0.setText("0");
        no0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no0ActionPerformed(evt);
            }
        });
        getContentPane().add(no0, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 406, 183, 32));

        back.setText("BACK");
        back.setEnabled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 406, 79, 32));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardNoActionPerformed

    private void depositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeActionPerformed
        setVisible(false);
        String cardNo = CardNo.getText();
        Deposite form1 = new Deposite(cardNo);
        form1.setVisible(true);
    }//GEN-LAST:event_depositeActionPerformed

    private void pinChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinChangeActionPerformed
        setVisible(false);
        String cardNo = CardNo.getText();
        ChangeAccPin form2 = new ChangeAccPin(cardNo);
        form2.setVisible(true);
    }//GEN-LAST:event_pinChangeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        CardNo.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        String card_str = CardNo.getText();
        if (card_str.length() > 0){
            status.setText("");
            card_str = card_str.substring(0, card_str.length() - 1);
        }
        else{
            status.setText("Field Empty");
        }
        CardNo.setText(card_str);
    }//GEN-LAST:event_cancelActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        PreparedStatement pst = null;
        Connection connector = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connector = DriverManager.getConnection("jdbc:mysql://localhost:8111/atm_users?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            pst = connector.prepareStatement("SELECT * FROM `users` WHERE `Card No.` = ?");
            pst.setString(1,CardNo.getText());
            
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                pst.close();
                connector.close();
                status.setText("Card Found");
                click.setText("Please click on the desire button for the next operation");
                deposite.setEnabled(true);
                pinChange.setEnabled(true);
                withdraw.setEnabled(true);
                balance.setEnabled(true);
                back.setEnabled(true);
            }
            else{
                status.setText("Card NOT Found");
            }
}
        catch(ClassNotFoundException | SQLException e){ System.out.println("ERROR"+ e); }
    }//GEN-LAST:event_enterActionPerformed

    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no1ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "1");
    }//GEN-LAST:event_no1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no2ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "2");
    }//GEN-LAST:event_no2ActionPerformed

    private void no3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no3ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "3");
    }//GEN-LAST:event_no3ActionPerformed

    private void no4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no4ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "4");
    }//GEN-LAST:event_no4ActionPerformed

    private void no5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no5ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "5");
    }//GEN-LAST:event_no5ActionPerformed

    private void no6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no6ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "6");
    }//GEN-LAST:event_no6ActionPerformed

    private void no7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no7ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "7");
    }//GEN-LAST:event_no7ActionPerformed

    private void no8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no8ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "8");
    }//GEN-LAST:event_no8ActionPerformed

    private void no9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no9ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "9");
    }//GEN-LAST:event_no9ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void no0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no0ActionPerformed
        status.setText("");
        CardNo.setText(CardNo.getText() + "0");
    }//GEN-LAST:event_no0ActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        setVisible(false);
        String cardNo = CardNo.getText();
        Withdraw form1 = new Withdraw(cardNo);
        form1.setVisible(true);
    }//GEN-LAST:event_withdrawActionPerformed

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
        setVisible(false);
        String cardNo = CardNo.getText();
        Balance form1 = new Balance(cardNo);
        form1.setVisible(true);
    }//GEN-LAST:event_balanceActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CardNo;
    private javax.swing.JButton back;
    private javax.swing.JButton balance;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JLabel click;
    private javax.swing.JButton deposite;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JLabel status;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
