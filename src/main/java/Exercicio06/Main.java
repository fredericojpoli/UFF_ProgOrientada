package Exercicio06;

import Exercicio06.Interpreter.*;
import Exercicio06.Modelo.*;
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
        Controle.expressao = "2 _a * _b + _b *";
        
                
        /* (2 _a * _b + _b *) == ((2 * _a ) + _b) * _b */
        
        
        /* 4) Calcular valor da expressão */
        /* 
        ((2 * _a ) + _b) * _b 
        ((2 * 5 ) + 2) * 2 
        (10 + 2) * 2 
        (12) * 2 = 24
        */
        Controle.Calcula();

        
        /* Alteramos _a */
        Controle.AlteraVariavel("_a", 10.0);
        Controle.AlteraVariavel("_b", 4.0);
        Controle.AlteraVariavel("_a", 5.0);
        Controle.AlteraVariavel("_b", 0.0);
    }
}
