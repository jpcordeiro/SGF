package br.tcc.Interface;

import br.tcc.Validacoes.LimparCampos;
import br.tcc.Validacoes.PreencherJtableGenerico;
import br.tcc.Validacoes.RetornaDataAtual;
import br.tcc.Validacoes.ValidaNumero;
import br.tcc.classe.Cidade;
import br.tcc.classe.Endereco;
import br.tcc.classe.Funcionario;
import br.tcc.classe.Pessoa;
import br.tcc.classe.PessoaFisica;
import br.tcc.classe.PessoaJuridica;
import br.tcc.classe.Telefone;
import br.tcc.classe.Usuario;
import br.tcc.dao.CidadeDAO;
import br.tcc.dao.EnderecoDAO;
import br.tcc.dao.FuncionarioDAO;
import br.tcc.dao.PessoaDAO;
import br.tcc.dao.PessoaFisicaDAO;
import br.tcc.dao.PessoaJuridicaDAO;
import br.tcc.dao.TelefoneDAO;
import br.tcc.dao.UsuarioDAO;
import java.awt.List;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao Paulo
 */
public class InterfaceFuncionario extends javax.swing.JFrame {

    Funcionario funcionario = new Funcionario();
    Pessoa pessoa = new Pessoa();
    PessoaFisica pfisica = new PessoaFisica();
    PessoaJuridica pjuridica = new PessoaJuridica();
    Endereco endereco = new Endereco();
    Cidade cidade = new Cidade();
    Telefone telefone = new Telefone();
    TelefoneDAO telefoneDAO = new TelefoneDAO();
    LimparCampos lcampos = new LimparCampos();
    private int situacao = 0;
    CidadeDAO cidadeDAO = new CidadeDAO();
    RetornaDataAtual retornadata = new RetornaDataAtual();
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Integer dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9, dig10, dig11;
    Integer dig21, dig22, dig23, dig24, dig25, dig26, dig27, dig28, dig29, dig210, dig211;
    public String fone1;
    PessoaFisicaDAO pfDao = new PessoaFisicaDAO();
    PessoaJuridicaDAO pjDao = new PessoaJuridicaDAO();
    EnderecoDAO endDao = new EnderecoDAO();
    FuncionarioDAO funcDao = new FuncionarioDAO();
    PessoaDAO pessoaDao = new PessoaDAO();
    /**
     * Creates new form InterfacePessoa
     */
    public InterfaceFuncionario() {

        initComponents();

        // setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGtipo_pessoa = new javax.swing.ButtonGroup();
        jTPFuncionario = new javax.swing.JTabbedPane();
        jPcadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFIdPessoa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFnome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRBFisico = new javax.swing.JRadioButton();
        jRBJuridica = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCBCidade = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTFlogradouro = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFbairro = new javax.swing.JTextField();
        jTFcomplemento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFNrCep = new javax.swing.JFormattedTextField();
        jPbotoes = new javax.swing.JPanel();
        jBincluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jBgravar = new javax.swing.JButton();
        jPpfisica = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        jCBSexo = new javax.swing.JComboBox();
        jTFNrCpf = new javax.swing.JFormattedTextField();
        jTFrg = new javax.swing.JFormattedTextField();
        jPpjuridica = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTFrazaosocial = new javax.swing.JTextField();
        jTFcnpj = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTFLogin = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTFsenha1 = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        jTFSenha2 = new javax.swing.JPasswordField();
        jTFDtCadastro = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jCBTpSituação = new javax.swing.JComboBox();
        jTFDtDemissão = new javax.swing.JTextField();
        jTFVlSalario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFDtNasc = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTFFone1 = new javax.swing.JFormattedTextField();
        jPconsulta = new javax.swing.JPanel();
        jCbPesquisa2 = new javax.swing.JComboBox();
        jTFPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbPesquisa = new javax.swing.JTable();
        jBtPesquisa1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionario");

        jLabel1.setText("Código");

        jLabel9.setText("Nome");

        jLabel10.setText("Data de cadastro");

        bGtipo_pessoa.add(jRBFisico);
        jRBFisico.setText("Física");
        jRBFisico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRBJuridicoMousePressed(evt);
            }
        });
        jRBFisico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRBFisicoKeyPressed(evt);
            }
        });

        bGtipo_pessoa.add(jRBJuridica);
        jRBJuridica.setText("Juridica");
        jRBJuridica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBJuridicaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRBJuridicoMousePressed(evt);
            }
        });
        jRBJuridica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRBJuridicaKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel2.setText("Cidade");

        jLabel3.setText("Logradouro");

        jLabel4.setText("Número");

        jLabel6.setText("Complemento");

        jLabel5.setText("Bairro");

        jLabel7.setText("CEP");

        try {
            jTFNrCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPbotoes.setBackground(new java.awt.Color(153, 153, 153));
        jPbotoes.setLayout(null);

        jBincluir.setText("Incluir");
        jBincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBincluirActionPerformed(evt);
            }
        });
        jPbotoes.add(jBincluir);
        jBincluir.setBounds(50, 10, 80, 40);

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });
        jPbotoes.add(jBAlterar);
        jBAlterar.setBounds(190, 10, 80, 40);

        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });
        jPbotoes.add(jBexcluir);
        jBexcluir.setBounds(360, 10, 80, 40);

        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });
        jPbotoes.add(jBcancelar);
        jBcancelar.setBounds(660, 10, 90, 40);

        jBgravar.setText("Gravar");
        jBgravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgravarActionPerformed(evt);
            }
        });
        jPbotoes.add(jBgravar);
        jBgravar.setBounds(520, 10, 80, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNrCep, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTFcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTFbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPbotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNrCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPbotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPpfisica.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa Física"));

        jLabel11.setText("CPF");

        jLabel12.setText("RG");

        Sexo.setText("Sexo");

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FEMININO", "MASCULINO" }));

        try {
            jTFNrCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFNrCpf.setText("");
        jTFNrCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNrCpfFocusLost(evt);
            }
        });

        try {
            jTFrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.### #")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPpfisicaLayout = new javax.swing.GroupLayout(jPpfisica);
        jPpfisica.setLayout(jPpfisicaLayout);
        jPpfisicaLayout.setHorizontalGroup(
            jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpfisicaLayout.createSequentialGroup()
                .addGroup(jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPpfisicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addComponent(jTFNrCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTFrg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sexo)
                    .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        jPpfisicaLayout.setVerticalGroup(
            jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpfisicaLayout.createSequentialGroup()
                .addGroup(jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(Sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNrCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPpjuridica.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa Juridica"));

        jLabel14.setText("CNPJ");

        jLabel16.setText("Razão Social");

        try {
            jTFcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFcnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFcnpjFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPpjuridicaLayout = new javax.swing.GroupLayout(jPpjuridica);
        jPpjuridica.setLayout(jPpjuridicaLayout);
        jPpjuridicaLayout.setHorizontalGroup(
            jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpjuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPpjuridicaLayout.createSequentialGroup()
                        .addComponent(jTFcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFrazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPpjuridicaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPpjuridicaLayout.setVerticalGroup(
            jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpjuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFrazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel18.setText("Data  de Demissão");

        jLabel19.setText("Salario");

        jLabel20.setText("Login");

        jLabel21.setText("Senha");

        jLabel22.setText("Digite a senha novamente");

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPesquisarMouseClicked(evt);
            }
        });
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLabel17.setText("Situação");

        jCBTpSituação.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATIVO", "LICENÇA", "FÉRIAS", "INATIVO" }));

        jTFDtDemissão.setToolTipText("");

        jTFVlSalario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFVlSalarioMouseClicked(evt);
            }
        });

        jLabel13.setText("Data de Nascimento");

        jLabel24.setText("Telefone ");

        try {
            jTFFone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPcadastroLayout = new javax.swing.GroupLayout(jPcadastro);
        jPcadastro.setLayout(jPcadastroLayout);
        jPcadastroLayout.setHorizontalGroup(
            jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroLayout.createSequentialGroup()
                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPpfisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPpjuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPcadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel21))
                                    .addGroup(jPcadastroLayout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(jTFsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jTFSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(20, 20, 20)
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(jPcadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jTFDtDemissão, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jCBTpSituação, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFVlSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPcadastroLayout.createSequentialGroup()
                                        .addComponent(jTFIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBPesquisar)))
                                .addGap(18, 18, 18)
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPcadastroLayout.createSequentialGroup()
                                        .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBFisico)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRBJuridica))))
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(377, 377, 377)
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPcadastroLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPcadastroLayout.setVerticalGroup(
            jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBPesquisar)))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRBFisico)
                            .addComponent(jRBJuridica))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTFVlSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19)
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBTpSituação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDtDemissão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(11, 11, 11)
                        .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPpfisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPpjuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPFuncionario.addTab("Cadastro", jPcadastro);

        jCbPesquisa2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "funcionário " }));

        jTbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Funcionário", "Data nasc.", "Data admi.", "Data demi.", "Salário", "Telefone Princ.", "Login"
            }
        ));
        jTbPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbPesquisaMouseClicked(evt);
            }
        });
        jTbPesquisa.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jTbPesquisaComponentMoved(evt);
            }
        });
        jScrollPane2.setViewportView(jTbPesquisa);

        jBtPesquisa1.setText("Pesquisar");
        jBtPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPconsultaLayout = new javax.swing.GroupLayout(jPconsulta);
        jPconsulta.setLayout(jPconsultaLayout);
        jPconsultaLayout.setHorizontalGroup(
            jPconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPconsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPconsultaLayout.createSequentialGroup()
                        .addComponent(jCbPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtPesquisa1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPconsultaLayout.setVerticalGroup(
            jPconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPconsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtPesquisa1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPFuncionario.addTab("Consulta", jPconsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTPFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPFuncionario)
        );

        setSize(new java.awt.Dimension(857, 668));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFVlSalarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFVlSalarioMouseClicked

        ValidaNumero validaNumero = new ValidaNumero();
        validaNumero.ValidaNumero(jTFVlSalario);
    }//GEN-LAST:event_jTFVlSalarioMouseClicked

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        //        InterfaceRetornaPessoa retornaPessoa = new InterfaceRetornaPessoa();
        //        retornaPessoa.setVisible(true);
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarMouseClicked
        final InterfaceRetornaPessoa retornaPessoa = new InterfaceRetornaPessoa();
        retornaPessoa.setVisible(true);
        retornaPessoa.addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosed(java.awt.event.WindowEvent evt) {
                jTFIdPessoa.setText(retornaPessoa.retornaId);
                jTFnome.setText(retornaPessoa.retornaDsPessoa);
                jTFDtNasc.setText(retornaPessoa.retornaDtNasc);
            }
        });
    }//GEN-LAST:event_jBPesquisarMouseClicked

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        int t = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente cancelar o cadastro?");
        if (t == 0) {
            situacao = 2;
            lcampos.LimparCampos(jPcadastro);
            estadobotoes(false);
        }
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jBgravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarActionPerformed

        Integer idCidade = null;
        String nivel1 = "1";

        if (situacao == 1) {
            if (jTFIdPessoa.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Funcionario");
                jTFIdPessoa.grabFocus();
                return;
            } else {
                funcionario.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));
            }

            funcionario.setDTCADASTRO(jTFDtCadastro.getText());

          
                funcionario.setDTDEMISSAO(jTFDtDemissão.getText());

            funcionario.setTPSITUACAO(jCBTpSituação.getSelectedIndex());

            if (jTFVlSalario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Valor do Sálario");
                jTFVlSalario.grabFocus();
                return;
            } else {
                funcionario.setVLSALARIO(Double.parseDouble(jTFVlSalario.getText()));
            }
            if (jTFLogin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Login");
                jTFLogin.grabFocus();
                return;
            } else {
                funcionario.setLOGIN(jTFLogin.getText());
                usuario.setDSUSUARIO(jTFLogin.getText());
            }
            if (jTFsenha1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a Senha");
                jTFsenha1.grabFocus();
                return;
            } else if (jTFsenha1.getText().equals(jTFSenha2.getText())) {
                usuario.setDSSENHA(jTFsenha1.getText());
            } else {
                JOptionPane.showMessageDialog(null, "A Senha não confere, favor digitar a senha novamente!");
                jTFsenha1.grabFocus();
                return;
            }
            usuario.setIDNIVEL(Integer.parseInt(nivel1));

            telefone.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));

            if (jTFFone1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o número do Telefone");
                jTFFone1.grabFocus();
                return;
            } else {
                telefone.setNRFONE(jTFFone1.getText());

            }
            telefone.setTPFONE("Principal");

            if (bGtipo_pessoa.isSelected(null)) {
                JOptionPane.showMessageDialog(null, "Favor selecionar o TIPO DE PESSOA!");
            } else if (jRBFisico.isSelected()) {
                pfisica.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));
                funcionario.setTPPESSOA("F");
                if (jTFNrCpf.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informe o número do CPF");
                    jTFNrCpf.grabFocus();
                    return;
                } else {
                    pfisica.setNRCPF(jTFNrCpf.getText());
                }
                if(!jTFrg.getText().equals("")){
                    pfisica.setNRRG(jTFrg.getText());
                }

                String sexo = jCBSexo.getSelectedItem().toString();
                if (sexo.equals("MASCULINO")) {
                    pfisica.setTPSEXO("M");
                } else {
                    pfisica.setTPSEXO("F");
                }

            } else {
                pjuridica.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));
                funcionario.setTPPESSOA("J");
                if (jTFcnpj.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informe o número do CNPJ");
                    jTFcnpj.grabFocus();
                    return;
                } else {
                    String cnpj = jTFcnpj.getText();
                    pjuridica.setNRCNPJ(jTFcnpj.getText());

                }
                if (jTFrazaosocial.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informe a Razão Social!");
                    jTFrazaosocial.grabFocus();
                    return;
                } else {
                    pjuridica.setRZSOCIAL(jTFrazaosocial.getText());
                }
            }
            endereco.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));

            String cidadeId = jCBCidade.getSelectedItem().toString();
            try {
                idCidade = cidadeDAO.ConsultaIdcidade(idCidade, cidadeId);
                endereco.setIDCIDADE(idCidade);
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceCidade.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (jTFlogradouro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Logradouro");
                jTFlogradouro.grabFocus();
                return;
            } else {
                endereco.setDSLOGRADOURO(jTFlogradouro.getText().toUpperCase());
            }
            if (jTFNumero.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Número do endereço");
                jTFNumero.grabFocus();
                return;
            } else {
                endereco.setDSNUMERO(jTFNumero.getText().toUpperCase());
            }
            if (jTFbairro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Bairro");
                jTFbairro.grabFocus();
                return;
            } else {
                endereco.setDSBAIRRO(jTFbairro.getText().toUpperCase());
            }
            if (jTFcomplemento.getText().equals("")) {
                endereco.setDSCOMPLEMENTO(".");
            } else {
                endereco.setDSCOMPLEMENTO(jTFcomplemento.getText());
            }
            String cep = jTFNrCep.toString();

            if (jTFNrCep.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o CEP");
                jTFNrCep.grabFocus();
                return;
            } else {
                endereco.setNRCEP(jTFNrCep.getText());
            }
            endereco.setTPENDERECO("RESIDENCIA");

            if (jRBFisico.isSelected()) {
                pfDao.incluir(pfisica);
                endDao.incluir(endereco);
                usuarioDAO.incluir(usuario);
                telefoneDAO.incluir(telefone);
                funcDao.incluir(funcionario);
            } else {
                pjDao.incluir(pjuridica);
                endDao.incluir(endereco);
                usuarioDAO.incluir(usuario);
                telefoneDAO.incluir(telefone);
                funcDao.incluir(funcionario);
            }
    
            lcampos.LimparCampos(jPcadastro);
            estadobotoes(false);

        } else{

            if (jTFIdPessoa.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Funcionario");
                jTFIdPessoa.grabFocus();
                return;
            } else {
                funcionario.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));
            }

            funcionario.setDTCADASTRO(jTFDtCadastro.getText());
            funcionario.setDTDEMISSAO(jTFDtDemissão.getText());
            funcionario.setTPSITUACAO(jCBTpSituação.getSelectedIndex());

            if (jTFVlSalario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Valor do Sálario");
                jTFVlSalario.grabFocus();
                return;
            } else {
                funcionario.setVLSALARIO(Double.parseDouble(jTFVlSalario.getText()));
            }
            if (jTFLogin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Login");
                jTFLogin.grabFocus();
                return;
            } else {
                funcionario.setLOGIN(jTFLogin.getText());
                usuario.setDSUSUARIO(jTFLogin.getText());
            }
            if (jTFsenha1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a Senha");
                jTFsenha1.grabFocus();
                return;
            } else if (jTFsenha1.getText().equals(jTFSenha2.getText())) {
                usuario.setDSSENHA(jTFsenha1.getText());
            } else {
                JOptionPane.showMessageDialog(null, "A Senha não confere, favor digitar a senha novamente!");
                jTFsenha1.grabFocus();
                return;
            }
            
            telefone.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));

            if (jTFFone1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o número do Telefone");
                jTFFone1.grabFocus();
                return;
            } else {
                telefone.setNRFONE(jTFFone1.getText());

            }
            telefone.setTPFONE("Principal");

            if (bGtipo_pessoa.isSelected(null)) {
                JOptionPane.showMessageDialog(null, "Favor selecionar o TIPO DE PESSOA!");
            } else if (jRBFisico.isSelected()) {
                pfisica.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));
                if (jTFNrCpf.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informe o número do CPF");
                    jTFNrCpf.grabFocus();
                    return;
                } else {
                    pfisica.setNRCPF(jTFNrCpf.getText());
                }
                 if(!jTFrg.getText().equals("")){
                    pfisica.setNRRG(jTFrg.getText());
                }

                String sexo = jCBSexo.getSelectedItem().toString();
                if (sexo.equals("MASCULINO")) {
                    pfisica.setTPSEXO("M");
                } else {
                    pfisica.setTPSEXO("F");
                }

            } else {
                pjuridica.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));
                if (jTFcnpj.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informe o número do CNPJ");
                    jTFcnpj.grabFocus();
                    return;
                } else {
                    String cnpj = jTFcnpj.getText();
                    pjuridica.setNRCNPJ(jTFcnpj.getText());

                }
                if (jTFrazaosocial.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informe a Razão Social!");
                    jTFrazaosocial.grabFocus();
                    return;
                } else {
                    pjuridica.setRZSOCIAL(jTFrazaosocial.getText());
                }
            }
            endereco.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));

            String cidadeId = jCBCidade.getSelectedItem().toString();
            try {
                idCidade = cidadeDAO.ConsultaIdcidade(idCidade, cidadeId);
                endereco.setIDCIDADE(idCidade);
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceCidade.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (jTFlogradouro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Logradouro");
                jTFlogradouro.grabFocus();
                return;
            } else {
                endereco.setDSLOGRADOURO(jTFlogradouro.getText().toUpperCase());
            }
            if (jTFNumero.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Número do endereço");
                jTFNumero.grabFocus();
                return;
            } else {
                endereco.setDSNUMERO(jTFNumero.getText().toUpperCase());
            }
            if (jTFbairro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o Bairro");
                jTFbairro.grabFocus();
                return;
            } else {
                endereco.setDSBAIRRO(jTFbairro.getText().toUpperCase());
            }
            if (jTFcomplemento.getText().equals("")) {
                endereco.setDSCOMPLEMENTO(".");
            } else {
                endereco.setDSCOMPLEMENTO(jTFcomplemento.getText());
            }
            String cep = jTFNrCep.toString();

            if (jTFNrCep.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o CEP");
                jTFNrCep.grabFocus();
                return;
            } else {
                endereco.setNRCEP(jTFNrCep.getText());
            }
            endereco.setTPENDERECO("RESIDENCIA");

            if (jRBFisico.isSelected()) {
                pfDao.alterar(pfisica);
                endDao.alterar(endereco);
                usuarioDAO.alterar(usuario);
                telefoneDAO.alterar(telefone);
                funcDao.alterar(funcionario);
            } else {
                pjDao.alterar(pjuridica);
                endDao.alterar(endereco);
                usuarioDAO.alterar(usuario);
                telefoneDAO.alterar(telefone);
                funcDao.alterar(funcionario);
            }
            lcampos.LimparCampos(jPcadastro);
            estadobotoes(false);

        }
    }//GEN-LAST:event_jBgravarActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        situacao = 1;
        
        int t = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente EXCLUIR o registro?");
        if (t == 0) {
                endDao.excluir(endereco);
                usuarioDAO.excluir(usuario);
                telefoneDAO.excluir(telefone);
                funcDao.excluir(funcionario);
            JOptionPane.showMessageDialog(rootPane, "Registro excluido com sucesso!");
            estadobotoes(false);
        }
        lcampos.LimparCampos(jPcadastro);
        
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        situacao = 2;
        estadobotoes(true);
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBincluirActionPerformed

        jTFlogradouro.grabFocus();
        lcampos.LimparCampos(jTPFuncionario);
        situacao = 1;
        estadobotoes(true);
        cidadeDAO.preenchercidade(jCBCidade, cidade);
        retornadata.RetornaDataAtual(jTFDtCadastro);
    }//GEN-LAST:event_jBincluirActionPerformed

    private void jRBJuridicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRBJuridicaKeyPressed

    }//GEN-LAST:event_jRBJuridicaKeyPressed

    private void jRBJuridicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBJuridicaMouseClicked
       jTFNrCpf.setEnabled(false);
        jTFrg.setEnabled(false);
        jCBSexo.setEnabled(false);

        jTFcnpj.setEnabled(true);
        jTFrazaosocial.setEnabled(true);
        
        String ID = jTFIdPessoa.getText();

        pjuridica.setIDPESSOA(Integer.parseInt(ID));
        pjDao.retornadados(pjuridica);
        jTFcnpj.setText(pjuridica.getNRCNPJ());
        jTFrazaosocial.setText(pjuridica.getRZSOCIAL());
    }//GEN-LAST:event_jRBJuridicaMouseClicked

    private void jRBJuridicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBJuridicoMousePressed
        jTFNrCpf.setEnabled(true);
         jTFrg.setEnabled(true);
         jCBSexo.setEnabled(true);

         jTFcnpj.setEnabled(false);
         jTFrazaosocial.setEnabled(false);

         String ID = jTFIdPessoa.getText();

        pfisica.setIDPESSOA(Integer.parseInt(ID));
        pfDao.retornadados(pfisica);
        jTFNrCpf.setText(pfisica.getNRCPF());
        jTFrg.setText(pfisica.getNRRG());
        String sexo = pfisica.getTPSEXO();

        if (sexo.equals("M")) {
            jCBSexo.setSelectedItem("MASCULINO");
        } else {
            jCBSexo.setSelectedItem("FEMININO");
        }
    }//GEN-LAST:event_jRBJuridicoMousePressed

    private void jRBFisicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRBFisicoKeyPressed

    }//GEN-LAST:event_jRBFisicoKeyPressed

    private void jBtPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisa1ActionPerformed

        PreencherJtableGenerico preencher = new PreencherJtableGenerico();
        switch (jCbPesquisa2.getSelectedIndex()) {
            case 0: {
                funcDao.consulta(funcionario);
                preencher.PreencherJComboBox(jTbPesquisa, funcionario.getRetorno());
                return;
            }
            case 1: {
                pessoa.setDSPESSOA(jTFPesquisa.getText().toUpperCase());
                funcDao.consultadescricao(pessoa, funcionario);
                preencher.PreencherJComboBox(jTbPesquisa, funcionario.getRetorno());
                return;
            }
        }
    }//GEN-LAST:event_jBtPesquisa1ActionPerformed

    private void jTbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbPesquisaMouseClicked
    
        if(evt.getClickCount() == 1){
            int linha = jTbPesquisa.getSelectedRow();
            String ID = (String) jTbPesquisa.getValueAt(linha, 0);
            Integer idpessoa = 0;
            
            funcionario.setIDPESSOA(Integer.parseInt(ID));
            funcDao.retornadados(funcionario);
           
            telefone.setIDPESSOA(Integer.parseInt(ID));
            telefoneDAO.retornadados(telefone);
            
            pessoa.setIDPESSOA(Integer.parseInt(ID));
            pessoaDao.retornadados(pessoa);
            
            pfisica.setIDPESSOA(Integer.parseInt(ID));
            pfDao.retornadados(pfisica);
            
            pjuridica.setIDPESSOA(Integer.parseInt(ID));
            pjDao.retornadados(pjuridica);
            
            endereco.setIDPESSOA(Integer.parseInt(ID));
            endDao.retornadados(endereco);
            
            String user = funcionario.getLOGIN();
            usuario.setDSUSUARIO(user);
            usuarioDAO.retornanivel(usuario);
            
                   
            String tpPessoa = funcionario.getTPPESSOA();
            
            jTFIdPessoa.setText(Integer.toString(funcionario.getIDPESSOA()));
            jTFnome.setText(pessoa.getDSPESSOA());
            if (tpPessoa.equals("F")){
                jRBFisico.setSelected(true);
                
                 jTFcnpj.setEnabled(false);
                 jTFrazaosocial.setEnabled(false);
                 
                 jTFNrCpf.setText(pfisica.getNRCPF());
                 jTFrg.setText(pfisica.getNRRG());
                 String sexo = pfisica.getTPSEXO();
                 if(sexo.equals("M")){
                     jCBSexo.setSelectedIndex(1);
                 }else{
                     jCBSexo.setSelectedIndex(0);
                 }               
            }else{
                jRBJuridica.setSelected(false);
                
                jTFNrCpf.setEnabled(false);
                jTFrg.setEnabled(false);
                jCBSexo.setEnabled(false);
                
                jTFrazaosocial.setText(pjuridica.getRZSOCIAL());
                jTFcnpj.setText(pjuridica.getNRCNPJ());
            }
            jTFDtNasc.setText(pessoa.getDTNASC());
            jTFDtCadastro.setText(funcionario.getDTCADASTRO());
            jTFDtDemissão.setText(funcionario.getDTDEMISSAO());
            jTFVlSalario.setText(Double.toString(funcionario.getVLSALARIO()));
            jTFFone1.setText(telefone.getNRFONE());
            jTFLogin.setText(funcionario.getLOGIN()); 
         
            jTFlogradouro.setText(endereco.getDSLOGRADOURO());
            jTFNumero.setText(endereco.getDSNUMERO());
            jTFcomplemento.setText(endereco.getDSCOMPLEMENTO());
            jTFbairro.setText(endereco.getDSBAIRRO());
            jTFNrCep.setText(endereco.getNRCEP());
            
            cidadeDAO.preenchercidade(jCBCidade, cidade);
            
            Integer idcidade = endereco.getIDCIDADE();
            cidade.setIDCIDADE(idcidade);
            cidadeDAO.retornacidade(cidade);
            jCBCidade.setSelectedItem(cidade.getDscidade());             
           
        }
       
        estadobotoes(false);
        jTPFuncionario.setSelectedIndex(0);
    }//GEN-LAST:event_jTbPesquisaMouseClicked

    private void jTFNrCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNrCpfFocusLost
   
        String cpff = jTFNrCpf.getText().toString();
        String strSemPontos = jTFNrCpf.getText().replace(".", "");
        char[] cpf = jTFNrCpf.getText().replace(".", "").replace("-", "").toCharArray();
        int qtdCpf = cpf.length;
        if (jTFNrCpf.equals("00000000000") || jTFNrCpf.equals("11111111111") ||
            jTFNrCpf.equals("22222222222") || jTFNrCpf.equals("33333333333") ||
            jTFNrCpf.equals("44444444444") || jTFNrCpf.equals("55555555555") ||
            jTFNrCpf.equals("66666666666") || jTFNrCpf.equals("77777777777") ||
            jTFNrCpf.equals("88888888888") || jTFNrCpf.equals("99999999999") ||
            (qtdCpf != 11)){
            jTFNrCpf.setText("");
            jTFNrCpf.grabFocus();
            JOptionPane.showMessageDialog(null, "Digite um CPF Válido!");
        }else{

            for (int i = 0; i < qtdCpf; i++) {
                char digCpf;
                digCpf = cpf[i];
                String charCPF;
                if (i == 0) {
                    charCPF = String.valueOf(digCpf);
                    dig1 = (10 *Integer.parseInt(charCPF));
                    dig21 = (11 *Integer.parseInt(charCPF));
                } else if (i == 1) {
                    charCPF = String.valueOf(digCpf);
                    dig2 = (9 * Integer.parseInt(charCPF));
                    dig22 = (10 * Integer.parseInt(charCPF));
                } else if (i == 2) {
                    charCPF = String.valueOf(digCpf);
                    dig3 = (8 * Integer.parseInt(charCPF));
                    dig23 = (9 * Integer.parseInt(charCPF));
                } else if (i == 3) {
                    charCPF = String.valueOf(digCpf);
                    dig4 = (7 * Integer.parseInt(charCPF));
                    dig24 = (8 * Integer.parseInt(charCPF));
                } else if (i == 4) {
                    charCPF = String.valueOf(digCpf);
                    dig5 = (6 * Integer.parseInt(charCPF));
                    dig25 = (7 * Integer.parseInt(charCPF));
                } else if (i == 5) {
                    charCPF = String.valueOf(digCpf);
                    dig6 = (5 * Integer.parseInt(charCPF));
                    dig26 = (6 * Integer.parseInt(charCPF));
                } else if (i == 6) {
                    charCPF = String.valueOf(digCpf);
                    dig7 = (4 * Integer.parseInt(charCPF));
                    dig27 = (5 * Integer.parseInt(charCPF));
                } else if (i == 7) {
                    charCPF = String.valueOf(digCpf);
                    dig8 = (3 * Integer.parseInt(charCPF));
                    dig28 = (4 * Integer.parseInt(charCPF));
                } else if (i == 8) {
                    charCPF = String.valueOf(digCpf);
                    dig9 = (2 * Integer.parseInt(charCPF));
                    dig29 = (3 * Integer.parseInt(charCPF));
                } else if (i == 9) {
                    charCPF = String.valueOf(digCpf);
                    dig10 = Integer.parseInt(charCPF);
                    dig210 = (2 * Integer.parseInt(charCPF));
                } else if (i == 10) {
                    charCPF = String.valueOf(digCpf);
                    dig11 =  Integer.parseInt(charCPF);
                    dig211 = Integer.parseInt(charCPF);
                }
            }
            Integer somaDig10 = (dig1 + dig2 + dig3 + dig4 + dig5 + dig6 + dig7 + dig8 + dig9);
            Integer restoDivDig10=( somaDig10 % 11);
            Integer digVerif1 = (11 - restoDivDig10);
            if (digVerif1 > 9){
                digVerif1 = 0;
            }
            Integer digVerif2 = 0;
            if (dig10 == digVerif1){
                Integer somaDig11 = (dig21 + dig22 + dig23 + dig24 + dig25 + dig26 + dig27 + dig28 + dig29 + dig210);
                Integer restoDivDig11=( somaDig11 % 11);
                digVerif2 = (11 - restoDivDig11);
                if (digVerif2 > 9){
                    digVerif2 = 0;
                }
                if(dig11 !=digVerif2){
                    jTFNrCpf.setText("");
                    jTFNrCpf.grabFocus();
                    JOptionPane.showMessageDialog(null, "Insira um CPF valido!");
                }
            }else{
                jTFNrCpf.setText("");
                jTFNrCpf.grabFocus();
                JOptionPane.showMessageDialog(null, "Insira um CPF valido!");
            }
        }
    }//GEN-LAST:event_jTFNrCpfFocusLost

    private void jTFcnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFcnpjFocusLost
        char[] cnpj = jTFcnpj.getText().toCharArray();
        int qtdCnpj = cnpj.length;

        if (jTFcnpj.equals("00000000000000") || jTFcnpj.equals("11111111111111")
                || jTFcnpj.equals("22222222222222") || jTFcnpj.equals("33333333333333")
                || jTFcnpj.equals("44444444444444") || jTFcnpj.equals("55555555555555")
                || jTFcnpj.equals("66666666666666") || jTFcnpj.equals("77777777777777")
                || jTFcnpj.equals("88888888888888") || jTFcnpj.equals("99999999999999")
                || (qtdCnpj != 18)) {
            jTFcnpj.setText("");
            jTFcnpj.grabFocus();
            JOptionPane.showMessageDialog(null, "Digite um CNPJ Válido!");
        } else {

            char dig13, dig14;
            int sm, result, dig, peso;

            sm = 0;
            peso = 2;
            for (int i = 14; i >= 0; i--) {

                dig = (int) (jTFcnpj.getText().charAt(i) - 48);
                if (dig != -1) {
                    if (dig != -2) {
                        if (dig != -3) {

                            sm = sm + (dig * peso);
                            peso = peso + 1;
                            if (peso == 10) {
                                peso = 2;
                            }
                        }
                    }
                }
            }

            result = sm % 11;
            if ((result == 0) || (result == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - result) + 48);
            }

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (int i = 16; i >= 0; i--) {
                dig = (int) (jTFcnpj.getText().charAt(i) - 48);
                if (dig != -1) {
                    if (dig != -2) {
                        if (dig != -3) {
                            sm = sm + (dig * peso);
                            peso = peso + 1;
                            if (peso == 10) {
                                peso = 2;
                            }
                        }
                    }
                }
            }

            result = sm % 11;
            if ((result == 0) || (result == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - result) + 48);
            }

            // Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 != jTFcnpj.getText().charAt(16)) || (dig14 != jTFcnpj.getText().charAt(17))) {
                jTFcnpj.setText("");
                jTFcnpj.grabFocus();
                JOptionPane.showMessageDialog(null, "Digite um CNPJ Válido!");
            }
        }
    }//GEN-LAST:event_jTFcnpjFocusLost

    private void jTbPesquisaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTbPesquisaComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbPesquisaComponentMoved


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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InterfaceFuncionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sexo;
    private javax.swing.ButtonGroup bGtipo_pessoa;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBgravar;
    private javax.swing.JButton jBincluir;
    private javax.swing.JButton jBtPesquisa1;
    private javax.swing.JComboBox jCBCidade;
    private javax.swing.JComboBox jCBSexo;
    private javax.swing.JComboBox jCBTpSituação;
    private javax.swing.JComboBox jCbPesquisa2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotoes;
    private javax.swing.JPanel jPcadastro;
    private javax.swing.JPanel jPconsulta;
    private javax.swing.JPanel jPpfisica;
    private javax.swing.JPanel jPpjuridica;
    private javax.swing.JRadioButton jRBFisico;
    private javax.swing.JRadioButton jRBJuridica;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFDtCadastro;
    private javax.swing.JTextField jTFDtDemissão;
    private javax.swing.JTextField jTFDtNasc;
    private javax.swing.JFormattedTextField jTFFone1;
    private javax.swing.JTextField jTFIdPessoa;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JFormattedTextField jTFNrCep;
    private javax.swing.JFormattedTextField jTFNrCpf;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JPasswordField jTFSenha2;
    private javax.swing.JTextField jTFVlSalario;
    private javax.swing.JTextField jTFbairro;
    private javax.swing.JFormattedTextField jTFcnpj;
    private javax.swing.JTextField jTFcomplemento;
    private javax.swing.JTextField jTFlogradouro;
    private javax.swing.JTextField jTFnome;
    private javax.swing.JTextField jTFrazaosocial;
    private javax.swing.JFormattedTextField jTFrg;
    private javax.swing.JPasswordField jTFsenha1;
    private javax.swing.JTabbedPane jTPFuncionario;
    private javax.swing.JTable jTbPesquisa;
    // End of variables declaration//GEN-END:variables

    private void estadobotoes(boolean situacao) {
        jBincluir.setEnabled(!situacao);
        jBAlterar.setEnabled(!situacao);
        jBexcluir.setEnabled(!situacao);
        jBgravar.setEnabled(situacao);
        jBcancelar.setEnabled(situacao);
    }

    public void buscarFone(String fone) {
        fone1 = jTFFone1.getText();

    }
}
