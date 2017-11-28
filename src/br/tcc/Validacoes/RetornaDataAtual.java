package br.tcc.Validacoes;

import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author João Paulo
 */
public class RetornaDataAtual {
  public void RetornaDataAtual(JTextField campo_data){
      Date data = new Date();
      String dia = "" + data.getDate();
      String mes = "" + String.valueOf(data.getMonth() +1);
      String ano = "" + (1900 + data.getYear());
      
      if (Integer.parseInt(mes) <= 9){
          mes = "0" + mes;
      }
      if(Integer.parseInt(dia) <= 9){
          dia = "0" + dia;
      }
      campo_data.setText(dia + "/" + mes + "/" + ano);
  }  
}
