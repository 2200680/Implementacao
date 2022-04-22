package RegistarCliente;

import javax.swing.*;

public class RegistarCliente extends JFrame {
    private JPanel Principal;
    private JList list1;
    private JButton inserirProdutoButton;
    private JButton anularProdutoButton;
    private JButton sairButton;
    private JButton aplicarDescontoButton;
    private JButton finalizarButton;

    public RegistarCliente(String title) {
    super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(Principal);
        pack();
    }



//    public static void main(String[] args) {
//        new RegistarCliente("Registar Recursos.Cliente").setVisible(true);
//    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }



}
