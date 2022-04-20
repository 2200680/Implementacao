package RegistarCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistarCliente extends JFrame {
    private JPanel painelPrincipal;
    private JList list1;
    private JLabel nomeLojaLabel;
    private JLabel horaLabel;
    private JButton inserirProdutoButton;
    private JButton anularProdutoButton;
    private JButton sairButton;
    private JButton aplicarDescontoButton;
    private JButton finalizarButton;





    public RegistarCliente() {

        setContentPane(painelPrincipal);
        pack();


    }

    public static void main(String[] args) {
       new RegistarCliente().setVisible(true);

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
