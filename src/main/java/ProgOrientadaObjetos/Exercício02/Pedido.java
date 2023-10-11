package ProgOrientadaObjetos.Exercício02;

public class Pedido {
    
    private String cliente;
    private Item[] pedido = new Item[5];
    public int indice = 0;
    
    /* construção */
    public Pedido(String nome) {
        cliente = nome;
    }
    
    /* acesso */
    public String getCliente() {
        return cliente;
    }
    
    public double getValorTotal() {
        int valor = 0;
        for (int i = 0; i < pedido.length; i++) {
            if (pedido[i] != null)
                valor += pedido[i].getValorTotal();
        }
        return valor;
    }
    
    public Item[] getItens() {
        return pedido;
    }
    
    public void addItem(Item item) {
        pedido[indice] = item;
        indice++;
    }
    
    public void rmvItem(Item item) {
        for (int i = 0; i < indice; i++) {
            Item itemAtual = pedido[i];
            if (pedido[i] != null && itemAtual.getPrato().equals(item.getPrato())) {
                pedido[i] = null;
                break;
            }
        }
    }
    
}
