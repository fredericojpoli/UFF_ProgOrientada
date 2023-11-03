package Exercicio06.Interpreter;

import Exercicio06.Janela;
import Exercicio06.Modelo.*;
import Exercicio06.SelecionaOperacao.*;

public abstract class NotacaoPolonesa {
    
    public static Numero calcula(Pilha topo) {
        Particula atual = topo.info;
        if (atual.getClass() == Operador.class) {
            
            SelecionaOperacao calculadora = new SelecionaAdicao(new SelecionaSubtracao(new SelecionaMultiplicacao(new SelecionaDivisao(new SelecionaPotenciacao(null)))));
            
            Numero esquerda = calcula(topo.proximo.proximo);
            Numero direita = calcula(topo.proximo);
            Operador meio = (Operador) atual;
            
            Numero resultado = calculadora.seleciona(meio, esquerda, direita);
            
            return resultado;
            
        }
        
        return ((Numero) atual);
    }
}
