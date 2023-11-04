package Exercicio06.SelecionaOperacao;

import Exercicio06.Modelo.Operacoes.*;

public class SelecionaPotenciacao implements SelecionaOperacao {
    
    private SelecionaOperacao proximo = null;
    
    public SelecionaPotenciacao(SelecionaOperacao proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operacao seleciona(String nome) {
        if (nome.equals("^"))
            return (new Potenciacao());
        
        if (proximo != null)
            return proximo.seleciona(nome);
        
        return null;
        
    }
}
