package Exercicio06.HandlerA.HandlerB;

import Exercicio06.Modelo.*;

public class AdicaoHandler implements HandlerB {
    
    private HandlerB proximo = null;
    
    public AdicaoHandler(HandlerB proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operador classifica(String nome) {
        if (nome.equals("+"))
            return (new OperadorAdicao(nome));
        
        if (proximo != null)
            return proximo.classifica(nome);
        
        return null;
        
    }

}
