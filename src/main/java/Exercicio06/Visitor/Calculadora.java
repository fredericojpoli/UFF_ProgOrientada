package Exercicio06.Visitor;

import Exercicio06.Modelo.*;

public class Calculadora implements Visitor {

    @Override
    public Numero visit(Adicao expressao) {
        double valor = expressao.fatorA.getValor() + expressao.fatorB.getValor();
        Numero resultado = new Numero(Double.toString(valor), valor);
        
        return resultado;
    }

    @Override
    public Numero visit(Subtracao expressao) {
        double valor = expressao.fatorA.getValor() - expressao.fatorB.getValor();
        Numero resultado = new Numero(Double.toString(valor), valor);
        
        return resultado;
    }

    @Override
    public Numero visit(Multiplicacao expressao) {
        double valor = expressao.fatorA.getValor() * expressao.fatorB.getValor();
        Numero resultado = new Numero(Double.toString(valor), valor);
        
        return resultado;
    }

    @Override
    public Numero visit(Divisao expressao) {
        double valor = expressao.fatorA.getValor() / expressao.fatorB.getValor();
        Numero resultado = new Numero(Double.toString(valor), valor);
        
        return resultado;
    }

    @Override
    public Numero visit(Potenciacao expressao) {
        Numero expoente = expressao.fatorB;
        double valor = 1;
        double exp = expoente.getValor();
        
        if (exp < 0)
            exp *= (-1);
        
        for (int i = 0; i < exp; i++)
            valor *= expressao.fatorA.getValor();
            
        if (expoente.getValor() < 0)
            valor = 1 / valor;
            
        Numero resultado = new Numero(Double.toString(valor), valor);
        
        return resultado;
    }

}
