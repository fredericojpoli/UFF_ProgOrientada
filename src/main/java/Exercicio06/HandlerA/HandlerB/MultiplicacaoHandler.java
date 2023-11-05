package Exercicio06.HandlerA.HandlerB;

import Exercicio06.Modelo.*;

public class MultiplicacaoHandler implements HandlerB {
    
    private HandlerB proximo = null;
    
    public MultiplicacaoHandler(HandlerB proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operador classifica(String nome) {
        if (nome.equals("*"))
            return (new OperadorMultiplicacao(nome));
        
        if (proximo != null)
            return proximo.classifica(nome);
        
        return null;
        
    }
}
