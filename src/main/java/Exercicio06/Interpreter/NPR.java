package Exercicio06.Interpreter;

import Exercicio06.Modelo.*;
import Exercicio06.HandlerA.*;
import Exercicio06.Visitor.*;

public abstract class NPR {
    
    public static Arvore traduz(String[] expressao, int indx) {

        /* Chain Of Responsability */
        HandlerA classificador = new VariavelHandler(new OperadorHandler(new ConstanteHandler(null)));

        Arvore novoNoh = new Arvore();
        novoNoh.conteudo = classificador.classifica(expressao[indx]);

        /* Se não é um elemento terminal/folha */
        if (novoNoh.conteudo.getClass() != Numero.class) {
            novoNoh.direita = traduz(expressao, indx-1);
            novoNoh.esquerda = traduz(expressao, indx-2);
        }
            
        return novoNoh;

    }
    
    public static Numero calcula(Arvore expressao) {
        /*
        // Não terminal
        if (expressao.conteudo.getClass() != Numero.class) {
            Numero fatorA = calcula(expressao.esquerda);
            Numero fatorB = calcula(expressao.direita);
            
            Calculadora calculadora = new Calculadora();
            
            // pra eu acessar o set fatores preciso transformar em operacao pq não é atributo de particula
            Operador operador = (Operador) expressao.conteudo; 
            operador.setFatores(fatorA, fatorB);
            
            // pra visitar precisava ser explicitamente do tipo OperadorTipo mas não rola pq é do tipo Operador
            return calculadora.visit(operador);
            
        } */
        
        // Terminal
        return ((Numero) expressao.conteudo);
    }
    
}
