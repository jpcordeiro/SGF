package br.tcc.Interface;

import br.tcc.Validacoes.LimparCampos;
import br.tcc.Validacoes.PreencherJtableGenerico;
import br.tcc.classe.Cidade;
import br.tcc.classe.Estado;
import br.tcc.dao.CidadeDAO;
import br.tcc.dao.EstadoDAO;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao Paulo -- acsantana
 */
public class InterfaceCidade extends javax.swing.JFrame {

    Cidade cidade = new Cidade();
    Estado estado = new Estado();
    CidadeDAO cidadeDAO = new CidadeDAO();
    EstadoDAO estadoDao = new EstadoDAO();
    LimparCampos lcampos = new LimparCampos();
    private int situacao = 0;

    public InterfaceCidade() {
        initComponents();
        jTFCodigo.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupPesquisa = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jTPCidade = new javax.swing.JTabbedPane();
        jPCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jCbUF = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBtIncluir = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jBtGravar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTFIssqn = new javax.swing.JTextField();
        jPConsulta = new javax.swing.JPanel();
        jBtPesquisa = new javax.swing.JButton();
        jTFPesquisa = new javax.swing.JTextField();
        jCbPesquisa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbPesquisa = new javax.swing.JTable();

        jMenuItem1.setText("Carregar Dados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupPesquisa.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidade");

        jLabel1.setText("Código");

        jTFCodigo.setName("cd_cidade"); // NOI18N
        jTFCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoFocusLost(evt);
            }
        });

        jLabel2.setText("Cidade");

        jLabel3.setText("Estado");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jBtIncluir.setText("Incluir");
        jBtIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtIncluirActionPerformed(evt);
            }
        });

        jBtAlterar.setText("Alterar");
        jBtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAlterarActionPerformed(evt);
            }
        });

        jBtExcluir.setText("Excluir");
        jBtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirActionPerformed(evt);
            }
        });

        jBtCancelar.setText("Cancelar");
        jBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarActionPerformed(evt);
            }
        });

        jBtGravar.setText("Gravar");
        jBtGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel4.setText("ISSQN");

        javax.swing.GroupLayout jPCadastroLayout = new javax.swing.GroupLayout(jPCadastro);
        jPCadastro.setLayout(jPCadastroLayout);
        jPCadastroLayout.setHorizontalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFIssqn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCbUF, javax.swing.GroupLayout.Alignment.LEADING, 0, 115, Short.MAX_VALUE)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(407, Short.MAX_VALUE))))
        );
        jPCadastroLayout.setVerticalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFIssqn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTPCidade.addTab("Cadastro", jPCadastro);

        jBtPesquisa.setText("Pesquisar");
        jBtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisaActionPerformed(evt);
            }
        });

        jCbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Cidade", " " }));

        jTbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Código UF", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTbPesquisa.setComponentPopupMenu(jPopupPesquisa);
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
                    .addComponent(jScrollPane1)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addComponent(jCbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTPCidade.addTab("Consulta", jPConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPCidade)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPCidade)
        );

        setSize(new java.awt.Dimension(553, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisaActionPerformed

        PreencherJtableGenerico preencher = new PreencherJtableGenerico();
        switch (jCbPesquisa.getSelectedIndex()) {
            case 0: {
                cidadeDAO.consulta(cidade);
                preencher.PreencherJComboBox(jTbPesquisa, cidade.getRetorno());
                return;
            }
            case 1: {
                cidade.setDscidade(jTFPesquisa.getText().toUpperCase());
                cidadeDAO.consultadescricao(cidade);
                preencher.PreencherJComboBox(jTbPesquisa, cidade.getRetorno());
                return;
            }
    }//GEN-LAST:event_jBtPesquisaActionPerformed
    }
private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jTFCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoFocusLost

}//GEN-LAST:event_jTFCodigoFocusLost

    private void jBtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGravarActionPerformed

        Integer idUf = null;
        if (situacao == 1) {
            cidade.setDscidade(jTFCidade.getText().toUpperCase());
            String uf = jCbUF.getSelectedItem().toString();
            try {
                idUf = estadoDao.ConsultaIdUf(idUf, uf);
                cidade.setIdUf(idUf);
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceCidade.class.getName()).log(Level.SEVERE, null, ex);
            }
            String issqn = jTFIssqn.getText();

            if (jTFCidade.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o nome da Cidade");
                jTFCidade.grabFocus();
                return;
            } else if (issqn.equals("")) {
                cidade.setNRISSQN(0.0);
                cidadeDAO.incluir(cidade);
                JOptionPane.showMessageDialog(null, "Cidade Cadastrada com sucesso!");
                lcampos.LimparCampos(jPCadastro);
                estadobotoes(false);
            } else {
                cidade.setNRISSQN(Double.parseDouble(jTFIssqn.getText()));
                cidadeDAO.incluir(cidade);
                JOptionPane.showMessageDialog(null, "Cidade Cadastrada com sucesso!");
                lcampos.LimparCampos(jPCadastro);
                estadobotoes(false);
            }
        } else {
            cidade.setDscidade(jTFCidade.getText());
            
            String uf = jCbUF.getSelectedItem().toString();
            try {
                idUf = estadoDao.ConsultaIdUf(idUf, uf);
                cidade.setIdUf(idUf);
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceCidade.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String issqn = jTFIssqn.getText();

            if (jTFCidade.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o nome da Cidade");
                jTFCidade.grabFocus();
                return;
            } else if (issqn.equals("")) {
                cidade.setNRISSQN(0.0);
                cidadeDAO.alterar(cidade);
                JOptionPane.showMessageDialog(null, "Cidade Alterada com sucesso!");
                lcampos.LimparCampos(jPCadastro);
                estadobotoes(false);
            } else {
                cidade.setNRISSQN(Double.parseDouble(jTFIssqn.getText()));
                cidadeDAO.alterar(cidade);
                JOptionPane.showMessageDialog(null, "Cidade Alterada com sucesso!");
                lcampos.LimparCampos(jPCadastro);
                estadobotoes(false);
            }
        }
    }//GEN-LAST:event_jBtGravarActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed

        int t = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente cancelar o cadastro?");
        if (t == 0) {
            situacao = 2;
            lcampos.LimparCampos(jPCadastro);
            estadobotoes(false);
        }
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed

        situacao = 1;
        estadobotoes(true);
        int t = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente EXCLUIR o registro?");
        if (t == 0) {
            cidadeDAO.excluir(cidade);
            JOptionPane.showMessageDialog(rootPane, "Registro excluido com sucesso!");
        }
        lcampos.LimparCampos(jPCadastro);
    }//GEN-LAST:event_jBtExcluirActionPerformed

    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed

        situacao = 2;
        estadobotoes(true);
        estadoDao.preencherestado(jCbUF, estado);
    }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jBtIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtIncluirActionPerformed
        jTFCidade.grabFocus();
        lcampos.LimparCampos(jPCadastro);
        situacao = 1;
        estadobotoes(true);
        estadoDao.preencherestado(jCbUF, estado);

    }//GEN-LAST:event_jBtIncluirActionPerformed

    private void jTbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbPesquisaMouseClicked

        if (evt.getClickCount()==1) {
            int linha = jTbPesquisa.getSelectedRow();
            String ID = (String) jTbPesquisa.getValueAt(linha, 0);
           
            cidade.setIDCIDADE(Integer.parseInt(ID));          
            cidadeDAO.retornadados(cidade);
            
            jTFCodigo.setText(Integer.toString(cidade.getIDCIDADE()));
            jTFCidade.setText(cidade.getDscidade());
            jCbUF.setSelectedIndex(0);
            jTFIssqn.setText(Double.toString(cidade.getNRISSQN()));
            }
        estadobotoes(false);
        jTPCidade.setSelectedIndex(0);
    }//GEN-LAST:event_jTbPesquisaMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InterfaceCidade().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtGravar;
    private javax.swing.JButton jBtIncluir;
    private javax.swing.JButton jBtPesquisa;
    private javax.swing.JComboBox jCbPesquisa;
    private javax.swing.JComboBox jCbUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPCadastro;
    private javax.swing.JPanel jPConsulta;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFIssqn;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTabbedPane jTPCidade;
    private javax.swing.JTable jTbPesquisa;
    // End of variables declaration//GEN-END:variables

    private void estadobotoes(boolean situacao) {
        jBtIncluir.setEnabled(!situacao);
        jBtAlterar.setEnabled(!situacao);
        jBtExcluir.setEnabled(!situacao);
        jBtGravar.setEnabled(situacao);
        jBtCancelar.setEnabled(situacao);
    }
}
