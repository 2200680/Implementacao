package Recursos;

import Recursos.*;
import javax.swing.*;

public class Compra {
    public long id;
    public String produto;
    public long quantidade;
    public double preço_unitário;
    public long preco_total;


    public Compra(long id, String produto, long quantidade, double preço_unitário, long preco_total) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preço_unitário = preço_unitário;
        this.preco_total = preco_total;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreço_unitário() {
        return preço_unitário;
    }

    public void setPreço_unitário(double preço_unitário) {
        this.preço_unitário = preço_unitário;
    }

    public long getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(long preco_total) {
        this.preco_total = preco_total;
    }
}
