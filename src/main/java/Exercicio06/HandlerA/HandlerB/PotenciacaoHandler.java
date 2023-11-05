package Exercicio06.HandlerA.HandlerB;

import Exercicio06.Modelo.*;

public class PotenciacaoHandler implements HandlerB {
    
    private HandlerB proximo = null;
    
    public PotenciacaoHandler(HandlerB proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operador classifica(String nome) {
        if (nome.equals("^"))
            return (new OperadorPotenciacao(nome));
        
        if (proximo != null)
            return proximo.classifica(nome);
        
        return null;
        
    }
}
