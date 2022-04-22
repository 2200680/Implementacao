package EfetuarCompra;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class codigoProduto extends JFrame {

    private JList lista;
    private JButton inserirProdutoButton;
    private JButton sairButton;
    private JButton aplicarDescontoButton;
    private JButton finalizarButton;
    private JButton anularProdutoButton;
    private JTextField CÓDIGOPRODUTOTextField;
    private JButton OKButton;
    private JButton voltarButton;
    private JPanel JanelaPrincipal;
    private JPanel painelLista;
    private JPanel painelBotoesProduto;
    private JPanel painelBotoes;
    private JPanel painelNomeLojaHora;

    public codigoProduto(String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(JanelaPrincipal);

        pack();

        sairButton.addActionListener(this::sairButtonActionPerformed);
//    inserirProdutoButton.addActionListener(this::inserirProdutoButtonActionPerformed);
//    aplicarDescontoButton.addActionListener(this::aplicarDescontoButtonActionPerformed);
//    finalizarButton.addActionListener(this::finalizarButtonActionPerformed);
//    anularProdutoButton.addActionListener(this::anularProdutoButtonActionPerformed);

    }

    private void sairButtonActionPerformed(ActionEvent e) {
        System.exit(0);
    }

//    private void createUIComponents() {
//        // TODO: place custom component creation code here
//    }

    public static void main(String[] args) {
        new codigoProduto("codigo Produto").setVisible(true);
    }
}

