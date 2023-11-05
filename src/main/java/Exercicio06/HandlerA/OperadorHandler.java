package Exercicio06.HandlerA;

import Exercicio06.HandlerA.HandlerB.*;
import Exercicio06.Modelo.*;

public class OperadorHandler implements HandlerA {
    
    private HandlerA proximo = null;
    
    public OperadorHandler(HandlerA proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula classifica(String particula) {
        if (particula.equals("+") || particula.equals("-") || particula.equals("*") || particula.equals("/") || particula.equals("^")) {
            HandlerB classificador = new AdicaoHandler(new DivisaoHandler(new MultiplicacaoHandler(new PotenciacaoHandler(new SubtracaoHandler(null)))));
            Operador novo = classificador.classifica(particula);
            return novo;
        }
        
        if (proximo != null)
            return proximo.classifica(particula);
        
        return null;
    }
    
}
