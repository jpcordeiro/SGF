package br.tcc.Interface;

import br.tcc.Validacoes.PreencherJtableGenerico;
import br.tcc.classe.Pessoa;
import br.tcc.classe.RelacaoPessoa;
import br.tcc.classe.Telefone;
import br.tcc.dao.PessoaDAO;
import br.tcc.dao.RelacaoPessoaDAO;
import br.tcc.dao.TelefoneDAO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author JOÃO PAULO
 */
public class InterfaceSMS extends javax.swing.JFrame {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String URL_SMS_GATEWAY = "http://smsgateway.me/api/v3/messages/send";
    private static final String METHOD_SMS_GATEWAY = "POST";
    private static final OkHttpClient client = new OkHttpClient();
    private static String email;
    private static String senha;
    private static String id;
    private static String sms;
    private static String numero;
    RelacaoPessoa relPessoa = new RelacaoPessoa();
    RelacaoPessoaDAO relPessoaDAO = new RelacaoPessoaDAO();
    Pessoa pessoa = new Pessoa();
    PessoaDAO pessoaDAO = new PessoaDAO();
    Telefone fone  = new Telefone();
    TelefoneDAO foneDAO = new TelefoneDAO();

    /**
     * Creates new form InterfaceSMS6
     */
    public InterfaceSMS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGSMS = new javax.swing.ButtonGroup();
        jPCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jCBRelacao = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jBPesq = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbRelacao = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jRBPadrao = new javax.swing.JRadioButton();
        jRBManual = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAMensagem = new javax.swing.JTextArea();
        jBEnviar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTFFone = new javax.swing.JFormattedTextField();
        jTFPesquisar = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro da Familia");

        jLabel1.setText("E-mail");

        jLabel2.setText("Senha");

        jLabel3.setText("Configuração de acesso para enviar sms");

        jLabel4.setText("Device ID (app do celular)");

        jCBRelacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Data" }));

        jLabel5.setText("Selecione");

