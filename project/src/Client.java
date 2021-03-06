/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_server_project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author asmaa
 */
public class Client extends javax.swing.JFrame {

    private Socket socket;
    private DataInputStream input;
    private DataOutputStream output;

    public Client() {
        try {
            initComponents();
            setSize(420, 550);
            setVisible(true);

            socket = new Socket("localhost", 1234);
            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Host not Available",
                    "Error Exception", JOptionPane.ERROR_MESSAGE);
        }

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
        fullname_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phone_txt = new javax.swing.JTextField();
        submit = new javax.swing.JToggleButton();
        background = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 80, 30);

        fullname_txt.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        fullname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullname_txtActionPerformed(evt);
            }
        });
        getContentPane().add(fullname_txt);
        fullname_txt.setBounds(140, 60, 200, 30);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email Addess");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 110, 30);

        email_txt.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        getContentPane().add(email_txt);
        email_txt.setBounds(140, 130, 200, 30);

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 100, 30);

        phone_txt.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        phone_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_txtActionPerformed(evt);
            }
        });
        getContentPane().add(phone_txt);
        phone_txt.setBounds(140, 190, 200, 30);

        submit.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(240, 260, 77, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client_server_project/Tent.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 403, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullname_txtActionPerformed

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void phone_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_txtActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try {
            FileReader reader = new FileReader("information.txt");
            Scanner myReader = new Scanner(reader);
            String data ="";
            while (myReader.hasNextLine()) {
                data += myReader.nextLine()+"\n";
                System.out.println(data);
            }
            myReader.close();
            FileWriter writer = new FileWriter("information.txt");
            String fn = "Full Name : " + fullname_txt.getText() + "\n";
            String em = "Email : " + email_txt.getText() + "\n";
            String ph = "Phone : " + phone_txt.getText();
             
            writer.write(data);
            writer.write(fn);
            writer.write(em);
            writer.write(ph);

            writer.close();

        } catch (IOException ex) {
           
        }


    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton background;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField fullname_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JToggleButton submit;
    // End of variables declaration//GEN-END:variables
}
