package Provas.P1;

public class Item {
    private Prato prato;
    private int quantidade;
    
    /* construção */
    public Item(String prato, int quantidade) {
        this.prato = Controle.findPrato(prato);
        this.quantidade = quantidade;
    }
    
    /* acesso */
    public Prato getPrato() {
        return prato;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public double getTotal() {
        return (prato.getPreco() * quantidade);
    }
    
    /* auxiliar para impressão do cardápio */
    public String descricao() {
        return (prato.descricao() + " " + quantidade + "UND");
    }
}
