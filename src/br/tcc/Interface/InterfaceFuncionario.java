package br.tcc.Interface;

import br.tcc.Validacoes.LimparCampos;
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
import br.tcc.dao.PessoaFisicaDAO;
import br.tcc.dao.PessoaJuridicaDAO;
import br.tcc.dao.UsuarioDAO;
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
    LimparCampos lcampos = new LimparCampos();
    private int situacao = 0;
    CidadeDAO cidadeDAO = new CidadeDAO();
    RetornaDataAtual retornadata = new RetornaDataAtual();
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
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
        jTFNrCep = new javax.swing.JTextField();
        jPpfisica = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFrg = new javax.swing.JTextField();
        jTFNrCpf = new javax.swing.JTextField();
        Sexo = new javax.swing.JLabel();
        jCBSexo = new javax.swing.JComboBox();
        jPpjuridica = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTFrazaosocial = new javax.swing.JTextField();
        jTFInscEstadual = new javax.swing.JTextField();
        jTFNrCnpj = new javax.swing.JFormattedTextField();
        jPbotoes = new javax.swing.JPanel();
        jBincluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBgravar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
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
        jLabel8 = new javax.swing.JLabel();
        jCBNivel = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jTFDtNasc = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTFFone1 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##) #####-####");

            jTFFone1 = new javax.swing.JFormattedTextField(telefone);
        }catch(Exception e){
        }
        jBfone1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCbPesquisa = new javax.swing.JComboBox();
        jTFPesquisa = new javax.swing.JTextField();
        jBtPesquisa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbPesquisa = new javax.swing.JTable();

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRBJuridicoMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBJuridicaMouseClicked(evt);
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

        jTFNrCep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFNrCepMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTFbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFNrCep, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(169, 169, 169)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTFcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFcomplemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNrCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPpfisica.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa Física"));

        jLabel11.setText("CPF");

        jLabel12.setText("RG");

        jTFrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFrgMouseClicked(evt);
            }
        });

        jTFNrCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFNrCpfMouseClicked(evt);
            }
        });

        Sexo.setText("Sexo");

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FEMININO", "MASCULINO", " " }));

        javax.swing.GroupLayout jPpfisicaLayout = new javax.swing.GroupLayout(jPpfisica);
        jPpfisica.setLayout(jPpfisicaLayout);
        jPpfisicaLayout.setHorizontalGroup(
            jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpfisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTFNrCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFrg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPpfisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sexo)
                    .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jTFrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNrCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPpjuridica.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa Juridica"));

        jLabel14.setText("CNPJ");

        jLabel15.setText("Insc. Estadual");

        jLabel16.setText("Razão Social");

        jTFInscEstadual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFInscEstadualMouseClicked(evt);
            }
        });

        try {
            jTFNrCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFNrCnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFNrCnpjMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPpjuridicaLayout = new javax.swing.GroupLayout(jPpjuridica);
        jPpjuridica.setLayout(jPpjuridicaLayout);
        jPpjuridicaLayout.setHorizontalGroup(
            jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpjuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jTFNrCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jTFInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTFrazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPpjuridicaLayout.setVerticalGroup(
            jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpjuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPpjuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFrazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNrCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPbotoes.setBackground(new java.awt.Color(153, 153, 153));

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

        javax.swing.GroupLayout jPbotoesLayout = new javax.swing.GroupLayout(jPbotoes);
        jPbotoes.setLayout(jPbotoesLayout);
        jPbotoesLayout.setHorizontalGroup(
            jPbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotoesLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jBincluir, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBexcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBgravar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(249, 249, 249))
        );
        jPbotoesLayout.setVerticalGroup(
            jPbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbotoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBcancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBexcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBgravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        jCBTpSituação.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATIVO", "LICENSA", "FERIAS", "INATIVO" }));

        jTFVlSalario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFVlSalarioMouseClicked(evt);
            }
        });

        jLabel8.setText("Nivel de Acesso");

        jCBNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));

        jLabel13.setText("Data de Nascimento");

        jLabel24.setText("Telefone");

        jTFFone1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFFone1MouseClicked(evt);
            }
        });

        jBfone1.setText("+ Telefone");
        jBfone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfone1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPcadastroLayout = new javax.swing.GroupLayout(jPcadastro);
        jPcadastro.setLayout(jPcadastroLayout);
        jPcadastroLayout.setHorizontalGroup(
            jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPcadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPpfisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPpjuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jTFDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFDtDemissão, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBTpSituação, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)))
                        .addGap(18, 18, 18)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jTFVlSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBfone1))
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel21))
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel8))
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jTFSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCBNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jTFIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisar))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPcadastroLayout.createSequentialGroup()
                                .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBFisico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBJuridica)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );
        jPcadastroLayout.setVerticalGroup(
            jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroLayout.createSequentialGroup()
                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRBFisico)
                            .addComponent(jRBJuridica)
                            .addComponent(jBPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBTpSituação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFDtDemissão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVlSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBfone1))
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
                                    .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPcadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPpfisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPpjuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPbotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTPFuncionario.addTab("Cadastro", jPcadastro);

        jCbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Funcionario", " " }));
        jCbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbPesquisaActionPerformed(evt);
            }
        });

        jBtPesquisa.setText("Pesquisar");
        jBtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisaActionPerformed(evt);
            }
        });

        jTbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Funcionario", "Data Admissão", "Data Demissão", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
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
        jScrollPane2.setViewportView(jTbPesquisa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtPesquisa)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPFuncionario.addTab("Consulta", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPFuncionario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPFuncionario)
        );

        setSize(new java.awt.Dimension(853, 687));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void jBincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBincluirActionPerformed

    jTFlogradouro.grabFocus();
    lcampos.LimparCampos(jTPFuncionario);
    situacao = 1;
    estadobotoes(true);
    cidadeDAO.preenchercidade(jCBCidade, cidade);
    retornadata.RetornaDataAtual(jTFDtCadastro);
}//GEN-LAST:event_jBincluirActionPerformed

