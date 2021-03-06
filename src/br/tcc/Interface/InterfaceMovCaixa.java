package br.tcc.Interface;

import br.tcc.ConsultaSimples.ConsultaCliente;

/**
 *
 * @author Joao Paulo 
 */
public class InterfaceMovCaixa extends javax.swing.JFrame {

    

    public InterfaceMovCaixa() {
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
        jTFIdCliente = new javax.swing.JTextField();
        jBPesquisarCliente = new javax.swing.JButton();
        jTFDsCliente = new javax.swing.JTextField();
        jBPesquisarParcelas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbParcela = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTFVlPagar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFVldinheiro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFVlTroco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFDesconto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFJuros = new javax.swing.JTextField();
        jBConfirmar = new javax.swing.JButton();
        jBExtornar = new javax.swing.JButton();
        jBComprovante = new javax.swing.JButton();
        jPConsulta = new javax.swing.JPanel();
        jBtPesquisa = new javax.swing.JButton();
        jTFPesquisa = new javax.swing.JTextField();
        jCbPesquisa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbPesquisa = new javax.swing.JTable();
        jPCadastro1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jBPesquisarParcelas1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbParcela1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTFVlPagar1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFVldinheiro1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTFVlTroco1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTFDesconto1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTFJuros1 = new javax.swing.JTextField();
        jBConfirmar1 = new javax.swing.JButton();
        jBExtornar1 = new javax.swing.JButton();
        jBComprovante1 = new javax.swing.JButton();

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

        jLabel2.setText("Cliente");

        jBPesquisarCliente.setText("Pesquisar");
        jBPesquisarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPesquisarClienteMouseClicked(evt);
            }
        });

        jBPesquisarParcelas.setText("Pesquisar Parcelas");

        jLabel4.setText("Parcelas a Pagar");

        jTbParcela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selecionar", "Código", "Data", "Valor", "Parcela"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbParcela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTbParcela.setColumnSelectionAllowed(true);
        jTbParcela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbParcelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTbParcela);

        jLabel3.setText("Valor Total a pagar");

        jLabel5.setText("Dinheiro");

        jLabel6.setText("Troco");

        jLabel7.setText("Desconto");

        jLabel8.setText("Juros");

        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jBExtornar.setText("Extornar");
        jBExtornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExtornarActionPerformed(evt);
            }
        });

        jBComprovante.setText("Comprovante");
        jBComprovante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprovanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCadastroLayout = new javax.swing.GroupLayout(jPCadastro);
        jPCadastro.setLayout(jPCadastroLayout);
        jPCadastroLayout.setHorizontalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCadastroLayout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jBPesquisarParcelas))
                    .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCadastroLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(34, 34, 34)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCadastroLayout.createSequentialGroup()
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBPesquisarCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFDsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTFVlPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTFVldinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTFVlTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addComponent(jTFDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFJuros))
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroLayout.createSequentialGroup()
                        .addComponent(jBExtornar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBComprovante)
                        .addGap(116, 116, 116)))
                .addContainerGap())
        );
        jPCadastroLayout.setVerticalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarCliente)
                    .addComponent(jTFDsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPesquisarParcelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFVlPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFVlTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVldinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExtornar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBComprovante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTPCidade.addTab("Receber", jPCadastro);

        jBtPesquisa.setText("Pesquisar");
        jBtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisaActionPerformed(evt);
            }
        });

        jCbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Cidade" }));

        jTbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Estado", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTbPesquisa.setComponentPopupMenu(jPopupPesquisa);
        jTbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbPesquisa);
        if (jTbPesquisa.getColumnModel().getColumnCount() > 0) {
            jTbPesquisa.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPConsultaLayout = new javax.swing.GroupLayout(jPConsulta);
        jPConsulta.setLayout(jPConsultaLayout);
        jPConsultaLayout.setHorizontalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtPesquisa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPCidade.addTab("Consulta", jPConsulta);

        jLabel9.setText("Código");

        jTFCodigo1.setName("cd_cidade"); // NOI18N
        jTFCodigo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigo1FocusLost(evt);
            }
        });

        jBPesquisarParcelas1.setText("Pesquisar Parcelas");
        jBPesquisarParcelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarParcelas1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Parcelas a Pagar");

        jTbParcela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selecionar", "Código", "Data", "Valor", "Parcela"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbParcela1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTbParcela1.setColumnSelectionAllowed(true);
        jTbParcela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbParcela1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTbParcela1);

        jLabel12.setText("Valor Total a pagar");

        jLabel13.setText("Dinheiro");

        jLabel14.setText("Troco");

        jLabel15.setText("Desconto");

        jLabel16.setText("Juros");

        jBConfirmar1.setText("Confirmar");
        jBConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmar1ActionPerformed(evt);
            }
        });

        jBExtornar1.setText("Extornar");
        jBExtornar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExtornar1ActionPerformed(evt);
            }
        });

        jBComprovante1.setText("Comprovante");
        jBComprovante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprovante1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCadastro1Layout = new javax.swing.GroupLayout(jPCadastro1);
        jPCadastro1.setLayout(jPCadastro1Layout);
        jPCadastro1Layout.setHorizontalGroup(
            jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastro1Layout.createSequentialGroup()
                .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCadastro1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCadastro1Layout.createSequentialGroup()
                        .addComponent(jTFCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPesquisarParcelas1)))
                .addGap(0, 344, Short.MAX_VALUE))
            .addGroup(jPCadastro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastro1Layout.createSequentialGroup()
                        .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jTFVlPagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCadastro1Layout.createSequentialGroup()
                                .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jTFVldinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jTFVlTroco1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCadastro1Layout.createSequentialGroup()
                                        .addComponent(jTFDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFJuros1))
                                    .addGroup(jPCadastro1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel16)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPCadastro1Layout.createSequentialGroup()
                                .addComponent(jBExtornar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBComprovante1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPCadastro1Layout.createSequentialGroup()
                        .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPCadastro1Layout.setVerticalGroup(
            jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastro1Layout.createSequentialGroup()
                .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarParcelas1))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPCadastro1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFVlPagar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastro1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFVlTroco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPCadastro1Layout.createSequentialGroup()
                        .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFJuros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPCadastro1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVldinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExtornar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBComprovante1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTPCidade.addTab("Pagar", jPCadastro1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPCidade)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(553, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisaActionPerformed

        
        
           
    }//GEN-LAST:event_jBtPesquisaActionPerformed
    
