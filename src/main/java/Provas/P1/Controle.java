package Provas.P1;

import java.io.*;

public abstract class Controle {
    
    public static Prato findPrato(String nomePrato) {
        for (Prato prato: Main.pratos) {
            if (prato.getNome().equals(nomePrato))
                return prato;
        }
        return null;
    }
    
    public static Pedido findPedido(String nomeCliente) {
        for (Pedido pedido: Main.pedidos) {
            if (pedido != null && pedido.getCliente().equals(nomeCliente))
                return pedido;
        }
        return null;
    }
   
    public static void printCardapio() {
        for (Prato prato : Main.pratos) {
            System.out.println(prato.getNome() + " - R$" + prato.getPreco());
        }
    }
    
    /* não coloquei essas exceptions na prova, o netbeans me obriga */
    public static Prato[] extraiPratos(String arq, int qtdPratos) throws FileNotFoundException, IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(arq));
        String linha = leitor.readLine();
        String[] palavras;
        Prato[] pratos = new Prato[qtdPratos];
        int indice = 0;
        
        while (linha != null) {
            palavras = linha.split(";");
            String nome = palavras[0];
            double preco = Double.parseDouble(palavras[1]);
            pratos[indice++] = new Prato(nome, preco);
            linha = leitor.readLine();
        }
        
        leitor.close();
        return pratos;
    }

    /* segunda questão da prova */
    public static int totalPratos() {
        int total = 0;
        for (Pedido pedido: Main.pedidos)
            if (pedido == null)
                break;
            else {
                for (Item item: pedido.getItens())
                    if (item == null)
                        break;
                    else
                        total += item.getQuantidade();
            }
            
        return total;
    }
    
    public static int contaPrato(String nome) {
        int total = 0;
        for (Pedido pedido: Main.pedidos) {
            if (pedido == null)
                break;
            else {
                for (Item item: pedido.getItens())
                    if (item == null)
                        break;
                    else if (item.getPrato().getNome().equals(nome))
                        total += item.getQuantidade();
            }
        }
        return total;
    }
}