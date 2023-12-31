/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.view;

/**
 *
 * @author pedro
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuBar1TelaPrincipal = new javax.swing.JMenuBar();
        jMenu1Elementos = new javax.swing.JMenu();
        jMenu1Favorito = new javax.swing.JMenu();
        jMenu1Consultar = new javax.swing.JMenu();
        jMenu2Cadastro = new javax.swing.JMenu();
        jMenu1Protagonista = new javax.swing.JMenu();
        jMenu2Usuario = new javax.swing.JMenu();
        jMenu3Jogo = new javax.swing.JMenu();
        jMenu1Fechar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Jogos");
        setResizable(false);

        jMenu1Elementos.setText("Elementos");
        jMenu1Elementos.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jMenu1Elementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ElementosActionPerformed(evt);
            }
        });

        jMenu1Favorito.setText("Favorito");
        jMenu1Favorito.setToolTipText("");
        jMenu1Favorito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1Favorito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1Elementos.add(jMenu1Favorito);

        jMenu1Consultar.setText("Consultar");
        jMenu1Consultar.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jMenu1Consultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1Consultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1Elementos.add(jMenu1Consultar);

        jMenuBar1TelaPrincipal.add(jMenu1Elementos);

        jMenu2Cadastro.setText("Cadastro");
        jMenu2Cadastro.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jMenu2Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2CadastroActionPerformed(evt);
            }
        });

        jMenu1Protagonista.setText("Protagonista");
        jMenu1Protagonista.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jMenu1Protagonista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenu1Protagonista.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1Protagonista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ProtagonistaActionPerformed(evt);
            }
        });
        jMenu2Cadastro.add(jMenu1Protagonista);

        jMenu2Usuario.setText("Usuario");
        jMenu2Usuario.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jMenu2Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2Usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2UsuarioActionPerformed(evt);
            }
        });
        jMenu2Cadastro.add(jMenu2Usuario);

        jMenu3Jogo.setText("Jogo");
        jMenu3Jogo.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jMenu3Jogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3Jogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3Jogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3JogoActionPerformed(evt);
            }
        });
        jMenu2Cadastro.add(jMenu3Jogo);

        jMenuBar1TelaPrincipal.add(jMenu2Cadastro);

        jMenu1Fechar.setText("Fechar");
        jMenu1Fechar.setFont(new java.awt.Font("Nimbus Roman", 0, 16)); // NOI18N
        jMenu1Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1FecharActionPerformed(evt);
            }
        });
        jMenuBar1TelaPrincipal.add(jMenu1Fechar);

        setJMenuBar(jMenuBar1TelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ElementosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ElementosActionPerformed

    private void jMenu1FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenu1FecharActionPerformed

    private void jMenu2CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2CadastroActionPerformed

    }//GEN-LAST:event_jMenu2CadastroActionPerformed

    private void jMenu2UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2UsuarioActionPerformed
        TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario(this);
        telaCadastroUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2UsuarioActionPerformed

    private void jMenu1ProtagonistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ProtagonistaActionPerformed
        TelaCadastroProtagonista telaCadastroProtagonista = new TelaCadastroProtagonista(this);
        telaCadastroProtagonista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1ProtagonistaActionPerformed

    private void jMenu3JogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3JogoActionPerformed
        TelaCadastroJogo telaCadastroJogo = new TelaCadastroJogo(this);
        telaCadastroJogo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu3JogoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1Consultar;
    private javax.swing.JMenu jMenu1Elementos;
    private javax.swing.JMenu jMenu1Favorito;
    private javax.swing.JMenu jMenu1Fechar;
    private javax.swing.JMenu jMenu1Protagonista;
    private javax.swing.JMenu jMenu2Cadastro;
    private javax.swing.JMenu jMenu2Usuario;
    private javax.swing.JMenu jMenu3Jogo;
    private javax.swing.JMenuBar jMenuBar1TelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
