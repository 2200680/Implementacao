package Recursos;

public class Cliente {
    private String nome;
    private long numeroCC;

    public Cliente(String nome, long numeroCC) {
        this.nome = nome;
        this.numeroCC = numeroCC;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumeroCC() {
        return numeroCC;
    }

    public void setNumeroCC(long numeroCC) {
        this.numeroCC = numeroCC;
    }
}
