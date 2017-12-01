package br.tcc.Interface;

/**
 *
 * @author Joao Paulo
 */
public class InterfaceMenu extends javax.swing.JFrame {

    private InterfaceCidade InterfaceCidade;

    /**
     * Creates new form InterfaceMenu
     */
    public InterfaceMenu() {

        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(InterfaceLogin.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLLogo = new javax.swing.JLabel();
        jPMenu = new javax.swing.JPanel();
        jBCliente = new javax.swing.JButton();
        jBCliente2 = new javax.swing.JButton();
        jBCliente5 = new javax.swing.JButton();
        jBCliente3 = new javax.swing.JButton();
        jBCliente4 = new javax.swing.JButton();
        jBCliente1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMcadastro = new javax.swing.JMenu();
        jMIEstado = new javax.swing.JMenuItem();
        jMIcidade = new javax.swing.JMenuItem();
        jMIcliente = new javax.swing.JMenuItem();
        jMIfuncionario = new javax.swing.JMenuItem();
        jMIproduto = new javax.swing.JMenuItem();
        jMIforma_pgto = new javax.swing.JMenuItem();
        jMIparcela = new javax.swing.JMenuItem();
        jMImarca = new javax.swing.JMenuItem();
        Fornecedor = new javax.swing.JRadioButtonMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMatendimento = new javax.swing.JMenu();
        jMIatendimento = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/tcc/fotos/logo.png"))); // NOI18N

        jBCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/tcc/fotos/cliente.jpg"))); // NOI18N
        jBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClienteActionPerformed(evt);
            }
        });

        jBCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/tcc/fotos/compra&venda.jpg"))); // NOI18N
        jBCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCliente2ActionPerformed(evt);
            }
        });

        jBCliente5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/tcc/fotos/fornecedor.jpg"))); // NOI18N
        jBCliente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCliente5ActionPerformed(evt);
            }
        });

        jBCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/tcc/fotos/sms.png"))); // NOI18N
        jBCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCliente3ActionPerformed(evt);
            }
        });

        jBCliente4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/tcc/fotos/caixa.jpg"))); // NOI18N
        jBCliente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCliente4ActionPerformed(evt);
            }
        });

        jBCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/tcc/fotos/funcionario.jpg"))); // NOI18N
        jBCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCliente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCliente3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCliente5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCliente4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCliente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCliente5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMcadastro.setText("Cadastro");

        jMIEstado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMIEstado.setText("Estado");
        jMIEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEstadoActionPerformed(evt);
            }
        });
        jMcadastro.add(jMIEstado);

        jMIcidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMIcidade.setText("Cidade");
        jMIcidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMIcidadeMouseClicked(evt);
            }
        });
        jMIcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIcidadeActionPerformed(evt);
            }
        });
        jMcadastro.add(jMIcidade);

        jMIcliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMIcliente.setText("Cliente");
        jMIcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIclienteActionPerformed(evt);
            }
        });
        jMcadastro.add(jMIcliente);

        jMIfuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMIfuncionario.setText("Funcionario");
        jMIfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIfuncionarioActionPerformed(evt);
            }
        });
        jMcadastro.add(jMIfuncionario);

        jMIproduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMIproduto.setText("Produto");
        jMIproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIprodutoActionPerformed(evt);
            }
        });
        jMcadastro.add(jMIproduto);

        jMIforma_pgto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMIforma_pgto.setText("Forma de Pagamento");
        jMIforma_pgto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIforma_pgtoActionPerformed(evt);
            }
        });
        jMcadastro.add(jMIforma_pgto);

        jMIparcela.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMIparcela.setText("Família Produtos");
        jMIparcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIparcelaActionPerformed(evt);
            }
        });
        jMcadastro.add(jMIparcela);

        jMImarca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMImarca.setText("Tipo de Movimento");
        jMImarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMImarcaActionPerformed(evt);
            }
        });
        jMcadastro.add(jMImarca);

        Fornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Fornecedor.setSelected(true);
        Fornecedor.setText("Fornecedor");
        Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornecedorActionPerformed(evt);
            }
        });
        jMcadastro.add(Fornecedor);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Preco de Venda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMcadastro.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Relacionamento Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMcadastro.add(jMenuItem2);

        jMenuBar1.add(jMcadastro);

        jMatendimento.setText("Movimentação");

        jMIatendimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMIatendimento.setText("Compra");
        jMIatendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIatendimentoActionPerformed(evt);
            }
        });
        jMatendimento.add(jMIatendimento);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setText("Venda");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMatendimento.add(jMenuItem5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Caixa");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMatendimento.add(jMenuItem4);

        jMenuBar1.add(jMatendimento);

        jMenu1.setText("SMS");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Enviar SMS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 604, Short.MAX_VALUE)
                .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLLogo))
        );

        setSize(new java.awt.Dimension(717, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIatendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIatendimentoActionPerformed
        new InterfaceCompraVenda().setVisible(true);
    }//GEN-LAST:event_jMIatendimentoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new InterfaceCompraVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new InterfacePrecoVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornecedorActionPerformed
        new InterfaceFornecedor().setVisible(true);
    }//GEN-LAST:event_FornecedorActionPerformed

    private void jMImarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImarcaActionPerformed
        new InterfaceTipoMovimento().setVisible(true);
    }//GEN-LAST:event_jMImarcaActionPerformed

    private void jMIparcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIparcelaActionPerformed
        new InterfaceFamilia().setVisible(true);
    }//GEN-LAST:event_jMIparcelaActionPerformed

    private void jMIforma_pgtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIforma_pgtoActionPerformed
        new InterfaceFormaPgto().setVisible(true);
    }//GEN-LAST:event_jMIforma_pgtoActionPerformed

    private void jMIprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIprodutoActionPerformed
        new InterfaceProduto().setVisible(true);
    }//GEN-LAST:event_jMIprodutoActionPerformed

    private void jMIfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIfuncionarioActionPerformed
        new InterfaceFuncionario().setVisible(true);
    }//GEN-LAST:event_jMIfuncionarioActionPerformed

    private void jMIclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIclienteActionPerformed
        new InterfaceCliente().setVisible(true);
    }//GEN-LAST:event_jMIclienteActionPerformed

    private void jMIcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIcidadeActionPerformed
        new InterfaceCidade().setVisible(true);
    }//GEN-LAST:event_jMIcidadeActionPerformed

    private void jMIcidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMIcidadeMouseClicked

    }//GEN-LAST:event_jMIcidadeMouseClicked

    private void jMIEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEstadoActionPerformed
        new InterfaceUF().setVisible(true);
    }//GEN-LAST:event_jMIEstadoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new InterfaceSMS().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new InterfaceRelacaoPessoa().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClienteActionPerformed
        new InterfaceCliente().setVisible(true);
    }//GEN-LAST:event_jBClienteActionPerformed

    private void jBCliente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCliente5ActionPerformed
        new InterfaceFornecedor().setVisible(true);
    }//GEN-LAST:event_jBCliente5ActionPerformed

    private void jBCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCliente1ActionPerformed
        new InterfaceFuncionario().setVisible(true);
    }//GEN-LAST:event_jBCliente1ActionPerformed

    private void jBCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCliente2ActionPerformed
        new InterfaceCompraVenda().setVisible(true);
    }//GEN-LAST:event_jBCliente2ActionPerformed

    private void jBCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCliente3ActionPerformed
        new InterfaceSMS().setVisible(true);
    }//GEN-LAST:event_jBCliente3ActionPerformed

    private void jBCliente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCliente4ActionPerformed
        new InterfaceCaixa().setVisible(true);
    }//GEN-LAST:event_jBCliente4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InterfaceMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem Fornecedor;
    private javax.swing.JButton jBCliente;
    private javax.swing.JButton jBCliente1;
    private javax.swing.JButton jBCliente2;
    private javax.swing.JButton jBCliente3;
    private javax.swing.JButton jBCliente4;
    private javax.swing.JButton jBCliente5;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JMenuItem jMIEstado;
    private javax.swing.JMenuItem jMIatendimento;
    private javax.swing.JMenuItem jMIcidade;
    private javax.swing.JMenuItem jMIcliente;
    private javax.swing.JMenuItem jMIforma_pgto;
    private javax.swing.JMenuItem jMIfuncionario;
    private javax.swing.JMenuItem jMImarca;
    private javax.swing.JMenuItem jMIparcela;
    private javax.swing.JMenuItem jMIproduto;
    private javax.swing.JMenu jMatendimento;
    private javax.swing.JMenu jMcadastro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPMenu;
    // End of variables declaration//GEN-END:variables
}
