package br.tcc.conexao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoOracle {

    public static Connection ConexaoOracle;
    public static Statement statement;
    public static ResultSet resultset;
    public ResultSetMetaData metaData;
    public int retorno = 0;

    public ConexaoOracle() {
        conecta();

    }

    public static Connection conecta() {
        if (ConexaoOracle != null) {
            return ConexaoOracle;
        } else {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                ConexaoOracle = DriverManager.getConnection("jdbc:oracle:thin:"
                        + "@127.0.0.1:1522"
                        + ":xe", " sgf ", "sgf");
                System.out.println("Conectado");
//                JOptionPane.showMessageDialog(null, "Conectado com sucesso");
                return ConexaoOracle;

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não localizado: ");
                ex.printStackTrace();
                return null;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com a fonte"
                        + " de dados: ");
                ex.printStackTrace();
                return null;
            }
        }
    }

    public void desconecta() {
        boolean result = true;
        try {
            ConexaoOracle.close();
            // JOptionPane.showMessageDialog(null, "banco fechado");
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possivel "
                    + "fechar o banco de dados: " + fecha);
            result = false;
        }
    }

    public void incluirSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            // JOptionPane.showMessageDialog(null, "O registro Cadastrado com sucesso! ");
            retorno = 0;
        } catch (SQLException sqlex) {
            if (sqlex.getErrorCode() == 00001) {
//                JOptionPane.showMessageDialog(null, "O registro não pôde ser "
//                        + "incluido pois já está cadastrado ");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql ," + sqlex
                        + ", o sql passado foi " + sql);
            }
            retorno = 0;
        }
    }

    public void executeSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível localizar o registro \n" + sqlex);
        }
        try {
            metaData = resultset.getMetaData();
        } catch (SQLException erro) {
            //   JOptionPane.showMessageDialog(null, erro);
        }
    }

    public void deleteSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            retorno = 0;
            retorno = statement.executeUpdate(sql);
            if (retorno == 1) {
//                JOptionPane.showMessageDialog(null, "Exclusao realizada com sucesso");
            }
        } catch (SQLException sqlex) {
            if (sqlex.getErrorCode() == 2292) {
                JOptionPane.showMessageDialog(null, "O registro não pôde ser "
                        + "excluído porque ele está sendo utilizado em outro cadastro/movimento");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql de exclusão," + sqlex + ", o sql passado foi "
                        + sql);
            }
            retorno = 0;
        }
    }

    public void atualizarSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            retorno = 0;
            retorno = statement.executeUpdate(sql);
            if (retorno == 1) {
                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
            }
        } catch (SQLException sqlex) {
            if (sqlex.getErrorCode() == 2292) {
                JOptionPane.showMessageDialog(null, "O registro não pôde ser "
                        + "atualizado porque ele está sendo utilizado em outro cadastro/movimento");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql de exclusão," + sqlex + ", o sql passado foi "
                        + sql);
            }
            retorno = 0;
        }
    }

    public int retornaseq(String atributo, String tabela) {

        ConexaoOracle conexao = new ConexaoOracle();
        String sql = "SELECT COALESCE(MAX(" + atributo
                + "),0) + 1 AS ULTIMO FROM " + tabela;
        conexao.executeSQL(sql);
        int resultado = 0;
        try {
            conexao.resultset.first();
            resultado = conexao.resultset.getInt("ULTIMO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados nao encontrado \n" + ex);
        }

        return resultado;
    }

    public int retornasequencia(String atributo, String tabela) {
        ConexaoOracle conecta = new ConexaoOracle();

        String sql = "SELECT COALESCE(MAX(" + atributo + "),0) + 1 AS ULTIMO "
                + " FROM " + tabela;
        conecta.executeSQL(sql);
        int resultado = 0;
        try {
            conecta.resultset.first();
            resultado = conecta.resultset.getInt("ULTIMO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados nao cadastrado \n" + ex);
        }
        return resultado;
    }

    public static void main(String args[]) {
        
        ConexaoOracle conexao = new ConexaoOracle();

        
    }
}
