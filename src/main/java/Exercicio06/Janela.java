package Exercicio06;

import Exercicio06.Modelo.*;

public abstract class Janela {
    
    public static void printPilha(Pilha equacao) {
        if (equacao != null) {
            System.out.print(equacao.info.getNome() + " ");
            printPilha(equacao.proximo);
        }
    } 
    
    public static void printVariaveis() {
        for (Numero variavel: Main.listaVariaveis)
            if (variavel != null)
                System.out.println(variavel.getNome() + " = " + variavel.getValor());
    }
}
