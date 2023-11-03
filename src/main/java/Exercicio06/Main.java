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
        Pilha expressao = Tradutor.traduz(linha);
                
        /* "2 _a * _b + _b *" == _b * (_b + (_a * 2)) */
        Janela.printPilha(expressao);
        System.out.println();
        
        /* 4) Calcular valor da expressão */
        Numero resultado = NotacaoPolonesa.calcula(expressao);
        System.out.println(resultado.getValor());
    }
}
