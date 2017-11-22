package br.tcc.Interface;

import br.tcc.ConsultaSimples.ConsultaCliente;
import br.tcc.ConsultaSimples.ConsultaFornecedor;
import br.tcc.Validacoes.LimparCampos;
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
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
    LimparCampos lcampos = new LimparCampos();

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
        jPVenda = new javax.swing.JPanel();
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
        jLabel10 = new javax.swing.JLabel();
        jTFTotal = new javax.swing.JTextField();
        jTFdata = new javax.swing.JTextField();
        jPCompra = new javax.swing.JPanel();
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
        jTFJuros1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTFTotal1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTFVlTroco1 = new javax.swing.JTextField();
        jTFVldinheiro1 = new javax.swing.JTextField();
        jPConsulta1 = new javax.swing.JPanel();
        jBPesquisarFornecedor1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTbConsMov = new javax.swing.JTable();
        jBComprovante2 = new javax.swing.JButton();
        jTFdata2 = new javax.swing.JFormattedTextField();
        jPConsulta2 = new javax.swing.JPanel();
        jBPesquisarFornecedor2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTbConsMovS = new javax.swing.JTable();
        jBComprovante3 = new javax.swing.JButton();
        jTFdata3 = new javax.swing.JFormattedTextField();

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
        jBPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarClienteActionPerformed(evt);
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

        jLabel10.setText("Total");

        javax.swing.GroupLayout jPVendaLayout = new javax.swing.GroupLayout(jPVenda);
        jPVenda.setLayout(jPVendaLayout);
        jPVendaLayout.setHorizontalGroup(
            jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVendaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(306, 306, 306)
                .addComponent(jTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPVendaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jBPesquisarCliente)
                .addGap(6, 6, 6)
                .addComponent(jTFDsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPVendaLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jBPesquisarParcelas))
            .addGroup(jPVendaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5))
            .addGroup(jPVendaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPVendaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(67, 67, 67)
                .addComponent(jLabel8)
                .addGap(83, 83, 83)
                .addComponent(jLabel9))
            .addGroup(jPVendaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFVlPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTFVldinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTFVlTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPVendaLayout.setVerticalGroup(
            jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVendaLayout.createSequentialGroup()
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPVendaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(6, 6, 6)
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBPesquisarCliente)
                    .addGroup(jPVendaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFDsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(jBPesquisarParcelas)
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPVendaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPVendaLayout.createSequentialGroup()
                                .addComponent(jTFVlPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel10)
                                .addGap(6, 6, 6)
                                .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPVendaLayout.createSequentialGroup()
                                .addComponent(jTFDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(jTFVldinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPVendaLayout.createSequentialGroup()
                                .addComponent(jTFJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addGap(11, 11, 11)
                                .addComponent(jTFVlTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        jTPCidade.addTab("Venda", jPVenda);

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

        javax.swing.GroupLayout jPCompraLayout = new javax.swing.GroupLayout(jPCompra);
        jPCompra.setLayout(jPCompraLayout);
        jPCompraLayout.setHorizontalGroup(
            jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCompraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addComponent(jLabel12)
                .addGap(284, 284, 284)
                .addComponent(jTFdata1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPCompraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTFCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTFIdFronecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jBPesquisarFornecedor)
                .addGap(6, 6, 6)
                .addComponent(jTFDsFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPCompraLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jBPesquisarParcelas1))
            .addGroup(jPCompraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13))
            .addGroup(jPCompraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPCompraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jTFVlPagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTFTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jTFDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTFVldinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTFJuros1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTFVlTroco1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jBConfirmarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPCompraLayout.setVerticalGroup(
            jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCompraLayout.createSequentialGroup()
                .addGroup(jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFdata1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPCompraLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))))
                .addGap(6, 6, 6)
                .addGroup(jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBPesquisarFornecedor)
                    .addGroup(jPCompraLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFIdFronecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFDsFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(jBPesquisarParcelas1)
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCompraLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(jTFVlPagar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17)
                        .addGap(6, 6, 6)
                        .addComponent(jTFTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCompraLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6)
                        .addComponent(jTFDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18)
                        .addGap(6, 6, 6)
                        .addComponent(jTFVldinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCompraLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(6, 6, 6)
                        .addComponent(jTFJuros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19)
                        .addGap(6, 6, 6)
                        .addComponent(jTFVlTroco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCompraLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBConfirmarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTPCidade.addTab("Compra", jPCompra);

        jBPesquisarFornecedor1.setText("Pesquisar");
        jBPesquisarFornecedor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPesquisarFornecedor1MouseClicked(evt);
            }
        });
        jBPesquisarFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarFornecedor1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Movimento do Dia");

        jTbConsMov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbConsMov.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTbConsMov.setColumnSelectionAllowed(true);
        jTbConsMov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbConsMovMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTbConsMov);
        jTbConsMov.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jBComprovante2.setText("Comprovante");
        jBComprovante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprovante2ActionPerformed(evt);
            }
        });

        try {
            jTFdata2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPConsulta1Layout = new javax.swing.GroupLayout(jPConsulta1);
        jPConsulta1.setLayout(jPConsulta1Layout);
        jPConsulta1Layout.setHorizontalGroup(
            jPConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPConsulta1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel22)
                .addGap(6, 6, 6)
                .addComponent(jTFdata2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPesquisarFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBComprovante2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConsulta1Layout.setVerticalGroup(
            jPConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsulta1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jBComprovante2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarFornecedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFdata2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPCidade.addTab("Movimento Entrada", jPConsulta1);

        jBPesquisarFornecedor2.setText("Pesquisar");
        jBPesquisarFornecedor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPesquisarFornecedor2MouseClicked(evt);
            }
        });
        jBPesquisarFornecedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarFornecedor2ActionPerformed(evt);
            }
        });

        jLabel23.setText("Movimento do Dia");

        jTbConsMovS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbConsMovS.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTbConsMovS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbConsMovSMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTbConsMovS);
        jTbConsMovS.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jBComprovante3.setText("Comprovante");
        jBComprovante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprovante3ActionPerformed(evt);
            }
        });

        try {
            jTFdata3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPConsulta2Layout = new javax.swing.GroupLayout(jPConsulta2);
        jPConsulta2.setLayout(jPConsulta2Layout);
        jPConsulta2Layout.setHorizontalGroup(
            jPConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsulta2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPConsulta2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel23)
                .addGap(6, 6, 6)
                .addComponent(jTFdata3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPesquisarFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBComprovante3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConsulta2Layout.setVerticalGroup(
            jPConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsulta2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jBComprovante3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarFornecedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFdata3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPCidade.addTab("Movimento Saída", jPConsulta2);

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
                relatorio();
                caixaDAO.incluir(caixa);

            } else {
                jTFVlPagar.setText(String.valueOf(total));
                jTFTotal.setText(String.valueOf(total));
            }
            conta = conta + 1;
        }
    }//GEN-LAST:event_jBConfirmarActionPerformed

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
                relatorio();
                caixaDAO.incluir(caixa);

            } else {
                jTFVlPagar1.setText(String.valueOf(total));
                jTFTotal1.setText(String.valueOf(total));
            }
            conta = conta + 1;
        }


    }//GEN-LAST:event_jBConfirmarCompraActionPerformed

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

    private void jBComprovante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprovante2ActionPerformed
        String data;
        Date date = new Date();
        String dt1 = String.valueOf(date.getDay());
        String dt2 = String.valueOf(date.getMonth());
        String dt3 = String.valueOf(date.getYear());

        data = String.valueOf(date.getTime() + dt1 + dt2 + dt3);
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("D:\\rel\\" + data));
            document.open();

            // adicionando um parágrafo no documento
            Paragraph p = new Paragraph("BELLA FLOR FLORICULTURA", FontFactory.getFont(FontFactory.COURIER, 18));
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("Avenida Amazonas, 41, Boa Esperança - PR");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("Telefone:(44) 3552-1467");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

            p = new Paragraph("Movimento de Entrada do Caixa");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

            PdfPTable table = new PdfPTable(3);

            PdfPCell cel1 = new PdfPCell(new Paragraph("Código"));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Data"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Valor"));

            table.addCell(cel1);
            table.addCell(cel2);
            table.addCell(cel3);

            String codigo = null;
            String datar = null;
            String valor = null;

            DefaultTableModel ItensVenda = (DefaultTableModel) jTbConsMov.getModel();
            int totlinha = jTbConsMov.getRowCount();
            int conta = 0;
            Double totalEntrada = 0.0;
            for (int i = 1; i <= totlinha; i++) {
                codigo = (String) jTbConsMov.getValueAt(conta, 0);
                datar = (String) jTbConsMov.getValueAt(conta, 1);
                valor = (String) jTbConsMov.getValueAt(conta, 2);

                PdfPCell c1 = new PdfPCell(new Paragraph(codigo));
                PdfPCell c2 = new PdfPCell(new Paragraph(datar));
                PdfPCell c3 = new PdfPCell(new Paragraph(valor));

                table.addCell(c1);
                table.addCell(c2);
                table.addCell(c3);

                conta = conta + 1;
                totalEntrada = totalEntrada + Double.parseDouble(valor);

            }
            document.add(table);
            p = new Paragraph("Total de Entrada : " + totalEntrada);
            document.add(p);
            String dtRel = jTFdata2.getText();

            p = new Paragraph("relatorio do Movimento do dia : " + dtRel);
            document.add(p);

        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }
        document.close();

        try {
            Desktop.getDesktop().open(new File("D:\\rel\\" + data));
        } catch (IOException ex) {
            Logger.getLogger(InterfaceCompraVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBComprovante2ActionPerformed

    private void jTbConsMovMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbConsMovMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbConsMovMouseClicked

    private void jBPesquisarFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarFornecedor1ActionPerformed

        PreencherJtableGenerico preencher = new PreencherJtableGenerico();
        String data = jTFdata2.getText();
        if ((!data.equals("")) || (data.length() == 10)) {
            caixaDAO.consMov(caixa, data);
            preencher.PreencherJtableGenerico(jTbConsMov, caixa.getRetorno());
            return;
        }
    }//GEN-LAST:event_jBPesquisarFornecedor1ActionPerformed

    private void jBPesquisarFornecedor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarFornecedor1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPesquisarFornecedor1MouseClicked

    private void jBPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPesquisarClienteActionPerformed

    private void jBPesquisarFornecedor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarFornecedor2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPesquisarFornecedor2MouseClicked

    private void jBPesquisarFornecedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarFornecedor2ActionPerformed

        PreencherJtableGenerico preencher = new PreencherJtableGenerico();
        String data = jTFdata3.getText();
        if ((!data.equals("")) || (data.length() == 10)) {
            caixaDAO.consMovS(caixa, data);
            preencher.PreencherJtableGenerico(jTbConsMovS, caixa.getRetorno());
            return;
        }

    }//GEN-LAST:event_jBPesquisarFornecedor2ActionPerformed

    private void jTbConsMovSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbConsMovSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbConsMovSMouseClicked

    private void jBComprovante3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprovante3ActionPerformed
        
        String data;
        Date date = new Date();
        String dt1 = String.valueOf(date.getDay());
        String dt2 = String.valueOf(date.getMonth());
        String dt3 = String.valueOf(date.getYear());

        data = String.valueOf(date.getTime() + dt1 + dt2 + dt3);
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("D:\\rel\\" + data));
            document.open();

            // adicionando um parágrafo no documento
            Paragraph p = new Paragraph("BELLA FLOR FLORICULTURA", FontFactory.getFont(FontFactory.COURIER, 18));
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("Avenida Amazonas, 41, Boa Esperança - PR");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("Telefone:(44) 3552-1467");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

            p = new Paragraph("Movimento de Saída do Caixa");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

            PdfPTable table = new PdfPTable(3);

            PdfPCell cel1 = new PdfPCell(new Paragraph("Código"));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Data"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Valor"));

            table.addCell(cel1);
            table.addCell(cel2);
            table.addCell(cel3);

            String codigo = null;
            String datar = null;
            String valor = null;

            DefaultTableModel ItensVenda = (DefaultTableModel) jTbConsMovS.getModel();
            int totlinha = jTbConsMovS.getRowCount();
            int conta = 0;
            Double totalEntrada = 0.0;
            for (int i = 1; i <= totlinha; i++) {
                codigo = (String) jTbConsMovS.getValueAt(conta, 0);
                datar = (String) jTbConsMovS.getValueAt(conta, 1);
                valor = (String) jTbConsMovS.getValueAt(conta, 2);

                PdfPCell c1 = new PdfPCell(new Paragraph(codigo));
                PdfPCell c2 = new PdfPCell(new Paragraph(datar));
                PdfPCell c3 = new PdfPCell(new Paragraph(valor));

                table.addCell(c1);
                table.addCell(c2);
                table.addCell(c3);

                conta = conta + 1;
                totalEntrada = totalEntrada + Double.parseDouble(valor);

            }
            document.add(table);
            p = new Paragraph("Total de Saída : " + totalEntrada);
            document.add(p);
            String dtRel = jTFdata3.getText();

            p = new Paragraph("relatorio do Movimento do dia : " + dtRel);
            document.add(p);

        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }
        document.close();

        try {
            Desktop.getDesktop().open(new File("D:\\rel\\" + data));
        } catch (IOException ex) {
            Logger.getLogger(InterfaceCompraVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBComprovante3ActionPerformed

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
    private javax.swing.JButton jBComprovante2;
    private javax.swing.JButton jBComprovante3;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBConfirmarCompra;
    private javax.swing.JButton jBPesquisarCliente;
    private javax.swing.JButton jBPesquisarFornecedor;
    private javax.swing.JButton jBPesquisarFornecedor1;
    private javax.swing.JButton jBPesquisarFornecedor2;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPCompra;
    private javax.swing.JPanel jPConsulta1;
    private javax.swing.JPanel jPConsulta2;
    private javax.swing.JPanel jPVenda;
    private javax.swing.JPopupMenu jPopupPesquisa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JFormattedTextField jTFdata2;
    private javax.swing.JFormattedTextField jTFdata3;
    private javax.swing.JTabbedPane jTPCidade;
    private javax.swing.JTable jTbCaixaCompra;
    private javax.swing.JTable jTbCaixaVenda;
    private javax.swing.JTable jTbConsMov;
    private javax.swing.JTable jTbConsMovS;
    private javax.swing.JTable jTbParcela;
    // End of variables declaration//GEN-END:variables

    private void relatorio() {
        String data;
        Date date = new Date();
        String dt1 = String.valueOf(date.getDay());
        String dt2 = String.valueOf(date.getMonth());
        String dt3 = String.valueOf(date.getYear());

        data = String.valueOf(date.getTime() + dt1 + dt2 + dt3);
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("D:\\rel\\" + data));
            document.open();

            // adicionando um parágrafo no documento
            Paragraph p = new Paragraph("BELLA FLOR FLORICULTURA", FontFactory.getFont(FontFactory.COURIER, 18));
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("Avenida Amazonas, 41, Boa Esperança - PR");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("Telefone:(44) 3552-1467");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

            p = new Paragraph("Comprovante de Pagamento");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

            String nome = null;
            if (jTFDsCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "É obrigatório preencher os dados do Cliente");
                jTFDsCliente.grabFocus();
            } else {
                nome = jTFDsCliente.getText();
            }

            p = new Paragraph("Cliente: " + nome);
            document.add(p);

            String pagar = "0.00";
            pagar = jTFVlPagar.getText();
            p = new Paragraph("Valor á Pagar: " + pagar);
            document.add(p);

            String desconto = "0.00";
            desconto = jTFDesconto.getText();
            p = new Paragraph("Desconto: " + desconto);
            document.add(p);

            String juros = "0.00";
            juros = jTFJuros.getText();
            p = new Paragraph("Juros: " + juros);
            document.add(p);

            String total = "0.00";
            total = jTFTotal.getText();
            p = new Paragraph("Total: " + total);
            document.add(p);

            String dinheiro = "0.00";
            dinheiro = jTFVldinheiro.getText();
            p = new Paragraph("Dinheiro: " + dinheiro);
            document.add(p);

            String troco = "0.00";
            troco = jTFVlTroco.getText();
            p = new Paragraph("Troco: " + troco);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }
        document.close();

        try {
            Desktop.getDesktop().open(new File("D:\\rel\\" + data));
        } catch (IOException ex) {
            Logger.getLogger(InterfaceCompraVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void relatoriocompra() {
        String data;
        Date date = new Date();
        String dt1 = String.valueOf(date.getDay());
        String dt2 = String.valueOf(date.getMonth());
        String dt3 = String.valueOf(date.getYear());

        data = String.valueOf(date.getTime() + dt1 + dt2 + dt3);
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("D:\\rel\\" + data));
            document.open();

            // adicionando um parágrafo no documento
            Paragraph p = new Paragraph("BELLA FLOR FLORICULTURA", FontFactory.getFont(FontFactory.COURIER, 18));
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("Avenida Amazonas, 41, Boa Esperança - PR");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("Telefone:(44) 3552-1467");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

            p = new Paragraph("Comprovante de Pagamento ao Fornecedor");
            p.setAlignment(1);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

            String nome = null;
            if (jTFDsFornecedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "É obrigatório preencher os dados do Fornecedor");
                jTFDsFornecedor.grabFocus();
            } else {
                nome = jTFDsFornecedor.getText();
            }

            p = new Paragraph("Fornecedor: " + nome);
            document.add(p);

            String pagar = "0.00";
            pagar = jTFVlPagar1.getText();
            p = new Paragraph("Valor á Pagar: " + pagar);
            document.add(p);

            String desconto = "0.00";
            desconto = jTFDesconto1.getText();
            p = new Paragraph("Desconto: " + desconto);
            document.add(p);

            String juros = "0.00";
            juros = jTFJuros1.getText();
            p = new Paragraph("Juros: " + juros);
            document.add(p);

            String total = "0.00";
            total = jTFTotal1.getText();
            p = new Paragraph("Total: " + total);
            document.add(p);

            String dinheiro = "0.00";
            dinheiro = jTFVldinheiro1.getText();
            p = new Paragraph("Dinheiro: " + dinheiro);
            document.add(p);

            String troco = "0.00";
            troco = jTFVlTroco1.getText();
            p = new Paragraph("Troco: " + troco);
            document.add(p);

            p = new Paragraph("     ");
            document.add(p);

        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }
        document.close();

        try {
            Desktop.getDesktop().open(new File("D:\\rel\\" + data));
        } catch (IOException ex) {
            Logger.getLogger(InterfaceCompraVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
