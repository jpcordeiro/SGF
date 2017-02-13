package br.tcc.Interface;

import br.tcc.Validacoes.LimparCampos;
import br.tcc.Validacoes.PreencherJtableGenerico;
import br.tcc.classe.Estado;
import br.tcc.dao.EstadoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao Paulo
 */
public class InterfaceUF extends javax.swing.JFrame {

    Estado estado = new Estado();
    EstadoDAO estadoDao = new EstadoDAO();
    LimparCampos lcampos = new LimparCampos();
    private int situacao = 0;
    

    /**
     * Creates new form InterfacePessoa
     */
    public InterfaceUF() {

        initComponents();
        jTFCodigo.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGtipo_pessoa = new javax.swing.ButtonGroup();
        jTPUF = new javax.swing.JTabbedPane();
        jPcadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFSigla = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFUf = new javax.swing.JTextField();
        jPanelbotoes = new javax.swing.JPanel();
        jBincluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBgravar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTFICMS = new javax.swing.JTextField();
        jPConsulta = new javax.swing.JPanel();
        jBtPesquisa = new javax.swing.JButton();
        jTFPesquisa = new javax.swing.JTextField();
        jCbPesquisa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbPesquisa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estado");

        jLabel1.setText("Código");

        jTFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoActionPerformed(evt);
            }
        });

        jLabel8.setText("Sigla");

        jLabel9.setText("Estado");

        jPanelbotoes.setBackground(new java.awt.Color(153, 153, 153));

        jBincluir.setText("Incluir");
        jBincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBincluirActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jBgravar.setText("Gravar");
        jBgravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgravarActionPerformed(evt);
            }
        });

        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelbotoesLayout = new javax.swing.GroupLayout(jPanelbotoes);
        jPanelbotoes.setLayout(jPanelbotoesLayout);
        jPanelbotoesLayout.setHorizontalGroup(
            jPanelbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbotoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jBincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBexcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBgravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBcancelar)
                .addContainerGap())
        );
        jPanelbotoesLayout.setVerticalGroup(
            jPanelbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbotoesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBincluir)
                    .addComponent(jBAlterar)
                    .addComponent(jBexcluir)
                    .addComponent(jBgravar)
                    .addComponent(jBcancelar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel18.setText("ICMS");

        javax.swing.GroupLayout jPcadastroLayout = new javax.swing.GroupLayout(jPcadastro);
        jPcadastro.setLayout(jPcadastroLayout);
        jPcadastroLayout.setHorizontalGroup(
            jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel18))
                        .addContainerGap(376, Short.MAX_VALUE))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jPanelbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFUf)
                            .addComponent(jTFSigla)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFICMS))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPcadastroLayout.setVerticalGroup(
            jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFICMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelbotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        jTPUF.addTab("Cadastro", jPcadastro);

        jBtPesquisa.setText("Pesquisar");
        jBtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisaActionPerformed(evt);
            }
        });

        jCbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Cidade", "UF" }));

        jTbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Estado", "UF", "ICMS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbPesquisa);

        javax.swing.GroupLayout jPConsultaLayout = new javax.swing.GroupLayout(jPConsulta);
        jPConsulta.setLayout(jPConsultaLayout);
        jPConsultaLayout.setHorizontalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addComponent(jCbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtPesquisa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConsultaLayout.setVerticalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtPesquisa)
                            .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jCbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPUF.addTab("Consulta", jPConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPUF)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPUF, javax.swing.GroupLayout.PREFERRED_SIZE, 380, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(440, 419));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBgravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarActionPerformed

       if (situacao == 1){
        estado.setDSUF(jTFUf.getText());
        estado.setDSSIGLA(jTFSigla.getText());
        String icms = jTFICMS.getText();

        if (jTFUf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o nome do Estado");
            jTFUf.grabFocus();
            return;
        } else if ((jTFSigla.getText().equals("")) || (jTFSigla.getText().length() >= 3) || (jTFSigla.getText().length() < 2)) {
            JOptionPane.showMessageDialog(null, "Informe a sigla do Estado com dois caracteres");
            jTFSigla.grabFocus();
            return;
        } else if (icms.equals("")) {
            estado.setNRICMS(0);
            estadoDao.incluir(estado);
            JOptionPane.showMessageDialog(null, "Estado Cadastrado com sucesso!");
            lcampos.LimparCampos(jPcadastro);
            estadobotoes(false);
        } else {
            estado.setNRICMS(Double.parseDouble(jTFICMS.getText()));
            estadoDao.incluir(estado);
            JOptionPane.showMessageDialog(null, "Estado Cadastrado com sucesso!");
            lcampos.LimparCampos(jPcadastro);
            estadobotoes(false);
        }}else{
           estado.setDSUF(jTFUf.getText());
        estado.setDSSIGLA(jTFSigla.getText());
        String icms = jTFICMS.getText();

        if (jTFUf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o nome do Estado");
            jTFUf.grabFocus();
            return;
        } else if ((jTFSigla.getText().equals("")) || (jTFSigla.getText().length() >= 3) || (jTFSigla.getText().length() < 2)) {
            JOptionPane.showMessageDialog(null, "Informe a sigla do Estado com dois caracteres");
            jTFSigla.grabFocus();
            return;
        } else if (icms.equals("")) {
            estado.setNRICMS(0);
            estadoDao.alterar(estado);
            JOptionPane.showMessageDialog(null, "Estado Cadastrado com sucesso!");
            lcampos.LimparCampos(jPcadastro);
            estadobotoes(false);
        } else {
            estado.setNRICMS(Double.parseDouble(jTFICMS.getText()));
            estadoDao.alterar(estado);
            JOptionPane.showMessageDialog(null, "Estado Alterado com sucesso!");
            lcampos.LimparCampos(jPcadastro);
            estadobotoes(false);
           
       }
    }//GEN-LAST:event_jBgravarActionPerformed
    }
    private void jBincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBincluirActionPerformed
        jTFUf.grabFocus();
        lcampos.LimparCampos(jPcadastro);
        situacao = 1;
        estadobotoes(true);
        jTFCodigo.setEnabled(false);
        
        
    }//GEN-LAST:event_jBincluirActionPerformed

    private void jBtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisaActionPerformed
        PreencherJtableGenerico preencher = new PreencherJtableGenerico();
        switch (jCbPesquisa.getSelectedIndex()) {
            case 0: {
                estadoDao.consulta(estado);
                preencher.PreencherJtableGenerico(jTbPesquisa, estado.getRetorno());
                return;
            }
            case 1: {
                estado.setDSUF(jTFPesquisa.getText().toUpperCase());
                estadoDao.consultadescricao(estado);
                preencher.PreencherJtableGenerico(jTbPesquisa, estado.getRetorno());
                return;
            }
            case 2: {
                estado.setDSSIGLA(jTFPesquisa.getText().toUpperCase());
                estadoDao.consultasigla(estado);
                preencher.PreencherJtableGenerico(jTbPesquisa, estado.getRetorno());
                return;
            }
    }//GEN-LAST:event_jBtPesquisaActionPerformed
    }
    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        situacao = 2;
        estadobotoes(true);
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        situacao = 1;
        estadobotoes(true);
        int t = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente EXCLUIR o registro?");
        if(t ==0){
        estadoDao.excluir(estado);
        JOptionPane.showMessageDialog(rootPane, "Registro excluido com sucesso!");
        }
        lcampos.LimparCampos(jPcadastro);
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        int t = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente cancelar o cadastro?");
        if (t == 0) {
            situacao = 2;
            lcampos.LimparCampos(jPcadastro);
            estadobotoes(false);
        }
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jTFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoActionPerformed

    private void jTbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbPesquisaMouseClicked
        if (evt.getClickCount() == 1) {
            int linha = jTbPesquisa.getSelectedRow();
            String ID = (String) jTbPesquisa.getValueAt(linha, 0);

            estado.setIDUF(Integer.parseInt(ID));
            estadoDao.retornadados(estado);  
            
            jTFCodigo.setText(Integer.toString(estado.getIDUF()));
            jTFUf.setText(estado.getDSUF());
            jTFSigla.setText(estado.getDSSIGLA());
            jTFICMS.setText(Double.toString(estado.getNRICMS()));
        }
        estadobotoes(false);
        jTPUF.setSelectedIndex(0);
    }//GEN-LAST:event_jTbPesquisaMouseClicked

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
            java.util.logging.Logger.getLogger(InterfaceUF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceUF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceUF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceUF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InterfaceUF().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGtipo_pessoa;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBgravar;
    private javax.swing.JButton jBincluir;
    private javax.swing.JButton jBtPesquisa;
    private javax.swing.JComboBox jCbPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPConsulta;
    private javax.swing.JPanel jPanelbotoes;
    private javax.swing.JPanel jPcadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFICMS;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTextField jTFSigla;
    private javax.swing.JTextField jTFUf;
    private javax.swing.JTabbedPane jTPUF;
    private javax.swing.JTable jTbPesquisa;
    // End of variables declaration//GEN-END:variables

    private void estadobotoes(boolean situacao) {
        jBincluir.setEnabled(!situacao);
        jBAlterar.setEnabled(!situacao);
        jBexcluir.setEnabled(!situacao);
        jBgravar.setEnabled(situacao);
        jBcancelar.setEnabled(situacao);
    }
}
