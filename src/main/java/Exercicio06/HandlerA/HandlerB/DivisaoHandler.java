package Exercicio06.HandlerA.HandlerB;

import Exercicio06.Modelo.*;

public class DivisaoHandler implements HandlerB {
    
    private HandlerB proximo = null;
    
    public DivisaoHandler(HandlerB proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operador classifica(String nome) {
        if (nome.equals("/"))
            return (new OperadorDivisao(nome));
        
        if (proximo != null)
            return proximo.classifica(nome);
        
        return null;
        
    }
}
