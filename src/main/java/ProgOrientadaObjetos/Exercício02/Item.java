package ProgOrientadaObjetos.Exercício02;

public class Item {
    private Prato prato;
    private int quantidade;
    
    /* construção */
    public Item(Prato prato, int quantidade) {
        this.prato = prato;
        this.quantidade = quantidade;
    }
    
    /* alteração */
    public void setPrato(Prato prato) {
        this.prato = prato;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    /* acesso */
    public Prato getPrato() {
        return prato;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public double getValorTotal() {
        return (prato.getPreco() * quantidade);
    }
}