private void jBgravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarActionPerformed

    Integer idCidade = null;
    String nivel1 = (String) jCBNivel.getSelectedItem();

    if (situacao == 1) {
        if (jTFIdPessoa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Funcionario");
            jTFIdPessoa.grabFocus();
            return;
        } else {
            funcionario.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));
        }

        funcionario.setDTCADASTRO(jTFDtCadastro.getText());

          if (jTFDtDemissão.getText().equals("")) {
                funcionario.setDTDEMISSAO("00/00/0000");
                return;
             }  
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
        telefone.setTPFONE(0);

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
//            if (jTFNrCpf.getText().equals("")) {
//                pfisica.setNRRG("0");
//            }
            String sexo = jCBSexo.getSelectedItem().toString();
            if (sexo.equals("MASCULINO")) {
                pfisica.setTPSEXO("M");
            } else {
                pfisica.setTPSEXO("F");
            }

        } else {
            pjuridica.setIDPESSOA(Integer.parseInt(jTFIdPessoa.getText()));
            if (jTFNrCnpj.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o número do CNPJ");
                jTFNrCnpj.grabFocus();
                return;
            } else {
                String cnpj = jTFNrCnpj.getText();
                boolean iscnpj = CnpjValido(cnpj);
                if (iscnpj = true) {
                    pjuridica.setNRCNPJ(jTFNrCnpj.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Informe o número do CNPJ");
                    jTFNrCnpj.grabFocus();
                }
            }
            pjuridica.setINSCESTADUAL(jTFInscEstadual.getText());
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
        }
        if (jTFNrCep.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o CEP");
            jTFNrCep.grabFocus();
            return;
        } else {
            endereco.setNRCEP(jTFNrCep.getText());
        }
        endereco.setTPENDERECO("RESIDENCIA");
        endereco.setIDSEQUENCIAL(0);
                

        PessoaFisicaDAO pfDao = new PessoaFisicaDAO();
        PessoaJuridicaDAO pjDao = new PessoaJuridicaDAO();
        EnderecoDAO endDao = new EnderecoDAO();
        FuncionarioDAO funcDao = new FuncionarioDAO();
        if (jRBFisico.isSelected()) {
            pfDao.incluir(pfisica);
            endDao.incluir(endereco);
            funcDao.incluir(funcionario);
        } else {
            pjDao.incluir(pjuridica);
            endDao.incluir(endereco);
            funcDao.incluir(funcionario);
        }
        JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com sucesso!");
        lcampos.LimparCampos(jPcadastro);
        estadobotoes(false);

    }

}//GEN-LAST:event_jBgravarActionPerformed

    private void jBfone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfone1ActionPerformed

        InterfaceTelefone InFone = new InterfaceTelefone();
        if (jTFIdPessoa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Para adicionar um número de telefone é necessario ter adicionado o código do funcionario!");
        } else {
            try {
                InFone.CapturaIdPessoa(jTFIdPessoa.getText());
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
            InFone.setVisible(true);
        }
    }//GEN-LAST:event_jBfone1ActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        situacao = 2;
        estadobotoes(true);
        cidadeDAO.preenchercidade(jCBCidade, cidade);
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        int t = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente cancelar o cadastro?");
        if (t == 0) {
            situacao = 2;
            lcampos.LimparCampos(jPcadastro);
            estadobotoes(false);
        }
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jCbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbPesquisaActionPerformed

    private void jBtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtPesquisaActionPerformed

    private void jTbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbPesquisaMouseClicked

    }//GEN-LAST:event_jTbPesquisaMouseClicked

    private void jRBJuridicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBJuridicoMousePressed
        jTFNrCpf.setEnabled(true);
        jTFrg.setEnabled(true);
        jCBSexo.setEnabled(true);

        jTFNrCnpj.setEnabled(false);
        jTFInscEstadual.setEnabled(false);
        jTFrazaosocial.setEnabled(false);
    }//GEN-LAST:event_jRBJuridicoMousePressed


    private void jRBFisicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRBFisicoKeyPressed

    }//GEN-LAST:event_jRBFisicoKeyPressed

    private void jRBJuridicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRBJuridicaKeyPressed

    }//GEN-LAST:event_jRBJuridicaKeyPressed

    private void jRBJuridicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBJuridicaMouseClicked
        jTFNrCpf.setEnabled(false);
        jTFrg.setEnabled(false);
        jCBSexo.setEnabled(false);

        jTFNrCnpj.setEnabled(true);
        jTFInscEstadual.setEnabled(true);
        jTFrazaosocial.setEnabled(true);
    }//GEN-LAST:event_jRBJuridicaMouseClicked

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

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
//        InterfaceRetornaPessoa retornaPessoa = new InterfaceRetornaPessoa();
//        retornaPessoa.setVisible(true);
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jTFVlSalarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFVlSalarioMouseClicked

        ValidaNumero validaNumero = new ValidaNumero();
        validaNumero.ValidaNumero(jTFVlSalario);
    }//GEN-LAST:event_jTFVlSalarioMouseClicked

    private void jTFFone1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFFone1MouseClicked

        ValidaNumero validaNumero = new ValidaNumero();
        validaNumero.ValidaNumero(jTFFone1);
    }//GEN-LAST:event_jTFFone1MouseClicked

    private void jTFNrCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNrCpfMouseClicked

        ValidaNumero validaNumero = new ValidaNumero();
        validaNumero.ValidaNumero(jTFNrCpf);
    }//GEN-LAST:event_jTFNrCpfMouseClicked

    private void jTFrgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFrgMouseClicked

        ValidaNumero validaNumero = new ValidaNumero();
        validaNumero.ValidaNumero(jTFrg);
    }//GEN-LAST:event_jTFrgMouseClicked

    private void jTFNrCnpjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNrCnpjMouseClicked

        ValidaNumero validaNumero = new ValidaNumero();
        validaNumero.ValidaNumero(jTFNrCnpj);
    }//GEN-LAST:event_jTFNrCnpjMouseClicked

    private void jTFInscEstadualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFInscEstadualMouseClicked

        ValidaNumero validaNumero = new ValidaNumero();
        validaNumero.ValidaNumero(jTFInscEstadual);
    }//GEN-LAST:event_jTFInscEstadualMouseClicked

    private void jTFNrCepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNrCepMouseClicked

        ValidaNumero validaNumero = new ValidaNumero();
        validaNumero.ValidaNumero(jTFNrCep);
    }//GEN-LAST:event_jTFNrCepMouseClicked

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
    private javax.swing.JButton jBfone1;
    private javax.swing.JButton jBgravar;
    private javax.swing.JButton jBincluir;
    private javax.swing.JButton jBtPesquisa;
    private javax.swing.JComboBox jCBCidade;
    private javax.swing.JComboBox jCBNivel;
    private javax.swing.JComboBox jCBSexo;
    private javax.swing.JComboBox jCBTpSituação;
    private javax.swing.JComboBox jCbPesquisa;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPbotoes;
    private javax.swing.JPanel jPcadastro;
    private javax.swing.JPanel jPpfisica;
    private javax.swing.JPanel jPpjuridica;
    private javax.swing.JRadioButton jRBFisico;
    private javax.swing.JRadioButton jRBJuridica;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFDtCadastro;
    private javax.swing.JTextField jTFDtDemissão;
    private javax.swing.JTextField jTFDtNasc;
    private javax.swing.JTextField jTFFone1;
    private javax.swing.JTextField jTFIdPessoa;
    private javax.swing.JTextField jTFInscEstadual;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JTextField jTFNrCep;
    private javax.swing.JFormattedTextField jTFNrCnpj;
    private javax.swing.JTextField jTFNrCpf;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JPasswordField jTFSenha2;
    private javax.swing.JTextField jTFVlSalario;
    private javax.swing.JTextField jTFbairro;
    private javax.swing.JTextField jTFcomplemento;
    private javax.swing.JTextField jTFlogradouro;
    private javax.swing.JTextField jTFnome;
    private javax.swing.JTextField jTFrazaosocial;
    private javax.swing.JTextField jTFrg;
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

    public static boolean CnpjValido(String cnpj) {
        if (!cnpj.substring(0, 1).equals("")) {
            try {
                cnpj = cnpj.replace('.', ' ');//onde há ponto coloca espaço
                cnpj = cnpj.replace('/', ' ');//onde há barra coloca espaço
                cnpj = cnpj.replace('-', ' ');//onde há traço coloca espaço
                cnpj = cnpj.replaceAll(" ", "");//retira espaço
                int soma = 0, dig;
                String cnpj_calc = cnpj.substring(0, 12);
                if (cnpj.length() != 14) {
                    return false;
                }
                char[] chr_cnpj = cnpj.toCharArray();
                /* Primeira parte */
                for (int i = 0; i < 4; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
                        soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);
                cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(
                        dig);
                /* Segunda parte */
                soma = 0;
                for (int i = 0; i < 5; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
                        soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);
                cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(
                        dig);
                return cnpj.equals(cnpj_calc);
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public void CnpjValido() {

    }
}
