package Estatistica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage_Gerente_2 {
    private JPanel panel1;
    private JButton produtoMaisVendidoButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;

    public MainPage_Gerente_2() {

        produtoMaisVendidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void btnProdutoMaisVendidoActionPerformed(ActionEvent e) {
        new JanelaProdutoMaisVendido();

        // TODO: place custom component creation code here
    }
}
