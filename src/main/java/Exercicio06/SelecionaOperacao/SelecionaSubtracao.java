package Exercicio06.SelecionaOperacao;

import Exercicio06.Modelo.*;
import Exercicio06.Visitor.*;

public class SelecionaSubtracao implements SelecionaOperacao {
    
    private SelecionaOperacao proximo = null;
    
    public SelecionaSubtracao(SelecionaOperacao proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Numero seleciona(Operador operador, Numero numA, Numero numB) {
        if (operador.getNome().equals("-")) {
            Calculadora calculadora = new Calculadora();
            Subtracao operacao = new Subtracao(numA, numB);
            return calculadora.visit(operacao);
        }
        
        if (proximo != null)
            return proximo.seleciona(operador, numA, numB);
        
        return null;
        
    }
}
