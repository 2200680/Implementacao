package Estatistica;

import Recursos.Produto;

import java.util.LinkedList;

public class GestaoListas {
    private LinkedList<Produto> produtos;

    private static final GestaoListas lista = new GestaoListas();

    //constutor
    private GestaoListas() {
        produtos = new LinkedList<>();
    }
    //getts
    public static GestaoListas getProdutos() {
        return lista;
    }/*
    public ProdutoMaisVendido(){



    }*/
}
