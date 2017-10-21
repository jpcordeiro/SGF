package br.tcc.Interface;

import br.tcc.ConsultaSimples.ConsultaCliente;
import br.tcc.ConsultaSimples.ConsultaFornecedor;
import br.tcc.Validacoes.PreencherJtableGenerico;
import br.tcc.Validacoes.RetornaDataAtual;
import br.tcc.classe.Caixa;
import br.tcc.classe.ContasPagar;
import br.tcc.classe.ContasReceber;
import br.tcc.classe.Pagamento;
import br.tcc.classe.Recebimento;
import br.tcc.dao.CaixaDAO;
import br.tcc.dao.ContasPagarDAO;
import br.tcc.dao.ContasReceberDAO;
import br.tcc.dao.PagamentoDAO;
import br.tcc.dao.RecebimentoDAO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joao Paulo
 */
public class InterfaceCaixa extends javax.swing.JFrame {

    ContasReceber contasReceber = new ContasReceber();
    ContasReceberDAO contasReceberDAO = new ContasReceberDAO();
    ContasPagar contasPagar = new ContasPagar();
    ContasPagarDAO contasPagarDAO = new ContasPagarDAO();
    Recebimento recebimento = new Recebimento();
    RecebimentoDAO recebimentoDAO = new RecebimentoDAO();
    Pagamento pagamento = new Pagamento();
    PagamentoDAO pagamentoDAO = new PagamentoDAO();
    Caixa caixa = new Caixa();
    CaixaDAO caixaDAO = new CaixaDAO();
    RetornaDataAtual retornadata = new RetornaDataAtual();

    public InterfaceCaixa() {
        initComponents();
        jTFCodigo.setEnabled(false);
        jTFVlPagar.setEnabled(false);
        jTFTotal.setEnabled(false);
        jTFVlTroco.setEnabled(false);
        jTFdata.setEnabled(false);
        jTFVlPagar.setText("0,0");
        jTFTotal.setText("0,0");
        jTFVlTroco.setText("0,0");
        jTFDesconto.setText("0.0");
        jTFJuros.setText("0.0");
        retornadata.RetornaDataAtual(jTFdata);
        
        jTFCodigo1.setEnabled(false);
        jTFVlPagar1.setEnabled(false);
        jTFTotal1.setEnabled(false);
        jTFVlTroco1.setEnabled(false);
        jTFdata1.setEnabled(false);
        jTFVlPagar1.setText("0,0");
        jTFTotal1.setText("0,0");
        jTFVlTroco1.setText("0,0");
        jTFDesconto1.setText("0.0");
        jTFJuros1.setText("0.0");
        retornadata.RetornaDataAtual(jTFdata1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupPesquisa = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbParcela = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTPCidade = new javax.swing.JTabbedPane();
        jPCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFIdCliente = new javax.swing.JTextField();
        jBPesquisarCliente = new javax.swing.JButton();
        jTFDsCliente = new javax.swing.JTextField();
        jBPesquisarParcelas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbCaixaVenda = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFVlPagar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFVldinheiro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFVlTroco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFJuros = new javax.swing.JTextField();
        jBConfirmar = new javax.swing.JButton();
        jBComprovante = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTFTotal = new javax.swing.JTextField();
        jTFdata = new javax.swing.JTextField();
        jPConsulta = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFIdFronecedor = new javax.swing.JTextField();
        jBPesquisarFornecedor = new javax.swing.JButton();
        jTFDsFornecedor = new javax.swing.JTextField();
        jTFdata1 = new javax.swing.JTextField();
        jBPesquisarParcelas1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTbCaixaCompra = new javax.swing.JTable();
        jTFVlPagar1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTFDesconto1 = new javax.swing.JTextField();
        jBConfirmarCompra = new javax.swing.JButton();
        jBComprovante1 = new javax.swing.JButton();
        jTFJuros1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTFTotal1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTFVlTroco1 = new javax.swing.JTextField();
        jTFVldinheiro1 = new javax.swing.JTextField();

        jMenuItem1.setText("Carregar Dados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupPesquisa.add(jMenuItem1);

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

        jLabel4.setText("Parcelas a Pagar");

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
        jBPesquisarParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarParcelasActionPerformed(evt);
            }
        });

        jTbCaixaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Venda", "Parcela", "Data", "Valor", "Selecionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbCaixaVenda.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTbCaixaVenda.setColumnSelectionAllowed(true);
        jTbCaixaVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbCaixaVendaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTbCaixaVenda);
        jTbCaixaVenda.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel5.setText("Parcelas a Pagar");

        jLabel3.setText("Valor a pagar");

        jLabel6.setText("Dinheiro");

        jTFVldinheiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFVldinheiroFocusLost(evt);
            }
        });

        jLabel7.setText("Troco");

        jLabel8.setText("Desconto");

        jTFDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFDescontoFocusLost(evt);
            }
        });

        jLabel9.setText("Juros");

        jTFJuros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFJurosFocusLost(evt);
            }
        });

        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jBComprovante.setText("Comprovante");
        jBComprovante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprovanteActionPerformed(evt);
            }
        });

        jLabel10.setText("Total");

        javax.swing.GroupLayout jPCadastroLayout = new javax.swing.GroupLayout(jPCadastro);
        jPCadastro.setLayout(jPCadastroLayout);
        jPCadastroLayout.setHorizontalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDsCliente))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBComprovante))
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTFVlPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jTFJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFVldinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTFVlTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBPesquisarParcelas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFdata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPCadastroLayout.setVerticalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addComponent(jTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarCliente)
                    .addComponent(jTFDsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPesquisarParcelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPCadastroLayout.createSequentialGroup()
                            .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFVlPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVldinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVlTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBComprovante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPCidade.addTab("Venda", jPCadastro);

        jLabel11.setText("Código");

        jTFCodigo1.setName("cd_cidade"); // NOI18N
        jTFCodigo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigo1FocusLost(evt);
            }
        });

        jLabel12.setText("Fornecedor");

        jBPesquisarFornecedor.setText("Pesquisar");
        jBPesquisarFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPesquisarFornecedorMouseClicked(evt);
            }
        });
        jBPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarFornecedorActionPerformed(evt);
            }
        });

        jBPesquisarParcelas1.setText("Pesquisar Parcelas");
        jBPesquisarParcelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarParcelas1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Parcelas a Pagar");

        jTbCaixaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Compra", "Parcela", "Data", "Valor", "Selecionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbCaixaCompra.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTbCaixaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbCaixaCompraMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTbCaixaCompra);
        jTbCaixaCompra.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel14.setText("Valor a pagar");

        jLabel15.setText("Desconto");

        jTFDesconto1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFDesconto1FocusLost(evt);
            }
        });

        jBConfirmarCompra.setText("Confirmar");
        jBConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarCompraActionPerformed(evt);
            }
        });

        jBComprovante1.setText("Comprovante");
        jBComprovante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprovante1ActionPerformed(evt);
            }
        });

        jTFJuros1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFJuros1FocusLost(evt);
            }
        });

        jLabel16.setText("Juros");

        jLabel17.setText("Total");

        jLabel18.setText("Dinheiro");

        jLabel19.setText("Troco");

        jTFVldinheiro1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFVldinheiro1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPConsultaLayout = new javax.swing.GroupLayout(jPConsulta);
        jPConsulta.setLayout(jPConsultaLayout);
        jPConsultaLayout.setHorizontalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addComponent(jTFCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFIdFronecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisarFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDsFornecedor))
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPConsultaLayout.createSequentialGroup()
                                .addComponent(jBConfirmarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBComprovante1))
                            .addGroup(jPConsultaLayout.createSequentialGroup()
                                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jTFVlPagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jTFJuros1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jTFTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFVldinheiro1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jTFVlTroco1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBPesquisarParcelas1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFdata1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPConsultaLayout.setVerticalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addComponent(jTFdata1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFIdFronecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarFornecedor)
                    .addComponent(jTFDsFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPesquisarParcelas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPConsultaLayout.createSequentialGroup()
                            .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFVlPagar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultaLayout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFJuros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVldinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVlTroco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirmarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBComprovante1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPCidade.addTab("Compra", jPConsulta);

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

        setSize(new java.awt.Dimension(553, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

}//GEN-LAST:event_jMenuItem1ActionPerformed

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

    private void jTbCaixaVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbCaixaVendaMouseClicked

        DefaultTableModel Itensparc = (DefaultTableModel) jTbCaixaVenda.getModel();
        int totlinha = jTbCaixaVenda.getRowCount();
        int conta = 0;
        double total = 0;
        String preco;
        double valor = 0;
        boolean sele = false;
        for (int i = 1; i <= totlinha; i++) {
            try {
                sele = (boolean) jTbCaixaVenda.getValueAt(conta, 5);
            } catch (Exception e) {
                if (sele != false) {
                    sele = false;
                }
            }
            if (sele == true) {

                preco = (String) jTbCaixaVenda.getValueAt(conta, 4);
                valor = Double.parseDouble(preco);
                total = total + valor;
                jTFVlPagar.setText(String.valueOf(total));
                jTFTotal.setText(String.valueOf(total));
            } else {
                jTFVlPagar.setText(String.valueOf(total));
                jTFTotal.setText(String.valueOf(total));
            }
            conta = conta + 1;
        }
    }//GEN-LAST:event_jTbCaixaVendaMouseClicked

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed

        DefaultTableModel Itensparc = (DefaultTableModel) jTbCaixaVenda.getModel();
        int totlinha = jTbCaixaVenda.getRowCount();
        int conta = 0;
        double total = 0;
        String preco;
        double valor = 0;
        boolean sele = false;
        for (int i = 1; i <= totlinha; i++) {
            try {
                sele = (boolean) jTbCaixaVenda.getValueAt(conta, 5);
            } catch (Exception e) {
                if (sele != false) {
                    sele = false;
                }
            }
            if (sele == true) {

                String IdContas = (String) jTbCaixaVenda.getValueAt(conta, 0);
                String IdCompra = (String) jTbCaixaVenda.getValueAt(conta, 1);
                String dtPagar = (String) jTbCaixaVenda.getValueAt(conta, 3);
                String VlPagar = (String) jTbCaixaVenda.getValueAt(conta, 4);
                String IdParcela = (String) jTbCaixaVenda.getValueAt(conta, 2);
                String Pago = "S";

                contasReceber.setIDCONTASRECEBER(Integer.parseInt(IdContas));
                contasReceber.setIDVENDA(Integer.parseInt(IdCompra));
                contasReceber.setDTRECEBER(dtPagar);
                contasReceber.setVLRECEBER(Double.parseDouble(VlPagar));
                contasReceber.setIDPARCELA(Integer.parseInt(IdParcela));
                contasReceber.setPAGO(Pago);

                contasReceberDAO.alterar(contasReceber);

                double vlpago = Double.parseDouble(jTFTotal.getText());
                double perjuros = Double.parseDouble(jTFJuros.getText());
                double perdesc = Double.parseDouble(jTFDesconto.getText());
                recebimento.setIDCONTASRECEBER(Integer.parseInt(IdContas));
                recebimento.setVLPAGO(vlpago);
                recebimento.setPERDESCONTO(perdesc);
                recebimento.setPERJUROS(perjuros);

                recebimentoDAO.incluir(recebimento);

                String data = jTFdata.getText();
                String InEntrada = "S";

                Integer idR = null;
                try {
                    idR = recebimentoDAO.retornaUltimoId(idR);
                } catch (SQLException ex) {
                    Logger.getLogger(InterfaceProduto.class.getName()).log(Level.SEVERE, null, ex);
                }

                caixa.setDTPAGO(data);
                caixa.setINENTRADA(InEntrada);
                caixa.setIDRECEBIMENTO(idR);

                caixaDAO.incluir(caixa);

            } else {
                jTFVlPagar.setText(String.valueOf(total));
                jTFTotal.setText(String.valueOf(total));
            }
            conta = conta + 1;
        }


    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void jBComprovanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprovanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBComprovanteActionPerformed

    private void jBPesquisarParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarParcelasActionPerformed

        PreencherJtableGenerico preencher = new PreencherJtableGenerico();
        String cliente = jTFIdCliente.getText().toUpperCase();
        Integer idCliente = Integer.parseInt(cliente);
        contasReceberDAO.consultageral(contasReceber, idCliente);
        preencher.PreencherJtableGenerico(jTbCaixaVenda, contasReceber.getRetorno());
        return;

    }//GEN-LAST:event_jBPesquisarParcelasActionPerformed

    private void jTFDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDescontoFocusLost
        String valor = jTFVlPagar.getText();
        String desconto = jTFDesconto.getText();
        if (!jTFVlPagar.equals("")) {
            if (!jTFDesconto.equals("")) {
                double vl_total = Double.parseDouble(valor);
                double desc = Double.parseDouble(desconto);
                jTFTotal.setText(String.valueOf(vl_total - desc));
            }
        }
    }//GEN-LAST:event_jTFDescontoFocusLost

    private void jTFJurosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFJurosFocusLost
        String valor = jTFVlPagar.getText();
        String juros = jTFJuros.getText();
        if (!jTFVlPagar.equals("")) {
            if (!jTFJuros.equals("")) {
                double vl_total = Double.parseDouble(valor);
                double jur = Double.parseDouble(juros);
                jTFTotal.setText(String.valueOf(vl_total + jur));
            }
        }


    }//GEN-LAST:event_jTFJurosFocusLost

    private void jTFVldinheiroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFVldinheiroFocusLost
        String total = jTFTotal.getText();
        String dinheiro = jTFVldinheiro.getText();
        if (!jTFTotal.equals("")) {
            if (!jTFVldinheiro.equals("")) {
                double vl_total = Double.parseDouble(total);
                double dinhe = Double.parseDouble(dinheiro);
                jTFVlTroco.setText(String.valueOf(dinhe - vl_total));
            }
        }

    }//GEN-LAST:event_jTFVldinheiroFocusLost

    private void jTFCodigo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigo1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigo1FocusLost

    private void jBPesquisarFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarFornecedorMouseClicked
        final ConsultaFornecedor retornaFornecedor = new ConsultaFornecedor();
        retornaFornecedor.setVisible(true);
        retornaFornecedor.addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosed(java.awt.event.WindowEvent evt) {
                jTFIdFronecedor.setText(retornaFornecedor.retornaId);
                jTFDsFornecedor.setText(retornaFornecedor.retornaDsFornecedor);
            }
        });
    }//GEN-LAST:event_jBPesquisarFornecedorMouseClicked

    private void jBPesquisarParcelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarParcelas1ActionPerformed
        PreencherJtableGenerico preencher = new PreencherJtableGenerico();
        String fornecedor = jTFIdFronecedor.getText().toUpperCase();
        Integer idfornecedor = Integer.parseInt(fornecedor);
        contasPagarDAO.consultageral(contasPagar, idfornecedor);
        preencher.PreencherJtableGenerico(jTbCaixaCompra, contasPagar.getRetorno());
        return;
    }//GEN-LAST:event_jBPesquisarParcelas1ActionPerformed

    private void jTbCaixaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbCaixaCompraMouseClicked

        DefaultTableModel Itensparc = (DefaultTableModel) jTbCaixaCompra.getModel();
        int totlinha = jTbCaixaCompra.getRowCount();
        int conta = 0;
        double total = 0;
        String preco;
        double valor = 0;
        boolean sele = false;
        for (int i = 1; i <= totlinha; i++) {
            try {
                sele = (boolean) jTbCaixaCompra.getValueAt(conta, 5);
            } catch (Exception e) {
                if (sele != false) {
                    sele = false;
                }
            }
            if (sele == true) {

                preco = (String) jTbCaixaCompra.getValueAt(conta, 4);
                valor = Double.parseDouble(preco);
                total = total + valor;
                jTFVlPagar1.setText(String.valueOf(total));
                jTFTotal1.setText(String.valueOf(total));
            } else {
                jTFVlPagar1.setText(String.valueOf(total));
                jTFTotal1.setText(String.valueOf(total));
            }
            conta = conta + 1;
        }

    }//GEN-LAST:event_jTbCaixaCompraMouseClicked

    private void jTFDesconto1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDesconto1FocusLost
        String valor = jTFVlPagar1.getText();
        String desconto = jTFDesconto1.getText();
        if (!jTFVlPagar1.equals("")) {
            if (!jTFDesconto1.equals("")) {
                double vl_total = Double.parseDouble(valor);
                double desc = Double.parseDouble(desconto);
                jTFTotal1.setText(String.valueOf(vl_total - desc));
            }
        }
    }//GEN-LAST:event_jTFDesconto1FocusLost

    private void jBConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarCompraActionPerformed

        DefaultTableModel Itensparc = (DefaultTableModel) jTbCaixaCompra.getModel();
        int totlinha = jTbCaixaCompra.getRowCount();
        int conta = 0;
        double total = 0;
        String preco;
        double valor = 0;
        boolean sele = false;
        for (int i = 1; i <= totlinha; i++) {
            try {
                sele = (boolean) jTbCaixaCompra.getValueAt(conta, 5);
            } catch (Exception e) {
                if (sele != false) {
                    sele = false;
                }
            }
            if (sele == true) {

                String IdContas = (String) jTbCaixaCompra.getValueAt(conta, 0);
                String IdCompra = (String) jTbCaixaCompra.getValueAt(conta, 1);
                String dtPagar = (String) jTbCaixaCompra.getValueAt(conta, 3);
                String VlPagar = (String) jTbCaixaCompra.getValueAt(conta, 4);
                String IdParcela = (String) jTbCaixaCompra.getValueAt(conta, 2);
                String Pago = "S";

                contasPagar.setIDCONTASPAGAR(Integer.parseInt(IdContas));
                contasPagar.setIDCOMRPA(Integer.parseInt(IdCompra));
                contasPagar.setDTPAGAR(dtPagar);
                contasPagar.setVLPAGAR(Double.parseDouble(VlPagar));
                contasPagar.setIDPARCELA(Integer.parseInt(IdParcela));
                contasPagar.setPAGO(Pago);

                contasPagarDAO.alterar(contasPagar);
                
                
                
                double vlpago = Double.parseDouble(jTFTotal1.getText());
                double perjuros = Double.parseDouble(jTFJuros1.getText());
                double perdesc = Double.parseDouble(jTFDesconto1.getText());
                pagamento.setIDCONTASPAGAR(Integer.parseInt(IdContas));
                pagamento.setVLPAGO(vlpago);
                pagamento.setPERDESCONTO(perdesc);
                pagamento.setPERJUROS(perjuros);

                pagamentoDAO.incluir(pagamento);
                

                String data = jTFdata.getText();
                String InEntrada = "N";

                Integer idR = null;
                try {
                    idR = pagamentoDAO.retornaUltimoId(idR);
                } catch (SQLException ex) {
                    Logger.getLogger(InterfaceCaixa.class.getName()).log(Level.SEVERE, null, ex);
                }

                caixa.setDTPAGO(data);
                caixa.setINENTRADA(InEntrada);
                caixa.setIDPAGAMENTO(idR);

                caixaDAO.incluir(caixa);

            } else {
                jTFVlPagar1.setText(String.valueOf(total));
                jTFTotal1.setText(String.valueOf(total));
            }
            conta = conta + 1;
        }


    }//GEN-LAST:event_jBConfirmarCompraActionPerformed

    private void jBComprovante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprovante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBComprovante1ActionPerformed

    private void jTFJuros1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFJuros1FocusLost
       String valor = jTFVlPagar1.getText();
        String juros = jTFJuros1.getText();
        if (!jTFVlPagar1.equals("")) {
            if (!jTFJuros1.equals("")) {
                double vl_total = Double.parseDouble(valor);
                double jur = Double.parseDouble(juros);
                jTFTotal1.setText(String.valueOf(vl_total + jur));
            }
        }
    }//GEN-LAST:event_jTFJuros1FocusLost

    private void jTFVldinheiro1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFVldinheiro1FocusLost
        String total = jTFTotal1.getText();
        String dinheiro = jTFVldinheiro1.getText();
        if (!jTFTotal1.equals("")) {
            if (!jTFVldinheiro1.equals("")) {
                double vl_total = Double.parseDouble(total);
                double dinhe = Double.parseDouble(dinheiro);
                jTFVlTroco1.setText(String.valueOf(dinhe - vl_total));
            }
        }
    }//GEN-LAST:event_jTFVldinheiro1FocusLost

    private void jBPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPesquisarFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InterfaceCaixa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComprovante;
    private javax.swing.JButton jBComprovante1;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBConfirmarCompra;
    private javax.swing.JButton jBPesquisarCliente;
    private javax.swing.JButton jBPesquisarFornecedor;
    private javax.swing.JButton jBPesquisarParcelas;
    private javax.swing.JButton jBPesquisarParcelas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPConsulta;
    private javax.swing.JPopupMenu jPopupPesquisa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFDesconto;
    private javax.swing.JTextField jTFDesconto1;
    private javax.swing.JTextField jTFDsCliente;
    private javax.swing.JTextField jTFDsFornecedor;
    private javax.swing.JTextField jTFIdCliente;
    private javax.swing.JTextField jTFIdFronecedor;
    private javax.swing.JTextField jTFJuros;
    private javax.swing.JTextField jTFJuros1;
    private javax.swing.JTextField jTFTotal;
    private javax.swing.JTextField jTFTotal1;
    private javax.swing.JTextField jTFVlPagar;
    private javax.swing.JTextField jTFVlPagar1;
    private javax.swing.JTextField jTFVlTroco;
    private javax.swing.JTextField jTFVlTroco1;
    private javax.swing.JTextField jTFVldinheiro;
    private javax.swing.JTextField jTFVldinheiro1;
    private javax.swing.JTextField jTFdata;
    private javax.swing.JTextField jTFdata1;
    private javax.swing.JTabbedPane jTPCidade;
    private javax.swing.JTable jTbCaixaCompra;
    private javax.swing.JTable jTbCaixaVenda;
    private javax.swing.JTable jTbParcela;
    // End of variables declaration//GEN-END:variables

}
