package Exercicio06.SelecionaOperacao;

import Exercicio06.Modelo.Operacoes.*;

public class SelecionaSubtracao implements SelecionaOperacao {
    
    private SelecionaOperacao proximo = null;
    
    public SelecionaSubtracao(SelecionaOperacao proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operacao seleciona(String nome) {
        if (nome.equals("-"))
            return (new Subtracao());
        
        if (proximo != null)
            return proximo.seleciona(nome);
        
        return null;
        
    }
}
