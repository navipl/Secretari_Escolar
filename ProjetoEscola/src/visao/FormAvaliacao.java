/*
 Esta clase tem de interagir com o usuario na incerçao de uma nova Avaliaçao no sistema da Escola, 
 executa a funcionalidade de cada botao gerando o caminho e os dados para serem enviados ao banco de dados.
 */

package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloDao.DaoAvalia;
import modeloBeans.BeansAvalia;
import modeloConection.ConexaoBD;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ivan
 */
public class FormAvaliacao extends javax.swing.JFrame {

    BeansAvalia mod = new BeansAvalia();
    DaoAvalia control = new DaoAvalia();
    ConexaoBD conex = new ConexaoBD();
    int key = 0;
    String data_banco;
    String data1;
    String data2;
    Date data_inicial;
    String nota_banco;
    
    
    public FormAvaliacao(){
        initComponents();
        preencherTablela("select COD_AVA,DATA_INI,DATA_FIM,VALOR_AVA,DESC_TIPO from avalia, tipo_ava where avalia.TIPO_AVA_ID_TIPO = tipo_ava.ID_TIPO order by COD_AVA;");
        preencherTipos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanelFormProfessor = new javax.swing.JPanel();
        jTextFieldCodAva = new javax.swing.JTextField();
        jButtonNovoAva = new javax.swing.JButton();
        jButtonSalvarAva = new javax.swing.JButton();
        jButtonEditarAva = new javax.swing.JButton();
        jButtonCancelarAva = new javax.swing.JButton();
        jButtonExcluirAva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAvalia = new javax.swing.JTable();
        jTextFieldPesquisaAva = new javax.swing.JTextField();
        jButtonPesquisaAva = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextFieldDataIni = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataFim = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxTipoAva = new javax.swing.JComboBox<>();
        jTextFieldNotaAva = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFormProfessor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFormProfessor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldCodAva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldCodAva.setEnabled(false);
        jTextFieldCodAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodAvaActionPerformed(evt);
            }
        });

        jButtonNovoAva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovoAva.setText("Novo");
        jButtonNovoAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoAvaActionPerformed(evt);
            }
        });

        jButtonSalvarAva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonSalvarAva.setText("Salvar");
        jButtonSalvarAva.setEnabled(false);
        jButtonSalvarAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAvaActionPerformed(evt);
            }
        });

        jButtonEditarAva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonEditarAva.setText("Editar");
        jButtonEditarAva.setEnabled(false);
        jButtonEditarAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarAvaActionPerformed(evt);
            }
        });

        jButtonCancelarAva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancelarAva.setText("Cancelar");
        jButtonCancelarAva.setEnabled(false);
        jButtonCancelarAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAvaActionPerformed(evt);
            }
        });

        jButtonExcluirAva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonExcluirAva.setText("Excluir");
        jButtonExcluirAva.setEnabled(false);
        jButtonExcluirAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirAvaActionPerformed(evt);
            }
        });

        jTableAvalia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableAvalia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAvalia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAvaliaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAvalia);

        jTextFieldPesquisaAva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldPesquisaAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaAvaActionPerformed(evt);
            }
        });

        jButtonPesquisaAva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonPesquisaAva.setText("Pesquisar");
        jButtonPesquisaAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaAvaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Codigo:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Nota:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Data de Entrega:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Data de Lançamento:");

        try {
            jFormattedTextFieldDataIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataIni.setEnabled(false);
        jFormattedTextFieldDataIni.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jFormattedTextFieldDataIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataIniActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataFim.setEnabled(false);
        jFormattedTextFieldDataFim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jFormattedTextFieldDataFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataFimActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Tipo:");

        jComboBoxTipoAva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxTipoAva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTipoAva.setEnabled(false);
        jComboBoxTipoAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoAvaActionPerformed(evt);
            }
        });

        jTextFieldNotaAva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldNotaAva.setEnabled(false);

        javax.swing.GroupLayout jPanelFormProfessorLayout = new javax.swing.GroupLayout(jPanelFormProfessor);
        jPanelFormProfessor.setLayout(jPanelFormProfessorLayout);
        jPanelFormProfessorLayout.setHorizontalGroup(
            jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelarAva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluirAva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditarAva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvarAva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovoAva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormProfessorLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodAva, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipoAva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFormProfessorLayout.createSequentialGroup()
                        .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelFormProfessorLayout.createSequentialGroup()
                                .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanelFormProfessorLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNotaAva, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormProfessorLayout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisaAva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisaAva))
                            .addComponent(jScrollPane1))
                        .addGap(0, 52, Short.MAX_VALUE))))
        );
        jPanelFormProfessorLayout.setVerticalGroup(
            jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormProfessorLayout.createSequentialGroup()
                        .addComponent(jButtonNovoAva)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelarAva)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvarAva))
                    .addGroup(jPanelFormProfessorLayout.createSequentialGroup()
                        .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodAva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxTipoAva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jFormattedTextFieldDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jFormattedTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldNotaAva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarAva)
                    .addComponent(jTextFieldPesquisaAva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaAva))
                .addGroup(jPanelFormProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormProfessorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluirAva)
                        .addContainerGap(219, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormProfessorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Avaliação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelFormProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFormProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(390, 390, 390))
        );

        setSize(new java.awt.Dimension(687, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void  preencherTipos () {
        conex.conecxao();
        
        conex.executaSql("select * from tipo_ava order by DESC_TIPO;");
        try {
            conex.rs.first();
            jComboBoxTipoAva.removeAllItems();
            do{
               jComboBoxTipoAva.addItem(conex.rs.getString("DESC_TIPO"));
            } while (conex.rs.next());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher Tipos"+ex);
        }
        
        conex.desconectar();
    }
    
    private void jTextFieldCodAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodAvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodAvaActionPerformed

    /*SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    java.sql.Date nascAlu;*/
   
    
    private void jButtonSalvarAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAvaActionPerformed
        if (jTextFieldCodAva.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Codigo para continuar");
            jTextFieldCodAva.requestFocus();
        }else if (jFormattedTextFieldDataIni.getText().isEmpty()) { 
            JOptionPane.showMessageDialog(null, "Informe a Data de Lançamento para continuar");
            jFormattedTextFieldDataIni.requestFocus();
        }else if (jFormattedTextFieldDataFim.getText().isEmpty()) { 
            JOptionPane.showMessageDialog(null, "Informe a Data de Entrega para continuar");
            jFormattedTextFieldDataFim.requestFocus();
        }else 
        if (key == 1) {
           mod.setAva_cod(jTextFieldCodAva.getText());
           mod.setDate_ini(jFormattedTextFieldDataIni.getText());
           mod.setDate_fim(jFormattedTextFieldDataFim.getText());
           mod.setAva_nota(jTextFieldNotaAva.getText());
           mod.setAva_tipo((String) jComboBoxTipoAva.getSelectedItem());
           control.Salvar(mod);
           
           jTextFieldCodAva.setText("");
           jFormattedTextFieldDataIni.setText("");
           jFormattedTextFieldDataFim.setText("");
           jTextFieldNotaAva.setText("");
           
           jTextFieldCodAva.setEnabled(false);
           jTextFieldNotaAva.setEnabled(false);
           jFormattedTextFieldDataIni.setEnabled(false);
           jFormattedTextFieldDataFim.setEnabled(false);
           jComboBoxTipoAva.setEnabled(false);
           
           jButtonSalvarAva.setEnabled(false);
           jButtonCancelarAva.setEnabled(false);
           jButtonPesquisaAva.setEnabled(true);
           jTextFieldPesquisaAva.setText("");
           jTextFieldPesquisaAva.setEnabled(true);
           key = 0;
           preencherTablela("select COD_AVA,DATA_INI,DATA_FIM,VALOR_AVA,DESC_TIPO from avalia, tipo_ava where avalia.TIPO_AVA_ID_TIPO = tipo_ava.ID_TIPO order by COD_AVA;");
       } else
          
       if (key == 2){
           mod.setAva_cod(jTextFieldCodAva.getText());
           mod.setDate_ini(jFormattedTextFieldDataIni.getText());
           mod.setDate_fim(jFormattedTextFieldDataFim.getText());
           mod.setAva_nota(jTextFieldNotaAva.getText());
           mod.setAva_tipo((String) jComboBoxTipoAva.getSelectedItem());
           control.Editar(mod);
           
           jTextFieldCodAva.setText("");
           jFormattedTextFieldDataIni.setText("");
           jFormattedTextFieldDataFim.setText("");
           jTextFieldNotaAva.setText("");
           
           jTextFieldCodAva.setEnabled(false);
           jTextFieldNotaAva.setEnabled(false);
           jFormattedTextFieldDataIni.setEnabled(false);
           jFormattedTextFieldDataFim.setEnabled(false);
           jComboBoxTipoAva.setEnabled(false);
          
           jButtonNovoAva.setEnabled(true);
           jButtonCancelarAva.setEnabled(false);
           
           key = 0;
           preencherTablela("select COD_AVA,DATA_INI,DATA_FIM,VALOR_AVA,DESC_TIPO from avalia, tipo_ava where avalia.TIPO_AVA_ID_TIPO = tipo_ava.ID_TIPO order by COD_AVA;");
       }
       
    }//GEN-LAST:event_jButtonSalvarAvaActionPerformed

    private void jButtonNovoAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoAvaActionPerformed
        key = 1;
        jTextFieldCodAva.setText("");
        jFormattedTextFieldDataIni.setText("");
        jFormattedTextFieldDataFim.setText("");
        jTextFieldNotaAva.setText("");
           
        jTextFieldPesquisaAva.setEnabled(false);
        
        jTextFieldCodAva.setEnabled(true);
        jTextFieldNotaAva.setEnabled(true);
        jFormattedTextFieldDataIni.setEnabled(true);
        jFormattedTextFieldDataFim.setEnabled(true);
        jComboBoxTipoAva.setEnabled(true);
        
        jButtonSalvarAva.setEnabled(true);
        jButtonEditarAva.setEnabled(false);
        jButtonExcluirAva.setEnabled(false);
        jButtonPesquisaAva.setEnabled(false);
        jButtonCancelarAva.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoAvaActionPerformed

    private void jButtonPesquisaAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaAvaActionPerformed
        mod.setAva_pesquisa(jTextFieldPesquisaAva.getText());
        BeansAvalia model = control.buscaBeansAvalia(mod);
        jTextFieldCodAva.setText(model.getAva_cod());
        jFormattedTextFieldDataIni.setText(model.getDate_ini());
        jFormattedTextFieldDataFim.setText(model.getDate_fim());
        jTextFieldNotaAva.setText(model.getAva_nota());
        jComboBoxTipoAva.setSelectedItem(model.getAva_tipo());
        
        preencherTablela("select*from avalia where COD_AVA like'%"+mod.getAva_pesquisa()+"%'");
       
    }//GEN-LAST:event_jButtonPesquisaAvaActionPerformed

    private void jButtonCancelarAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAvaActionPerformed
        jTextFieldCodAva.setText("");
        jFormattedTextFieldDataIni.setText("");
        jFormattedTextFieldDataFim.setText("");
        jTextFieldNotaAva.setText("");
        
        jTextFieldPesquisaAva.setEnabled(true);
        
        jTextFieldCodAva.setEnabled(false);
        jTextFieldNotaAva.setEnabled(false);
        jFormattedTextFieldDataIni.setEnabled(false);
        jFormattedTextFieldDataFim.setEnabled(false);
        jComboBoxTipoAva.setEnabled(false);
        
        jButtonPesquisaAva.setEnabled(true);
        jButtonSalvarAva.setEnabled(false);
        jButtonCancelarAva.setEnabled(false);
        jButtonNovoAva.setEnabled(true);
        jButtonEditarAva.setEnabled(false);
        jButtonExcluirAva.setEnabled(false);
        
    }//GEN-LAST:event_jButtonCancelarAvaActionPerformed

    private void jButtonEditarAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarAvaActionPerformed
        key = 2;
        jTextFieldNotaAva.setEnabled(true);
        jFormattedTextFieldDataIni.setEnabled(true);
        jFormattedTextFieldDataFim.setEnabled(true);
        jComboBoxTipoAva.setEnabled(true);
        
        jButtonSalvarAva.setEnabled(true);
        jButtonCancelarAva.setEnabled(true);
        jButtonEditarAva.setEnabled(false);
        jButtonNovoAva.setEnabled(false);
        jButtonExcluirAva.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarAvaActionPerformed

    private void jButtonExcluirAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirAvaActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja Realmente Excluir?");
        if(resposta == JOptionPane.YES_OPTION) {
            mod.setAva_cod(jTextFieldCodAva.getText());
            control.Excluir(mod);
            jTextFieldCodAva.setText("");
            jFormattedTextFieldDataIni.setText("");
            jFormattedTextFieldDataFim.setText("");
            jTextFieldNotaAva.setText(""); 
            
            jTextFieldNotaAva.setEnabled(false);
            jFormattedTextFieldDataIni.setEnabled(false);
            jFormattedTextFieldDataFim.setEnabled(false);
            jComboBoxTipoAva.setEnabled(false);
            
            jButtonSalvarAva.setEnabled(false);
            jButtonEditarAva.setEnabled(false);
            jButtonExcluirAva.setEnabled(false);
            jButtonCancelarAva.setEnabled(false);
            preencherTablela("select * from avalia order by COD_AVA;");
        }
    }//GEN-LAST:event_jButtonExcluirAvaActionPerformed

    private void jTableAvaliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAvaliaMouseClicked
        String nome_avalia = ""+jTableAvalia.getValueAt(jTableAvalia.getSelectedRow(), 0);
        conex.conecxao();
        conex.executaSql("select * from avalia where COD_AVA = '" + nome_avalia + "';");
        try {
            conex.rs.first();
            
            jTextFieldCodAva.setText(String.valueOf(conex.rs.getString("COD_AVA")));
            ConvData(conex.rs.getString("DATA_INI"));
            jFormattedTextFieldDataIni.setText(data_banco);
            ConvNota2(conex.rs.getString("VALOR_AVA"));
            jTextFieldNotaAva.setText(nota_banco);
            ConvData(conex.rs.getString("DATA_FIM"));
            jFormattedTextFieldDataFim.setText(data_banco);
            
            
            ConexaoBD conexPesquisa = new ConexaoBD();
            conexPesquisa.conecxao();
            conexPesquisa.executaSql("select * from tipo_ava where ID_TIPO ="+conex.rs.getInt("TIPO_AVA_ID_TIPO"));
            conexPesquisa.rs.first();
            jComboBoxTipoAva.setSelectedItem(conexPesquisa.rs.getString("DESC_TIPO"));
            conexPesquisa.desconectar();
            
            jButtonEditarAva.setEnabled(true);
            jButtonExcluirAva.setEnabled(true);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Selecionar os Dados!" + ex);
        }
        
        conex.desconectar();
    }//GEN-LAST:event_jTableAvaliaMouseClicked

    private void jTextFieldPesquisaAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaAvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaAvaActionPerformed

    private void jFormattedTextFieldDataIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataIniActionPerformed

    private void jFormattedTextFieldDataFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataFimActionPerformed

    private void jComboBoxTipoAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoAvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoAvaActionPerformed

   public void preencherTablela(String Sql) {
       ArrayList dados = new ArrayList();
       String [] colunas = new String [] {"ID","Data Inicio","Data Fim","Nota","Tipo"};
       conex.conecxao();
       
       conex.executaSql(Sql);
       
       try{
           conex.rs.first();
           do {
               ConvData(conex.rs.getString("DATA_INI"));
               data1 = data_banco;
               ConvData(conex.rs.getString("DATA_FIM"));
               data2 =  data_banco;
               ConvNota2(conex.rs.getString("VALOR_AVA"));
               dados.add(new Object[]{conex.rs.getString("COD_AVA"),data1,data_banco,nota_banco,conex.rs.getString("DESC_TIPO")});  
           }while(conex.rs.next());
           
       }catch(SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Nenhum resultado encontrado na tabela.");
       }
       ModeloTabela modelo = new ModeloTabela(dados, colunas);
       
       jTableAvalia.setModel(modelo);
       jTableAvalia.getColumnModel().getColumn(0).setPreferredWidth(90);
       jTableAvalia.getColumnModel().getColumn(0).setResizable(false);
       jTableAvalia.getColumnModel().getColumn(1).setPreferredWidth(90);
       jTableAvalia.getColumnModel().getColumn(1).setResizable(false);
       jTableAvalia.getColumnModel().getColumn(2).setPreferredWidth(90);
       jTableAvalia.getColumnModel().getColumn(2).setResizable(false);
       jTableAvalia.getColumnModel().getColumn(3).setPreferredWidth(90);
       jTableAvalia.getColumnModel().getColumn(3).setResizable(false);
       jTableAvalia.getColumnModel().getColumn(4).setPreferredWidth(90);
       jTableAvalia.getColumnModel().getColumn(4).setResizable(false);
       jTableAvalia.getTableHeader().setReorderingAllowed(false);
       jTableAvalia.setAutoResizeMode(jTableAvalia.AUTO_RESIZE_OFF);
       jTableAvalia.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
       conex.desconectar();
   } 
   
   public void ConvData (String data) {

        try {
            data_inicial = new SimpleDateFormat("yyyy-MM-dd").parse(data);
            data_banco = new SimpleDateFormat("dd/MM/yyyy").format(data_inicial);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro"+ex);
        }
 
    }

    public void ConvBanco (String data) {
        try {
            data_inicial = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            data_banco = new SimpleDateFormat("yyyy-MM-dd").format(data_inicial);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro"+ex);
        }
    }
    
    public void ConvNota (String nota_inicial) {
        nota_banco = nota_inicial.replaceAll(",", ".");
        //nota_banco = Double.parseDouble(nota_inicial);
        
    }
    
    public void ConvNota2 (String nota_inicial) {
        nota_banco = nota_inicial.replaceAll("\\.", ",");
        //nota_banco = Double.parseDouble(nota_inicial);
        
    }
   
   
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
            java.util.logging.Logger.getLogger(FormAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new FormAvaliacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarAva;
    private javax.swing.JButton jButtonEditarAva;
    private javax.swing.JButton jButtonExcluirAva;
    private javax.swing.JButton jButtonNovoAva;
    private javax.swing.JButton jButtonPesquisaAva;
    private javax.swing.JButton jButtonSalvarAva;
    private javax.swing.JComboBox<String> jComboBoxTipoAva;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataFim;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelFormProfessor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAvalia;
    private javax.swing.JTextField jTextFieldCodAva;
    private javax.swing.JTextField jTextFieldNotaAva;
    private javax.swing.JTextField jTextFieldPesquisaAva;
    // End of variables declaration//GEN-END:variables
}