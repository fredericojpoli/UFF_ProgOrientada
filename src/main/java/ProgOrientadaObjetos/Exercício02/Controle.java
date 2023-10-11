package ProgOrientadaObjetos.Exercício02;

public abstract class Controle {
    
    public static void printCardapio() {
        for (Prato prato : Restaurante.pratos) {
            System.out.println(prato.getNome() + " - R$" + prato.getPreco());
        }
    }
    
    public static void printPedido(Pedido pedido) {
        System.out.println("PEDIDO DE " + pedido.getCliente());
        Item itens[] = pedido.getItens();
        for (int i = 0; i < pedido.indice; i++)
            System.out.println(itens[i].getPrato().getNome() + " " + itens[i].getQuantidade() + "UND de R$" + itens[i].getPrato().getPreco());
        System.out.println("TOTAL -> R$" + pedido.getValorTotal() + "\n");
    }
    
    public static Prato getPrato(String nomePrato) {
        for (Prato prato: Restaurante.pratos) {
            if (prato.getNome().equals(nomePrato))
                return prato;
        }
        return null;
    }
    
    public static int getPedido(String nomeCliente) {
        for (int i = 0; i < Restaurante.comandas.length; i++) {
            Pedido comanda = Restaurante.comandas[i];
            if (comanda.getCliente().equals(nomeCliente))
                return i;
        }
        return -1;
    }
    
}
