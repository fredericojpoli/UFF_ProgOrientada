package ProgOrientadaObjetos.Exercício02;

public class Prato {
    private String nome;
    private double preco;
    
    /* construção */
    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    /* alteração */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    /* acesso */
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
}
