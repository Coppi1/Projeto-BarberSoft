/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.unifio.barbersoft;

import EnderecoViaCep.Endereco;
import EnderecoViaCepService.ViaCepService;
import LoginBarbersoftController.loginControler;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author educo
 */
public class telaCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form telaCadastro
     */
    public telaCadastroCliente() {
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

        btgroupSexo = new javax.swing.ButtonGroup();
        lbCliNomeCompleto = new javax.swing.JLabel();
        lbCliSexo = new javax.swing.JLabel();
        lbCliCep = new javax.swing.JLabel();
        lbCliCidade = new javax.swing.JLabel();
        lbCliEmail = new javax.swing.JLabel();
        lbCliTelefone = new javax.swing.JLabel();
        lbCliSenha = new javax.swing.JLabel();
        lbCliRepeditSenha = new javax.swing.JLabel();
        txtCliNome = new javax.swing.JTextField();
        radCliSexHomem = new javax.swing.JRadioButton();
        radCliSexMulher = new javax.swing.JRadioButton();
        radCliSexOutros = new javax.swing.JRadioButton();
        ftxtCliCEP = new javax.swing.JFormattedTextField();
        btCliBuscaCep = new javax.swing.JButton();
        txtCliCidade = new javax.swing.JTextField();
        txtCliEmail = new javax.swing.JTextField();
        ftxtCliTelefone = new javax.swing.JFormattedTextField();
        pwCliSenha = new javax.swing.JPasswordField();
        pwCliReSenha = new javax.swing.JPasswordField();
        btCliCadastrar = new javax.swing.JButton();
        btCliClancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbCliBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lbCliNomeCompleto.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbCliNomeCompleto.setForeground(new java.awt.Color(0, 0, 0));
        lbCliNomeCompleto.setText("Nome Completo:");
        getContentPane().add(lbCliNomeCompleto);
        lbCliNomeCompleto.setBounds(10, 150, 155, 30);

        lbCliSexo.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbCliSexo.setForeground(new java.awt.Color(0, 0, 0));
        lbCliSexo.setText("Sexo:");
        getContentPane().add(lbCliSexo);
        lbCliSexo.setBounds(130, 180, 60, 40);

        lbCliCep.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbCliCep.setForeground(new java.awt.Color(0, 0, 0));
        lbCliCep.setText("CEP:");
        getContentPane().add(lbCliCep);
        lbCliCep.setBounds(130, 230, 69, 30);

        lbCliCidade.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbCliCidade.setForeground(new java.awt.Color(0, 0, 0));
        lbCliCidade.setText("Cidade:");
        getContentPane().add(lbCliCidade);
        lbCliCidade.setBounds(100, 260, 90, 50);

        lbCliEmail.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbCliEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbCliEmail.setText("E-mail:");
        getContentPane().add(lbCliEmail);
        lbCliEmail.setBounds(110, 300, 80, 50);

        lbCliTelefone.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbCliTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lbCliTelefone.setText("Telefone:");
        getContentPane().add(lbCliTelefone);
        lbCliTelefone.setBounds(90, 340, 110, 50);

        lbCliSenha.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbCliSenha.setForeground(new java.awt.Color(0, 0, 0));
        lbCliSenha.setText("Senha:");
        getContentPane().add(lbCliSenha);
        lbCliSenha.setBounds(110, 390, 90, 40);

        lbCliRepeditSenha.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lbCliRepeditSenha.setForeground(new java.awt.Color(0, 0, 0));
        lbCliRepeditSenha.setText("Repetir Senha:");
        getContentPane().add(lbCliRepeditSenha);
        lbCliRepeditSenha.setBounds(30, 430, 180, 40);

        txtCliNome.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        getContentPane().add(txtCliNome);
        txtCliNome.setBounds(200, 150, 520, 30);

        btgroupSexo.add(radCliSexHomem);
        radCliSexHomem.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        radCliSexHomem.setText("Homem");
        getContentPane().add(radCliSexHomem);
        radCliSexHomem.setBounds(200, 190, 110, 30);

        btgroupSexo.add(radCliSexMulher);
        radCliSexMulher.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        radCliSexMulher.setText("Mulher");
        getContentPane().add(radCliSexMulher);
        radCliSexMulher.setBounds(320, 190, 100, 30);

        btgroupSexo.add(radCliSexOutros);
        radCliSexOutros.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        radCliSexOutros.setText("Outros");
        getContentPane().add(radCliSexOutros);
        radCliSexOutros.setBounds(430, 190, 100, 30);

        try {
            ftxtCliCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCliCEP.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        getContentPane().add(ftxtCliCEP);
        ftxtCliCEP.setBounds(200, 230, 380, 30);

        btCliBuscaCep.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        btCliBuscaCep.setText("Buscar CEP");
        btCliBuscaCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliBuscaCepActionPerformed(evt);
            }
        });
        getContentPane().add(btCliBuscaCep);
        btCliBuscaCep.setBounds(590, 230, 170, 30);

        txtCliCidade.setEditable(false);
        txtCliCidade.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        getContentPane().add(txtCliCidade);
        txtCliCidade.setBounds(200, 270, 520, 30);

        txtCliEmail.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        getContentPane().add(txtCliEmail);
        txtCliEmail.setBounds(200, 310, 520, 30);

        try {
            ftxtCliTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(ftxtCliTelefone);
        ftxtCliTelefone.setBounds(200, 350, 520, 30);

        pwCliSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pwCliSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwCliSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(pwCliSenha);
        pwCliSenha.setBounds(200, 390, 520, 30);

        pwCliReSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pwCliReSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwCliReSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(pwCliReSenha);
        pwCliReSenha.setBounds(200, 430, 520, 30);

        btCliCadastrar.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        btCliCadastrar.setText("Concuir Cadastro");
        btCliCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCliCadastrar);
        btCliCadastrar.setBounds(200, 490, 220, 60);

        btCliClancel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        btCliClancel.setText("Cancelar");
        btCliClancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliClancelActionPerformed(evt);
            }
        });
        getContentPane().add(btCliClancel);
        btCliClancel.setBounds(450, 490, 190, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\educo\\OneDrive\\Área de Trabalho\\Projects Note\\Faculdade-JAVA\\Java\\Projetos Faculdade\\Projeto Integrador\\BarberSoft\\src\\main\\java\\BarberIMG\\icon30.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(960, 40, 270, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\educo\\OneDrive\\Área de Trabalho\\Projects Note\\Faculdade-JAVA\\Java\\Projetos Faculdade\\Projeto Integrador\\BarberSoft\\src\\main\\java\\BarberIMG\\cad_cli75.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 880, 80);

        lbCliBackGround.setForeground(new java.awt.Color(0, 0, 0));
        lbCliBackGround.setIcon(new javax.swing.ImageIcon("C:\\Users\\educo\\OneDrive\\Área de Trabalho\\Projects Note\\Faculdade-JAVA\\Java\\Projetos Faculdade\\Projeto Integrador\\BarberSoft\\src\\main\\java\\BarberIMG\\bkgr_img.png")); // NOI18N
        getContentPane().add(lbCliBackGround);
        lbCliBackGround.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCliCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliCadastrarActionPerformed
        
        if(txtCliNome.getText().matches("") || 
                txtCliEmail.getText().matches("") || 
                txtCliCidade.getText().matches("") || 
                pwCliSenha.getText().matches("")){   
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            
                try { 
                loginControler cadastro = new loginControler();
                cadastro.casdastroCliente(this);
                } catch (SQLException sql) {
                }
                
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                this.setVisible(false);
        }
            
        
        
        
    }//GEN-LAST:event_btCliCadastrarActionPerformed

    private void btCliClancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliClancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCliClancelActionPerformed

    private void pwCliSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwCliSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwCliSenhaActionPerformed

    private void pwCliReSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwCliReSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwCliReSenhaActionPerformed

    private void btCliBuscaCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliBuscaCepActionPerformed
     
        ViaCepService buscaCidade = new ViaCepService();
        String cepCli = ftxtCliCEP.getText();
        
        Endereco endereco;
        try {
            endereco = ViaCepService.getEndereco(cepCli);
            
            String cli_cidade = endereco.getLocalidade();
            txtCliCidade.setText(cli_cidade);
        } catch (IOException ex) {
            Logger.getLogger(telaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
    }//GEN-LAST:event_btCliBuscaCepActionPerformed

    public ButtonGroup getBtgroupSexo() {
        return btgroupSexo;
    }

    public void setBtgroupSexo(ButtonGroup btgroupSexo) {
        this.btgroupSexo = btgroupSexo;
    }

    public JFormattedTextField getFtxtCliTelefone() {
        return ftxtCliTelefone;
    }

    public void setFtxtCliTelefone(JFormattedTextField ftxtCliTelefone) {
        this.ftxtCliTelefone = ftxtCliTelefone;
    }


    public JPasswordField getPwCliSenha() {
        return pwCliSenha;
    }

    public void setPwCliSenha(JPasswordField pwCliSenha) {
        this.pwCliSenha = pwCliSenha;
    }

    public JTextField getTxtCliEmail() {
        return txtCliEmail;
    }

    public void setTxtCliEmail(JTextField txtCliEmail) {
        this.txtCliEmail = txtCliEmail;
    }

    public JTextField getTxtCliNome() {
        return txtCliNome;
    }

    public void setTxtCliNome(JTextField txtCliNome) {
        this.txtCliNome = txtCliNome;
    }

    public JTextField getTxtCliCidade() {
        return txtCliCidade;
    }

    public void setTxtCliCidade(JTextField txtCliCidade) {
        this.txtCliCidade = txtCliCidade;
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
            java.util.logging.Logger.getLogger(telaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliBuscaCep;
    private javax.swing.JButton btCliCadastrar;
    private javax.swing.JButton btCliClancel;
    private javax.swing.ButtonGroup btgroupSexo;
    private javax.swing.JFormattedTextField ftxtCliCEP;
    private javax.swing.JFormattedTextField ftxtCliTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbCliBackGround;
    private javax.swing.JLabel lbCliCep;
    private javax.swing.JLabel lbCliCidade;
    private javax.swing.JLabel lbCliEmail;
    private javax.swing.JLabel lbCliNomeCompleto;
    private javax.swing.JLabel lbCliRepeditSenha;
    private javax.swing.JLabel lbCliSenha;
    private javax.swing.JLabel lbCliSexo;
    private javax.swing.JLabel lbCliTelefone;
    private javax.swing.JPasswordField pwCliReSenha;
    private javax.swing.JPasswordField pwCliSenha;
    private javax.swing.JRadioButton radCliSexHomem;
    private javax.swing.JRadioButton radCliSexMulher;
    private javax.swing.JRadioButton radCliSexOutros;
    private javax.swing.JTextField txtCliCidade;
    private javax.swing.JTextField txtCliEmail;
    private javax.swing.JTextField txtCliNome;
    // End of variables declaration//GEN-END:variables
}
