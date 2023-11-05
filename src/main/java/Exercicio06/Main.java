package Exercicio06;

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
        Controle.setExpressao("2 _a * _b + _b *");
        
                
        /* (2 _a * _b + _b *) == ((2 * _a ) + _b) * _b */
        
        
        /* 4) Calcular valor da expressão */
        /* 
        ((2 * _a ) + _b) * _b 
        ((2 * 5 ) + 2) * 2 
        (10 + 2) * 2 
        (12) * 2 = 24
        */
        Controle.Calcula();

        
        /* Alteramos variaveis e o Observador faz o resultado ser recalculado. */
        Controle.AlteraVariavel("_a", 10.0);
        /*_c não está na expressao*/
        Controle.AlteraVariavel("_c", 100.0);
        
        /*Alteramos a expressao e as variaveis*/
        Controle.setExpressao("2 _c * _a + _a *");
        Controle.inicializa("_c", 0.0);
        
        Controle.AlteraVariavel("_b", 4.0);
        Controle.AlteraVariavel("_a", 5.0);
        Controle.AlteraVariavel("_c", 0.0);
    }
}
