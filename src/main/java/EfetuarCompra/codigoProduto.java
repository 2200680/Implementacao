package EfetuarCompra;

import Recursos.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class codigoProduto extends JFrame {

    private JList lista;
    private JButton inserirProdutoButton;
    private JButton sairButton;
    private JButton aplicarDescontoButton;
    private JButton finalizarButton;
    private JButton anularProdutoButton;
    private JPanel JanelaPrincipal;
    private JPanel painelLista;
    private JPanel painelBotoes;
    private JButton OKButton;
    private JButton VOLTARButton;

    public codigoProduto(String title) {
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

    private void inserirProdutoButtonActionPerformed(ActionEvent e) {
    //    Produto produto = new Produto(adsa);
    //    produto.setVisible(true);
    }


    private void anularProdutoButtonActionPerformed(ActionEvent e){

    }


    private void aplicarDescontoButtonActionPerformed(ActionEvent e){
    //    Produto produto = new Produto(adsa);
    //    produto.setVisible(true);
    }


    private void finalizarButtonActionPerformed(ActionEvent e){

    }


    private void sairButtonActionPerformed(ActionEvent e) {
        System.exit(0);
    }



    public static void main(String[] args) {
        new codigoProduto("codigo Produto").setVisible(true);
    }


    //    private void createUIComponents() {
//        // TODO: place custom component creation code here
//    }
}

