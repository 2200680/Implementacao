package EfetuarCompra;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class codigoProduto extends JFrame {


    private JLabel nomeLojaLabel;
    private JLabel horaLabel;
    private JList lista;
    private JButton inserirProdutoButton;
    private JButton sairButton;
    private JButton aplicarDescontoButton;
    private JButton finalizarButton;
    private JButton anularProdutoButton;
    private JTextField CÓDIGOPRODUTOTextField;
    private JButton OKButton;
    private JButton voltarButton;

    public codigoProduto() {
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
