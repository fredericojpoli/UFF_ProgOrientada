package Exercicio06;

import Exercicio06.Modelo.*;
import Exercicio06.Interpreter.*;
import java.util.*;

public class Main {
    
    public static List<Numero> listaVariaveis = new ArrayList();
    
    public static void main(String[] args) {
        
        /* 2) Inicialização das variáveis */
        Controle.inicializa("_a", 5);
        Controle.inicializa("_b", 2);
        
        /* 3) Listar variáveis */
        Janela.printVariaveis();
        
        /* 1) Transformar um string em uma representação orientada a objetos da expressão */
        String linha = "2 _a * _b + _b *";
        String expressao[] = linha.split(" ");
        Arvore npr = Tradutor.traduz(expressao, expressao.length - 1);
                
        /* "2 _a * _b + _b *" == ((2 * _a ) + _b) * _b */
        Janela.printArvore(npr);
        System.out.println();
        
        /* 4) Calcular valor da expressão */
    }
}
