package Exercicio06;

import Exercicio06.Particula.Variavel;
import Exercicio06.Particula.Particula;
import Exercicio06.Particula.Operador;
import Exercicio06.Operacao.*;

public abstract class Controle {
    
    /* rascunho */
    public static Particula setParticula(String nome) {
        if (nome.equals("+") || nome.equals("/") || nome.equals("*") || nome.equals("^") || nome.equals("-")) {
            Operador novo = new Operador(nome);
            return novo;
        }
        
        Variavel novo = buscaVariavel(nome);
        return novo;
    }
    
    /* rascunho */
    public static Operacao setOperacao(Operador operador, Variavel numeroA, Variavel numeroB) {
       if (operador.getNome().equals("+"))
           return (new Adicao(numeroA, numeroB));
       
       if (operador.getNome().equals("/"))
           return (new Divisao(numeroA, numeroB));
            
       if (operador.getNome().equals("*"))
           return (new Multiplicacao(numeroA, numeroB));
                
       if (operador.getNome().equals("^"))
           return (new Potenciacao(numeroA, numeroB));
       
       return (new Subtracao(numeroA, numeroB)); 
    }
    
    /* rascunho */
    public static Variavel buscaVariavel(String nome) {
        for (Variavel var: Main.listaVariaveis)
            if (nome.equals(var.getNome()))
                return var;
        return (new Variavel(nome, 0));
    }
    
    
}
