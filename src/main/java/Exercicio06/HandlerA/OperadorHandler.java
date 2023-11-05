package Exercicio06.HandlerA;

import Exercicio06.Modelo.*;

public class OperadorHandler implements HandlerA {
    
    private HandlerA proximo = null;
    
    public OperadorHandler(HandlerA proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula classifica(String particula) {
        // Se é um sinal, descubre o tipo de sinal
        if (particula.equals("+") || particula.equals("-") || particula.equals("*") || particula.equals("/") || particula.equals("^")) {
            return (new Operador(particula));
        }
        
        if (proximo != null)
            return proximo.classifica(particula);
        
        return null;
    }
    
}
