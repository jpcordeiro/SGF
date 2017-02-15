package br.tcc.Validacoes;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author JOÃO PAULO
 */
public class ValidaNumero {

    public void ValidaNumero(JTextField Numero) {
        long valor;
        if (Numero.getText().length() != 0) {
            try {
                valor = Long.parseLong(Numero.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Esse Campo só aceita números");
                Numero.grabFocus();
            }
        }
    }

}
