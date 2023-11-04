package Exercicio06.Interpreter;

import Exercicio06.Modelo.*;
import Exercicio06.Visitor.*;

public abstract class NPR {
    
    public static Numero calcula(Arvore noh) {
        
        Calculadora calculadora = new Calculadora();
        
        /* Terminal? */
        if (noh.conteudo.getClass() == Numero.class) {
            return calculadora.visit(noh.conteudo);
        }
        
        if (noh.conteudo.getClass() == Operador.class) {
            Numero fatorA = calcula(noh.esquerda);
            Numero fatorB = calcula(noh.direita);
            
            Operador operador = (Operador) noh.conteudo;
            operador.setFatores(fatorA, fatorB);
            
            /* ta dando erro na hora de converter a operacao */
            /*return calculadora.visit(operador.operacao);*/
        }
        return null;
            
        
    }
}
