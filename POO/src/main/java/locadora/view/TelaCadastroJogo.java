/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import locadora.controller.JogoController;

/**
 *
 * @author pedro
 */
public class TelaCadastroJogo extends javax.swing.JFrame {
        private TelaPrincipal telaPrincipal;
    /**
     * Creates new form TelaCadastroJogo
     */
    public TelaCadastroJogo() {
        initComponents();
    }
    
    public TelaCadastroJogo(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
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
        jLabel2Nome = new javax.swing.JLabel();
        jLabel3Genero = new javax.swing.JLabel();
        jLabel4Sinopse = new javax.swing.JLabel();
        jTextField1Sinopse = new javax.swing.JTextField();
        jTextField1Nome = new javax.swing.JTextField();
        jButton1Consultar = new javax.swing.JButton();
        jButton2Cancelar = new javax.swing.JButton();
        jButton3Limpar = new javax.swing.JButton();
        jButton4Salvar = new javax.swing.JButton();
        jComboBox1Genero = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Jogos");

        jLabel1.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jLabel1.setText("CADASTRAR JOGO");

        jLabel2Nome.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jLabel2Nome.setText("Nome:");

        jLabel3Genero.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jLabel3Genero.setText("Gênero:");

        jLabel4Sinopse.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jLabel4Sinopse.setText("Sinopse:");

        jTextField1Sinopse.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N

        jTextField1Nome.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N

        jButton1Consultar.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jButton1Consultar.setText("Consultar");

        jButton2Cancelar.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jButton2Cancelar.setText("Cancelar");

        jButton3Limpar.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jButton3Limpar.setText("Limpar");

        jButton4Salvar.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jButton4Salvar.setText("Salvar");
        jButton4Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4SalvarActionPerformed(evt);
            }
        });

        jComboBox1Genero.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jComboBox1Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informe o gênero", "Magia", "Historico", "FPS", "Aventura", "Ação", "Fantasia", "Ficção Cientifica", "Romance", "Terror", "Poderes", " " }));
        jComboBox1Genero.setToolTipText("Informe o gênero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4Salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1Consultar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2Nome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1Nome))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3Genero)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4Sinopse)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1Sinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Nome)
                    .addComponent(jTextField1Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Genero)
                    .addComponent(jComboBox1Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4Sinopse)
                    .addComponent(jTextField1Sinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Consultar)
                    .addComponent(jButton2Cancelar)
                    .addComponent(jButton3Limpar)
                    .addComponent(jButton4Salvar))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4SalvarActionPerformed
        String genero = jComboBox1Genero.getSelectedItem().toString();
        boolean sucesso;
        
        try{
            JogoController jogoController = new JogoController();
            sucesso = jogoController.cadastrarJogo(jTextField1Nome.getText(),genero, jTextField1Sinopse.getText());
            if(sucesso == true){
                JOptionPane.showMessageDialog(null, "Jogo guardado");
            }else {
                JOptionPane.showMessageDialog(null, "Preencha corretamente");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }//GEN-LAST:event_jButton4SalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Consultar;
    private javax.swing.JButton jButton2Cancelar;
    private javax.swing.JButton jButton3Limpar;
    private javax.swing.JButton jButton4Salvar;
    private javax.swing.JComboBox<String> jComboBox1Genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2Nome;
    private javax.swing.JLabel jLabel3Genero;
    private javax.swing.JLabel jLabel4Sinopse;
    private javax.swing.JTextField jTextField1Nome;
    private javax.swing.JTextField jTextField1Sinopse;
    // End of variables declaration//GEN-END:variables

    private void limparTelaCadastroJogo(ActionEvent evt) {
        
    }
}
