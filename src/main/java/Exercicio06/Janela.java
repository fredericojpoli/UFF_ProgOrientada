package Exercicio06;

import Exercicio06.Modelo.*;

public abstract class Janela {
    
    public static void printArvore(Arvore equacao) {
        if (equacao != null) {
            printArvore(equacao.esquerda);
            System.out.print(" " + equacao.conteudo.getNome() + " ");
            printArvore(equacao.direita);
        }
    } 
    
    public static void printVariaveis() {
        for (Numero variavel: Main.listaVariaveis)
            if (variavel != null)
                System.out.println(variavel.getNome() + " = " + variavel.getValor());
    }
}
