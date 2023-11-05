package Exercicio06.HandlerA;

import Exercicio06.Modelo.*;

public class ConstanteHandler implements HandlerA {
    
    private HandlerA proximo = null;
    
    public ConstanteHandler(HandlerA proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula classifica(String particula) {
        return (new Numero(particula, Double.parseDouble(particula)));
    }
    
}
