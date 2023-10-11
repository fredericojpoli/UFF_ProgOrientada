package ProgOrientadaObjetos.Exercício02;

import java.io.*;

public class Restaurante {
    
    public static Pedido[] comandas = new Pedido[4];
    public static Prato[] pratos = new Prato[8];
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader leitorPedidos = new BufferedReader(new FileReader("src/main/java/ProgOrientadaObjetos/Exercício02/pedidos.txt"));
        BufferedReader leitorPratos = new BufferedReader(new FileReader("src/main/java/ProgOrientadaObjetos/Exercício02/pratos.txt"));
        String linha;
        String palavras[];
        
        comandas[0] = new Pedido("Helo");
        comandas[1] = new Pedido("Manu");
        comandas[2] = new Pedido("Sophia");
        comandas[3] = new Pedido("Bea");
        
        linha = leitorPratos.readLine();
        for (int i = 0; i < pratos.length; i++) {
            /* separa as informações da linha */
            palavras = linha.split(";");
            /* cadastra o prato */
            Prato prato = new Prato(palavras[0], Double.parseDouble(palavras[1]));
            pratos[i] = prato;
            /* avança a linha */
            linha = leitorPratos.readLine();
        }
        
        /* imprime o cardápio */
        Controle.printCardapio();
        System.out.println(" ");
        
        Prato prato;
        int quantidade;
        Pedido pedido;
        linha = leitorPedidos.readLine();
        while (linha != null) {
            /* separa ass palavras da linha */
            palavras = linha.split(";");
            /* separa as coisas que vão ser usadas como parâmetro */
            pedido = comandas[Controle.getPedido(palavras[0])];
            prato = Controle.getPrato(palavras[1]);
            quantidade = Integer.parseInt(palavras[2]);
            /* criando o item */
            Item item = new Item(prato, quantidade);
            pedido.addItem(item);
            /* avança uma linha */
            linha = leitorPedidos.readLine();
        }
        
        /* imprime a comanda */
        /* só usar essa iteração se a lista tiver preenchida */
        for (Pedido comanda : comandas) {
            Controle.printPedido(comanda);
        }
        
        
        
        leitorPedidos.close();
        leitorPratos.close();
    }
}
