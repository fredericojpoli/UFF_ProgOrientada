package Exercicio06.SelecionaOperacao;

import Exercicio06.Modelo.Operacoes.*;

public class SelecionaMultiplicacao implements SelecionaOperacao {
    
    private SelecionaOperacao proximo = null;
    
    public SelecionaMultiplicacao(SelecionaOperacao proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operacao seleciona(String nome) {
        if (nome.equals("*"))
            return (new Multiplicacao());
        
        if (proximo != null)
            return proximo.seleciona(nome);
        
        return null;
        
    }
}
