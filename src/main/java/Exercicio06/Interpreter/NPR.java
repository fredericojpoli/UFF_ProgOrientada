package Exercicio06.Interpreter;

import Exercicio06.Modelo.*;
import Exercicio06.HandlerA.*;
import Exercicio06.Janela;
import Exercicio06.Visitor.*;

public abstract class NPR {
    
    public static Arvore traduz(String[] expressao, int indx) {

        // Chain Of Responsability: HandlerA/HandlerA.java
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
        
        // Não terminal
        if (expressao.conteudo.getClass() != Numero.class) {
            Calculadora calculadora = new Calculadora();
            
            // o conteudo dos filhos passa a ser o resultado (pra atualizar a arvore)
            expressao.esquerda.conteudo = calcula(expressao.esquerda);
            expressao.direita.conteudo = calcula(expressao.direita);
            
            Operador operador = (Operador) expressao.conteudo;
            operador.setFatores((Numero) expressao.esquerda.conteudo, (Numero) expressao.direita.conteudo);
            
            // se eu não fizer isso, o visitor lê como um Operador
            switch (operador.getNome()) {
                case "+":
                   return calculadora.visit(new OperadorAdicao(operador));
                case "/":
                   return calculadora.visit(new OperadorDivisao(operador));
                case "*":
                   return calculadora.visit(new OperadorMultiplicacao(operador));
                case "^":
                   return calculadora.visit(new OperadorPotenciacao(operador));
                case "-":
                   return calculadora.visit(new OperadorSubtracao(operador));
            }
        } 
        
        // Terminal
        return ((Numero) expressao.conteudo);
    }
    
}