        jBPesq.setText("Pesquisar");
        jBPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesqActionPerformed(evt);
            }
        });

        jTbRelacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Relação", "Tipo Relação", "Comemoração", "Data ", "Código Cliente", "Cliente", "Selecionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbRelacao.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTbRelacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbRelacaoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTbRelacao);

        jLabel6.setText("Tipo de mensagem");

        bGSMS.add(jRBPadrao);
        jRBPadrao.setText("Padrão");

        bGSMS.add(jRBManual);
        jRBManual.setText("Manual");

        jLabel7.setText("Mensagem");

        jTAMensagem.setColumns(20);
        jTAMensagem.setRows(5);
        jTAMensagem.setText("\n");
        jScrollPane1.setViewportView(jTAMensagem);

        jBEnviar.setText("Enviar");
        jBEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarActionPerformed(evt);
            }
        });

        jLabel8.setText("Número não cadastrado");

        try {
            jTFFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTFPesquisar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPCadastroLayout = new javax.swing.GroupLayout(jPCadastro);
        jPCadastro.setLayout(jPCadastroLayout);
        jPCadastroLayout.setHorizontalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addComponent(jCBRelacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesq))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBPadrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBManual))
                            .addComponent(jLabel7)))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jBEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFFone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadastroLayout.setVerticalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBRelacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesq)
                    .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRBPadrao)
                    .addComponent(jRBManual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(487, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTbRelacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbRelacaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbRelacaoMouseClicked

    private void jBEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarActionPerformed

        if (jTFEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "E-mail é obrigatório!");
            jTFEmail.grabFocus();
        } else {
            email = jTFEmail.getText();
        }
        if (jPFSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Senha é obrigatório!");
            jPFSenha.grabFocus();
        } else {
            senha = jPFSenha.getText();
        }
        if (jTFId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Device ID é obrigatório!");
            jTFId.grabFocus();
        } else {
            id = jTFId.getText();
        }
        if (!bGSMS.isSelected(null)) {
            if (jRBPadrao.isSelected()) {
                int r = jTbRelacao.getRowCount();
                for (int i = 0; i < r; i++) {
                    String sel = (String) jTbRelacao.getValueAt(i, 6);
                    if (!sel.equals(null)) {
                        String nome = (String) jTbRelacao.getValueAt(i, 0);
                        String cliente = (String) jTbRelacao.getValueAt(i, 5);
                        String comemoração = (String) jTbRelacao.getValueAt(i, 2);
                        String data = (String) jTbRelacao.getValueAt(i, 3);
                        sms = cliente + ", " + nome + " está comemorando " + comemoração + " no dia " + data;
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione os contatos para enviar a mensagem!");
                    }
                }
            } else if (!jTAMensagem.getText().equals("")) {
                if (!jTFFone.equals("")) {
                    numero = jTFFone.getText();
                    sms = jTAMensagem.getText();
                } else {
                    sms = jTAMensagem.getText();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mensagem é obrigatório!");
                jTAMensagem.grabFocus();
            }
            int r = jTbRelacao.getRowCount();
            if (r == 0) {
                String[] numbers = {numero};
                try {
                    sendSMS(email, senha, id, numbers, sms);
                } catch (IOException ex) {
                    Logger.getLogger(InterfaceSMS.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                for (int i = 0; i < r; i++) {
                    String sel = (String) jTbRelacao.getValueAt(i, 6);
                    if (!sel.equals(null)) {
                        String id = (String) jTbRelacao.getValueAt(i, 4);
                        fone.setIDPESSOA(Integer.parseInt(id));
                        foneDAO.consultaFone(fone);

                    }
                    sendSMS(email, senha, id, numbers, sms);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione o tipo de mensagem!");
        }


    }//GEN-LAST:event_jBEnviarActionPerformed

    private void jBPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesqActionPerformed

        PreencherJtableGenerico preencher = new PreencherJtableGenerico();
        switch (jCBRelacao.getSelectedIndex()) {
            case 0: {
                relPessoaDAO.consultar(relPessoa);
                preencher.PreencherJComboBox(jTbRelacao, relPessoa.getRetorno());
                int r = jTbRelacao.getRowCount();
                for (int i = 0; i < r; i++) {
                    String id = (String) jTbRelacao.getValueAt(i, 4);
                    pessoa.setIDPESSOA(Integer.parseInt(id));
                    pessoaDAO.consultarId(pessoa);
                    String nome = pessoa.getDSPESSOA();
                    jTbRelacao.setValueAt(nome, i, 5);
                }
                jTbRelacao.setValueAt("false", r, 6);

                return;
            }
            case 1: {
                relPessoa.setDTCOMEMORACAO(jTFPesquisar.getText());
                relPessoaDAO.consultaData(relPessoa);
                preencher.PreencherJComboBox(jTbRelacao, relPessoa.getRetorno());
                int r = jTbRelacao.getRowCount();
                for (int i = 0; i < r; i++) {
                    String id = (String) jTbRelacao.getValueAt(i, 4);
                    pessoa.setIDPESSOA(Integer.parseInt(id));
                    pessoaDAO.consultarId(pessoa);
                    String nome = pessoa.getDSPESSOA();
                    jTbRelacao.setValueAt(nome, i, 5);
                }
                jTbRelacao.setValueAt("false", r, 6);
                return;
            }
        }
    }//GEN-LAST:event_jBPesqActionPerformed

    private static void sendSMS(String email, String password, String deviceId,
            String numbers[], String message) throws IOException {
        Map<String, Object> bodyParams = new HashMap<>();

        bodyParams.put("email", email);
        bodyParams.put("password", password);
        bodyParams.put("device", deviceId);
        bodyParams.put("number", numbers);
        bodyParams.put("message", message);

        Request request = new Request.Builder()
                .url(URL_SMS_GATEWAY)
                .method(METHOD_SMS_GATEWAY, RequestBody.create(JSON, gerenateJson(bodyParams)))
                .build();

        Response response = client.newCall(request).execute();

        if (response.isSuccessful()) {
            System.out.println("SMS enviado com sucesso!");
        } else {
            System.err.println("Erro ao enviar o SMS!");
        }

        System.out.println(response.body().string());
    }

    private static String gerenateJson(Map map) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(map);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceSMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceSMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceSMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceSMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceSMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGSMS;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JButton jBPesq;
    private javax.swing.JComboBox<String> jCBRelacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPCadastro;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JRadioButton jRBManual;
    private javax.swing.JRadioButton jRBPadrao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTAMensagem;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JFormattedTextField jTFFone;
    private javax.swing.JTextField jTFId;
    private javax.swing.JFormattedTextField jTFPesquisar;
    private javax.swing.JTable jTbRelacao;
    // End of variables declaration//GEN-END:variables

}
