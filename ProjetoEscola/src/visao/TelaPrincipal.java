/*
 Esta clase tem de interagir com o usuario indicando os botoes de acesso a cada formulario de cadastro.
 */
package visao;

import modeloConection.ConexaoBD;

/**
 *
 * @author Ivan
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    ConexaoBD conecta = new ConexaoBD();
    FormProfessor telaProf = new FormProfessor();
    FormAluno telaAlu = new FormAluno();
    FormTurma telaTurm = new FormTurma();
    FormAvaliacao telaAvalia = new FormAvaliacao();
    
    public TelaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jInternalBemVindo = new javax.swing.JInternalFrame();
        jPanelInterno = new javax.swing.JPanel();
        jLabelAgendar = new javax.swing.JLabel();
        jButtonAgeAvalia = new javax.swing.JButton();
        jButtonCadProfessor = new javax.swing.JButton();
        jButtonCadAluno = new javax.swing.JButton();
        jButtonCadTurma = new javax.swing.JButton();
        jLabelCad = new javax.swing.JLabel();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonFecharBoasVindas = new javax.swing.JButton();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadProfessor = new javax.swing.JMenuItem();
        jMenuItemCadAluno = new javax.swing.JMenuItem();
        jMenuItemCadTurma = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemTelaBemVindos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalBemVindo.setTitle("Bem - Vindo");
        jInternalBemVindo.setVisible(true);
        jInternalBemVindo.getContentPane().setLayout(null);

        jPanelInterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInterno.setLayout(null);

        jLabelAgendar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAgendar.setText("Agendar:");
        jPanelInterno.add(jLabelAgendar);
        jLabelAgendar.setBounds(20, 180, 80, 20);

        jButtonAgeAvalia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incProvas.png"))); // NOI18N
        jButtonAgeAvalia.setToolTipText("Agendar Avaliaçoes, Exercicios e Trabalhos");
        jButtonAgeAvalia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgeAvaliaActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonAgeAvalia);
        jButtonAgeAvalia.setBounds(20, 210, 130, 125);

        jButtonCadProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incProfessor1.png"))); // NOI18N
        jButtonCadProfessor.setToolTipText("Cadastro de Professor");
        jButtonCadProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadProfessorActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonCadProfessor);
        jButtonCadProfessor.setBounds(20, 40, 130, 125);

        jButtonCadAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incAluno.png"))); // NOI18N
        jButtonCadAluno.setToolTipText("Cadastro de Aluno");
        jButtonCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAlunoActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonCadAluno);
        jButtonCadAluno.setBounds(150, 40, 130, 125);

        jButtonCadTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incTurma.png"))); // NOI18N
        jButtonCadTurma.setToolTipText("Cadastro de Turma");
        jButtonCadTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadTurmaActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonCadTurma);
        jButtonCadTurma.setBounds(280, 40, 130, 125);

        jLabelCad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCad.setText("Cadastros:");
        jPanelInterno.add(jLabelCad);
        jLabelCad.setBounds(20, 10, 90, 20);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo2.jpg"))); // NOI18N
        jPanelInterno.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 460, 340);

        jInternalBemVindo.getContentPane().add(jPanelInterno);
        jPanelInterno.setBounds(10, 80, 460, 340);

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitulo.setText("Sistema de Gerenciamanto:");
        jInternalBemVindo.getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 10, 320, 30);

        jButtonFecharBoasVindas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IncFechar.png"))); // NOI18N
        jButtonFecharBoasVindas.setToolTipText("Fechar Tela de Bem - Vindo");
        jButtonFecharBoasVindas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBoasVindasActionPerformed(evt);
            }
        });
        jInternalBemVindo.getContentPane().add(jButtonFecharBoasVindas);
        jButtonFecharBoasVindas.setBounds(420, 10, 60, 60);

        getContentPane().add(jInternalBemVindo);
        jInternalBemVindo.setBounds(30, 20, 500, 450);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo1.jpg"))); // NOI18N
        jLabelFundoPrincipal.setMaximumSize(preferredSize());
        jLabelFundoPrincipal.setMinimumSize(getMaximumSize());
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 560, 500);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadProfessor.setText("Professor");
        jMenuItemCadProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProfessorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadProfessor);

        jMenuItemCadAluno.setText("Aluno");
        jMenuItemCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAlunoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadAluno);

        jMenuItemCadTurma.setText("Turma");
        jMenuItemCadTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadTurmaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadTurma);

        jMenuBar1.add(jMenuCadastro);

        jMenu3.setText("Ferramentas");

        jMenuItemTelaBemVindos.setText("Tela Bem Vindos");
        jMenuItemTelaBemVindos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTelaBemVindos);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Sair");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(573, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProfessorActionPerformed
        if(telaProf == null) {
            telaProf = new FormProfessor();
            telaProf.setVisible(true);
            telaProf.setResizable(false);
        }else{
            telaProf.setVisible(true);
            telaProf.setResizable(false);
    }
        // FormProfessor tela = new FormProfessor();
        //tela.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCadProfessorActionPerformed

    private void jButtonCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAlunoActionPerformed
        if(telaAlu == null) {
        telaAlu = new FormAluno();
        telaAlu.setVisible(true);
        telaAlu.setResizable(false);
        }else{
        telaAlu.setVisible(true);
        telaAlu.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadAlunoActionPerformed

    private void jButtonFecharBoasVindasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBoasVindasActionPerformed
        jInternalBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBoasVindasActionPerformed

    private void jButtonCadProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadProfessorActionPerformed
        if(telaProf == null) {
            telaProf = new FormProfessor();
            telaProf.setVisible(true);
            telaProf.setResizable(false);
        }else{
            telaProf.setVisible(true);
            telaProf.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadProfessorActionPerformed

    private void jMenuItemTelaBemVindosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindosActionPerformed
        jInternalBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBemVindosActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItemCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAlunoActionPerformed
         if(telaAlu == null) {
        telaAlu = new FormAluno();
        telaAlu.setVisible(true);
        telaAlu.setResizable(false);
        }else{
        telaAlu.setVisible(true);
        telaAlu.setResizable(false);
        }

    }//GEN-LAST:event_jMenuItemCadAlunoActionPerformed

    private void jMenuItemCadTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadTurmaActionPerformed
        if(telaTurm == null) {
        telaTurm = new FormTurma();
        telaTurm.setVisible(true);
        telaTurm.setResizable(false);
        }else{
        telaTurm.setVisible(true);
        telaTurm.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItemCadTurmaActionPerformed

    private void jButtonCadTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadTurmaActionPerformed
        if(telaTurm == null) {
        telaTurm = new FormTurma();
        telaTurm.setVisible(true);
        telaTurm.setResizable(false);
        }else{
        telaTurm.setVisible(true);
        telaTurm.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadTurmaActionPerformed

    private void jButtonAgeAvaliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgeAvaliaActionPerformed
        if(telaAvalia == null) {
        telaAvalia = new FormAvaliacao();
        telaAvalia.setVisible(true);
        telaAvalia.setResizable(false);
        }else{
        telaAvalia.setVisible(true);
        telaAvalia.setResizable(false);
        
    }//GEN-LAST:event_jButtonAgeAvaliaActionPerformed
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
    private javax.swing.JButton jButtonAgeAvalia;
    private javax.swing.JButton jButtonCadAluno;
    private javax.swing.JButton jButtonCadProfessor;
    private javax.swing.JButton jButtonCadTurma;
    private javax.swing.JButton jButtonFecharBoasVindas;
    private javax.swing.JInternalFrame jInternalBemVindo;
    private javax.swing.JLabel jLabelAgendar;
    private javax.swing.JLabel jLabelCad;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadAluno;
    private javax.swing.JMenuItem jMenuItemCadProfessor;
    private javax.swing.JMenuItem jMenuItemCadTurma;
    private javax.swing.JMenuItem jMenuItemTelaBemVindos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInterno;
    // End of variables declaration//GEN-END:variables
}
