 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.unifio.barbersoft;

import LoginBarbersoftController.loginControler;
import LoginBarbersoftDAO.loginDAO;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author educo
 */
public class telaI1Login extends javax.swing.JFrame {

    /**
     * Creates new form telaInicial
     */
    public telaI1Login() {
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

        lbLogin = new javax.swing.JLabel();
        lbCadastro = new javax.swing.JLabel();
        txtEmailLogin = new javax.swing.JTextField();
        pwSenhaLogin = new javax.swing.JPasswordField();
        btLoginCLI = new javax.swing.JButton();
        btLoginADM = new javax.swing.JButton();
        btRegistro = new javax.swing.JButton();
        btRegistro1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(199, 161, 135));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lbLogin.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbLogin.setText("Email:");
        getContentPane().add(lbLogin);
        lbLogin.setBounds(50, 130, 110, 40);

        lbCadastro.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbCadastro.setText("Senha:");
        getContentPane().add(lbCadastro);
        lbCadastro.setBounds(40, 190, 120, 40);

        txtEmailLogin.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        getContentPane().add(txtEmailLogin);
        txtEmailLogin.setBounds(120, 130, 520, 40);

        pwSenhaLogin.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        pwSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwSenhaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(pwSenhaLogin);
        pwSenhaLogin.setBounds(120, 190, 520, 40);

        btLoginCLI.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        btLoginCLI.setText("Login Cliente");
        btLoginCLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginCLIActionPerformed(evt);
            }
        });
        getContentPane().add(btLoginCLI);
        btLoginCLI.setBounds(120, 250, 190, 60);

        btLoginADM.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        btLoginADM.setText("Login Barbearia");
        btLoginADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginADMActionPerformed(evt);
            }
        });
        getContentPane().add(btLoginADM);
        btLoginADM.setBounds(350, 250, 200, 60);

        btRegistro.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        btRegistro.setText("Cadastro Barbearia");
        btRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btRegistro);
        btRegistro.setBounds(370, 430, 240, 60);

        btRegistro1.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        btRegistro1.setText("Cadastro Cliente");
        btRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistro1ActionPerformed(evt);
            }
        });
        getContentPane().add(btRegistro1);
        btRegistro1.setBounds(120, 430, 210, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginADMActionPerformed
        if (txtEmailLogin.getText().matches("") || pwSenhaLogin.getText().matches("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        } else {

            try {
                loginControler LoginAdm = new loginControler();
                LoginAdm.loginAdm(this);
                
            } catch (SQLException ex) {
                Logger.getLogger(telaI1Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            

            
        }
    }//GEN-LAST:event_btLoginADMActionPerformed

    private void pwSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwSenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwSenhaLoginActionPerformed

    private void btLoginCLIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginCLIActionPerformed
       
        
        
        if(txtEmailLogin.getText().matches("") || pwSenhaLogin.getText().matches("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
        
            try {
                loginControler LoginCLiente = new loginControler();
                LoginCLiente.loginUsuario(this);
                              
            } catch (SQLException ex) {
                Logger.getLogger(telaI1Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            

             
        }
        
        
    }//GEN-LAST:event_btLoginCLIActionPerformed

    private void btRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistro1ActionPerformed
        telaCadastroCliente telaDeCadastroCliente = new  telaCadastroCliente();
        telaDeCadastroCliente.setVisible(true);
    }//GEN-LAST:event_btRegistro1ActionPerformed

    private void btRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistroActionPerformed
        telaCadastroBarbearia telaDeCadastroBarber = new  telaCadastroBarbearia();
        telaDeCadastroBarber.setVisible(true);
    }//GEN-LAST:event_btRegistroActionPerformed

    public JPasswordField getPwSenhaLogin() {
        return pwSenhaLogin;
    }

    public void setPwSenhaLogin(JPasswordField pwSenhaLogin) {
        this.pwSenhaLogin = pwSenhaLogin;
    }

    public JTextField getTxtEmailLogin() {
        return txtEmailLogin;
    }

    public void setTxtEmailLogin(JTextField txtEmailLogin) {
        this.txtEmailLogin = txtEmailLogin;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (Exception e) {
        }
  
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaI1Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaI1Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaI1Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaI1Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaI1Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btLoginADM;
    public javax.swing.JButton btLoginCLI;
    public javax.swing.JButton btRegistro;
    public javax.swing.JButton btRegistro1;
    public javax.swing.JLabel lbCadastro;
    public javax.swing.JLabel lbLogin;
    public javax.swing.JPasswordField pwSenhaLogin;
    public javax.swing.JTextField txtEmailLogin;
    // End of variables declaration//GEN-END:variables
}
