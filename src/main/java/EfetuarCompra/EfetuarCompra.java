package EfetuarCompra;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EfetuarCompra extends JFrame {
    private JPanel JanelaPrincipal;
    private JButton inserirProdutoButton;           //inserir produto
    private JButton sairButton;                     //sair
    private JButton aplicarDescontoButton;          //aplicar desconto
    private JButton finalizarButton;                //finalizar
    private JButton anularProdutoButton;            //anular produto
    private JPanel painelLista;
    private JPanel painelBotoes;
    private JPanel painelNomeLojaHora;
    private JList lista;

    public EfetuarCompra(String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(JanelaPrincipal);

        pack();

        sairButton.addActionListener(this::sairButtonActionPerformed);
        inserirProdutoButton.addActionListener(this::inserirProdutoButtonActionPerformed);
        aplicarDescontoButton.addActionListener(this::aplicarDescontoButtonActionPerformed);
        finalizarButton.addActionListener(this::finalizarButtonActionPerformed);
        anularProdutoButton.addActionListener(this::anularProdutoButtonActionPerformed);
    }


    private void finalizarButtonActionPerformed(ActionEvent actionEvent) {
        this.setVisible(true);

    }

    private void anularProdutoButtonActionPerformed(ActionEvent actionEvent) {
        this.setVisible(true);
    }

    private void aplicarDescontoButtonActionPerformed(ActionEvent actionEvent) {
        this.setVisible(true);

    }

    private void inserirProdutoButtonActionPerformed(ActionEvent actionEvent) {
        this.setVisible(true);

    }

    private void sairButtonActionPerformed(ActionEvent e){
        System.exit(0);
    }


    public static void main(String[] args) {
        new EfetuarCompra("Efetuar Compra").setVisible(true);
    }

//    private void createUIComponents() {
//        // TODO: place custom component creation code here
//    }

}
