package br.tcc.Validacoes;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author JOÃO PAULO
 */
public class LimparCampos {
    
    public void LimparCampos(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");

            } else if ((component instanceof JComboBox)) {
                JComboBox field = (JComboBox) component;
                field.removeAllItems();
            }
        }
    }
}
