package Provas.P1;

public class Pedido {
    
    private Item[] pedido = new Item[5];
    private int qtdItens = 0;
    private String cliente;
    
    /* construção */
    public Pedido(String nome) {
        cliente = nome;
    }
    
    /* adição */
    public void addItem(String prato, int qtd) {
        pedido[qtdItens] = new Item(prato, qtd);
        qtdItens++;
    }
    
    /* acesso */
    public String getCliente() {
        return cliente;
    }
    
    public Item[] getItens() {
        return pedido;
    }
    
    public int getQtd() {
        return qtdItens;
    }
       
    public double getValorTotal() {
        double valor = 0;
        for (int i = 0; i < qtdItens; i++) {
            if (pedido[i] != null)
                valor += pedido[i].getTotal();
        }
        return valor;
    }
    
}
