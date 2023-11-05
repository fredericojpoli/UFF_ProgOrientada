package Exercicio06.HandlerA.HandlerB;

import Exercicio06.Modelo.*;

public class SubtracaoHandler implements HandlerB {
    
    private HandlerB proximo = null;
    
    public SubtracaoHandler(HandlerB proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operador classifica(String nome) {
        if (nome.equals("-"))
            return (new OperadorSubtracao(nome));
        
        if (proximo != null)
            return proximo.classifica(nome);
        
        return null;
        
    }
}
