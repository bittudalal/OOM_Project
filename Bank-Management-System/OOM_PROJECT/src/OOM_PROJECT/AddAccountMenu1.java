/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOM_PROJECT;

import javax.swing.JOptionPane;
import javax.swing.JDialog;

/**
 *
 * @author Taru
 */
public class AddAccountMenu1 extends javax.swing.JDialog {

    /**
     * Creates new form AddAccountMenu1
     */
    Customer customer ;
    public AddAccountMenu1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        setVisible(true);
        customer = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstName = new javax.swing.JLabel();
        First = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        Last = new javax.swing.JTextField();
        MobileNO = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        InitialDeposit = new javax.swing.JLabel();
        Deposit = new javax.swing.JTextField();
        AccountType = new javax.swing.JLabel();
        typefield = new javax.swing.JComboBox();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new java.awt.GridLayout(6, 2, 5, 5));

        FirstName.setText("First Name");
        getContentPane().add(FirstName);

        First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstActionPerformed(evt);
            }
        });
        getContentPane().add(First);

        LastName.setText("Last Namae");
        getContentPane().add(LastName);
        getContentPane().add(Last);

        MobileNO.setText("Mobile No.");
        getContentPane().add(MobileNO);
        getContentPane().add(jTextField3);

        InitialDeposit.setText("Initial Deposit ");
        getContentPane().add(InitialDeposit);
        getContentPane().add(Deposit);

        AccountType.setText("Account Type");
        getContentPane().add(AccountType);

        typefield.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--None--", "Savings", "Checking", "Loan" }));
        getContentPane().add(typefield);

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        if(First.getText().isEmpty()){
             //JOptionPane optionPane = new JOptionPane("First name must not be empty",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(this,"First name must not be empty", "Input Error",JOptionPane.WARNING_MESSAGE);
      //    Toolkit.getDefaultToolkit().beep();
        
        }
        else if (Deposit.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"There must be some initial deposit", "Input Error",JOptionPane.WARNING_MESSAGE);
        }
        try{
            double d = Float.parseFloat(Deposit.getText());
        }catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Invalid Deposit Amount", "Input Error",JOptionPane.WARNING_MESSAGE);
        }
        Account account = null;
        if(typefield.getSelectedItem().toString()=="Checking"){
            account = new Checking(Float.parseFloat(Deposit.getText()));
        }
        else if(typefield.getSelectedItem().toString()=="Savings"){
            account = new Savings(Float.parseFloat(Deposit.getText()));
        }
        else if(typefield.getSelectedItem().toString()=="Loan"){
            account = new Loan(Float.parseFloat(Deposit.getText()));
        }
        else{
            JOptionPane.showMessageDialog(this,"Please Select Account type", "Input Error",JOptionPane.WARNING_MESSAGE);
        }
        customer = new Customer(First.getText(),Last.getText(),account,jTextField3.getText());
        this.dispose();
        
         
    }//GEN-LAST:event_okActionPerformed

    private void FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_cancelActionPerformed
    public Customer getCustomer(){
        return customer;
    }
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
            java.util.logging.Logger.getLogger(AddAccountMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAccountMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAccountMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAccountMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddAccountMenu1 dialog = new AddAccountMenu1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountType;
    private javax.swing.JTextField Deposit;
    private javax.swing.JTextField First;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel InitialDeposit;
    private javax.swing.JTextField Last;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel MobileNO;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox typefield;
    // End of variables declaration//GEN-END:variables
}