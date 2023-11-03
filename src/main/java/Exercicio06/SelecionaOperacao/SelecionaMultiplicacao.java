package Exercicio06.SelecionaOperacao;

import Exercicio06.Modelo.*;
import Exercicio06.Visitor.*;

public class SelecionaMultiplicacao implements SelecionaOperacao {
    
    private SelecionaOperacao proximo = null;
    
    public SelecionaMultiplicacao(SelecionaOperacao proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Numero seleciona(Operador operador, Numero numA, Numero numB) {
        if (operador.getNome().equals("*")) {
            Calculadora calculadora = new Calculadora();
            Multiplicacao operacao = new Multiplicacao(numA, numB);
            return calculadora.visit(operacao);
        }
        
        if (proximo != null)
            return proximo.seleciona(operador, numA, numB);
        
        return null;
        
    }
}
