package EfetuarCompra;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EfetuarCompra {
    private JList list1;
    private JLabel nomeLojaLabel1;
    private JLabel horaLabel;
    private JButton inserirProdutoButton;
    private JButton anularProdutoButton;
    private JButton sairButton;
    private JButton aplicarDescontoButton;
    private JButton finalizarButton;

    public EfetuarCompra() {
        finalizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
