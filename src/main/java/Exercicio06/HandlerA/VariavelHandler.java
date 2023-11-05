package Exercicio06.HandlerA;

import Exercicio06.Modelo.*;
import Exercicio06.Controle;

public class VariavelHandler implements HandlerA {
    
    private HandlerA proximo = null;
    
    public VariavelHandler(HandlerA proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula classifica(String particula) {
        if (particula.startsWith("_")) 
            return Controle.buscaVariavel(particula);
        
        if (proximo != null)
            return proximo.classifica(particula);
        
        return null;
        
    }
    
}
