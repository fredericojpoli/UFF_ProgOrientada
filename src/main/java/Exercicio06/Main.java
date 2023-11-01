package Exercicio06;

import Exercicio06.Particula.Variavel;
import Exercicio06.Particula.Particula;
import Exercicio06.Particula.Operador;
import Exercicio06.Operacao.*;
import java.util.*;

/* "anda até achar um operador\npega a operacao do operador\nopera operando n-1 com n-2" */
public class Main {
    
    public static List<Variavel> listaVariaveis = new ArrayList();
    
    public static void main(String[] args) throws ClassNotFoundException {
       
        
        /* inicializo variaveis */
        Variavel a = new Variavel("_a", 5);
        Variavel b = new Variavel("_b", 2);
        listaVariaveis.add(a);
        listaVariaveis.add(b);
        
        /* leio a expressão e corto ela em particulas */
        String linha = "2 _a * _b + _b *";
        
        
        
        /* classifico */
        List<Particula> expressao = new ArrayList();
        
        
        /* opero */
        int i = 0;
        while (expressao.size() > 1) {
            if (expressao.get(i).getTipo() == Operador.class) {
                Variavel variavelA = (Variavel) expressao.get(i-2);
                Operador operador = (Operador) expressao.get(i);
                Variavel variavelB = (Variavel) expressao.get(i-1);
                
                Operacao operacao = Controle.setOperacao(operador, variavelA, variavelB);
                Variavel resultado = new Variavel("temp", operacao.calcular());
                
                System.out.println(variavelA.getNome() + " " + operador.getNome() + " " + variavelB.getNome() + " = " + resultado.getValor());
                
                /* coloco o novo resultado e apago o que eu já usei*/
                expressao.set(i, resultado);
                expressao.remove(i-1);
                expressao.remove(i-1);
                
                i = 0;
            } else
                i++;
        }
    }
    
    /* observer: quando o resultado total mudar imprime na tela */
    /* visitor: coisas que eu posso fazer com esse objeto */
    /* interpreter: calcula o valor */
    /* cor: */
    
            
}