private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbPesquisaMouseClicked

      
    }//GEN-LAST:event_jTbPesquisaMouseClicked

    private void jTFCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoFocusLost

    }//GEN-LAST:event_jTFCodigoFocusLost

    private void jBPesquisarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarClienteMouseClicked
        final ConsultaCliente retornaCliente = new ConsultaCliente();
        retornaCliente.setVisible(true);
        retornaCliente.addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosed(java.awt.event.WindowEvent evt) {
                jTFIdCliente.setText(retornaCliente.retornaId);
                jTFDsCliente.setText(retornaCliente.retornaDsCliente);
            }
        });
    }//GEN-LAST:event_jBPesquisarClienteMouseClicked

    private void jTbParcelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbParcelaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbParcelaMouseClicked

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed

    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void jBExtornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExtornarActionPerformed

    }//GEN-LAST:event_jBExtornarActionPerformed

    private void jBComprovanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprovanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBComprovanteActionPerformed

    private void jTFCodigo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigo1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigo1FocusLost

    private void jTbParcela1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbParcela1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbParcela1MouseClicked

    private void jBConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBConfirmar1ActionPerformed

    private void jBExtornar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExtornar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBExtornar1ActionPerformed

    private void jBComprovante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprovante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBComprovante1ActionPerformed

    private void jBPesquisarParcelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarParcelas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPesquisarParcelas1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceMovCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMovCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMovCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMovCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InterfaceMovCaixa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComprovante;
    private javax.swing.JButton jBComprovante1;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBConfirmar1;
    private javax.swing.JButton jBExtornar;
    private javax.swing.JButton jBExtornar1;
    private javax.swing.JButton jBPesquisarCliente;
    private javax.swing.JButton jBPesquisarParcelas;
    private javax.swing.JButton jBPesquisarParcelas1;
    private javax.swing.JButton jBtPesquisa;
    private javax.swing.JComboBox jCbPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPCadastro;
    private javax.swing.JPanel jPCadastro1;
    private javax.swing.JPanel jPConsulta;
    private javax.swing.JPopupMenu jPopupPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFDesconto;
    private javax.swing.JTextField jTFDesconto1;
    private javax.swing.JTextField jTFDsCliente;
    private javax.swing.JTextField jTFIdCliente;
    private javax.swing.JTextField jTFJuros;
    private javax.swing.JTextField jTFJuros1;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTextField jTFVlPagar;
    private javax.swing.JTextField jTFVlPagar1;
    private javax.swing.JTextField jTFVlTroco;
    private javax.swing.JTextField jTFVlTroco1;
    private javax.swing.JTextField jTFVldinheiro;
    private javax.swing.JTextField jTFVldinheiro1;
    private javax.swing.JTabbedPane jTPCidade;
    private javax.swing.JTable jTbParcela;
    private javax.swing.JTable jTbParcela1;
    private javax.swing.JTable jTbPesquisa;
    // End of variables declaration//GEN-END:variables
  
}
