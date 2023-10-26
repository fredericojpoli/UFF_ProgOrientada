package Provas.P1;

import java.io.*;

public class Main {
    
    public static Pedido[] pedidos = new Pedido[100];
    public static Prato[] pratos;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int qtdPedidos = 0;
        int qtdPratos = 7;
        
        /* criar e imprimir cardapio */
        pratos = Controle.extraiPratos("src/main/java/Provas/P1/pratos.txt", qtdPratos);
        for (Prato prato: pratos)
            System.out.println(prato.descricao());
        System.out.println("\n");
        
        
        /* armazenando pedidos */
        FileReader arq = new FileReader("src/main/java/Provas/P1/pedidos.txt");
        BufferedReader leitor = new BufferedReader(arq);
        String linha = leitor.readLine();
        String[] palavras;
        while (linha != null) {
            palavras = linha.split(";");
            Pedido atual = Controle.findPedido(palavras[0]);
            if (atual == null) {
                pedidos[qtdPedidos] = new Pedido(palavras[0]);
                atual = pedidos[qtdPedidos];
                qtdPedidos++;
            }
            atual.addItem(palavras[1], Integer.parseInt(palavras[2]));
            linha = leitor.readLine();
        }
        leitor.close();
        
        
        /* imprime a comanda */
        for (int i = 0; i < qtdPedidos; i++) {
            for (int j = 0; j < pedidos[i].getQtd(); j++)
                System.out.println(pedidos[i].getItens()[j].descricao());
            System.out.println("Total de " + pedidos[i].getCliente() + " foi de R$ " + pedidos[i].getValorTotal() + "\n");
        }
        
        /* conta o total de pratos pedidos */
        int total = Controle.totalPratos();
        
        
        /* conta a ocorrência de cada prato */
        /* só usar essa iteração se a lista tiver preenchida */
        for (Prato prato: pratos) {
            int ocorrencia = Controle.contaPrato(prato.getNome());
            int frequencia = (100 * ocorrencia) / total;
            System.out.println(prato.getNome() + " - " + frequencia);
        }
    }
}
