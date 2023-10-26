package Provas.P1;

public class Prato {
    private String nome;
    private double preco;
    
    /* construção */
    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    /* acesso */
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    /* auxiliar para impressão do cardápio */
    public String descricao() {
        return (nome + " R$" + preco);
    }
}
