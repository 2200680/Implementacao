public class Produto {
    private long id;
    private String produto;
    private long quantidade;
    private double preço_unitario;
    private long quantidadeVendida;

    public Produto(long id, String produto, long quantidade, double preço_unitario) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preço_unitario = preço_unitario;
    }

    //Getts
    public long getId() {
        return id;
    }

    public String getProduto() {
        return produto;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public double getPreço_unitario() {
        return preço_unitario;
    }

    //Setts
    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreço_unitario(double preço_unitario) {
        this.preço_unitario = preço_unitario;
    }
}
